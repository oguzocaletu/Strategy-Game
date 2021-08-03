public class Okcu extends Asker{
	public static void Cost(int adet){
		Kaynaklar.odun-=15*adet;
		Kaynaklar.demir-=5*adet;
		Kaynaklar.altin-=5*adet ;
	}
	public void saldir(){
		if(Bilgisayar.okcu>0){
			Bilgisayar.okcu--;
			Bilgisayar.okcuToplamCan-=5;
			Oyuncu.okcu--;

		}
		else if(Bilgisayar.piyade>2){
			Bilgisayar.piyadeToplamCan-=25;
			Bilgisayar.piyade=Bilgisayar.piyadeToplamCan/10;
			Oyuncu.okcu--;

		}
		else if(Bilgisayar.piyade==1){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.suvari>0){
				Bilgisayar.suvariToplamCan-=12;
				Bilgisayar.suvari=Bilgisayar.suvariToplamCan/50;
				Oyuncu.okcu--;

			}
			else{
				Bilgisayar.Can--;
				Oyuncu.okcu--;
			}
		}
		else if(Bilgisayar.piyade==2){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.suvari>0){
				Bilgisayar.suvariToplamCan-=4;
				Bilgisayar.suvari=Bilgisayar.suvariToplamCan/50;
				Oyuncu.okcu--;

			}
			else{
				Bilgisayar.Can--;
				Oyuncu.okcu--;
			}

		}
		else if(Bilgisayar.suvari>0){
			Bilgisayar.suvariToplamCan-=20;
			Bilgisayar.suvari=Bilgisayar.suvariToplamCan/50;
			Oyuncu.okcu--;
		}
		else{
			Bilgisayar.Can--;
			Oyuncu.okcu--;
		}
			

	}
	

}