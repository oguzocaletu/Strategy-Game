public class Suvari extends Asker{

	public static void Cost(int adet){
		Kaynaklar.odun-=5*adet;
		Kaynaklar.demir-=20*adet;
		Kaynaklar.altin-=30*adet ;
	}

	public void saldir(){

		if(Bilgisayar.suvari>0){// suvariye ilk suvariye saldirir
			Bilgisayar.suvari--;
			Bilgisayar.suvariToplamCan-=50;
			Oyuncu.suvari--;


		}
		else if(Bilgisayar.piyade>=5){
			Bilgisayar.piyadeToplamCan-=50;
			Bilgisayar.piyade=Bilgisayar.piyadeToplamCan/10;
			Oyuncu.suvari--;

		}
		else if(Bilgisayar.piyade==1){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.okcu>=8){
				Bilgisayar.okcuToplamCan-=40;
				Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
				Oyuncu.suvari--;

			}
			else{
				Bilgisayar.Can-=40;
				Oyuncu.suvari--;
			}
		}
		else if(Bilgisayar.piyade==2){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.okcu>=6){
				Bilgisayar.okcuToplamCan-=30;
				Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
				Oyuncu.suvari--;

			}
			else{
				Bilgisayar.Can-=40;
				Oyuncu.suvari--;
			}
		}
		else if(Bilgisayar.piyade==3){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.okcu>=4){
				Bilgisayar.okcuToplamCan-=20;
				Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
				Oyuncu.suvari--;

			}
			else{
				Bilgisayar.Can-=40;
				Oyuncu.suvari--;
			}
		}
		else if(Bilgisayar.piyade==4){
			Bilgisayar.piyade--;
			Bilgisayar.piyadeToplamCan=0;
			if(Bilgisayar.okcu>=2){
				Bilgisayar.okcuToplamCan-=10;
				Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
				Oyuncu.suvari--;

			}
			else{
				Bilgisayar.Can-=40;
				Oyuncu.suvari--;
			}
		}

		else if(Bilgisayar.okcu>0){
			Bilgisayar.okcuToplamCan-=20;
			Bilgisayar.okcu=Bilgisayar.okcuToplamCan/5;
			Oyuncu.suvari--;

		}
		else{
			Bilgisayar.Can-=40;
			Oyuncu.suvari--;

		}
		
	}
}