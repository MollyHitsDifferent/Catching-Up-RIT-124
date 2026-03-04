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
        new Fighter("d10" , Dice.d4, 22, "Roarger"),
        new Fighter("d10" , Dice.d4, 22, "boarger"),
        new Fighter("d10" , Dice.d4, 22, "Coarger"),
        new Fighter("d10" , Dice.d4, 22, "Toarger"),
        new Fighter("d10" , Dice.d4, 22, "XDoarger")
        ;}
        System.out.println(fiteList);
    }
}
