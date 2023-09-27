package fib;

public class driver {
	public static int count = 0;
	public static void main(String[] args) {
		System.out.println(getFibanacci(5));
		System.out.println(count);
	}

	public static int getFibanacci(int index) {
		count++;
		int fib1 = 0;
		int fib2 = 1;
		for(int i = 0; i < index; i++) {
			if(i % 2 == 0) {
				fib1 += fib2;
			} else {
				fib2 += fib1;
			}
		}
		if(fib1 > fib2) {
			return fib1;
		}
		return fib2;
	}
}
