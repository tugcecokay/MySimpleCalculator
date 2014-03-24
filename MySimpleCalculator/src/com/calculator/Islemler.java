package com.calculator;

import java.util.Scanner;

public class Islemler {
	private float x;//private x değerinin başka class'larda kullanımını engeller.Set get methodları kullanarak bu değerleri başka class'larda 
	private float y;// kullanıma açıyoruz
	
	public float  getX() {
		return x;
	}
	public void setX(float  x) {
		this.x = x;
	}
	public float  getY() {
		return y;
	}
	public void setY(float  y) {
		this.y = y;
	}
	public Islemler() {
		super();
		this.x = x;
		this.y = y;
	}
	
	public float  toplama(float x, float  y){//toplama işlemini yapan method
		float  toplam = x+y;
		return toplam;
	}
	
	public float  cikarma(float  x, float y){//çıkarma işlemini yapan method
		float  cikart = x-y;
		return cikart;
	}
	public float bolme(float  x, float  y){//bölme işlemini yapan method
		float bol; 		
		bol = x/y;
		return bol;
	}
	public float  carp(float x,float  y){//çarpma işlemini yapan method
		float  carp = x*y; 
		return carp;
	}
	public float kokal(float x){
		float kokal=(float) Math.sqrt(x);
		return kokal;
	}
	public float üsal(float x, float y){
		float üsal = (float) Math.pow((x),(y));
		return üsal;		
	}

}
