package MainPackage;

import java.util.Scanner; 

public class CheckDigit {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number between 13 and 16 digits");
		long number = input.nextLong(); 
		while (number < 1000000000000L || number > 9999999999999999L){
			System.out.println("Error. Between 13 and 16 digits");
			number = input.nextLong(); 
		}
		input.close();
		Long number2 = number;
		String number3 = Long.toString(number2);
		char[] number_chars = number3.toCharArray();
		int odds = 0;
		for (int i=number_chars.length-1; i>-1; i = i-2){
			int num = (int)number_chars[i] -48;
			odds += num;
		}
		int evens = 0;
		for (int i=number_chars.length-2; i>-1; i = i-2){
			int num = (int)number_chars[i] -48;
			if (2*num > 9){
				num = (2*num)%10 + (2*num) / 10;
				evens += num;
			}
			else
				evens += 2*num;
		}
		
		boolean card = false;
		int total = evens + odds;
		if (total%10 ==0){
			if ((int)number_chars[0]-48 ==4 || (int)number_chars[0]-48 ==5 || (int)number_chars[0]-48 ==6){
				card = true;
			}
			else if ((int)number_chars[0]-48 ==3 && (int)number_chars[1]-48 ==7){
				card = true;
			}
		}
		else
			card = false;
		if (card)
			System.out.println("The number is valid");
		else
			System.out.println("The number is invalid");
	}
}
