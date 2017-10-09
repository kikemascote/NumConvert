package app;

public class Convert {
	public static String convertTo(int n, int b) {
		if (n < 1) {
			return "";
		} else {
			switch (n % b) {
			case 0:
				return convertTo(n / b, b) + "0";
			case 1:
				return convertTo(n / b, b) + "1";
			case 2:
				return convertTo(n / b, b) + "2";
			case 3:
				return convertTo(n / b, b) + "3";
			case 4:
				return convertTo(n / b, b) + "4";
			case 5:
				return convertTo(n / b, b) + "5";
			case 6:
				return convertTo(n / b, b) + "6";
			case 7:
				return convertTo(n / b, b) + "7";
			case 8:
				return convertTo(n / b, b) + "8";
			case 9:
				return convertTo(n / b, b) + "9";
			case 10:
				return convertTo(n / b, b) + "A";
			case 11:
				return convertTo(n / b, b) + "B";
			case 12:
				return convertTo(n / b, b) + "C";
			case 13:
				return convertTo(n / b, b) + "D";
			case 14:
				return convertTo(n / b, b) + "E";
			case 15:
				return convertTo(n / b, b) + "F";
			default:
				return "";
			}
		}
	}
}
