package org.academiadecodigo.hackaton.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class WebHomeController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String home () {
        return "home/home";
    }

}
