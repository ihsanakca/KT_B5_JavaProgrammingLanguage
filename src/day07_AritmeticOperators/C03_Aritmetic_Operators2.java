package day07_AritmeticOperators;

public class C03_Aritmetic_Operators2 {
    public static void main(String[] args) {

        // 4500 dakika kaç saatir?
        int dk=4587;
        int saat=dk/60;
        int kalanDk=dk%60;

        System.out.println("saat = " + saat);
        System.out.println("kalanDk = " + kalanDk);


        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)

      int totalSecond=31502;
      // 1 min = 60 seconds
        //1 hour = 60 minutes
        // 1 hour = 3600 seconds

        int hour=totalSecond/3600;
        int minute=totalSecond%3600/60;
        int second=totalSecond%60;

        System.out.println(totalSecond+ " saniye "+hour+
                " saat "+minute+" dakika "+second+" saniyedir.");



    }

}
