import java.util.Scanner;


public class ClassExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter username.");
		String username = keyboard.next();
		
		System.out.println("enter password.");
		String password = keyboard.next();
		
		System.out.println("Hello " + username + ", Welcome to CSC 201 class! Your password is " + password);
		
	}

}
