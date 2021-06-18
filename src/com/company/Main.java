package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("1-Toplama \n"+"2-Çıkarma\n"+"3-Çarpma\n"+"4-Bölme\n"+"Seçiminiz ? = ");
        int secim=scan.nextInt();
        switch (secim){
            case(1):
                System.out.println("Sonuç: "+(sayi1+sayi2));
                break;
            case(2):
                System.out.println("Sonuç: "+(sayi1-sayi2));
                break;
            case(3):
                System.out.println("Sonuç: "+(sayi1*sayi2));
                break;
            case(4):
                switch (sayi2){
                    case(0):
                        System.out.println("Bİr sayı 0'a bölünmez");
                        break;
                    default:System.out.println("Sonuç: "+(sayi1/sayi2));
                        break;
                }
                break;

            default:
                System.out.println("Hatalı giriş yaptınız!!");
                break;

        }

    }
}
