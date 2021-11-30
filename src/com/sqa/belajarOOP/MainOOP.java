package com.sqa.belajarOOP;

import java.util.ArrayList;
import java.util.List;

public class MainOOP {

	public static void main(String[] args) {

		BidangRuang bidang1 = new BidangRuang(); //instance
		bidang1.setNama("Lingkaran");
		BidangRuang bidang2 = new BidangRuang();
		bidang2.setNama("Segitiga");
		
		System.out.println("Bidang 1 Nama ->" + bidang1.getNama());
		System.out.println("Bidang 1 Nama ->" + bidang1.hitungLuas());
		System.out.println("Bidang 2 Nama ->" + bidang2.getNama());
		System.out.println("Bidang 2 Nama ->" + bidang2.hitungLuas());
		
		Segitiga segitiga = new Segitiga();
		segitiga.setNama("Segitiga Sama Sisi");
		segitiga.gambarRuang();
		
		Kotak kotak = new Kotak();
		kotak.setNama("Kotak");
		kotak.gambarRuang();
		
		BidangRuang [] ruang = new BidangRuang[2];
		ruang[0] = segitiga;
		ruang[1] = kotak;
		
		for(int i = 0; i < ruang.length; i++) {
			ruang[i].gambarRuang();
		}
		
		Tesseract tesseract = new Tesseract();
		
		MainanBalok mainan = new MainanBalok();
		
		mainan.add(kotak);
		mainan.add(segitiga);
		mainan.add(tesseract);
		
		mainan.mainkanSemua();
		
		
		List<Ruang2D> lstRuang = new ArrayList<Ruang2D>();
		
		lstRuang.add(new Kotak(10));
		lstRuang.add(new Segitiga(5, 10));
		lstRuang.add(new Balok(5));
		
		
		for (Ruang2D ruang2d : lstRuang) {
			
			if(ruang2d instanceof Ruang3D) {
				System.out.println("Volumenya adalah " + ((Ruang3D)ruang2d).volume());
			}
			
			System.out.println("Luasnya adalah " +ruang2d.luas());
		}
	}

}
