package zetulunGunlugu2.GunTernaryStringManipulations;

public class Ternary {
    public static void main(String[] args) {

        //condition ? true ise : false ise ;
        int y =10;
        System.out.println( (y>5) ? (2*y) : (3*y));

        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c = 4;

        int result =  c<0 ?  -1*c : c ;
        System.out.println(result);

        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

        int a = 13;
        int b = -7;

        Object result2 = (a>0 && b>0)  || (a<0 && b<0) ? a*b : "Farkli isaretli sayilari carpamiyorum" ;

        System.out.println(result2);

        //Object java da butun Non-primitive (classlarin) ortak parent(baba) idir (==>Hz. Adem gibidir)
        //Object in parenti yoktur.
        //farkli data tipleri icin ortak bir variable olusturmak istediginizde data type olarak object kullaniriz,


//Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int x = -313;
        x= Math.abs(x);
        String resultYeni =  x>99 && x<1000 ?"uc basamaklidir" : "uc basamakli degildir" ;
        System.out.println(resultYeni);

        //interview question
        /*   Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */

        int year = -2000;

        String result2Yeni = year%100==0 ? year%400==00 ? "Leap" : "Not Leap" : year%4==0 ? "Leap" : "Not Leap" ;
        System.out.println(result2Yeni);


    }
}


