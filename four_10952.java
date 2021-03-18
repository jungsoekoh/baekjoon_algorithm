import java.util.Scanner;

public class four_10952 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = 0;

        while(true) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A+B);

            if(i == 4) {
                in.close();
                break;
            }
            i++;
        }
    }
}

// import java.util.Scanner;   

// public class four_10952 {
//     public static void main(String args[]){
        
//         Scanner in=new Scanner(System.in);
            
//         while(in.hasNextInt()){
//             int a=in.nextInt();
//             int b=in.nextInt();
//             System.out.println(a+b);
//         }
//         in.close();
//     }
// }
