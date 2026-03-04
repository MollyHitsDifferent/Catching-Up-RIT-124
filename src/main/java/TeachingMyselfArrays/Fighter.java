import java.util.*;
import java.util.stream.IntStream;
public class Fighter {
    private String hitDie;
    private int[] damRange;
    private int healthPoints;
    private String name;

    public Fighter(String hd, int[] dr, int hp, String name) {
        this.hitDie = hd;
        this.damRange = dr;
        this.healthPoints = hp;
        this.name = name
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
        IntStream d8 = new IntStream.range(1,9);
        d8.forEach(System.out::println);
        // new Fighter("1d12", d8, 22, "Roarger")
    }
}
