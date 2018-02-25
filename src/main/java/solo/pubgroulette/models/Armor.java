package solo.pubgroulette.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Armor {

    List<String> armor = Arrays.asList(
        "Level 1 only",
        "Level 2 only",
        "Level 3 only",
        "Helmet only",
        "Vest Only",
        "No Armor",
        "Any armor"
    );

    public Armor() {
    }

    public String getRandomArmor() {
        Random r = new Random();
        int n = r.nextInt(armor.size()) + 1;
        return armor.get(n - 1);
    }
}
