import java.io.FileOutputStream;
import java.io.IOException;
class FileWriterThread extends Thread {
    public String fileName;
    public int start;
    public int end;

    public FileWriterThread(String fileName, int start, int end) {
        this.fileName = fileName;
        this.start = start;
        this.end = end;
    }

    public void run() {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = start; i <= end; i++) {
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Lab_11_3 {

    public static void main(String[] args) {
        String fileName = "Sample.txt";
        int fileSize = 10000; 
        int numThreads = 4; 
        int chunkSize = fileSize / numThreads;
        FileWriterThread[] threads = new FileWriterThread[numThreads];
        int start = 0;
        int end = chunkSize - 1;
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new FileWriterThread(fileName, start, end);
            threads[i].start();
            start = end + 1;
            end = (i == numThreads - 2) ? fileSize - 1 : end + chunkSize;
        }

        
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrate yield()
        for (FileWriterThread thread : threads) {
            thread.yield();
        }

        // Demonstrate interrupt()
        for (FileWriterThread thread : threads) {
            thread.interrupt();
        }

        System.out.println("File writing complete.");
    }
}

