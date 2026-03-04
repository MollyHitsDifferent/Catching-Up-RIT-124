import java.util.*;
import java.util.stream.IntStream;
public class Fighter {
    private String hitDie;
    private DieRolls DamDie;
    private int[] damRange;
    private int healthPoints;
    private String name;

    public Fighter(String hd, DieRolls dd, int hp, String name) {
        this.hitDie = hd;
        this.DamDie = dd
        this.damRange = DieRolls(this.DamDie);
        this.healthPoints = hp;
        this.name = name;
    }
    public int[] DieRolls(DieRolls x){
    String dicetoString = x.toString();
    int holder = Integer.parseInt(dicetoString);
    holder++;
    int[] damageRange = IntStream.rangeClosed(1, holder).toArray();
        return damageRange;
}
    public int[] getDamRange() {
        return damRange;
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
        return "Fighter name: " + this.getName() + " has " + getHealthPoints() + " HP.";
    }
    public static void main(String[] args) {
        // So you DONT USE NEW when you set up a stream for some reason. When you are looking to store
        // a stream as an array instantiate the variable as an arry, then stream to an array 
        int[] d8 = IntStream.range(1,9).toArray();
        Fighter J = new Fighter("d10" , d4 , 22, "Roarger");
    }
}
