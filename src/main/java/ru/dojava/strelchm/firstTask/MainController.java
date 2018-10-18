package ru.dojava.strelchm.firstTask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    /**
     * Гет-запрос на главную страницу
     *
     * @param concat - ФИО
     * @param model - модель
     * @return - страницу html "greeting"
     */
    @GetMapping("/")
    public String greeting(@RequestParam(name = "concat", required = false, defaultValue = " ") String concat,
                           Model model) {
        model.addAttribute("concat", concat);
        return "greeting";
    }

    /**
     * Пост-запрос на главную страницу
     *
     * @param name - имя
     * @param surname - фамилия
     * @param model - модель
     * @return - страницу html "greeting"
     */
    @PostMapping("/")
    public String concatenation(@RequestParam(name = "name", required = false, defaultValue = "") String name,
                                @RequestParam(name = "surname", required = false, defaultValue = "user") String surname,
                                ModelMap model) {

        /*if(name.isEmpty() && surname.isEmpty()) {
            model.put("concat", "");
        } else {*/
        model.put("concat", "Hello, dear " + name + "  " + surname);
        return "greeting";
    }


    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "surname", required = false) String surname,
                        Model model) {
        model.addAttribute("nameMy", name);
        model.addAttribute("surnameMy", surname);
        return "hello";
    }

}