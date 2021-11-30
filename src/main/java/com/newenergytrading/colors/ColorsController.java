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
    private static Color durationColor;

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
    public String colorForm(Model model) {
        if (colors.size() > 0) {
            model.addAttribute("backgroundColor", "background-color:" + colors.get(colors.size()-1).getColor());
        }
        if (colors.size() > 1) {
            model.addAttribute("colorText", "color:" + colors.get(colors.size()-2).getColor());
        }
        return "colorForm";
    }

    @PostMapping("colorForm")
    public String yyy(Model model, Color color) {
        colors.add(color);
        model.addAttribute("backgroundColor", "background-color:" + colors.get(colors.size()-1).getColor());
        if (colors.size() > 1) {
            model.addAttribute("colorText", "color:" + colors.get(colors.size()-2).getColor());
        }
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
        model.addAttribute("colors", colors);
        if (durationColor != null) {
            model.addAttribute("duration", durationColor.getDuration());
        }
        return "start";
    }
    @PostMapping("start")
    public String durationTime(Color color) {
        durationColor = color;
        return "redirect:start";
    }

}
