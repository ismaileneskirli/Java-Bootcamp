
public class CampaignManager {

	
	private Logger[] loggers;

	// referance
	public CampaignManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void addNewCampaign(Campaign campaign){
		System.out.println("Eklenen kampanya adý : " + campaign.getCampaignName());
		// burada db ye veya arraye eklemek için kod yazýlacak.
		Utils.runLoggers(loggers, "campaign added");
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Silinen kampanya adý : " + campaign.getCampaignName());
		Utils.runLoggers(loggers, "campaign deleted");
	}
	
	public void updateCampaignDiscount (Campaign campaign, double discountRate) {
		campaign.setDiscountRate(campaign.getDiscountRate() + discountRate);
		Utils.runLoggers(loggers, "campaign updated, new discount is : " + String.valueOf(campaign.getDiscountRate()));
	}
}
