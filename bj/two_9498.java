import java.util.Scanner;

public class two_2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Score = in.nextInt();

        if ( Score >= 90 ) {
            System.out.println("A");
        } else if ( Score < 90 && Score >= 80 ) {
            System.out.println("B");
        } else if ( Score < 80 && Score >= 70) {
            System.out.println("C");
        } else if ( Score < 70 && Score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        } 
    }
}