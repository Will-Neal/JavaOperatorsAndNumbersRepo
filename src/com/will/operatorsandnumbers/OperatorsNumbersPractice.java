package com.will.operatorsandnumbers;

public class OperatorsNumbersPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiftIntegerLeft();
		shiftIntegerRight();
		calcBitwiseOr();
		incrementPostfix();
		incrementThreeTimes();
		checkPostAndPre();
	}
	
	/*
	 * Write the following integers in binary notation.
	 * 
	 * 1 = 0000 0001
	 * 8 = 0000 1000
	 * 33 = 0010 0001
	 * 78 = 0100 1110
	 * 787 = 0011 0001 0011
	 * 33,987 = 1000 0100 1100 0011
	 * */
	
	/*
	 * Convert the following numbers to binary notation. 
	 * 0010 = 2
	 * 1001 = 9
	 * 0011 0100 = 52
	 * 0111 0010 = 114
	 * 0010 0001 1111 = 543
	 * 0010 1100 0110 0111 = 11367
	 * */
	
	public static void shiftIntegerLeft() {
		int num = 4;
		System.out.println(Integer.toBinaryString(num));
		int x = num << 1;
		System.out.println(Integer.toBinaryString(x));
		
		int num1 = 9; //Outcome will be 18 in binary which is 0001 0010
		System.out.println("9 as binary: " + Integer.toBinaryString(num1));
		int y = num1 << 1;
		System.out.println("9 left-shift: " + Integer.toBinaryString(y));
		
		int num2 = 17; //Outcome will be 34 100010
		System.out.println("17 as binary: " + Integer.toBinaryString(num2));
		int z = num2 << 1;
		System.out.println("17 left-shift: " + Integer.toBinaryString(z));
		
		int num3 = 88;//outcome will be 176 1011000
		System.out.println("88 as binary: " + Integer.toBinaryString(num3));
		int a = num << 1;
		System.out.println("88 left-shift: " + Integer.toBinaryString(a));
	}
	
	public static void shiftIntegerRight() {
		System.out.println("=======================");
		int x = 150;
		System.out.println(Integer.toBinaryString(x));
		x = 150 >> 2; //We are essentially dividing by 2 twice so the result should be 37(37.5 rounded down) 0r 100101
		System.out.println(Integer.toBinaryString(x));
		
		int a = 225;
		System.out.println("225 as binary: " + Integer.toBinaryString(a));
		a = 225 >> 2; //We are essentially dividing by 2 twice so the result should be 56(56.25 rounded down) 111000
		System.out.println("225 right shift 2: " + Integer.toBinaryString(a));
		
		int b = 1555;
		System.out.println("1555 as binary: " + Integer.toBinaryString(b));
		b = 1555 >> 2; //We are essentially dividing by 2 twice so the result should be 388(388.75 rounded down) 110000100
		System.out.println("1555 right shift 2: " + Integer.toBinaryString(b));
		
		int c = 32456;
		System.out.println("32456 as binary: " + Integer.toBinaryString(c));
		c = 32456 >> 2; //We are essentially dividing by 2 twice so the result should be 8114 or 1111110110010
		System.out.println("32456 right shift 2: " + Integer.toBinaryString(c));
	}
	
	public static void calcBitwiseOr() {
		System.out.println("==================");
		int x = 7;
		int y = 17;
		int z = x&y;
		String zBinary = Integer.toBinaryString(z);
		System.out.println("decimal: " + z);
		System.out.println("binary: " + zBinary);
		
		z = x|y;
		zBinary = Integer.toBinaryString(z);
		System.out.println(z);
		System.out.println(zBinary);
	}
	
	public static void incrementPostfix() {
		System.out.println("==================");
		int x = 0;
		System.out.println(x);
		x++;
		System.out.println(x);
	}
	
	public static void incrementThreeTimes() {
		System.out.println("================");
		int x = 0;
		System.out.println(x);
		++x;
		System.out.println(x);
		x++;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
	}
	
	public static void checkPostAndPre() {
		System.out.println("================");
		int x = 5;
		int y = 8;
		int sum = x++ + y; //14 if prefix, 13 if postfix
		System.out.println(sum);
	}
}
