package part.a;

import java.math.BigInteger;
import java.util.Scanner;

public class ATestOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            BigInteger sum = a.add(b);
            if(sum.compareTo(c)>0)
                System.out.println("Case #"+i+": true");
            else
                System.out.println("Case #"+i+": false");


        }
    }
}
