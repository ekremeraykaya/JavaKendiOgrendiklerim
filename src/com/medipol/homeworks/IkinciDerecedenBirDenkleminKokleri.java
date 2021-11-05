package com.medipol.homeworks;

import java.util.Scanner;

public class IkinciDerecedenBirDenkleminKokleri {

	public static void main(String[] args) {
		
		System.out.println("ax^2 + bx + c = 0 ikinci dereceden bir denklemdir. Bu denklemin koklerini bulunuz.");
		
		Scanner scan = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		
		System.out.println("a degiskeninin degerini giriniz: ");
		a = scan.nextDouble();
		
		System.out.println("b degiskeninin degerini giriniz: ");
		b = scan.nextDouble();
		
		System.out.println("c degiskeninin degerini giriniz: ");
		c = scan.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		if(delta < 0) {
			System.out.println("Denklemin gercel koku yoktur.");
		}
		else if(delta == 0) {
			x1 = -b / (2 * a);
			System.out.printf("Denklemin birbirine esit iki koku vardir. \nBunlar x1=x2=%f",x1);
		}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("Denklemin birbirinden farkli iki gercel koku vardir. \nBunlar x1=%f  x2=%f",x1,x2);
		}

	}

}
