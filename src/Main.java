import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int []array= new int[]{2, 3, 4, 5, 6};
//        Math.pow(array.length,2);
//        System.out.println("numbers:"+Arrays.toString(array));
//        System.out.println("Power of numbers"+Arrays.toString(minArray(array)));
//    }
//
//    public static int [] minArray(int [] array){
//        for (int i = 0; i < array.length; i++)
//            //i= array.length;
//            Arrays.sort(array);
//        return array;

       Scanner scanner = new Scanner (System.in);
       int [] number = new int [10];

        for (int i = 0; i < number.length; i++) {
            System.out.print((i+1)+" Word: ");
            number [i]=scanner.nextInt();
        }
        for (int j = number.length-1; j >=0 ; j--) {
            System.out.println(" Number: "+ number[j]);

        }

    }
}


