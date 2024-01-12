package day06_Concat_TypeCasting;

public class C06_ClassTask {
    public static void main(String[] args) {
        /*
        60 soruluk bir sınavda 4 yanlış 1 doğruyu götürmektedir.
        Tüm sorulara cevap veren bir öğrencinin 51,25 neti
        olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?
         */

        int toplamSoruAdedi=60;
        double oran=4;
        double net=51.25;

        double yanlisAdet=(toplamSoruAdedi-net)/(1+1/oran);

        System.out.println(yanlisAdet);

        /*
        Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
İfadesini bir değişkene atayın ve yıl başka bir değişken ile
kontrol edilebilsin.
TASK

         */

        int yil=1553;
        String str="Fatih Sultan Mehmet "+yil+" yılında İstanbul u fethetmiştir.";
        System.out.println(str);


    }
}
