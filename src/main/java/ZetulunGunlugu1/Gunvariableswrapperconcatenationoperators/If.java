package ZetulunGunlugu1.Gunvariableswrapperconcatenationoperators;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        //if Statements
        //bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanilir

       /*

       if (you study hard){
            you will learn java
        }
        */

        //Ornek 1: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

        // number>-1 && number<10 her ikisi de true olursa

        int number = 3;


        if(number>-1 && number<10 ){

            System.out.println("Rakam");
        }

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int numb = 111;

        if (numb>99 && numb<999 ) {

            System.out.println("Sayi üç basamaklidir!");
        }




    //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz: ");

        int num = input.nextInt();

        //1. yol:

        if(num % 2 == 0 ) {

            System.out.println("Cift sayi");
        }

        if (num%2 != 0) {

            System.out.println("Tek sayi");
        }


        //2. yol
        //if else statements

        if(true){
            //burasi calisir

        }else{

            //burasi calisir
        }



        if(num % 2 == 0){
            System.out.println("Cift sayi");
        }else{

            System.out.println("Tek sayi");
        }


     //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

       //  Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int numberYeni = input.nextInt();

        if(numberYeni > 0 ){
            System.out.println("Pozitif");
        }else if (numberYeni<0){
            System.out.println("Negatif");

        }else{
            System.out.println("Notr");
        }

        //Gunlerrrr

        //Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        byte numYeni = input.nextByte();

        if(numYeni == 1){
            System.out.println("Sunday");
        }else if(numYeni==2){
            System.out.println("Monday");
        }else if(numYeni==3){
            System.out.println("Tuesday");
        }else if(numYeni==4){
            System.out.println("Wednesday");
        }else if(numYeni==5){
            System.out.println("Thursday");
        }else if(numYeni==6){
            System.out.println("Friday");
        }else if(numYeni==7){
            System.out.println("Saturday");
        }else {
            System.out.println("Hatali giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz.");
        }


      //Boundary Value Analysis

      //kodun sinirlari icin test edilmesi

        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

      //  Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Gecerli bir yas giriniz");
        } else if(age<5){
            System.out.println("Bebek");
        } else if(age<13){
            System.out.println("Cocuk");
        } else if(age<21){
            System.out.println("Genc");
        } else if(age<31){
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas");
        }


        /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day
         */

       // Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");

        String dayName = input.next();

        if (dayName.equals("Saturday")|| dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        } else if ( dayName.equals("Monday") || dayName.equals("Tuesday") ||dayName.equals("Wednesday") ||
                dayName.equals("Thursday") ||dayName.equals("Friday")) {
            System.out.println("Week Day");
        } else {

            System.out.println("Invalid day name");

            }


            if (dayName.equalsIgnoreCase("Saturday")|| dayName.equalsIgnoreCase("Sunday")){
                System.out.println("Weekend Day");
            } else if ( dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||dayName.equalsIgnoreCase("Wednesday") ||
                    dayName.equalsIgnoreCase("Thursday") ||dayName.equalsIgnoreCase("Friday")) {
                System.out.println("Week Day");
            } else {

                System.out.println("Invalid day name");


                boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

                boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                        dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                        dayName.equalsIgnoreCase("Friday");

                if (isWeekendDay) {
                    System.out.println("Weekend Day");
                } else if (isWeekDay) {
                    System.out.println("Week day");
                } else {
                    System.out.println("Invalid day name..");
                }


                 /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;

                60 yasindan buyukse "Emekli Olabilir "yazdirin


1
               Eger calisan erkek ise;

                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

               // Scanner input = new Scanner(System.in);
                System.out.println("Cinsiyetinizi giriniz");
                String gender = input.next();

                System.out.println("Yasinizi giriniz");
                int ageYeni = input.nextInt();

                if (ageYeni < 0 || ageYeni > 120) {
                    System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz");

                } else if (gender.equalsIgnoreCase("Kadin")) {

                    if (ageYeni > 60) {
                        System.out.println("Emekli olabilir");
                    } else {
                        System.out.println("Calismali...");
                    }

                } else if (gender.equalsIgnoreCase("Erkek")) {

                    if (ageYeni > 65) {
                        System.out.println("Emekli olabilir");
                    } else {
                        System.out.println("Kesinlikle Calismali...");
                    }

                } else {
                    System.out.println("Tanimli degil...");
                }


            }




        }
        }
