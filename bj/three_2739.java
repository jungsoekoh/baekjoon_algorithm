import java.util.Scanner;

public class three_2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.close();

        for(int i = 1; i <= 9; ++i) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}