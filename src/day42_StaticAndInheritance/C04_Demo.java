package day42_StaticAndInheritance;

public class C04_Demo {
    public static void main(String[] args) {


        C06_SciCalc calc=new C06_SciCalc();
        int r1 = calc.add(8, 6);
        int r2 = calc.sub(9, 5);
        int r3 = calc.multi(4, 3);
        int r4 = calc.div(16, 4);
        double r5 = calc.power(4, 3);



        System.out.println(r1+" : "+r2+" : "+r3+" : "+r4+" : "+r5);

        C07_FlightCalculato calc2=new C07_FlightCalculato();
        calc2.yonHesapla();
        double power = calc2.power(4, 3);

        //    C03_Calculator obj=new C03_Calculator();


    }


    // parent - child ilişkisi varsa -- Single level Inheritance   ----    MÜMKÜN

    // grandparent - parent -child   -- ilişkisi varsa --- Multi Level Inheritance    ---- MüMKÜN

    // multiple Inheritance ---  javada yok  parent - parent >  Child    ---- MÜMKÜN DEĞİL


    // is a relation ---
    // parent - child
    // super - sub
    // base - derived
}


























