package com.galvanize.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
class Warmup{

	@GetMapping("/")
	public String getDirectory(){
		return "you got /";
	}
	@GetMapping("/{id}")
	public String getId(@PathVariable String id){
		return "You got " + id;
	}
    @PostMapping("/add-pokemon")
    public String addToHashMap() {return null;}
}