import java.util.Arrays;

public class assignmentThree {

	public static void main(String[] args) {
		
		int[] age = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
	
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			}
		
		//Prints first item subtracted from last item
		clashPrint(ageClash(age)); 
		
		//printing the array with the added entry
		for (int i = 0; i < newAge(age).length; i++) {
			System.out.println(newAge(age)[i]);
		}
		
		//newAge adds 10 to the array and clash prints the subtraction again
		clashPrint(ageClash(newAge(age)));
		
		//Prints average of updated age array
		System.out.println("Average Age: " + ageAvg(newAge(age))); 
		
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
		int nameSum = 0;
		int avg = 0;
		
		for (String az : names) {
			nameSum += az.length();
			}
		
		avg = nameSum/names.length;
		
		System.out.println("Average Name Length: " + avg);
		
		String allNames = "";
		
		for (String boeing : names) {
			allNames += boeing + " ";
		}
		
		System.out.println(allNames);
		
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int nameLengthPrinterSum = 0;
		
		for (int printer : nameLengths) {
			nameLengthPrinterSum += printer;
		}
		
		System.out.println("Number of Letters in Names Array: " + nameLengthPrinterSum);
		
	}
	public static int ageClash (int[] ageArr) {
		//last age slot - slot 0
				int product;
				int lastAge = ageArr[ageArr.length -1];
				int firstAge = ageArr[0];
				product = lastAge - firstAge;
				return product;
	}
	public static int[] newAge (int[] incArr) {
		// adding an entry to the age array
		int[] newAgeArr = Arrays.copyOf(incArr, 9);
		newAgeArr[8] = 10;
		return newAgeArr;
		
	}
	
	public static void clashPrint(int x) {
		// original code:
		// system.out.print("text" + x);
		// Above code concatenated age array slot 0 after subtraction result printing 903 instead of 90
		// It also made slot 0 not appear in the next for loop print out
		// Problem resolved by not concatenating the incoming integer.
		System.out.print("The Last age minus the first age is: ");
		System.out.println(x);
	}
	public static int ageAvg (int[] incArr) {
		int sum = 0;
		int result;
		for (int i = 0; i < incArr.length; i++) {
			sum += incArr[i];
		}
		result = sum/incArr.length;
		return result;

	}
	public static String Hello (String str, int n) {
		String hello = "";
		for (int i = 0; i< n; i++) {
			hello += str;
		}
		return hello;
	}
	public static String properName (String x, String y) {
		return x + " " + y;
	}
	public static Boolean hundreds (int[] x) {
		int sum = 0;
		for(int b : x) {
			sum += b;
		}
		return sum > 100;
	}
	public static Boolean twoGoIn (int[] x, int[] y) {
		
		int xavg, yavg, xsum = 0, ysum = 0;
		
		for (int a : x) {
			xsum += a;
		}
		
		for (int a : y) {
			ysum += a;
		}
		
		xavg = xsum/x.length;
		yavg = ysum/y.length;
		
		return xavg > yavg;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	public static void buyShirts (boolean stretchedShirts) {
		//checks your shirts for stretching
		//alerts you if you need new ones
		if (stretchedShirt) {
			System.out.println("Buy more shirts!");
		}
	}
}
