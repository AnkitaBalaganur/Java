package basic_interview_questions;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  String str = s.nextLine();
	        
	        String resverse = "";
	        int length = str.length();
	        
	        for(int i=0;i<length;i++) {
	        	resverse = str.charAt(i) + resverse;
	        }
	        System.out.println(resverse);
	}

}
