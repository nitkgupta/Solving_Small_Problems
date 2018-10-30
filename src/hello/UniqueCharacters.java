package hello;

import java.util.Scanner;
/*
 * to count whether the string has unique characters or not.
 */
public class UniqueCharacters {
	public static void main(String ng[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to be checked");
		String str=scan.nextLine();
		boolean b=checkUniqueness(str);
		if(b) {
			System.out.println(str+ " has unique characters.");
		}
		else {
			System.err.println(str + " has some non unique characters.");
		}
	}

	private static boolean checkUniqueness(String str) {
		int MAX_LENGTH=256;
		int[] in=new int[MAX_LENGTH];
		for(int i=0;i<=str.length()-1;i++) {
			in[str.charAt(i)]++;
		}
		boolean b=true;
		for(int j=0;j<=MAX_LENGTH-1;j++) {
			if(in[j]>=2) {
				return false;
			}
		}
		return b;
		
	}

}
