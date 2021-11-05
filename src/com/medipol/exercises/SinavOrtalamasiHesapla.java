package com.medipol.exercises;

import java.util.Scanner;

public class SinavOrtalamasiHesapla {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrenci numarasini giriniz: ");
		int ogrenciNumarasi = scan.nextInt();
				
		System.out.println("Ad ve soyad giriniz: ");
		scan = new Scanner(System.in);
		//scan.next();
		String adSoyad = scan.nextLine();		
		
		System.out.println("Vize notunuzu giriniz: ");
		scan = new Scanner(System.in);
		//scan.next();
		int vizeNotu = scan.nextInt();
				
		System.out.println("Final notunuzu giriniz: ");
		scan = new Scanner(System.in);
		//scan.next();
		int finalNotu = scan.nextInt();
		
		double ortalama = (vizeNotu * 0.3) + (finalNotu * 0.7);
		
		System.out.printf("Adi soyadi %s olan ogrenci numarasi %d olan"
				+ " kisinin not ortalamasi %f",adSoyad,ogrenciNumarasi,ortalama);
		
		
		
		
		
		
		
		
	}

}
