package com.api.pruebaptm.apiPrueba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/getfibonacci")
public class fivonacciController {

	 @GetMapping("/number/{index}")
	    public Integer getNumber(@PathVariable Integer index) {


	        int serie = index + 1 , num1 = 0, num2 = 1, suma = 0, retorno=0;



	        for (int i = 1; i <= serie; i++) {


	        	suma = num1 + num2;

 	            num1 = num2;

 	           num2 = suma;
	             if(i==index && i!=1 && suma>1) {
	            	
	            	
	 	            

	            		            	 return num2;

	        }else {
	        	retorno =  1;}
	        }
	        
	             
return retorno;
	    }


	


}
