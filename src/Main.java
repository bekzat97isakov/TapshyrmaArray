import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int leng = scanner.nextInt();
        Array arr = new Array();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(0);
        arr.remove(1);
        for (int i = 0; i < arr.getSize(); i++) {
            if (arr.getArr(i) > 0){
                System.out.println(arr.getArr(i));
            }

        }
    }
}