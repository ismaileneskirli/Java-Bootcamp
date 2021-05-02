
public class SalesManager {

	
//	public Campaign campaign;
//	
//	public SalesManager(Campaign campaign) {
//		this.campaign = campaign;
//	}
	
	public void sellGameWithCampaign(Game game, Gamer gamer, Campaign campaign){
		double discountedPrice = game.getPrice() - game.getPrice()* campaign.getDiscountRate() / 100;
		System.out.println(game.getName()+" Oyununun Kampanyasýz Fiyatý " + game.getPrice() +" TL idi.");
		System.out.println("Oyunun indirimli fiyatý " + discountedPrice +" ye satýn aldýnýz");
		System.out.println("Ýyi oyunlar "+ gamer.getName());
		
	}
	
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getName() + " oyununu satýn aldýnýz");
		System.out.println("Ýyi oyunlar "+ gamer.getName());
	}
}
