package com.calculator;

import java.util.Scanner;

import javax.swing.MenuElement;

import org.omg.CORBA.ARG_IN;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int secim;
		secim = menu();
		Islemler ı1 = new Islemler();// İşlem objesi

		switch (secim) { // Oluşturduğum menünün işlev kazanması için switch
							// case yapısı.
		case 1:
			System.out.println("İşlemi iptal etmek için bir harfe basınız.");
			System.out.println("1. sayıyı giriniz : ");// Bu komut içerisindeki
														// ifadeyi ekrana
														// yazdırır
			try { // try-catch yapısı: Kullanıcı tarafından sayı dışında bir
					// ifadenin girilmesinin kontrolünü yapar
				ı1.setX(input.nextFloat());// Kullanıcının girdiği ilk sayıyı
											// hafızasına alır
				System.out.println("2. sayıyı giriniz : ");
				ı1.setY(input.nextFloat());// Kullanıcının girdiği ikinci sayıyı
											// hafızasına alır
				System.out.println("Sonuç " + ı1.toplama(ı1.getX(), ı1.getY()));// Burada
																				// ise
																				// alınan
																				// değerler
																				// method
																				// ile
																				// işlenir
																				// ve
																				// ekrana
																				// yazdırılır.
			} catch (Exception e) {// try-catch yapısı Kullanıcı harf ya da
									// simgeye bastığında aşağıdaki eroru verir
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}
			break;
		case 2:
			System.out.println("İşlemi iptal etmek için bir harfe basınız.");
			try {
				System.out.println("1. sayıyı giriniz : ");
				ı1.setX(input.nextFloat());
				System.out.println("2. sayıyı giriniz : ");
				ı1.setY(input.nextFloat());
				System.out.println("Sonuç:" + ı1.cikarma(ı1.getX(), ı1.getY()));
			} catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}
			break;
		case 3:
			System.out.println("İşlemi iptal etmek için bir harfe basınız.");
			try {
				System.out.println("1. sayıyı giriniz : ");
				ı1.setX(input.nextFloat());
				System.out.println("2. sayıyı giriniz : ");
				ı1.setY(input.nextFloat());
				System.out.println("Sonuç " + ı1.carp(ı1.getX(), ı1.getY()));
			} catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}

			break;
		case 4:
			System.out.println("İşlemi iptal etmek için bir harfe basınız.");

			System.out.println("1. sayıyı giriniz : ");
			try {
				ı1.setX(input.nextFloat());
			}

			catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}
			System.out.println("2. sayıyı giriniz : ");
			try {
				ı1.setY(input.nextFloat());
			} catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}
			if (ı1.getY() == 0) {// Bölme işleminde 2.sayı 0 olamaz
				System.err.println("2.sayı 0 olamaz!");
				System.out.println("Tekrar giriniz:");
				try {
					ı1.setY(input.nextFloat());
				} catch (Exception e) {
					System.err.println("İşleminiz iptal edildi.");
					System.exit(-1);
				}
			}

			System.out.println("Sonuç:" + ı1.bolme(ı1.getX(), ı1.getY()));

			break;
		case 5:
			System.out.println("Kök almak istediğiniz sayıyı giriniz:");
			
			if(ı1.getX()<0){
				System.out.println("Pozitif sayı giriniz");
			}
			else {
			
			try {ı1.setX(input.nextFloat());}
			catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
				System.exit(-1);
			}
			System.out.println("Sonuç:" + ı1.kokal(ı1.getX()));
			 }
			break;
		case 6:
			System.out.println("Üs almak istediğiniz sayiyi giriniz");
			try {ı1.setX(input.nextFloat());}
			catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
			}
			System.out.println("Üs giriniz:");
			try{ı1.setY(input.nextFloat()); }
			catch (Exception e) {
				System.err.println("İşleminiz iptal edildi.");
			}
			System.out.println("Sonuç:"+ı1.üsal(ı1.getX(),ı1.getY()));
			
		default:
			main(args);

			

		}

	}

	public static int menu() {// menü methodu
		Scanner input = new Scanner(System.in);
		int sec = 0;

		System.out.println("1.Toplama işlemi");
		System.out.println("2.Çıkartma işlemi");
		System.out.println("3.Çarpma işlemi");
		System.out.println("4.Bölme işlemi");
		System.out.println("5.Kök alma işlemi");
		System.out.println("6.Üs alma işlemi");
		System.out.println("Seçiminiz :");
		try {
			sec = input.nextInt();// nextInt ile satıra girilen sayı hafızaya
									// alınır
		}// girilen değeri döndürür

		catch (Exception e) {
			System.err.println("Yanlış bir tuşa bastınız.");
		}
		return sec;

	}
}
