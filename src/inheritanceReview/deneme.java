package inheritanceReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme {


    public static void main(String[] args) {

/*
    Scanner scan = new Scanner (System.in);
		System.out.println("enter a string");
    String s = scan.nextLine();
    String r = "";
		for(int i = s.length()-1; i>=0 ; i-- ) {
        r = r + s.charAt(i);
            System.out.println(r);
    }
		System.out.println(r);
		if(s.equals(r)) {
        System.out.println("Palindrome");
    }else {
        System.out.println("Not Palindrome");
    }
		scan.close();
}

 */

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter beginnig and ending integer");
        int b = scan.nextInt();
        int e = scan.nextInt();

        int sum = 0;
        if (b > e) {
            System.out.println("begingin integer must be less than or equal to ending integer");
        } else {
            for (int i = b; i <= e; i++) {
                sum = sum + i;
            }
        }

        System.out.println(sum);

        scan.close();

         */

        List<String> blabla = new ArrayList<>();
        blabla.add("BIST");
        blabla.add("BIST01");
        blabla.add("BIST02");
        blabla.add("BIST03");

        for (String w: blabla) {
            System.out.println(w + " ");
        }


    }

}
