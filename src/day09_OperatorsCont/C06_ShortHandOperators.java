package day09_OperatorsCont;

public class C06_ShortHandOperators {
    public static void main(String[] args) {

        int number = 10; //decleration, assignment
        number = 20;
        System.out.println("number = "+number);

        String text = "Java Programming Language";
        System.out.println("text = "+text);

        text = "Phyton Programming Language";
        System.out.println("text = "+text);

        text = "Golden Globe";
        System.out.println("text = "+text);
        System.out.println("-------------------------");

        int x = 50;
        x = x +1;   //x++;
        System.out.println("x = "+x);

        x+=25;   //x=x+25;  x+=25 shorthand operators
        System.out.println("x = "+x);

        double y = 13.5;
        System.out.println("y = "+y);

        y-=3.5;   // y = y - 3.5
        System.out.println("y = "+y);

        double bakiye = 1650.54;
        System.out.println("bakiye = "+bakiye);

        bakiye +=1500;
        System.out.println("bakiye = "+bakiye);

        bakiye -=3000;
        System.out.println("bakiye = "+bakiye);

        double sayi = 15;
        System.out.println("sayi + "+sayi);
        sayi*=2;
        System.out.println("sayi + "+sayi);

        sayi%=4; //sayi = sayi %4
        System.out.println("sayi + "+sayi);

        double maas = 50000;
        maas /=2;
        System.out.println("maas = "+maas);

        System.out.println("-------------------------");

        String word = "Golden";
        word+="Globe";  // word = "Golden" + "Globe"
        System.out.println(word);
        word+="New";
        System.out.println(word);


        System.out.println("--------------------------");

        int odenecekTutar = 1130;
        System.out.println("odenecekTutar = "+odenecekTutar);

        int ikiyuzluk = 1130 / 200;
        odenecekTutar %=200;  //130 TL
        System.out.println("odenecekTutar = "+odenecekTutar);
        int yuzluk = odenecekTutar / 100;
        odenecekTutar %=100;
        System.out.println("odenecekTutar = "+odenecekTutar);

        int yirmilik = odenecekTutar/20;
        odenecekTutar %=20;    //10
        System.out.println("odenecekTutar = "+odenecekTutar);

        int onluk = odenecekTutar/10;
        odenecekTutar %=10;
        System.out.println("odenecekTutar = "+odenecekTutar);

        System.out.println("1130TL icin; " +ikiyuzluk+" adet ikiyuzluk banknot, "+yuzluk+" adet yuzluk banknot, "+yirmilik+"" +
                " adet yirmilik banknot, "+onluk+" onluk banknot odemeniz gerekmektedir!" );
















    }
}
