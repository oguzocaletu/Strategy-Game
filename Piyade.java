public class Piyade extends Asker  {
	public static void Cost(int adet){
		Kaynaklar.odun-=5*adet ;
		Kaynaklar.demir-=10*adet ;
		Kaynaklar.altin-=2*adet ;
	}

	
	public void saldir(){// piyade ilk suvariye saldirir
		if(Bilgisayar.suvari>0){
			Bilgisayar.suvariToplamCan-=5;
			Bilgisayar.suvari=Bilgisayar.suvariToplamCan/50;
			Oyuncu.piyade--;

		}
		else if(Bilgisayar.piyade>0){
			Bilgisayar.piyadeToplamCan-=10;
			Bilgisayar.piyade--;
			Oyuncu.piyade--;

		}
		

		else if(Bilgisayar.okcu>1){
			Bilgisayar.okcuToplamCan-=10;
			Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
			Oyuncu.piyade--;

		}
		else if(Bilgisayar.okcu>0){
			Bilgisayar.okcuToplamCan-=5;
			Bilgisayar.okcu=0;
			Bilgisayar.Can-=10;
			Oyuncu.piyade--;

		}
		else{
			Bilgisayar.Can-=20;
			Oyuncu.piyade--;

		}
	}
}