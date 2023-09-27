package ZetulunGunlugu1.Gunvariableswrapperconcatenationoperators;

import java.util.Scanner;

public class Practice01 {//class basi

    public static void main(String[] args) { //main method basi
        // int bir variable(yas) olustur ve yazdir
        //syntax:
        //data turu + variable ismi + atama operatoru + variable deger+ ;
     //   int yas = 35;
       // System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır

        int sayi = 50;
        System.out.println(sayi);

        //konsola sayi = 50 seklinde yazdır

        System.out.println("sayi = "+ sayi); //variable i etiketiyle yazdirma islemidir

        System.out.println("sayi = " + sayi); //soutv

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
       // int benimYasim = yas;
       //7 System.out.println("benimYasim = " + benimYasim);

        //String bir variable olusturalım (isim)
      //  String isim = "Zeynep";

        //isim variable ını etiketıyle yazdır

        //System.out.println("isim = " + isim);
       // System.out.println("isim = " + isim); //soutv
        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala

        //String onunIsmi = isim;

        //onunIsmi variable'ını etiketiyle yazdır
       // System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
        //isim = "Sakir";

        //isim ve onunIsmi variable'larını yazdır
      //  System.out.println("isim = " + isim);

       // System.out.println("onunIsmi = " + onunIsmi);

        // ORTALAMA


         /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double sayilarinToplami = num1 + num2 + num3+ num4 +num5;

        double sayilarinOrtalamasi = sayilarinToplami/5;

        System.out.println(sayilarinOrtalamasi);

        /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */


        // "\n" bu isaret alt satira gecmesini sagliyo

        String isim = "zetul";
        String soyisim = "secilmis";
        byte yas = 29;
        double boy = 1.61;
        byte kilo = 52;

        System.out.println("Isim: " + isim + "\nSoyisim: "+ soyisim +"\nYas: " + yas + "\nBoy: "+ boy + "\nKilo: "+kilo);

  /*2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın


         */

        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2);
        System.out.println(sayi1+sayi2+str1);
        System.out.println(str1+(sayi1+sayi2)+str2);
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);


        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        //1.adım Scanner objesi olusturmak

        Scanner input = new Scanner(System.in);

        //kullanıcıya mesaj verelim
        System.out.println("Lutfen karesini bulmak istediğiniz sayıyı giriniz");
        int sayiYeni= input.nextInt();

        System.out.println(sayiYeni);

        System.out.println(sayiYeni*sayiYeni);


    } //main method sonu

} //class sonu
