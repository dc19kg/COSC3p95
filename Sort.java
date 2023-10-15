import java.util.Random;

/*
 * COSC 3p95
 * Assignment 1
 * @author Deryk Cotton
 * Student #4876411
 * @version 1.0 (Oct 15, 2023)
 */
public class Sort {
    private int[] sortedArr; // global variable to be changed in constructor
    public Sort(int arr[]) { // parameter taken from the main class of the randomly generated array
        sortedArr = sorting(arr); //setting the global array variable to the method call
        printSorted(); // printing the array
    }

    public static int[] TestCases() { // generates the test cases, one at a time
        Random random = new Random(); // creating the random generator
        int size = random.nextInt(20); // Generates a random array length between 0 and 20 (for easier readability)
        int[] array = new int[size]; // creates the array of random size
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); // Generates random numbers between 0 and 100
        }
        return array; // returning the array
    }

    private static int[] sorting(int[] arr){
        //loops to go through the array of integers
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0; //temporary variable to help with sorting
                //sorting
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; // return the values of the array
    }

    private void printSorted(){
        System.out.println("Sorted array:"); //separation for tests
        for (int num : sortedArr) { // loop to get all values of the array
            System.out.print(num + " "); // printing the values
        }
    }

    public static void main(String[] args) {
        int[] randomArray = TestCases(); // creating the array to be used by the constructor
        System.out.println("Unsorted array:"); //separation for tests
        for (int num : randomArray) { // loop to get all values of the array
            System.out.print(num + " "); // printing the values
        }
        System.out.println(); // newline
        Sort x = new Sort(randomArray); // setting the array to the previously generated one
    }
}