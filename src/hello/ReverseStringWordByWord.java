package hello;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		ReverseStringWordByWord reverse=new ReverseStringWordByWord();
		String result = reverse.reverseWordString(str);
		System.out.println("reversed String is "+result);
	}

	private String reverseWordString(String str) {
		String[] words=str.split(" ");
		String result="";
		for(int i=0;i<words.length;i++) {
			String temp="";
			for(int j=words[i].length()-1;j>=0;j--) {
				temp=temp.concat(Character.toString(words[i].charAt(j)));
			}
			result=result.concat(temp + " ");
		}
		return result.trim();
	}
}