package cal;

import java.math.BigDecimal;

public class Operators {

	private BigDecimal answer;
	
	public Operators(BigDecimal answer) {
		this.answer = answer;
	}

	public BigDecimal getAnswer() {
		return answer;
	}


	// 현재 값에 따라 분류해주기
	public void seperate(String currValue, String nextValue) {
		if("+".equals(currValue)) {
			answer = plus(answer,nextValue);
		}
		
		if("-".equals(currValue)) {
			answer = minus(answer,nextValue);
		}
		
		if("*".equals(currValue)) {
			answer = multiply(answer,nextValue);
		}
		
		if("/".equals(currValue)) {
			answer = division(answer,nextValue);
		}
	}
	
	private BigDecimal plus(BigDecimal answer, String nextValue) {
		return answer.add(new BigDecimal(nextValue));
	}
	
	private BigDecimal minus(BigDecimal answer, String nextValue) {
		return answer.subtract(new BigDecimal(nextValue));
	}
	
	private BigDecimal multiply(BigDecimal answer, String nextValue) {
		return answer.multiply(new BigDecimal(nextValue));
	}
	
	private BigDecimal division(BigDecimal answer, String nextValue) {
		return answer.divide(new BigDecimal(nextValue));
	}

}
