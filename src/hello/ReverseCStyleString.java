package hello;

import java.util.Scanner;

public class ReverseCStyleString {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		ReverseCStyleString reverse=new ReverseCStyleString();
		String result = reverse.reverseString(str);
		System.out.println("reversed String is "+result);
	}

	private String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp.concat(Character.toString(str.charAt(i)));
		}
		return temp;
	}

}
