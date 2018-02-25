package solo.pubgroulette.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Location {

    List<String> erangel = Arrays.asList(
         "Zharki",
         "Northwest Bunker",
         "Plane Crash",
         "Shooting Range",
         "Severny",
         "Yasnaya Compound",
         "Stalber",
         "Kameshki",
         "Georgopol",
         "Hospital",
         "Ruins",
         "Water Town",
         "Rozhok",
         "School",
         "Apartments",
         "Yasnaya Polyana",
         "Mansion",
         "Lipovka",
         "Swamp Town",
         "Gatka",
         "Gatka Trenches",
         "Pochinki",
         "Shelter",
         "Prison",
         "Woodcutter Camp",
         "Mylta",
         "Mylta Power",
         "Farm",
         "Farm Ridge",
         "Ridge Complex",
         "Farmlands",
         "Quarry",
         "Ferry Pier",
         "Primorsk",
         "Military Base",
         "Novorepnoye Radio",
         "Novorepnoye"
    );
    List<String> miramar = Arrays.asList(
        "Ruins",
        "Trailer Park",
        "La Cobreria",
        "Crater Fields",
        "El Pozo",
        "San Martin",
        "Hacienda del Patron",
        "Water Treatment",
        "Torre Ahumada",
        "Cruz del Valle",
        "Campo Militar",
        "Tierra Bronca",
        "El Azahar",
        "Monte Nuevo",
        "Power Grid",
        "Pecado",
        "Graveyard",
        "Minas Generales",
        "La Bendita",
        "Junkyard",
        "Impala",
        "Islands next to Impala",
        "Puerto Paraiso",
        "Mines",
        "Los Leones",
        "Chumacera",
        "Ladrillera",
        "Valle del Mar",
        "Prison",
        "Minas del Sur",
        "Los Higos"
    );

    public Location() {
    }

    public String getLocation(int mapNum) {
        if (mapNum == 1) {
            return getRandomLocation(erangel);
        } else {
            return getRandomLocation(miramar);
        }
    }

    public String getRandomLocation (List<String> map) {
        Random r = new Random();
        int n = r.nextInt(map.size()) + 1;
        return map.get(n - 1);
    }
}
