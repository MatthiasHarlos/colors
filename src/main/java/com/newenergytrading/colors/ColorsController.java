package com.newenergytrading.colors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ColorsController {
    private static List<Color> colors = new ArrayList<>();
    private static int counter;

    @GetMapping("/")
    public String redirect() {
        return "redirect:colorForm";
    }

    @GetMapping("delete")
    public String deleteAll() {
        colors = new ArrayList<>();
        counter = 0;
        return "start";
    }

    @GetMapping("colorForm")
    public String colorForm() {
        return "colorForm";
    }

    @PostMapping("colorForm")
    public String yyy(Color color) {
        colors.add(color);
        return "colorForm";
    }

    @GetMapping("start")
    public String start(Model model) {
        if (colors.size() < 1) {
            return "redirect:colorForm";
        }
        counter++;
        if (counter == colors.size()) {
            counter = 0;
        }
        model.addAttribute("colorOutput", "background-color:" + colors.get(counter).getColor());
        return "start";
    }

}
