import java.util.Arrays;
import java.util.Scanner;

public class five_2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}