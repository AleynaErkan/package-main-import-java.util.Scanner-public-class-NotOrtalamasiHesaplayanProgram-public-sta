package main;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) { // try ile hatalarımızı daha kolay görmeyi saglar.
		/*Not Ortalaması Hesaplayan Program : Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan 
		ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. Ayrıca notuna göre geçti kaldı yazdırın ekrana.
       */
			
			Scanner giris = new Scanner(System.in);
			int mat, fizik, kimya, turkce, tarih, muzik ;
			
			System.out.println("Matematik notunuz giriniz :");
			mat = giris.nextInt();
			
			System.out.println("Fizik notunuz giriniz :");
			fizik = giris.nextInt();
			
			System.out.println("Kimya notunuzu giriniz : ");
			kimya = giris.nextInt();
			
			System.out.println("Turkce notunuzu giriniz :");
			turkce = giris.nextInt();
			
			System.out.println("Tarih notunuzu giriniz :");
			tarih = giris.nextInt();
			
			System.out.println("Muzik notunuzu giriniz :");
			muzik = giris.nextInt();
			
			double sinavOrtalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;
			boolean kosul = sinavOrtalama > 60 && sinavOrtalama < 100 ; 
			double gecmeKalma = kosul ? "Tebrikler Sınıfı Gectiniz :) " : "Üzgünüm Sınıfta Kaldiniz :( " ;
			
			System.out.println("Not Ortalamanız : " + sinavOrtalama + " " + gecmeKalma);
			
		}
		
		
	}


