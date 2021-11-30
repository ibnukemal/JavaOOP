package com.sqa.belajarOOP;

public class BidangRuang implements Mainan {

	public static void main(String[] args) {
		BidangRuang main = new BidangRuang();
		main.gambarRuang();
	}
	
	private String nama;
	
	public void gambarRuang() {
		System.out.println("Belum ada gambar");
	}
	
	public int hitungLuas() {
		return 0;
	}
	public int hitungVolume() {
		return 0;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	@Override
	public void mainkan() {
		
	}
	
}
