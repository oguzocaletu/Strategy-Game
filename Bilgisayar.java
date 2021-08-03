public class Bilgisayar {
	public int altin=100;
	public int odun=100;
	public int demir=100;
	public int demirMadeni=0;
	public int altinMadeni=0;
	public int marangozhane=0;
	public static int piyade=0;
	public static int  suvari=0;
	public static int okcu=0;
	//
	public static int Can=100;
	public static int okcuToplamCan=okcu*10;
	public static int suvariToplamCan =suvari*50;
	public static int piyadeToplamCan=piyade*10;
	public Bilgisayar(int can){
		Can=can;
	}
	public void saldir(){
		while(Bilgisayar.okcu>0){
			if(Oyuncu.okcu>0){
				Oyuncu.okcu--;
				Oyuncu.okcuToplamCan-=5;
				Bilgisayar.okcu--;
			}
			else if(Oyuncu.piyade>2){
				Oyuncu.piyadeToplamCan-=25;
				Oyuncu.piyade=Oyuncu.piyadeToplamCan/10;
				Bilgisayar.okcu--;

			}
			else if(Oyuncu.piyade==1){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.suvari>0){
					Oyuncu.suvariToplamCan-=12;
					Oyuncu.suvari=Oyuncu.suvariToplamCan/50;
					Bilgisayar.okcu--;
				}
				else{
					AnaBina.Can--;
					Bilgisayar.okcu--;
				}
			}
			else if(Oyuncu.piyade==2){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.suvari>0){
					Oyuncu.suvariToplamCan-=4;
					Oyuncu.suvari=Oyuncu.suvariToplamCan/50;
					Bilgisayar.okcu--;
				}
				else{
					AnaBina.Can--;
					Bilgisayar.okcu--;
				}

			}
			else if(Oyuncu.suvari>0){
				Oyuncu.suvariToplamCan-=20;
				Oyuncu.suvari=Oyuncu.suvariToplamCan/50;
				Bilgisayar.okcu--;

			}
			else{
				AnaBina.Can--;
				Bilgisayar.okcu--;

			}
		}


		//sonra suvari saldırır

		while(Bilgisayar.suvari>0){
			if(Oyuncu.suvari>0){// suvariye ilk suvariye saldirir
				Oyuncu.suvari--;
				Oyuncu.suvariToplamCan-=50;
				Bilgisayar.suvari--;

			}
			else if(Oyuncu.piyade>=5){
				Oyuncu.piyadeToplamCan-=50;
				Oyuncu.piyade=Oyuncu.piyadeToplamCan/10;
				Bilgisayar.suvari--;
			}
			else if(Oyuncu.piyade==1){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.okcu>=8){
					Oyuncu.okcuToplamCan-=40;
					Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
					Bilgisayar.suvari--;

				}
				else if(Oyuncu.okcu>0){
					Oyuncu.okcu=0;
				}

				else{
					AnaBina.Can-=40;
					Bilgisayar.suvari--;
				}
			}
			else if(Oyuncu.piyade==2){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.okcu>=6){
					Oyuncu.okcuToplamCan-=30;
					Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
					Bilgisayar.suvari--;
				}
				else{
					AnaBina.Can-=40;
					Bilgisayar.suvari--;
				}
			}
			else if(Oyuncu.piyade==3){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.okcu>=4){
					Oyuncu.okcuToplamCan-=20;
					Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
					Bilgisayar.suvari--;
				}
				else{
					AnaBina.Can-=40;
					Bilgisayar.suvari--;
				}
			}
			else if(Oyuncu.piyade==4){
				Oyuncu.piyade--;
				Oyuncu.piyadeToplamCan=0;
				if(Oyuncu.okcu>=2){
					Oyuncu.okcuToplamCan-=10;
					Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
					Bilgisayar.suvari--;
				}
				else{
					AnaBina.Can-=40;
					Bilgisayar.suvari--;
				}
			}

			else if(Oyuncu.okcu>0){
				Oyuncu.okcuToplamCan-=20;
				Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
				Bilgisayar.suvari--;

			}
			else{
				AnaBina.Can-=40;
				Bilgisayar.suvari--;

			}
		}

		//en sonra piyade saldırır
		while (Bilgisayar.piyade>0){
			if(Oyuncu.suvari>0){
				Oyuncu.suvariToplamCan-=5;
				Oyuncu.suvari=Oyuncu.suvariToplamCan/50;
				Bilgisayar.piyade--;

			}
			else if(Oyuncu.piyade>0){
				Oyuncu.piyadeToplamCan-=10;
				Oyuncu.piyade--;
				Bilgisayar.piyade--;

			}
			

			else if(Oyuncu.okcu>=2){
				Oyuncu.okcuToplamCan-=10;
				Oyuncu.okcu=Oyuncu.okcuToplamCan/5;
				Bilgisayar.piyade--;

			}
			else if(Oyuncu.okcu>0){
				Oyuncu.okcuToplamCan-=5;
				Oyuncu.okcu=0;
				AnaBina.Can-=10;
				Bilgisayar.piyade--;

			}
			else{
				AnaBina.Can-=20;
				Bilgisayar.piyade--;
			}
		}
	}
	public void altinMadeniKur(){
		altinMadeni++;
		odun-=20;
		demir-=20;
	}
	public void demirMadeniKur(){
		demirMadeni++;
		odun-=10;
		demir-=30;
	}
	public void marangozhaneKur(){
		marangozhane++;
		odun-=20;
		demir-=5;
	}


	public void piyadeYetistir(){
		while(odun>=5&&demir>=10&&altin>=2){
			piyade++;
			piyadeToplamCan=piyade*10;
			odun-=20;
			demir-=5;
		}
	}
	public void suvariYetistir(){
		while(odun>=5&&demir>=20&&altin>=30){
			suvari++;
			suvariToplamCan =suvari*50;
			odun-=20;
			demir-=5;
		}
	}
	public void okcuYetistir(){
		while(odun>=15&&demir>=5&&altin>=5){
			okcu++;
			okcuToplamCan=okcu*5;
			odun-=20;
			demir-=5;
		}
	}


	public void TurSonu(){
		altin+=(altinMadeni*10);
		odun+=(40* marangozhane);
		demir+=(demirMadeni*20);
	}


	
	
}