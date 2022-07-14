import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {20, 15, 45, 22, 57, 23};
        Arrays.sort(arr);
        int[] siralanmis = Arrays.copyOf(arr, arr.length);
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        System.out.println("Min deger : " + siralanmis[0] + "\n" + "Max deger : " + siralanmis[arr.length - 1]);
        int yk = 0;
        int yb = 0;
        for (int i : arr) {
            if (i < sayi) {
                yk = i;
            } else {
                yb = i;
                break;
            }
        }
        System.out.println("En yakin en kucuk sayi : " + yk);
        System.out.println("En yakin en buyuk sayi : " + yb);
    }
}
