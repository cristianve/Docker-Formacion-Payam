package com.example.Web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping(value = "/hola", method = RequestMethod.POST) //ANOTACION FOR POST 

	
	@PostMapping
	public ResponseEntity<?> newBazz(@RequestParam("firstNum") Integer firstNum,@RequestParam("secondNum") Integer secondNum){
		
		
		 ValoresEntrada valores= new ValoresEntrada(firstNum,secondNum);
		 Service service= new Service();
		 service.sumar(valores);
		 
		
		//System.out.println(firstNum+ " "+secondNum);
	    return new ResponseEntity<>("La suma de los valores777: "+valores.getX()+" + "+valores.getY()+" = "+service.getSuma(), HttpStatus.OK);
	}



}
