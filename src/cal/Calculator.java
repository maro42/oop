package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] values = input.split(" ");
		int answer = Integer.parseInt(values[0]);
		
		for(int i=1; i<values.length-1; i++) {
			String nextNum = values[i+1];
			if("+".equals(values[i])) {
				answer = plus(answer,nextNum);
			}
			
			if("-".equals(values[i])) {
				answer = minus(answer,nextNum);
			}
			
			if("*".equals(values[i])) {
				answer = multiply(answer,nextNum);
			}
			
			if("/".equals(values[i])) {
				answer = division(answer,nextNum);
			}
		}
		
		System.out.println(answer);
	}
	
	private static int plus(int answer, String nextNum) {
		return answer + Integer.parseInt(nextNum);
	}
	
	private static int minus(int answer, String nextNum) {
		return answer - Integer.parseInt(nextNum);
	}
	
	private static int multiply(int answer, String nextNum) {
		return answer * Integer.parseInt(nextNum);
	}
	
	private static int division(int answer, String nextNum) {
		return answer / Integer.parseInt(nextNum);
	}

}
