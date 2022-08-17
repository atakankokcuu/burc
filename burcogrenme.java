import java.util.Scanner;

public class burcogrenme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ay girin");
        int mo = scanner.nextInt();
        System.out.print("gün girin");
        int day = scanner.nextInt();
        if (mo == 1) {
            if (day > 0 && day < 22) {
                System.out.print("burcunuz oğlak");
            } else if (day > 22 && day < 31) {
                System.out.print("burcunuz kova");
            }
        }


        if (mo == 2) {
            if (day > 0 && day < 20) {
                System.out.print("burcunuz kova");
            } else if (day > 20 && day < 31) {
                System.out.print("burcunuz balık");

            }


        }
        if (mo == 3) {
            if (day > 0 && day < 20) {
                System.out.print("burcunuz balık");
            } else if (day > 20 && day < 31) {
                System.out.print("burcunuz koç");

            }
        }
    }
}

