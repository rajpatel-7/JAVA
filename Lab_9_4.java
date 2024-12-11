public class Lab_9_4 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

    
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads terminated.");
    }
}

class Buffer {
    private int data;
    private boolean empty = true;


    synchronized void produce(int value) {
        try {
            while (!empty) {
                wait();
            }
            data = value;
            empty = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    synchronized int consume() {
        try {
            while (empty) {
                wait();
            }
            int consumedData = data;
            empty = true;
            notify();
            return consumedData;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                buffer.produce(i);
                System.out.println("Producer produced: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int consumedData = buffer.consume();
                if (consumedData != -1) {
                    System.out.println("Consumer consumed: " + consumedData);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
