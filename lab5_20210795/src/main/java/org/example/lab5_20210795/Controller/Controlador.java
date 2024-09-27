package org.example.lab5_20210795.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    @GetMapping("")
    public String index(){
        return "paginaprincipal";
    }
}
