package com.sqa.belajarOOP;

public class Balok extends Kotak implements Ruang3D{
	
	 public Balok(float sisi) {
		// TODO Auto-generated constructor stub
		 this.setNilaiSisi(sisi);
	}
	
	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return getNilaiSisi() * getNilaiSisi()*getNilaiSisi();
	}

}
