package logicalProg;

import java.util.Scanner;


public class leapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Year:");
		int y = sc.nextInt();
		// 1 if else loop using
//	        if(y%4 == 0 &&  y%100 != 0||y%400==0)
//	            System.out.println( y  + " is a Leap Year.");
//	        else
//	            System.out.println(y  + " is not a Leap Year.");
//	        

		// 2 ternary operator using
		// boolean result=(y%4==0)?(y%100!=0?true:false):(y%400==0?true:false);
//	        boolean result=(y%4==0&&y%100!=0||y%400==0)?true:false;
//	        System.out.println(result);
//	        		if (result==true)
//	        			System.out.println("leap year is="+y);
//	        		else
//	        			System.out.println("not a leap year="+y);

		// 3if else ladder using
//		boolean leap = false;
//		if (y % 4 == 0) {
//			if (y % 100 == 0) {
//				if (y % 400 == 0)
//					leap = true;
//				else
//					leap = false;
//			} else
//				leap = true;
//		} else {
//			leap = false;
//
//		}
//		if (leap == true)
//			System.out.println(y + " is a Leap Year.");
//		else
//			System.out.println(y + " is not a Leap Year.");

		// 4 using method
		findleap(y);

	}

	private static void findleap(int y) {
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			System.out.println("\n" + y + " is a Leap Year.");

		else
			System.out.println("\n" + y + " is not a Leap Year.");

	}
}
