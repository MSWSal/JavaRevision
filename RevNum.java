import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        int num = sc.nextInt();

        //Algo method
//        int reverse = 0;
//
//        while (num != 0){
//            reverse *= 10;
//            reverse += num%10;
//            num /=10;
//        }
//
//        System.out.println("Reverse is using algo :"+reverse);


        //string buffer method
//        StringBuffer rev;
//        StringBuffer number = new StringBuffer(String.valueOf(num));
//
//        rev = number.reverse();
//
//        System.out.println("Reverse is using buffer :"+rev);

        //Stringbuilder class
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);

        System.out.println(stringBuilder.reverse());


    }

}
