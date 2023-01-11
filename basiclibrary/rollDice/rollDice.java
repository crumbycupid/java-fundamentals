public class rollDice {
    public int[] roll(int n) {
        int[] output = new int[n];
        Random rand = new Random();
        for(int i=0; i < n; i++) {
            output[i] = rand.nextInt(1, 6);
        }
        return  output;
    }
}
