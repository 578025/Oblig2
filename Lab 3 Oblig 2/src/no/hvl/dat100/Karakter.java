package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i= 1; i <= 10; i++) {


		String tallTxt = showInputDialog("Score mellom 0 og 100: ");
		int score = parseInt(tallTxt);
		
		if(score < 0 || score > 100) {
			showMessageDialog(null,"Må være mellom 0 og 100 ");
		
			i--;
			continue;
		}
	
		String karakter;
		if (score < 40) karakter = "F"; else
		if (score < 50) karakter = "E"; else
		if (score < 60) karakter = "D"; else
		if (score < 80) karakter = "C"; else
		if (score < 90) karakter = "B"; else
		 karakter = "A";
		
		showMessageDialog (null,"Karakteren din er: " + karakter);
	}
	}}

