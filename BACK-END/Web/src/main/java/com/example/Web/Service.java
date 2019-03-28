package com.example.Web;

public class Service {

	
	int suma=0;
	
	public Service() {
		
	}
	
	public void sumar(ValoresEntrada a) {
		
		Sumar suma= new Sumar(a);
		this.suma= suma.getSuma();
		
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	
	
}
