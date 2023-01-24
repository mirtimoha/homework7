import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //first task
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        String [] array3 = {"new", "array", "is", "created"};

        //second task
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println(array1[array1.length-1]);

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i]);
            System.out.print(", ");
        }
        System.out.println(array2[array1.length-1]);

        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i]);
            System.out.print(", ");
        }
        System.out.println(array3[array3.length-1]);

        //third task
        for (int i = array1.length - 1; i > 0 ; i--) {
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println(array1[0]);

        for (int i = array2.length - 1; i > 0; i--) {
            System.out.print(array2[i]);
            System.out.print(", ");
        }
        System.out.println(array2[0]);

        for (int i = array3.length - 1; i > 0; i--) {
            System.out.print(array3[i]);
            System.out.print(", ");
        }
        System.out.println(array3[0]);

        // fourth task
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 != 0) {
                array4[i] = array4[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array4));
    }
}