package part.a;

import java.util.ArrayList;
import java.util.Scanner;

public class ATestSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        for(String value:values){
            int a = Integer.parseInt(value);
            System.out.println(a);

        }
    }
}
