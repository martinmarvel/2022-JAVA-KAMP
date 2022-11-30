package birinciHaftaOdev;

public class Main {

	public static void main(String[] args) {
		// Değişkenler; Stringi değişkene atadık, eğer daha sonra değiştirmek istersek
				// işimizi kolaylaştırı ve bellek yönetimi daha iyi olur.

				int calisanSayisi = 13;
				String mesaj = "Toplam Sayı :";

				System.out.println(calisanSayisi);
				System.out.println("Toplam Sayım: " + calisanSayisi);
				System.out.println(mesaj + calisanSayisi);

				/*
				 * Output: 13 Toplam Sayım: 13 Toplam Sayı :13
				 */



				// byte, short, long, int tam sayı tutar. float ve double ondalıklı sayı tutar.
				// char karakter veri tipidir fakat arka planda ASCII kodudur ve sayısal bir
				// veri tipidir.
				// boolean true, false döndürür(0 veya 1)



				// CONDITIONALS

				int sayi = 20;

				if (sayi < 20) {

					System.out.println("Sayı 20'den küçüktür");

				} else if (sayi == 20) {
					System.out.println("Sayı 20'ye eşittir");

				} else {
					System.out.println("Sayı 20'den büyüktür");

				}

				// Output: Sayı 20'ye eşittir
				

				// RECAP DEMO1

				int sayi1 = 30;
				int sayi2 = 25;
				int sayi3 = 2;
				int enBuyuk = sayi1;

				if (enBuyuk < sayi2) {
					enBuyuk = sayi2;
				}

				if (enBuyuk < sayi3) {
					enBuyuk = sayi3;
				}

				System.out.println("En büyük sayı " + enBuyuk);

				// Output: En büyük sayı 30


				// LOOPS; Döngü, birbirine benzeyen işlemleri tekrarlar. i++(bir bir arttır),
				// i+=2(sadece tekli sayılar, i=2(çiftli sayılar)

				for (int i = 1; i < 10; i += 2) {
					System.out.println(i);
				}
				//Output : 1 3 5 7 9

				// While

				int i = 1; // değişkenleri kendi blokları içerinde kullanabiliriz, o yüzden burada bir "i"
							// değişkenini tekrar tanımladık
				while (i < 10) {
					System.out.println(i);
					i += 2;
				}
				
				 //Output : 1 3 5 7 9
				 
			


				// ARRAYS (DİZİLER) dizi index 0'dan başlar

				String[] ogrenciler = new String[3];
				ogrenciler[0] = "Ömer";
				ogrenciler[1] = "Talha";
				ogrenciler[2] = "Özdemir";

				for (int k = 0; k < ogrenciler.length; k++) {
					System.out.println(ogrenciler[k]);
				}
				
				//Output : Ömer Talha Özdemir
				
				for(String ogrenci:ogrenciler) {
					System.out.println(ogrenci);

				}
				//Output : Ömer Talha Özdemir
				
				// RECAP DEMO 2 
				
				double[] myList = {1.2,1.3,14.3,5.6};
				double total = 0;
				double max = myList[0];
				for (double number:myList) {
					if(max<number) {
						max = number;
					}
					total = total + number;
					System.out.println(number);
				}
				System.out.println("Toplam = " + total);
				System.out.println("En büyük = " + max);
				
				//Output : Toplam = 22.4
				//Output : En büyük = 14.3
				
				
				//ÇOK BOUTLU DİZİLER(MULTIDIMENSIONAL ARRAYS)
				//Alttaki örnekte, bir tablodadaki satır ve kolonda bulunan verileri for ile dönüp yazdırmış olduk 
				
				String[][] sehirler = new String [3][3];
				
				sehirler [0][0] = "İstanbul";
				sehirler [0][1] = "Bursa";
				sehirler [0][2] = "Bilecik";
				sehirler [1][0] = "Ankara";
				sehirler [1][1] = "Konya";
				sehirler [1][2] = "Kayseri";
				sehirler [2][0] = "Diyarbakır";
				sehirler [2][1] = "Şanlıurfa";
				sehirler [2][2] = "Gaziantep";
				
				for(int in = 0; in<=2; in++) {
					System.out.println("--------------------");
					for(int j = 0; j<=2; j++) {
						System.out.println(sehirler [in][j]);
					}
				}
				//Output: 
				/*
				--------------------
				İstanbul
				Bursa
				Bilecik
				--------------------
				Ankara
				Konya
				Kayseri
				--------------------
				Diyarbakır
				Şanlıurfa
				Gaziantep
				*/
				
				
				
				//STRING İFADELERLE ÇALIŞMAK
				
				String mesaj1 = "Bugün hava güneşli.";
				
				System.out.println("Eleman sayısı: "+ mesaj1.length());
				System.out.println("5. Eleman : " + mesaj1.charAt(4));
				//Concat kullanıldığı zaman yeni bir String oluşur. Daha sonra kullanmak için bir değişkene atanması gerekir.
				System.out.println(mesaj1.concat("Ne güzel!"));
				System.out.println(mesaj1.startsWith("B"));
				System.out.println(mesaj1.endsWith("."));
				
				char [] karakterler = new char[5];
				mesaj1.getChars(0,5, karakterler, 0);
				System.out.println(karakterler);
				System.out.println(mesaj1.indexOf("av"));
				System.out.println(mesaj1.lastIndexOf("a"));
				
				String mesaj3 = mesaj1.replace(' ', '-');
				System.out.println(mesaj3);
				System.out.println(mesaj1.substring(2,5));
				
				for(String kelime:mesaj1.split(" ")) {
					System.out.println(kelime);
				}
				
				System.out.println(mesaj1.toLowerCase());
				System.out.println(mesaj1.toUpperCase());
				System.out.println(mesaj1.trim());
				/*Output: 
				Bugün hava güneşli.Ne güzel!
				true
				true
				Bugün
				7
				9
				Bugün-hava-güneşli.
				gün
				Bugün
				hava
				güneşli.
				bugün hava güneşli.
				BUGÜN HAVA GÜNEŞLİ.
				Bugün hava güneşli.
				*/

				
				//MİNİ PROJE
				
				char harf = 'I';
				
				switch(harf) { 
				case 'A':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Kalın sesli");
					break;
					default:
						System.out.println("Kalın sesli");
				}
				//Output: Kalın sesli

				
				int number4 = 6;
				int toplam1 = 0;
				
				for(int ini = 1; ini < number4; ini++) {
					
					if(number4 % ini == 0) {
						toplam1 = toplam1 +ini;
					}
					
					if(toplam1 == number4) {
						System.out.println("Mükemmel sayı");
					}else{
						System.out.println("KMükemmel sayı değil");
					}
					
				}
				//Output: Mükemmel sayı
	}

}
