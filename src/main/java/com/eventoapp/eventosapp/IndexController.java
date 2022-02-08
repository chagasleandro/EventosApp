package com.eventoapp.eventosapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.*;
import org.springframework.web.bild.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
