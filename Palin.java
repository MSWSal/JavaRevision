import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        int num = sc.nextInt();
        int rev = 0;

        while (num !=0){
            rev *= 10;
            rev += num%10;
            num/=10;
        }

        if (rev == num){
            System.out.println("Palindrime");

        }else {
            System.out.println("Not a Palindrime");

        }
    }
}
