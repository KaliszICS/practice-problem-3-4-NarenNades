/**

        * File: Lesson 3.4 - nested Ifs

        * Author: Naren Nades

        * Date Last Modified: June 22, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int min(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num2 > num3) {
				return num3;
			}
			return num2;
		}
		return num1;
	}

	public static Boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

}
