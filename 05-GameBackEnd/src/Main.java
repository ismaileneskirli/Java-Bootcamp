
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Games, Gamers, GamerManager, SalesManager(Gamer gamer),Campaign(), CampaignManager(Game game)
		//Logger, DatabaseLogger
		
		Logger[] loggers = {new DatabaseLogger()} ;
		// db simulasyonu
		Gamer[] gamers = {};
		GamerManager gamerManager = new GamerManager(loggers);
		Gamer enes = new Gamer(1, "1131312312", "enes","kirli", "10.08.1998", 150,78);
		Gamer ahmet = new Gamer(2,"313221","ahmet","keskin","12.05.2000",200,50);
		
		//                                1. Gereksinimler
		// kay�t
		gamers = gamerManager.register(enes, gamers);
		gamerManager.signUp(enes);
		//guncelleme, parametre olarak ald��� kullan�c� db de kay�tl� m� ?
		gamerManager.updateBudget(enes, 100,gamerManager.isSignedIn(enes, gamers));
		//kay�t silme
		gamerManager.deleteGamerStatistics(enes,gamerManager.isSignedIn(enes, gamers));
		// dogrulama yap�lamad� ahmet sistemde kay�tl� degil
		gamerManager.deleteGamerStatistics(ahmet, gamerManager.isSignedIn(ahmet, gamers));
		
		//                             2. Gereksinimler
		Game warcraft = new Game(1,"warcraft",200,0);
		SalesManager salesManager = new SalesManager();
		salesManager.sellGame(warcraft, enes);
		
		//                             3. Gereksinimler
		// yeni kampanya girisi
		Campaign egitimKampanyasi = new StudentCampaign(1,"ogrenci kampanyas�",15.0);
		CampaignManager campaignManager = new CampaignManager(loggers);
		// kampanya eklenmesi
		campaignManager.addNewCampaign(egitimKampanyasi);
		// kampanya g�ncellenmesi 
		campaignManager.updateCampaignDiscount(egitimKampanyasi, 5);
		
		//                            4. Gereksinimler 
		// sat�sa kampanya entegrasyonu
		salesManager.sellGameWithCampaign(warcraft, ahmet,egitimKampanyasi);
		
		
	}

}
