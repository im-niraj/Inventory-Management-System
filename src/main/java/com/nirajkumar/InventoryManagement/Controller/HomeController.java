package com.nirajkumar.InventoryManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nirajkumar
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String Index(){
        return "index";
    }

}
