package hello;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String ng[]) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		callEnvy(str);
	}

	private static void callEnvy(String str) {
		int length=str.length();
		if((length%2)==0) {
			String temp="";
			for(int i=(length-1);i>=(length/2);i--) {
				temp=temp.concat(Character.toString(str.charAt(i)));
			}
			System.out.println((str.substring(0,(length/2)-1)));
			
			if((str.substring(0,(length/2))).equals(temp)){
				System.out.println(str+" is already a palindrome. No need to add Suffix.");
			}
			else {
//				String stick="";
//				for(int j=0;j<=(length-1);j++) {
//					if(str.charAt(j)!=str.charAt((length-1)-j)) {
//						System.out.println(j);
//						System.out.println((length-1)-j);
//						
//						stick=stick.concat(Character.toString(str.charAt(j)));
//					}
//				}
//				for(int i=(stick.length()-1);i>=0;i--) {
//					str=str.concat(Character.toString(stick.charAt(i)));
//				}
//				System.out.println("String Successfully made palindrome : "+str);
			}
		}
		else {
			String temp="";
			for(int i=(length-1);i>=(length/2+1);i--) {
				temp=temp.concat(Character.toString(str.charAt(i)));
			}
			if((str.substring(0, (length/2)).equals(temp))) {
				System.out.println(str+" is already a palindrome. No need to add Suffix.");
			}
			
		}
		
	}

}
