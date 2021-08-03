public class Oyuncu {
	int countBina=0;
	Bina [] bina=new Bina[countBina];
	static int  countAsker=0;
	public static Asker [] asker=new Asker[countAsker];
	public static int marangozhane=0;
	public static int altinMadeni=0;
	public static int demirMadeni=0;
	public static int piyade=0;
	public static int suvari=0;
	public static int okcu=0;
	public static int okcuToplamCan=okcu*10;
	public static int suvariToplamCan =suvari*50;
	public static int piyadeToplamCan=piyade*10;
	public static String hamleler="";
	private static int hasar=0;
	private static int binaHasari=0;
	public static void askerKucult(){
		Asker[] temp=new Asker[asker.length-1];
			for(int i=0;i<temp.length;i++){
				temp[i]=asker[i];
			}
			asker=temp;
	}
	private static int demir;
	private static int altin;
	private static int odun;

	private static int Tmarangozhane=marangozhane;
	private static int TaltinMadeni=altinMadeni;
	private static int TdemirMadeni=demirMadeni;	
	public String help(int N){
		demir=Kaynaklar.demir;
		altin=Kaynaklar.altin;
		odun=Kaynaklar.odun;
		int hamle=N;
		if(N==1||N==0){
			if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan>=(hasar+binaHasari)){
				hamleler= hamle+" hamlede kazanamazsınız";
			} 
			else   
			hamleler+=" 7 ";
			
		}
		else{
			if(odun>=20&&demir>=5&&Tmarangozhane==0&&odun<100){
				N--;
				hamleler+=" 1 ";
				Tmarangozhane++;
			}
			else if (odun>=20&&demir>=20&&TaltinMadeni==0&&altin<100){
				N--;
				hamleler+=" 2 ";
				TaltinMadeni++;
			}
			else if (odun>=10&&demir>=30&&TdemirMadeni==0&&demir<100){
				N--;
				hamleler+=" 3 ";
				TdemirMadeni++;
			}
			
			else if(odun>=150&&demir>=50&&altin>=50){
				hamleler+=" (6-10) ";
				hasar+=15*50;
				binaHasari=10*1;
				odun-=150;
				demir-=50;
				altin-=50;
				if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan<=(hasar+binaHasari))
					N=2;
			}
			if(odun>=25&&demir>=50&&altin>=150){
				hamleler+=" (5-5) ";
				hasar+=5*50;
				binaHasari=5*40;
				odun-=25;
				demir-=50;
				altin-=150;
				if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan<=(hasar+binaHasari))
					N=2;
			}
			else if(odun>=50&&demir>=100&&altin>=20){
				hamleler+=" (4-10) ";
				hasar+=10*5;
				binaHasari=10*20;
				odun-=50;
				demir-=100;
				altin-=10;
				if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan<=(hasar+binaHasari))
					N=2;
			}
			else if(odun>=75&&demir>=25&&altin>=25){
				hamleler+=" (6-5) ";
				hasar+=5*15;
				binaHasari=5*1;
				odun-=75;
				demir-=25;
				altin-=25;
				if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan<=(hasar+binaHasari))
					N=2;
			}
			
			else if(odun>=25&&demir>=50&&altin>=5){
				hamleler+=" (4-5) ";
				hasar+=5*5;
				binaHasari=5*20;
				odun-=25;
				demir-=50;
				altin-=5;
				if(Bilgisayar.piyadeToplamCan+Bilgisayar.suvariToplamCan+Bilgisayar.Can+Bilgisayar.okcuToplamCan<=(hasar+binaHasari))
					N=2;
			}
				odun+=Tmarangozhane*40;
				demir+=TdemirMadeni*20;
				altin+=TaltinMadeni*10;
			help(N-1);
		}
			return hamleler;	
	}

	public void saldir(){ // once okcu saldirir sonra suvari sonra piyade 
		Asker saldirOkcu=new Okcu();
		for(int i=okcu;i>0;i--){
			saldirOkcu.saldir();
		}
		Asker saldirSuvari=new Suvari();
		for(int i=suvari;i>0;i--){
			saldirSuvari.saldir();
		}
		Asker saldirPiyade=new Piyade();
		for(int i=piyade;i>0;i--){
			saldirPiyade.saldir();
		}
	}
	
	public void MarangozhaneEkle(){
		Bina[] temp=new Bina[countBina+1];
		Bina tempM=new Marangozhane();
		for(int i=0;i<bina.length;i++){
			temp[i]=bina[i];
		}
		temp[countBina]=tempM;
		bina=temp;

		countBina++;
		marangozhane++;
		
	}
	public void AltinMadeniEkle(){
		Bina[] temp=new Bina[countBina+1];
		Bina tempA=new AltinMadeni();
		for(int i=0;i<bina.length;i++){
			temp[i]=bina[i];
		}
		temp[countBina]=tempA;
		bina=temp;
		
		countBina++;
		altinMadeni++;
		
	}
	public void DemirMadeniEkle(){
		Bina[] temp=new Bina[countBina+1];
		Bina tempD=new DemirMadeni();
		for(int i=0;i<bina.length;i++){
			temp[i]=bina[i];
		}
		temp[countBina]=tempD;
		bina=temp;
		
		countBina++;
		demirMadeni++;
		
	}
	public void PiyadeEkle(int adet){
		for(int j=0;j<adet;j++){
			Asker[] temp=new Asker[countAsker+1];
			Asker tempP=new Piyade();
			for(int i=0;i<asker.length;i++){
				temp[i]=asker[i];
			}
			temp[countAsker]=tempP;
			asker=temp;

			countAsker++;
			piyade++;
			
		}
		piyadeToplamCan=piyade*10;
	}
	public void SuvariEkle(int adet){
		for(int j=0;j<adet;j++){
			Asker[] temp=new Asker[countAsker+1];
			Asker tempS=new Suvari();
			for(int i=0;i<asker.length;i++){
				temp[i]=asker[i];
				}
			temp[countAsker]=tempS;
			asker=temp;

			countAsker++;
			suvari++;
			}
			suvariToplamCan =suvari*50;
		
	}	
	public void OkcuEkle(int adet){
		for(int j=0;j<adet;j++){
			Asker[] temp=new Asker[countAsker+1];
			Asker tempO=new Okcu();
			for(int i=0;i<asker.length;i++){
				temp[i]=asker[i];
			}
			temp[countAsker]=tempO;
			asker=temp;

			countAsker++;
			okcu++;
		}
		okcuToplamCan=okcu*5;
	}
	
}

