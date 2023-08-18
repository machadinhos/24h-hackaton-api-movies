package org.academiadecodigo.hackaton.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")
public class WebCardController {

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String movie (@PathVariable Integer id) {

        switch (id) {
            case 1:
                return "movie/1";
            case 2:
                return "movie/2";
            case 3:
                return "movie/3";
            case 4:
                return "movie/4";
            case 5:
                return "movie/5";
            case 6:
                return "movie/6";
            case 7:
                return "movie/7";
            case 8:
                return "movie/8";
            case 9:
                return "movie/9";
            default:
                return "redirect:/home";
        }
    }

}
