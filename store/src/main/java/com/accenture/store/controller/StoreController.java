package com.accenture.store.controller;

import com.accenture.store.dto.ProductDto;
import com.accenture.store.util.Resources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/product")
public class StoreController {




    @GetMapping
    public String getTestData() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        mv.getModel().put("data", "Welcome home man");

        return "funciono";
    }


}
