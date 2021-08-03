import java.util.Scanner;
public class Oyun{
	
	public static void main(String []args){
		Scanner k=new Scanner(System.in);
		int turSayisi=-1;
		boolean turn=true;
		Oyuncu o=new Oyuncu();
		System.out.println("Lutfen bir ile 3 arasindan bir zorluk seviyesi secin\n\nKolay mod icin - 1 -\nOrta zorluk icin - 2 -\nZor mod icin - 3 -");
		System.out.println();
		System.out.println("Zorluk seviyesi secemek istemiyorsaniz 4 u tuslayin");
		String hardnes=k.nextLine();
		Bilgisayar b=new Bilgisayar(100);
		if(hardnes.equals("1"))
			b.Can=100;
		else if(hardnes.equals("2"))
			b.Can=150;
		else if(hardnes.equals("3"))
			b.Can=250;
		else if(hardnes.equals("4"))
			b.Can=100;
		else{
			System.out.println();
			System.out.println("Geçerli bir değer girmediniz zorluk otomatik olarak atandi");
			System.out.println();
			b.Can=100;
		}

		int adet=0;


			while(b.Can>0&&AnaBina.Can>0){

				turn=true;
				turSayisi++;

				System.out.println("Tur "+turSayisi);
				System.out.println();
				System.out.print("\tOyuncu Mevcut Durum:\t Can: "+AnaBina.Can);
				System.out.println("\tCan "+Bilgisayar.Can+"\t\t Bilgisayar Mevcut Durum:");
				System.out.println();
				System.out.println();
				if(AnaBina.Can>=b.Can){
					for(int i=0;i<AnaBina.Can/10;i++){
						
						if(i==AnaBina.Can/10-1){// ekrandaaki binanin uzunlugu bina cani ile direkt orantili !!!

							System.out.println("\t\t\t|_|__|_|\t\t\t|_|__|_|");
						}
						else
							if((AnaBina.Can/10)-(Bilgisayar.Can/10)>i)

								System.out.println("\t\t\t|_|  |_|");
							else
								System.out.println("\t\t\t|_|  |_|\t\t\t|_|  |_|");
					}
				}
				else{
					for(int i=0;i<b.Can/10;i++){
						
						if(i==b.Can/10-1){// ekrandaaki binanin uzunlugu bina cani ile direkt orantili !!!

							System.out.println("\t\t\t|_|__|_|\t\t\t|_|__|_|");
						}
						else
							if((b.Can/10)-(AnaBina.Can/10)>i)

								System.out.println("\t\t\t        \t\t\t|_|  |_|");
							else
								System.out.println("\t\t\t|_|  |_|\t\t\t|_|  |_|");
					}

				}
				System.out.println();
				System.out.println("\tOdun: "+Kaynaklar.odun+"\t\t\t\t\t\t\tOdun: "+b.odun);
				System.out.println("\tDemir: "+Kaynaklar.demir+"\t\t\t\t\t\t\tDemir: "+b.demir);
				System.out.println("\tAltin: "+Kaynaklar.altin+"\t\t\t\t\t\t\tAltin: "+b.altin);// altin değis
				System.out.println("\tMarangozhane: "+o.marangozhane+"\t\t\t\t\t\t\tMarangozhane: "+b.marangozhane);
				System.out.println("\tAltin madeni: "+o.altinMadeni+"\t\t\t\t\t\t\tAltin madeni: "+b.altinMadeni);
				System.out.println("\tDemir madeni:: "+o.demirMadeni+"\t\t\t\t\t\tDemir madeni: "+b.demirMadeni);
				System.out.println("\tPiyade: "+o.piyade+"\t\t\t\t\t\t\tPiyade: "+b.piyade);
				System.out.println("\tSuvari: "+o.suvari+"\t\t\t\t\t\t\tSuvari: "+b.suvari);
				System.out.println("\tOkcu: "+o.okcu+"\t\t\t\t\t\t\t\tOkcu: "+b.okcu);
				System.out.println();
				
				
				System.out.println();
				// pc mevcut durum yaz
				System.out.println();
				System.out.println("\t\t\t\t\tSira sende");
				System.out.println();
				System.out.println("\t\t   *******************************************************");
				System.out.println();
				System.out.println("\t\t\t   Lutfen asagidaki hamlelerden birini secin:");
				System.out.println();
				System.out.println("\t\t\t\t1- Bir marangozhane kur \n\t\t\t\t2- Bir altin madeni kur \n\t\t\t\t3- Bir demir madeni kur");
				System.out.println("\t\t\t\t4- N tane piyade uret");
				System.out.println("\t\t\t\t5- N tane suvari uret");
				System.out.println("\t\t\t\t6- N tane okcu uret");
				System.out.println("\t\t\t\t7- Saldir");
				System.out.println("\t\t\t\t8- Ipucu ile otomatik oyna");
				System.out.println("\t\t\t\t9- Pas");
				System.out.println();
				while(turn){// your turn or not?
					Kaynaklar.altin+=(10*o.altinMadeni);
					Kaynaklar.odun+=(40*o.marangozhane);
					Kaynaklar.demir+=(20*o.demirMadeni);
					int answer=k.nextInt();
					if(answer==4||answer==5||answer==6){
						adet=k.nextInt();
					}

					switch(answer){
						case 1:
							if(Kaynaklar.odun<20||Kaynaklar.demir<5){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								Marangozhane.Cost();
								o.MarangozhaneEkle();
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu marangozhane kurdu*****");
								System.out.println();
							}

						break;
						case 2:
							if(Kaynaklar.odun<20||Kaynaklar.demir<20){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								AltinMadeni.Cost();
								o.AltinMadeniEkle();
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu altin madeni kurdu*****");
								System.out.println();
							}
						break;
						case 3:
							if(Kaynaklar.odun<10||Kaynaklar.demir<30){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								DemirMadeni.Cost();
								o.DemirMadeniEkle();// yukarida parasi odendi buraya demir madenini arttirma islemi yap
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu demir madeni kurdu*****");
								System.out.println();
							}

						break;
						case 4:
							if(Kaynaklar.odun<5*adet||Kaynaklar.demir<10*adet||Kaynaklar.altin<2*adet){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								Piyade.Cost(adet);
								o.PiyadeEkle(adet);
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu "+adet+" Piyade yetistirdi");
								System.out.println();
							}
						break;
						case 5:
							if(Kaynaklar.odun<5*adet||Kaynaklar.demir<20*adet||Kaynaklar.altin<30*adet){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								Suvari.Cost(adet);
								o.SuvariEkle(adet);
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu "+adet+" Suvari yetistirdi*****");
								System.out.println();
							}
						break;
						case 6:
							if(Kaynaklar.odun<15*adet||Kaynaklar.demir<5*adet||Kaynaklar.altin<5*adet){
								System.out.println("Yetersiz Kaynak lutfen baska islem secin");							
								break;
							}
							else{
								Okcu.Cost(adet);
								o.OkcuEkle(adet);
								turn=false;
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu "+adet+" Okcu yetistirdi*****");
								System.out.println();
							}
						break;
						case 7:
								System.out.println();
								System.out.println("\t\t\t\t  *****Oyuncu saldiriyor*****");
								System.out.println();
							o.saldir();
							turn=false;

						break;
						case 8:
							System.out.println(o.help(5));
							Oyuncu.hamleler="";
						break;
						case 9:
							System.out.println("\t\t\t\t  *****Oyuncu Pas geçti*****");
							turn=false;
						break;
					}


					
				
			}// your turn finishes
			// Bilgisayar plays
			if(b.Can<=0)
				break;
			switch(turSayisi%8){
				case 0:
					b.marangozhaneKur();
					System.out.println("\t\t\t\t*****Bilgisayar marangozhane kurdu*****");
					System.out.println();
				break;
				case 1:
					b.altinMadeniKur();
					System.out.println("\t\t\t\t*****Bilgisayar altin madeni kurdu*****");
					System.out.println();
				break;
				case 2:
					b.demirMadeniKur();
					System.out.println("\t\t\t\t*****Bilgisayar demir madeni kurdu*****");
					System.out.println();
				break;
				case 3:
					b.piyadeYetistir();
					System.out.println("\t\t\t\t*****Bilgisayar "+b.piyade+" piyade yetistirdi*****");
					System.out.println();
				break;
				case 4:
					b.suvariYetistir();
					System.out.println("\t\t\t\t*****Bilgisayar "+b.suvari+" suvari yetistirdi*****");
					System.out.println();
				break;
				case 5:
					b.okcuYetistir();
					System.out.println("\t\t\t\t*****Bilgisayar "+b.okcu+" okcu yetistirdi*****");
					System.out.println();
				break;
				case 6:
					b.saldir();
					System.out.println("\t\t\t\t*****Bilgisayar saldiriyor*****");
					System.out.println();
				break;
				case 7:
					System.out.println("\t\t\t\t*****Bilgisayar pas geçti****");
					System.out.println();
				break;
			}
			b.TurSonu();
			
		}// someone wins
		if(AnaBina.Can>0){
			System.out.println();
			System.out.println("\t\t\t\t*****Oyunu siz Kazandiniz******\n\t\t\t\t      *****Tebrikler*****");
		}
		else{
			System.out.println();
			System.out.println("\t\t\t\t     Oyunu Bilgisayar kazandi.");
		}
	}
}