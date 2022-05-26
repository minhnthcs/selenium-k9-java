package lession_03;

public class Lab3_2 {

     /**
     * Finding maximum value/minimum value from an integer array
     *
     *     int[] intArr = {1, 2, 3, 4, 5};
     *
     *     Minimum: 1
     *     Maximum: 5
     */


    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 10, 35, -60, 15, 52};
        int max = myArray[0];
        int min = myArray[0];

        System.out.printf("Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }
        System.out.printf("\n");

        for (int index = 1; index < myArray.length; index++) {
            if (myArray[index] > max){
                int tmp = max;
                max = myArray[index];
                myArray[index] = tmp;
            }
        }

        for (int index = 1; index < myArray.length; index++) {
            if (myArray[index] < min){
                int tmp = min;
                min = myArray[index];
                myArray[index] = tmp;
            }
        }

        System.out.printf("Minimum: %d\n", min);
        System.out.printf("Maximum: %d", max);

    }
}
