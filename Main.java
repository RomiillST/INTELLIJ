package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Input array length: ");
        QuickFindUF p = new QuickFindUF(sc.nextInt());
        p.array_print();
        while (true) {
            System.out.println("Go create connections!");
            System.out.println("Input p: ");
            int x = sc.nextInt();
            if (x == 666) {
                break;
            }
            System.out.println("Input q: ");
            int y = sc.nextInt();
            p.union(x,y);
            p.array_print();
            System.out.println("\n");
        }
        while (true){
            System.out.println("Go check connections!");
            System.out.println("Input p: ");
            int x = sc.nextInt();
            if (x==666){
                System.out.println("Nice");

                break;
            }
            System.out.println("Input q: ");
            int y = sc.nextInt();
            p.connected(x,y);
            System.out.println("\n");
        }
    p.array_print();
    }
}
