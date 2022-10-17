import java.util.*;
class TypeWriter {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter text: ");
	String text = s.nextLine();
	for (int i = 0; i < text.length(); i++) {
		System.out.printf("%c", text.charAt(i));
		try {
		Thread.sleep(500);
		} 
		catch (InterruptedException ex) {
		Thread.currentThread().interrupt();
		}
	}
	}
}