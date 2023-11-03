package zetulunGunlugu2.GunTernaryStringManipulations;

public class StringManipulations {
    public static void main(String[] args) {
//        String s = "Java is easy" ;
//
//        //Example 1: "s" Stringinde kullanilan character sayisini bulunuz.
//        int sLength = s.length();
//        System.out.println(sLength);
//
//        //Example 2: "s" stringindeki ilk indexte bulunan characteri ve son indexte bulunan karakteri aliniz.
//
//        char firstChar = s.charAt(0);//J
//        System.out.println(firstChar);
//
//        char lastChar = s.charAt(11);//y
//        System.out.println(lastChar);
//
//        char lastChar2 = s.charAt(s.length()-1) ; //s
//        System.out.println(lastChar2);
//
//        //note : s.charAt(0) kodu bize herzaman ilk karakteri verir cunku index 0 dan baslar
//        //note : s.charAt( s.length()-1 ) charAt method parantezine almak istedigimiz indexi vermemiz gerekiyor
//        // s.length()-1 ile her zaman son index i alabilmeyi saglamis olduk
//
//        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
//        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)
//
//        String firstFourChar = s.substring(0,4) ; //Java
//        System.out.println(firstFourChar);
//
//        //Example 4: "s" String'indeki "is" kelimesini aliniz.
//        String s2 = s.substring(5, 7);
//        System.out.println(s2);//is
//
//        //Example 5: "s" String'indeki "easy" kelimesini aliniz.
//        //1.yol
//        String s3 = s.substring(8, 12);
//        System.out.println(s3);//easy
//
//        //2.yol
//        //Bir characterden baslayarak sonuna kadar almak isterseniz o zaman tek parametreli methodu kullanabilirsiniz
//        String s4 = s.substring(8);
//        System.out.println(s4);
//
//        //Example 6:  "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
//        boolean isExist = s.contains("Easy");
//
//        System.out.println(isExist); //false
//
//        //Example 7: "s" stringin belli bir harfle baslayip baslamadigini kontrol ediniz.
//        boolean isStart = s.startsWith("Java");
//        System.out.println(isStart); //true
//
//        //Example 8: "s" stringinin easy ile bitip bitmedigini kontrol ediniz.
//        boolean isEnd = s.endsWith("easy");
//        System.out.println(isEnd);
//










        String s = "Learn Java earn 456 money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s1 = s.replace("money","dollar");
        System.out.println(); //Learn Java earn dollar

        //Ornek 2: "s" stringindeki tum "e" harfleri siliniz

        String s2 = s.replace("e","");
        System.out.println(s2);

        //Ornek 3: s stringindeki tum rakamlari(0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz

        //Regex : regular expressions

        /*
                        Meshur Regex'ler

    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7) Tum sesli harfler ==> [aeiouAEIOU]
       x, q, w harfleri ==> [xqw]

    8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
    9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

Bu kisimda [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
    Sadece space karakteri : \\s
    Space karakteri haric  : \\S
    Sadece rakamlar        : \\d  (digit ten geliyor)
    Rakamlar haric         : \\D
*/

        //Ornek 3: s Stringindeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz

        String s3 = s.replaceAll("[0-9]","*");
        System.out.println(s3);

        //Ornek 4: "s" stringindeki rakam sayisini bulunuz
        int num= s.replaceAll("[^0-9]","").length();
        System.out.println(num);



    }
}
