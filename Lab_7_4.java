public class Lab_7_4{
	public static void main(String[] args) {
		EventDemo event = new EventDemo();
		event.performEvent();
		event.mouseClicked();
		event.mousePressed();
		event.mouseReleased();
		event.mouseMoved();
		event.mouseDragged();
		event.keyPressed();
		event.keyReleased();
	}
}
interface EventListener{
	void performEvent();
}
interface MouseListener extends EventListener{
		void mouseClicked();
		void mousePressed();
		void mouseReleased();
		void mouseMoved();
		void mouseDragged();
}
interface KeyListener extends MouseListener{
		void keyPressed();
		void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
		public void performEvent(){
			System.out.println("Performing Event");
		}
		public void mouseClicked(){
			System.out.println("Mouse Clicked");
		}
		public void mousePressed(){
			System.out.println("Mouse Pressed");
		}
		public void mouseReleased(){
			System.out.println("Mouse Released");
		}
		public void mouseMoved(){
			System.out.println("Mouse Moved");
		}
		public void mouseDragged(){
			System.out.println("Mouse Dragged");
		}
		public void keyPressed(){
			System.out.println("Key Pressed");
		}
		public void keyReleased(){
			System.out.println("Key Released");
		}
}