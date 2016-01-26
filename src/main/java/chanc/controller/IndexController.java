package chanc.controller;



import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")

public class IndexController {
    public static final Logger log = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.POST})
    public String index(HttpServletRequest request, Model model, HttpSession session) {
        model.addAttribute("md1", "opa-opa");

//        log.info("/index controller");
        return "index";
    }
}