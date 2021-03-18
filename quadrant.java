import java.util.Scanner;

public class quadrant{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        in.close();

        if (x != 0 && y != 0) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("1");
                } else {
                    System.out.println("4");
                }
            } else {
                if (y > 0) {
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }
            }
        } else if (x == 0 && y == 0) {
            System.out.println("원점 상에 존재");
        } else if (x == 0 && y != 0) {
            System.out.println("y축 상에 존재");
        } else {
            System.out.println("x축 상에 존재");
        }
    }
}