package day35_Week07_Review;

public class C10_CountOddEven {

    public static void main(String[] args) {


        int[] num1= {5,8,45,26,78,99,13,21};

        int countOfEven= 0;
        int countOfOdd= 0;

        for (int each : num1) {
            if(each%2 ==0){
                countOfEven++;
            }else{
                countOfOdd++;
            }

        }

        System.out.println(countOfEven);
        System.out.println(countOfOdd);

    }
}
