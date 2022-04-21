package week2.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator mycalc = new Calculator();
		System.out.println("Sum of 2 numbers: "+mycalc.add(5, 10, 25));
		System.out.println("Subtrction of 2 numbers: "+mycalc.sub(155, 110));
		System.out.println("Multiplication of 2 numbers: "+mycalc.multiply(534, 23));
		System.out.println("Division of 2 numbers:"+mycalc.divide(13430.343f,20f));
		
	}

}
