package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.DefectSeverityDetails;
import com.example.demo.model.Developer;



@Controller
@RequestMapping
public class AjaxHandlingController {
	
	 
     
	 @PostMapping(value = "/getDefectCount")
	    public @ResponseBody DefectSeverityDetails postEmployeeData( @RequestBody Developer developer){
	        System.out.println("...................");
	        DefectSeverityDetails defectSeverityDetails = new DefectSeverityDetails();
	        defectSeverityDetails.setHiegh(3);
	        defectSeverityDetails.setMedium(2);
	        defectSeverityDetails.setMedium(8);
	        
	        return defectSeverityDetails;
	    }
}
