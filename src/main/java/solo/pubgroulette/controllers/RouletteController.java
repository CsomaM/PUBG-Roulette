package solo.pubgroulette.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import solo.pubgroulette.models.Armor;
import solo.pubgroulette.models.Location;
import solo.pubgroulette.models.Strats;
import solo.pubgroulette.models.Weapons;

@Controller
public class RouletteController {

    @RequestMapping({"", "/"})
    public String mainPage () {
        return "main";
    }

    @RequestMapping("chosenmap/{type}")
    public String stratPage (@PathVariable String type, Model model) {
        model.addAttribute("dropLocation", new Location().getLocation(Integer.parseInt(type)));
        model.addAttribute("weapon", new Weapons().getRandomWeapon());
        model.addAttribute("armor", new Armor().getRandomArmor());
        model.addAttribute("strat", new Strats().getRandomStrat());
        return "stratpage";
    }

    @RequestMapping("rules")
    public String rulesPage(Model model) {
        model.addAttribute("rules", new Strats().getStrats());
        return "rulespage";
    }
}
