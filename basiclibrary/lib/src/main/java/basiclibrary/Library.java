/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

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

    public int[] calculateLowAvgArray(int[][] array) {
        int[] lowestAvgArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (calculateAvgArray(lowestAvgArray) > calculateAvgArray(array[i])) {
                lowestAvgArray = array[i];
            }
        }
        return lowestAvgArray;
    }

    public String analyzingWeatherData(int[][] weather) {
        int lowTemp = 100;
        int highTemp = 0;
        HashSet<Integer> uniqueTemps = new HashSet<>();
        for (int[] array : weather) {
            for (int value : array) {
                uniqueTemps.add(value);
                if (value < lowTemp) {
                    lowTemp = value;
                }
                if (value > highTemp) {
                    highTemp = value;
                }
            }
        }
        String response = "High:" + highTemp + "\n" + "Low:" + lowTemp + "\n";
        for(int i = lowTemp; i < highTemp; i++){
            if(!uniqueTemps.contains(i)){
                response += "Never saw temperature:" + i + "\n";
            }
        }
        return response;
    }
    public String tally(List<String> array){
        HashMap<String, Integer> votes = new HashMap<>();
        int numberOfVotes = 0;
        String Winner = "";
        for(String name : array){
           if(!votes.containsKey(name)) {
               votes.put(name, 0);
           } else{
               votes.put(name, votes.get(name) + 1);
           }
           for (String person : array){
               if(votes.get(name) > numberOfVotes){
                   numberOfVotes = votes.get(name);
                   Winner = name;
               }
           }
        }
        return Winner + " got the most votes";
    }
}
