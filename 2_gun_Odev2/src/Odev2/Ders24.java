package Odev2;

public class Ders24 {

	public static void main(String[] args) {
	sayibulmaca();	

	}
	public static void sayibulmaca() {
		int [] sayilar =new int[] {1,2,5,7,9,0};
		int aranacak=13;
		boolean Varmi=false;
		
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				Varmi=true;
				
				break;
			}
		}
		if(Varmi) {
			mesajver("Say� Mevcuttur.");
			
		}else {
			mesajver("Say� Mevcut DE��LD�R.");
		}
	}
		public static void mesajver(String mesaj) {
			System.out.println(mesaj);
		}

}
