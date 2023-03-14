package com.example.demomicroservice.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demomicroservice.bean.Employee;

@Controller
public class normalController {

	@GetMapping("/hello")
	 public String getString() {
    	System.out.println("getEmployee");
       return "index";
    }
	
	@GetMapping("/")
	 public String getindex() {
   	System.out.println("getEmployee");
      return "index1";
   }
}
