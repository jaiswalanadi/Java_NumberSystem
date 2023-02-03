import java.util.Scanner;

public class ns4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the decimal number: ");

        int m = scn.nextInt();

        System.out.println("Enter the binary number: ");

        int n = scn.nextInt();

        int decimalnum = 0;

        int power = 1;

        while(n != 0){
            int rem = n % 2;

            decimalnum += rem * power;

            power *= 2;

            n /= 10;

        }

        System.out.print(m * decimalnum);

    }

}