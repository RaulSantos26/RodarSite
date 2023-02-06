package br.com.bb.RodarSite.controllers;

import br.com.bb.RodarSite.dto.PaisesDto;
import br.com.bb.RodarSite.services.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RodarSiteController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping("/")
    public String abrir(){
        List<PaisesDto> dto = paisesService.findAll();
        dto.forEach(System.out::println);

        return "index";
    }
}
