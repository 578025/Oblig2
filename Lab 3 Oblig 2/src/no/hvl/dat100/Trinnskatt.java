package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Double.*;

public class Trinnskatt {

	public static void main(String[] args) {
		String tallTxt = showInputDialog(" Brutto ");
		
		double brutto = parseDouble(tallTxt);
		double prosent;
		if (brutto < 180800) prosent = 0; else
		if (brutto <= 254500) prosent = 0.019; else
		if (brutto <= 639750) prosent = 0.042; else
		if (brutto <= 999550) prosent = 0.132; else
			prosent = 0.162;
		
		double trinnskatt = (double) (brutto *prosent);
		
		System.out.println("Trinnskatten din er: " + trinnskatt);
		

	}

}
