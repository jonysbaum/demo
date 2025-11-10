package com.galvanize.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;


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
    public String addToHashMap() {return ""}
}