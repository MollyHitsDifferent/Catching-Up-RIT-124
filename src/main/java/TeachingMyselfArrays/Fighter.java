import java.util.*;
import java.util.stream.IntStream;

public class Fighter {
    private String hitDie;
    private Dice damDie;
    private int[] damRange;
    private int healthPoints;
    private String name;

    public Fighter(String hd, Dice dd, int hp, String name) {
        this.hitDie = hd;
        this.damDie = dd;
        this.damRange = damDie.getRange();
        this.healthPoints = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getHitDie() {
        return hitDie;
    }

    @Override
    public String toString() {
        return "Fighter name: " + this.getName() + " has " + this.getHealthPoints() + " HP.";
    }

    public static void main(String[] args) {
        // So you DONT USE NEW when you set up a stream for some reason. When you are looking to store
        // a stream as an array instantiate the variable as an arry, then stream to an array 
        Fighter[] fiteList = {
        new Fighter("d10" , Dice.d4, 9, "Roarger"),
        new Fighter("d10" , Dice.d4, 66, "boarger"),
        new Fighter("d10" , Dice.d4, 14, "Coarger"),
        new Fighter("d10" , Dice.d4, 13, "Toarger"),
        new Fighter("d10" , Dice.d4, 8, "XDoarger")};
        System.err.println("Full List");
        Arrays.stream(fiteList).forEach(System.out::println);
            System.out.println("Filter List");
        Arrays.stream(fiteList).filter(e -> e.getHealthPoints() >10).forEach(System.out::println);

        // this is a way to print each value without using any tools. Its not what they want me to do.
        // int counter = 0 ;
        // while (counter < 5){
        //     System.err.println(fiteList[counter]);
        //     counter++ ;
        // }
    }
}
