import java.util.Scanner;

public class three_2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();
        
        for(int i = N; i >= 1; --i) {
            System.out.println(i);
        }
    }
}