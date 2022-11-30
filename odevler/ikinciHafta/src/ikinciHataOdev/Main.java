package ikinciHataOdev;

public class Main {

	public static void main(String[] args) {
		// METODLAR(FUNCTIONS)

		sayiBulmaca();
		sayiBulmaca();
		ekle();

		int sayi = topla(5, 7);
		System.out.println(sayi);
		// Output : 12
		
		int toplam = topla1(1,2,3,4,5,6);
		System.out.println(toplam);
		// Output : 21
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}

		if (varMi) {
			mesajVer("Sayi mevcut : " + aranacak);
		} else {
			mesajVer("Sayi mevcut değil : " + aranacak);

		}
		// Metod isimleri camel casing yazılır örn: sayiBulmaca()

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	// Output : Sayi mevcut : 7 Sayi mevcut : 7

	////////////////////////////////////////////////////////////////////

	// "void" operasyonlar bir şeyi yap demek, bize sonuç döndürmez.
	// topla() metodunu "int" tipinde bir veri döndürecek şekilde yazıldı, "return"
	// ifadesi olmak zorunda

	public static void ekle() {
		System.out.println("Eklendi");
	}

	// Output : Eklendi
	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;

	}
	
	//VARIABLE ARGUMENTS
	
	//"..." işareti ile sınırsız arguments gönderebiliriz, bu işaret arka planda bize bir dizi oluşturuyor
	
	public static int topla1(int ... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
