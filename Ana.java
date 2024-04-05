package kuryemisciOrnegi;

import java.util.Scanner;

public class Ana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean asalMi=false;
		int asal_olmayanlar_toplam =0; 
		int asal_olanlar_toplam=0;
		
		String asal_sayilar="";
		String asal_olmayan_sayilarString="";
		
		System.out.print("Dizinin uzunluğunu giriniz: ");
		int dizinin_uzunlugu = scanner.nextInt();

		int sayilar[] = new int[dizinin_uzunlugu];

		for (int i = 0; i < sayilar.length; i++) {
			System.out.print("Dizinin " + i + " ninci indeks değerini giriniz: ");
			sayilar[i] = scanner.nextInt();
		}	
		for(int sayi:sayilar) {
			for(int j=2;j<sayi;j++) 
			{
				if (sayi%j==0) {
					asal_olmayanlar_toplam+=1;
					asal_olmayan_sayilarString+=String.valueOf(sayi)+" ";
					break;
					
				}else {
					asalMi=true;
				}
				
			}if (asalMi) {
				asal_olanlar_toplam+=1;
				asal_sayilar+=String.valueOf(sayi)+" ";
				asalMi=false;
			}
			
		}
		System.out.println("Asal sayı sayısı: "+asal_olanlar_toplam+"\n Asal sayılar: "+asal_sayilar);
		System.out.println("Asal olmayan sayı sayısı: "+asal_olmayanlar_toplam+"\n Asal olmayan sayılar: "+asal_olmayan_sayilarString);
		
		
		
		
	}
}