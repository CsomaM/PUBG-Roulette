package solo.pubgroulette.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouletteController {

    @RequestMapping({"", "/"})
    public String mainPage () {
        return "main";
    }
}
