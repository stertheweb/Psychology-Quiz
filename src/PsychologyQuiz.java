import java.util.Scanner;

public class PsychologyQuiz {
	public static void main(String[] args)  
	{
		/* Declarations */
		final int exhausted = 0;
		final int beginningStress = 1;
		final int possiblyStress = 2;
		final int probablyStress = 3;
		int userInput = 0;
		int total = 0;
		
		/* Quiz */
		System.out.println("Hello. Welcome to the 'Are You Stressed?' quiz!");
		System.out.println("This quiz will assess how stressed you are.");
		System.out.println("Please answer each question with a 0 for no or");
		System.out.println("1 for yes.");
		System.out.println("Do you find yourself less eager to go back to work or");
		System.out.println("to resume your chores after a weekend?");
		Scanner scan = new Scanner (System.in);
		userInput = scan.nextInt();
		if ((userInput != 0) && (userInput != 1)) {
			return;
		}
		else {
		total = total + userInput;
		}
		System.out.println("Are your dedications to work, exercise, diet,");
		System.out.println("and friendships waning?");
		userInput = scan.nextInt();
		if ((userInput != 0) && (userInput != 1)) {
			return;
		}
		else {
		total = total + userInput;
		}
		System.out.println("Are you losing your sense of humor?");
		userInput = scan.nextInt();
		if ((userInput != 0) && (userInput != 1)) {
			return;
		}
		else {
		total = total + userInput;
		}
		
		/* Result */
		if (total == exhausted) {
			System.out.print("You are probably more exhausted than stressed out.");
		}
		if (total > exhausted) {
			if (total == beginningStress) {
				System.out.print("You are beginning to stress out.");
			}
			else if (total == possiblyStress) {
				System.out.print("You are possibly stressed out.");
			}
			else if (total == probablyStress) {
				System.out.print("You are probably stressed out.");
			}
		}
		}
}