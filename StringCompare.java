
//Given a string, find out the lexicographically 
//smallest and largest substring of length k.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StringCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		System.out.println("Enter the length");
		int k = scan.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<=str.length()-k;i++){
			list.add(str.substring(i, i+k));
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}
}
