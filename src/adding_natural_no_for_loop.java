import java.util.Scanner;

public class adding_natural_no_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=a ; i++) {
            sum +=i;
        }
        System.out.println("The result is: "+sum);
    }
}
