import java.util.Scanner;

public class AdditionQuiz{
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 20);//change the number
		int number2 = (int)(System.currentTimeMillis() / 7 % 20);

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number2 + " + " + number1 + " = ");

		int answer = input.nextInt();

		System.out.println(number2 + " + " + number1 + " = " + answer + " is " + (number1 + number2 == answer));
	}
}