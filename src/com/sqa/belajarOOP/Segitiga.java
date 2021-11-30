package com.sqa.belajarOOP;
import java.util.Scanner;

public class Segitiga extends BidangRuang implements Ruang2D{
	
	private float alas = 0;
	private float tinggi = 0;
	
	
	public Segitiga() {
		
	}
	public Segitiga(float alas, float tinggi) {
   	 
   	 this.alas = alas;
   	 this.tinggi = tinggi;
   	 
    }
	
	@Override
	public void gambarRuang() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Tinggi Segitiga : ");
		int tinggi = input.nextInt();
		for (int i = 0; i <= tinggi; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	@Override
	public float luas() {
		// TODO Auto-generated method stub
		return 0.5f * alas * tinggi;
	}

	@Override
	public float keliling() {
		// TODO Auto-generated method stub
		return 3*alas;
	}

	public float getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public float getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	
	
	
}
