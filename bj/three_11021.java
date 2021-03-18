import java.util.Scanner;

public class three_11021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int i = 1; i <= N; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println("Case #" + i + ": " + (A+B));
        }

        in.close();
    }
}