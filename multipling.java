import java.util.Scanner;

public class multipling{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        String B = in.next();

        in.close();
        for(int i=2; i>=0; i--){
            System.out.println(A*(B.charAt(i)-'0'));
        }
        System.out.println(A*Integer.parseInt(B));
    }
}