import java.util.Scanner;

public class if_alarm {
    
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 스캐너 생성자에서 시가 입력되는 멤버변수
        int M = in.nextInt(); // 스캐너 생성자에서 분이 입력되는 멤버변수
        in.close(); // 스캐너 생성자 멤버변수가 모두 입력되면 닫기.

        if(M < 45) { // M이 45보다 작을경우. 즉, 빼야하는 분이 현재보다 클경우.
            H--; // 시(hour) 1 감소. 즉, 시에서 분을 가져온다.
            M = 60 - (45 - M); // 분(min) 감소. 가져온 시에서 45에서 M을 빼고난 나머지를 뺌. 
                               // → (60 + M) - 45를 하는게 더 직관적이라고 생각.

            if(H < 0) { // 0보다 H가 작으면? 즉 자정 전을 가리킨다. 고로 H = 23.
                H = 23;
            }
            System.out.println(H + "" + M);
        } else {
            System.out.println(H + "" + (M - 45));
        }
    }

}
