package com.sqa.belajarOOP;
import java.util.ArrayList;
import java.util.List;

public class MainanBalok {
	List<Mainan> lstMainan = new ArrayList<Mainan>();
	
	public void add(Mainan mainan) {
		lstMainan.add(mainan);
	}
	
	public void mainkanSemua () {
		for(Mainan mainan : lstMainan) {
			mainan.mainkan();
		}
	}
}
