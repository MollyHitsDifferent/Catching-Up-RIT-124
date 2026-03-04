// import java.util.stream.IntStream;



public enum Dice {
    d4(new int[] {1,2,3,4}),
    d6(new int[] {1,2,3,4,5,6}),
     d8(new int[] {1,2,3,4,5,6,7,8}),
      d10(new int[] {1,2,3,4,5,6,7,8,9,10}),
       d12(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}),
        d20(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});

    private int[] range;

    private Dice(int[] inputRange){
        this.range = inputRange;
    }
    public int[] getRange() {
        return range;
    }
   
}

