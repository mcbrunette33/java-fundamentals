/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {

    public int[] roll(int n) {
        Random rand = new Random();
        int[] dieArray = new int[n];
        //create loop for die
        for (int i = 0; i < n; i++) {
            int dieRoll = rand.nextInt(6) + 1;
            dieArray[i] = dieRoll;
        }
        return dieArray;
    }

    public boolean containsDuplicates(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            for (int j = 1; j <= array.length - 1; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public float calculateAvgArray(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            }
        return sum / array.length;
    }
    public int[] calculateLowAvgArray(int[][] array){
        int[] lowestAvgArray = array[0];
        for(int i = 1; i < array.length; i++){
          if(calculateAvgArray(lowestAvgArray) > calculateAvgArray(array[i])){
              lowestAvgArray = array[i];
          }
        }
        return lowestAvgArray;
    }

}