
public class SalesManager {

	
//	public Campaign campaign;
//	
//	public SalesManager(Campaign campaign) {
//		this.campaign = campaign;
//	}
	
	public void sellGameWithCampaign(Game game, Gamer gamer, Campaign campaign){
		double discountedPrice = game.getPrice() - game.getPrice()* campaign.getDiscountRate() / 100;
		System.out.println(game.getName()+" Oyununun Kampanyas�z Fiyat� " + game.getPrice() +" TL idi.");
		System.out.println("Oyunun indirimli fiyat� " + discountedPrice +" ye sat�n ald�n�z");
		System.out.println("�yi oyunlar "+ gamer.getName());
		
	}
	
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getName() + " oyununu sat�n ald�n�z");
		System.out.println("�yi oyunlar "+ gamer.getName());
	}
}
