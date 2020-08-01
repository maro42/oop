package cal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] values = input.split(" ");
		BigDecimal currValue = new BigDecimal(values[0]);
		
		// 답 초기화
		Operators op = new Operators(currValue);
		
		for(int i=0; i<values.length-1; i++) {
			op.seperate(values[i], values[i+1]);
		}
		
		System.out.println(op.getAnswer());
	}

}
