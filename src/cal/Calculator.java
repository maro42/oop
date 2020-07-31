package cal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] values = input.split(" ");
		BigDecimal answer = new BigDecimal(values[0]);

//		for(int i=1; i<values.length-1; i++) {
//			String nextNum = values[i+1];
//			if("+".equals(values[i])) {
//				answer = plus(answer,nextNum);
//			}
//			
//			if("-".equals(values[i])) {
//				answer = minus(answer,nextNum);
//			}
//			
//			if("*".equals(values[i])) {
//				answer = multiply(answer,nextNum);
//			}
//			
//			if("/".equals(values[i])) {
//				answer = division(answer,nextNum);
//			}
//		}
		
		System.out.println(answer);
	}
	
	private static BigDecimal plus(BigDecimal answer, String nextNum) {
		return answer.add(new BigDecimal(nextNum));
	}
	
	private static BigDecimal minus(BigDecimal answer, String nextNum) {
		return answer.subtract(new BigDecimal(nextNum));
	}
	
	private static BigDecimal multiply(BigDecimal answer, String nextNum) {
		return answer.multiply(new BigDecimal(nextNum));
	}
	
	private static BigDecimal division(BigDecimal answer, String nextNum) {
		return answer.divide(new BigDecimal(nextNum));
	}

}
