package day38_Constructors;

public class C01_StrongPassword {

    public static void main(String[] args) {
        String password = "Ab12345!";
        System.out.println("isStrongPassword(password) = " + isStrongPassword(password));


    }


  public static boolean isStrongPassword(String password){

    //      Password must be at least have 8 characters long  and should not contain space
      boolean b1 = password.length() >= 8 && !password.contains(" ");
      boolean b2 = false; // uppercase
      boolean b3 = false; // lowercase
      boolean b4 = false; // digit
      boolean b5 = false; // special characters

      char[] charArray = password.toCharArray();

      for (char c : charArray) {
          if(Character.isUpperCase(c)){
              b2=true;
          } else if (Character.isLowerCase(c)) {
              b3=true;
          } else if (Character.isDigit(c)) {
              b4 =true;
          } else {
              b5=true;
          }
      }

      boolean isStrongPassword = b1 && b2 && b3 && b4 && b5;

      return isStrongPassword;
  }
}
/*
 Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space +
        1.2 PassWord should at least contain one upper case letter +
        1.3 PassWord should at least contain one lower case letter +
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit +
 */