import java.util.Scanner;

public class Lottery{
	public static void main(String[] args) {
		
		int lottery = (int)(Math.random() * 100);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();

		int lottery_digit1 = lottery / 10;
		int lottery_digit2 = lottery % 10;

		int guess_digit1 = guess / 10;
		int guess_digit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);

		if(guess == lottery)
			System.out.println("Exact match: you win $10.000");
		else if (guess_digit1 == lottery_digit2 && guess_digit2 == lottery_digit1)
			System.out.println("Match all digits: you win $3.000");
		else if (guess_digit2 == lottery_digit2 || guess_digit2 == lottery_digit1 || guess_digit1 == lottery_digit2 || guess_digit1 == lottery_digit1)
			System.out.println("Match one digit: you win $1.000");
		else
			System.out.println("Sorry,no match");

	}
}