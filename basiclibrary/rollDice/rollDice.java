public class rollDice {
    public int[] roll(int n) {
        int[] output = new int[n];
        Random rand = new Random();
        for(int i=0; i < n; i++) {
            output[i] = rand.nextInt(1, 6);
        }
        return  output;
    }

    public boolean cotainsDuplicates(int[ array]){
        for(int i=0; i < array.length; i++) {
            for (int j =1; j < array.length; j++){
                if (i ==j) continue;
                if (array[i] == array[j])
                    return true;
            }
        }
        return false;
    }

    public int calculateAverage(int[] arrayOfValues){
        int sum = 0
                int arrayLength = arrayOfValues.length;
        for (int i = 0; i <arrayOfValues.length; i++){
            sum = sum + arrayOfValues[i];
        }
        return sum/arrayLength;
    }
    public int[] lowestAverageArray(int[][ weeklyMonthTemperatures]){
        for (int i = 0; i < weeklyMonthTemperatures.length; i++){
            int arrayAverage = calculateAverage(weeklyMonthTemperatures[i])
        }
        return lowestAverageArray();
    }
    public int findAverageofArray(int[] array){

    }
}
