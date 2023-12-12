import java.util.Scanner;
 
public class 4A_watermelanProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
 
        if (x < 4) {
            System.out.println("NO");
        } 
        else {
            System.out.println(x % 2 == 0 ? "YES" : "NO");
        }
    }
}
