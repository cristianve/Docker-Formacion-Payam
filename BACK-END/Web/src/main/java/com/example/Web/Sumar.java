package com.example.Web;

public class Sumar {
		
	int suma;
	public  Sumar(ValoresEntrada a) {
		
		this.suma= a.getX()+a.getY();
	}
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	
	
}
