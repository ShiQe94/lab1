package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java world\n");
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota\n");
        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");
        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";
        System.out.printf("a = %d, b = %f, s = %20s %n",a,b,s);
        System.out.print("Nazywaliśmy to \"witaminą B3\"");
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 !=0) {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while ((num1 !=0) && (num2 !=0));
        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for(int l : liczby)
        {
            System.out.println(l);
            if (l < mn) mn = l;
            if(l > mx) mx = l;
            avg += l;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx, (float)avg/liczby.length);

        Account acc = new Account();
        acc.setName("Piotr Gołąbek");
//        acc.name = "Piotr Gołąbek";
        System.out.println(acc.getName());





    }
}
