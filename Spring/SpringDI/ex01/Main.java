package ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)  {
		
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		
		String answer = "";
		String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};	

		String[] arr2 = Arrays.stream(arr).filter((a)-> !skip.contains(a)).toArray(String[]::new);
		
		char[] s2 = s.toCharArray();
		
		
		for(int i = 0 ; i < s2.length; i++) {
			int index2 = s2[i]-97+5;
			System.out.println(index2);
			if(index2>=arr2.length) {
				answer+=arr2[arr2.length-index2];
			}else {
				answer+=arr2[index2];
			}	
		}
		System.out.println(answer);
	}
}
