public class DemirMadeni extends Bina {

	public void work(){
		Kaynaklar.demir+=20;
	}

	public static void Cost(){
		Kaynaklar.odun-=10;
		Kaynaklar.demir-=30;
	}


}