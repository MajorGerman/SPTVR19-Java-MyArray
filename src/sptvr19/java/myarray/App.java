package sptvr19.java.myarray;
import java.util.Arrays;
import java.util.Random;

class App {
    public static void run() throws InterruptedException {
        
        int lenght = 20;
        int i;
        
        System.out.println("   --- MyArray ---");
        System.out.println("--- by Georg Laabe ---");
        
        System.out.println("\nExercise: ");
        System.out.println("\nCreate an array of 20 random even integers.");
        System.out.println("Calculate the average of the array elements");
        System.out.println("without regard to the minimum and maximum elements of the array.");
                
        System.out.println("\nSolution:");
                     
        System.out.printf("\n ---------------- Random Array --------------");
        
        for (i = 11; i < lenght; i++) {
            System.out.print("----");
        }
        System.out.println("");
        
        int array[] = new int[lenght];
        int sum = 0;
        int number; 
        
        int max = 0;
        int min = 0;
                
        Random rand = new Random();
        
        
        for (i = 0; i < lenght; i++) {
            number = rand.nextInt(50);
            array[i] = number * 2;
            sum += number;
            System.out.printf("%4d", array[i]);
        }
        
        System.out.print("\n --------------------------------------------");
        
        for (i = 11; i < lenght; i++) {
            System.out.print("----");
        }
        System.out.println("");
        Arrays.sort(array);
        
        sum -= array[0];
        sum -= array[lenght - 1];
        array[0] = 0;
        array[lenght - 1] = 0;
        
        System.out.println("\nAverage is: " + sum / (lenght - 2));
        Thread.sleep(6000);
    }
}