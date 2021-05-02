
public class CampaignManager {

	
	private Logger[] loggers;

	// referance
	public CampaignManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void addNewCampaign(Campaign campaign){
		System.out.println("Eklenen kampanya ad� : " + campaign.getCampaignName());
		// burada db ye veya arraye eklemek i�in kod yaz�lacak.
		Utils.runLoggers(loggers, "campaign added");
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Silinen kampanya ad� : " + campaign.getCampaignName());
		Utils.runLoggers(loggers, "campaign deleted");
	}
	
	public void updateCampaignDiscount (Campaign campaign, double discountRate) {
		campaign.setDiscountRate(campaign.getDiscountRate() + discountRate);
		Utils.runLoggers(loggers, "campaign updated, new discount is : " + String.valueOf(campaign.getDiscountRate()));
	}
}
