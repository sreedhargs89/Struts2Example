package com.sree.action;

import com.sree.service.TutorialFinderService;

public class TutorialAction {
	
	/**
	 * This is the first method going to execute when struts call happened
	 * struts.xml is like a mapper -- url to the action class
	 */
	
	private String bestTutorialSite;
	
	
	
	public String execute(){
		TutorialFinderService tutObj = new TutorialFinderService();		
		setBestTutorialSite(tutObj.getBestTutorialSite());
		return "success";
	}



	public String getBestTutorialSite() {
		return bestTutorialSite;
	}



	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

}
