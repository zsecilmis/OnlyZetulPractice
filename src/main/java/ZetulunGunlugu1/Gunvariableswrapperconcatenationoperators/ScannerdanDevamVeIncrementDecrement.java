package ZetulunGunlugu1.Gunvariableswrapperconcatenationoperators;

import java.util.Scanner;

public class ScannerdanDevamVeIncrementDecrement {

    public static void main(String[] args) {

               /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi ve soyadinizi giriniz:");

        String fullName = input.nextLine();

        System.out.println("Yasinizi giriniz:");

        byte age =input.nextByte();

        System.out.println("Boyunuzu giriniz");

        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz:");

        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz:");

        String maritalStatus = input.next();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

        {

            //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

            // Scanner input = new Scanner(System.in);

            System.out.println("Lutfen iki sayi giriniz:");

            double firstNumber = input.nextDouble();
            double secondNumber = input.nextDouble();

            System.out.println("toplam: " + ( firstNumber + secondNumber));
            System.out.println("cikarma: "+(firstNumber-secondNumber));
            System.out.println("carpim: "+ (firstNumber*secondNumber));
            System.out.println("bolme: "+(firstNumber/secondNumber));




        }

        {
            //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
            //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
            //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

            // Scanner input = new Scanner(System.in);

            System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz: ");

            float shortSide = input.nextFloat();

            System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz: ");

            float longSide = input.nextFloat();

            System.out.println("Dikdortgenin alani: " + shortSide*longSide);

            System.out.println("Dikdortgenin cevresi: " + 2*(shortSide+longSide));


            //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
            //rakamlarin toplamini yazdiran kodu yaziniz
            //           45678 ==> 45 + 78 = 123

            //Scanner input = new Scanner(System.in);

            System.out.println("Lutfen bes basamakli bir sayi giriniz: ");
            int num = input.nextInt();

            //bir tamsayiyi 1000 e bolersek son uc basamagi silmis oluruz

            int firstTwo = num/1000;

            // % ==> modulus operator solunda bulunan sayinin
            // saginda bulunan sayiya bolumunden kalani verir
            // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir

            int lastTwo = num%100;

            System.out.println("ilk iki basamak ile son iki basamak toplami:"+ (firstTwo+lastTwo));


            //INCREMENT DECREMENT

            //Increment :

            int a = 5;
            System.out.println(a);

            a = a +2; //7
            System.out.println(a);

            a+=2; //9
            System.out.println(a);

            //Decrement :

            int c = 8;
            System.out.println(c);

            c = c-3;
            System.out.println(c);

            c-=3;
            System.out.println(c);

            //Increment 2 :

            int d=6;
            System.out.println(d);

            d= d*2;
            System.out.println(d);

            d*=2;
            System.out.println(d);

            // Decrement 2 :

            int e = 20;
            System.out.println(e);

            e= e/2;
            System.out.println(e);

            e/=2;
            System.out.println(e);

            //1 ile increment

            int f = 13 ;
            System.out.println(f);

            f= f+1;
            System.out.println(f);

            f+=1;
            System.out.println(f);

            f++;
            System.out.println(f);

            //1 ile decrement

            int h = 9;
            System.out.println(h);

            h--;
            System.out.println(h);

            //post-increment / pre-increment

            int i =10;
            int k = i++;

            System.out.println(k); //10
            System.out.println(i); //11

            int m = 15; //16
            int n = ++m; //16

            System.out.println(m);//16 m satir sonunda artirildigi icin m nin degeri 16 olur
            System.out.println(n);//16 m artirildiktan sonra n ye konuldugu icin n nin degeri de 16 olur

            //Ornek

            int p = 17;
            int r = p--;

            System.out.println(p); //16
            System.out.println(r);//17

            int s = 20;
            int t = --s;

            System.out.println(s); //19
            System.out.println(t); //19



        }

    }
}

