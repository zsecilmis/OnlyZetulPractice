package ZetulunGunlugu1.Gunvariableswrapperconcatenationoperators;

import java.util.Scanner;

public class BirinciGun {

    //VARIABLES

    // psvm main method kisaltmasi

    //main yazinca da methodu veriyo

    public static void main(String[] args){

        // Variable nasil olusturulur?

        // Data Type + Variable name + Assignment Operator + Variable degeri + noktali virgul
        int         age              =                  13                ;
        System.out.println(age);

       /*
       Javada temelde iki tip data vardir
       1)primitive data type:
           char, boolean, byte, short, int, long, float, double

       2)non-primitive data type:
            String
        */
        //1)primitive data types:
        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Note: char data typeinda degerler her zaman tek tirnak icine konulmalidir

        char    isminIlkHarfi    =   'A'  ;

        //boolean data type:  1 bit
        //boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired = false;

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.

        short neighborhoodPopulation = 1200 ;

        //int data type:
        // tam sayilar icindir hafizada 4 byte yer kaplar
        // int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        // Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int countryPopulation = 10000000 ;

        //sout yaz enter a bas==> System.out.printin(); kodunun kisa yolu

        //long data type:
        // tam sayilar icindir hafizada 8 byte yer kaplar
        // long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        // Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 76487634786583785L ;


        // Note: Eger long a atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yok
        // ama int lerin araliginda degilse bunun long oldugunu sonuna L koyarak javaya soylemeliyiz

        long ben = 276376370004764L ;

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        //Note: float olusturdugunuzda sonuna f ya da F koymalisiniz
        // cunku java ondalik sayilari otomatik olarak double kabul eder

        float priceOfShirt = 20.9F ;


        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonraki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double weightOfCell = 0.000000000873487345 ;
        System.out.println(weightOfCell);

        //1.5E-14 ==> 1.5 carpi 10 uzeri -14 demektir

        // E exponent demek yani ustlu sayi

        // her class bir non-primitive oldugundan buyuk harfle baslar
        //Non-primitive Data Type:

            //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
            //String olusturken yuklenmek istenen deger her zaman cift tirnak icine konulmalidir

            String studentName = "Ali Can" ;

            //primitive data type icin default deger 0 dir.
            //Stringler icin default deger(varsayilan deger) null dir.
            //null demek 0 demek degildir. 0 da codingte bir degerdir
            //null hiclik demektir
            //null icinde variable veya method bulunmayan bos bir obje demektir

        /*
        interview sorusu :
        primitive ve non-primitive data type lari arasindaki fark nedir?
        1) primitiveler sadece bizim atadigimiz degeri icerir
           non-primitiveler bizim atadigimiz degeri ve methodlar icerir

        2) primitiveler kucuk harfle baslar
           non-primitiveler ise buyuk harfle baslar

        3) primitiveleri java uretmistir ve sayisi bellidir 8 tane
           non-primitiveleri java ve programcilar uretebilir sinirsiz sayidadir

        4) primitiveler memoryde data typelarina gore sabit boyutta bellek kullanir
           non-primitiveler ise memoryde buyuklugune gore degisen boyutlarda bellek kullanabilir

         */

            //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin

            byte studentScore1 = 79 ;

            byte studentScore2 = 35 ;

            System.out.println(studentScore1 + studentScore2 );

          //  WRAPPERCLASS

        //java, primitive data typelara bazi faydali methodlar ekleyerek yeni bir veri yapisi olusturmustur.
        //Bu yeni yapi"WrapperClass" olarak adlandirilir.

        //primitive   : char     , boolean, byte, short, int    , long, float, double
        //WrapperClass: Character, Boolean, Byte, Short, Integer, Long, Float, double

        int n = 12;

        Integer m = 12;

        //Ornek: Primitive int i wrapper Integer a ceviriniz. (Autoboxing)

        int num = 15;

        Integer wrapperNum = num;

        //Ornek: Wrapper Byte i primitive byte a ceviriniz. (Unboxing)

        Byte x = 126;

        byte primk = x;

        //CONCATENATION

        //Ornek 1: Bir String ve iki integer variable olusturun.
        // String degeri ile Integer larin toplamini console yazdirin

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma1011
        System.out.println(s + a * b); //elma110
        System.out.println(s + (a+b)); //elma21
        System.out.println(a+ b + s); //21elma
        System.out.println(a + s + b); // 10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa concatenation islemi olur
        //Concatenation islemi birlestirme yapar
        //Note : Concatenation islemlerinde java matematikteki islem onceligini kullanir

        /* Matematikte islem onceligi
        1)Once uslu sayilar
        2)Parantez ici islemler
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir

         */



        //OPERATORS

         /*
        1)+, -, *, / islemleri javada matematikte kullanildigi gibi kullanilir
        Note 1 :  Javada bir tamsayiyi baska bir tamsayiya bolme isleminde sonuc her zaman tamsayi olur
        Note 2 : Eger sonuc tamsayi degilse java sonucun ondalik kismini iptal ederek onu int e cevirir.
        Yuvarlama yapmaz.
        Note 3 : Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.

        25/10 = 2.5 yani double oldugu icin sonuc double cinsinden veriyo

         */

        int kisiSayisi =10;
        int paraMiktari = 25;
        System.out.println(paraMiktari / kisiSayisi); //2

        int ogrenciSayisi = 10;
        double ucretMiktari = 25;

        System.out.println(ucretMiktari / ogrenciSayisi); //2.5

        /*
        2) Javada "Logical Operator" AND ve OR islemler

        AND

        CAY    AND   KAHVE   SONUC
        true   &&    false   false
        false  &&    true    false
        false  &&    false   false
        true   &&    true    true

        Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
        AND islemi perfectionisttir, bir tane bile false sonucu false yapar

        OR

        CAY    AND   KAHVE   SONUC
        true   ||    false   true
        false  ||    true    true
        false  ||    false   false
        true   ||    true    true

        Note :OR (||) isleminde bir tane true sonucu true yapmak icin yeterlidir
        OR isleminde sonucun false olabilmesi icin her sey false olmalidir

        3) NOT operator ( ! ) true olani false, false olani true yapar.

        !true  ====> false
        !false ====> true
        !!true ====> true

        4) Comparison Operators
        <, >, >=, <=, ==, !=

         NOTE: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz
         */

        boolean first = 3 < 5;
        boolean second = 2 + 3 != 5;
        boolean third = 2 + 3 * 5 >= 19;

        System.out.println(first && second);//false
        System.out.println( first || second || third);//true

        // SCANNER



        //1. adim : Scanner Classtan object olustur
                Scanner input = new Scanner(System.in);

                //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
                System.out.println("input your age..");

                //3. adim : Uygun methodu kullanarak kullanicinin verdigi datayi memorye yerlestiriniz.
                byte yourAge = input.nextByte();

                //nextByte methodu kullanicinin verdigi veriyi alir

        System.out.println("Your age is "+ yourAge);


        // TYPE CASTING

        /*
        Numeric primitive data typelarinin birbirine donusturulmesine "Type Casting" denir
        Numeric data typelar : byte, short, int, long, float, double

        Note 1: Kucuk data type lerini buyuk data type'larina cevirmeyi java otomatik yapabilir
        Bu isleme AutoWidening (Otomatik Genisletme) denir

        Note 2: Buyuk data type larini kucuk data type'larina cevirmek riskli bir istir
        Java bu riskli isleri otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
        Bu isleme Explicit Narrowing (Aciktan daraltma)

         */

        //Ornek : byte data type ini int data type ina ceviriniz (Auto Widening)

        byte myAge = 13;
        int ageInt = myAge;

        // Ornek : int data type ini short data type ina ceviriniz.(Explicit Narrowing)

        int weight = 313;
        short weightShort = (short) weight;






    }
}








