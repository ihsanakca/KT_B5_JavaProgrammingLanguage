package day04_variables;

public class C06_Currencies {
    public static void main(String[] args){

        //$1000 exchage rate

        int dollar = 1000;

        double lira = dollar * 27.0937;
        double euro = dollar * 0.925;
        double jpy = dollar * 145.37;
        double pound = dollar * 1.2687;
        double cad = dollar * 1.3539;
        double yuan = dollar * 7.2796;

        System.out.println("Lira = "+lira);
        System.out.println("Euro = "+euro);
        System.out.println("JPY = "+jpy);
        System.out.println("Pound = "+pound);
        System.out.println("CAD = "+cad);
        System.out.println("Yuan = "+yuan);





    }
}
