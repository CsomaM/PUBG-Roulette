package solo.pubgroulette.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Weapons {

    List<String> weapons = Arrays.asList(
            "Pistols only",
            "SMGs only",
            "Shotguns only",
            "Assault rifles only",
            "Snipers only",
            "Snipers but no scope above 2x",
            "Single fire SMgs only",
            "Single fire Assault rifles only",
            "Any weapons"
    );

    public Weapons() {
    }

    public String getRandomWeapon() {
        Random r = new Random();
        int n = r.nextInt(weapons.size()) + 1;
        return weapons.get(n - 1);
    }
}
