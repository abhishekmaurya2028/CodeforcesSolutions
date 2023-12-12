import java.util.Scanner;

public class WayTooLong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String [] words = new String[a + 1];
		for(int i = 0; i <= a; i++){
			words[i]= sc.nextLine();
		}
		for(int i =0; i <= a; i++){
			if(words[i].length() > 10){
			System.out.print(words[i].charAt(0));
			System.out.print(words[i].length()-2);
			System.out.println(words[i].charAt(words[i].length()-1));
			}
			else
			System.out.println(words[i]);
		}
	}
}