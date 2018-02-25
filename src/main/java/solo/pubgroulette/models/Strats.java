package solo.pubgroulette.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Strats {

    List<String> strats = Arrays.asList(
            "Can only loot red houses",
            "Fuckboy: You can only loot fuckboy shacks"
    );

    public Strats() {
    }

    public String getRandomStrat() {
        Random r = new Random();
        int n = r.nextInt(strats.size()) + 1;
        return strats.get(n - 1);
    }
}
