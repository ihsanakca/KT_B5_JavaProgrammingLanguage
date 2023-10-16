package day41_Encapsulation_Static;

import java.util.Scanner;

public class Car {
    String marka;
    int modelYili;
    private String saseNo;
    private String motorNo;
    private int beygir;
    boolean isManual;
    boolean isSUV;
    private final String sifre = "AcilsinKapilar";
    static int tekerlekSayisi = 4;

    public Car(){

    }

    public Car(String marka) {
        this.marka = marka;
    }

    public Car(String marka, int modelYili) {
        this.marka = marka;
        this.modelYili = modelYili;
    }

    public Car(String marka, int modelYili, int beygir) {
        this.marka = marka;
        this.modelYili = modelYili;
        this.beygir = beygir;
    }

    public Car(String marka, int modelYili, int beygir, boolean isManual) {
       this(marka,modelYili,beygir);
        this.isManual = isManual;
    }

    public int getBeygir() {
        return beygir;
    }

    public void setBeygir(int beygir) {
        if(beygir<1){
        return;
        }
        this.beygir=beygir;
    }

    public Car(String marka, int modelYili, String saseNo, String motorNo, int beygir, boolean isManual, boolean isSUV) {
        this.marka = marka;
        this.modelYili = modelYili;
        this.saseNo = saseNo; //
        this.motorNo = motorNo;
        this.beygir = beygir;
        this.isManual = isManual;
        this.isSUV = isSUV;
    }

    public String getSaseNo(){
        return saseNo;
    }

    public void setSaseNo(String yeniSaseNo){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sase no degistirmek istiyorsunuz. Lutfen Super Sifreyi Giriniz: ");
        String sifre = scanner.nextLine();
        if(sifre.equals(this.sifre)){
            saseNo = yeniSaseNo;
            System.out.println("Sase no basari ile degistirildi");
            return;
        }
        System.out.println("Hatali Sifre. Sase no degistirmeye yetkiniz yoktur");
    }

    public String getMotorNo() {
        return motorNo;
    }

    public void setMotorNo(String yeniMotorNo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Motor no degistirmek istiyorsunuz. Lutfen Super Sifreyi Giriniz: ");
        String sifre = scanner.nextLine();
        if(sifre.equals(this.sifre)){
            motorNo = yeniMotorNo;
            System.out.println("Motor no basari ile degistirildi");
            return;
        }
        System.out.println("Hatali Sifre. Motor no degistirmeye yetkiniz yoktur");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", modelYili=" + modelYili +
                ", saseNo='" + saseNo.substring(saseNo.length()-4) + '\'' +
                ", motorNo='" + motorNo.substring(motorNo.length()-4) + '\'' +
                ", beygir=" + beygir +
                ", isManual=" + isManual +
                ", isSUV=" + isSUV +
                ", tekerlekSayisi='" + tekerlekSayisi + '\'' +
                '}';
    }


   //instance method instnace ve static method ve degisklenler cagirilabiliyor
    public  String beygirKarsilastir(){
        if(beygir>100){
            return "Guclu Motor";
        }
//        System.out.println("tekerlekSayisi = " + tekerlekSayisi);
//        toString();
//        lastikDegistir();
        return "Zayif Motor";
    }
    //static method - static variable static methodlar cagirilabilir
    public static void lastikDegistir(){
        System.out.println("Degistirilecek Lastik Adeti "+tekerlekSayisi);
    }



}
