package test;

import java.util.Arrays;

//²âÊÔlambda
public class TestLambda {
	
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		Arrays.asList(1, 2, 4, 5, 8).forEach(e -> System.out.println(e));
	}
}
