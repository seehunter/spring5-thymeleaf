package com.wudskq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * @PackageName com.wudskq.controller
 * @ClassName HelloController
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/3/29 IntelliJ IDEA
 * @Since 1.0
 * @Description
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("name", "tom");
        return "404";
    }
}
