import java.util.Scanner;

public class multipling1{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        String B = in.next();
        char[] arrB = B.toCharArray();

        in.close(); // Scanner close..

        for(int i=0; i < arrB.length; i++){
            System.out.println(A*(arrB[(arrB.length - 1)-i] -'0'));
            // i = 2, 1, 0 순으로 출력되어야 정답
            // i는 0부터 시작
            // ∴ 역순을 위하여 (arrB.length - 1) - i
            // arrB.length는 3이므로 arrB.length - 1 
        }
        System.out.println(A*Integer.parseInt(B));
    }
}