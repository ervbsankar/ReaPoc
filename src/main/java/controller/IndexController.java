package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by A513915 on 7/29/2015.
 */

@Controller
public class IndexController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index(){
       // return "index";
        return "redirect:/resources/index.html";
    }
}
