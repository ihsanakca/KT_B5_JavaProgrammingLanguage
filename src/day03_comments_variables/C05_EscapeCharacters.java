package day03_comments_variables;

public class C05_EscapeCharacters {
    public static void main(String[] args){
        // \n  -> Yeni Satir
        // \t  -> bir tab bsoluk birakti
        // \b  -> Backspace
        // \"  -> "
        // \r  -> Satir Basi
        // \\  ->  \


        System.out.println("One\tTwo\tThree");
        System.out.println("One\bTwo\bThree");
        System.out.print("One\nTwo\nThree\n");
        System.out.println("\"One\" \"Two\" \"Three\"");
        // ' there is no excape chars for ' you can write it in the string
        System.out.print("'One' 'Two' 'Three'");
        System.out.println("One Two\rThree");
        System.out.println("One\\Two\\Three");


    }


}
