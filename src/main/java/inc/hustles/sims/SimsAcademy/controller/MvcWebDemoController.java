package inc.hustles.sims.SimsAcademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcWebDemoController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }
}
