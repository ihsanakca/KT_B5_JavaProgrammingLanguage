package day13_ForLoops;

public class C01_Ternary_New_Nested {
    public static void main(String[] args) {

       /*
        Kullanicidan bir tamsayi alin.
        Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        uygun olani yazdirin

        */

        int sayi = -20;

        System.out.println(sayi > 0
                ? sayi % 2 == 0 ? "Pozitif çift sayıdır." : "Pozitif tek sayıdır."
                : sayi > -1000 && sayi < -99 ? "Üç basamaklı negatif sayıdır" : "Üç basamaklı olmayan negatif sayıdır" +
                ".");

        /*
        girilen farklı üç sayıdan en büyüğünü bir değişkene atayın ve yazdırın.
         */

        int x = 10, y = 20, z = 30;

        int max = x > y && x > z
                ? x
                : y > z ? y : z;

        System.out.println("max = " + max);


        // Math clasını kullanarak...
        int temp=Math.max(x,y);
        int maxx=Math.max(temp,z);
        System.out.println("maxx = " + maxx);

    }
}
