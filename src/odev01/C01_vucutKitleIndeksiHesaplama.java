package odev01;

import java.util.Scanner;

public class C01_vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        double hesaplama = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + hesaplama);


    }
}
