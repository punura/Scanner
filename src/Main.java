import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
		System.out.println("What is your grade? ");
		String grade = scanner.nextLine();
		System.out.println("What is your favourite color?");
		String color = scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		System.out.println("Your grade is "+grade);
		System.out.println("Your favourite color is "+color);
		
		scanner.close();

	}

}
