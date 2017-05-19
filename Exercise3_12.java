package chapter3;
import java.util.Scanner;

public class Exercise3_12 {
	private static Scanner in;

	public static void main(String[] args){

        in = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int user_input = in.nextInt();

        int temp_remaning = 0;

        int d1 = user_input % 10;
        temp_remaning = user_input / 10;
        int d2 = temp_remaning % 10;
        int d3 = temp_remaning / 10;

        String rev = Integer.toString(d3) + Integer.toString(d2) + Integer.toString(d1);
        String original = Integer.toString(user_input);
        

        if(rev.equals(original)){
            System.out.println(original + " is a palindrone");
        }else{
            System.out.println(original + " is not a palindrone");

        }
}
}
