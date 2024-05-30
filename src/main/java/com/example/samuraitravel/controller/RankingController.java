package com.example.samuraitravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;

@Controller
public class RankingController {
	private final HouseRepository houseRepository;        
    
    public RankingController(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;            
    }  
    @GetMapping("/ranking")
    public String index(Model model) {
	
	List<House> Ranking = houseRepository.findTop10Ranking(); 
	model.addAttribute("Ranking", Ranking);
		return "ranking/index";
	}
	
	
    
}