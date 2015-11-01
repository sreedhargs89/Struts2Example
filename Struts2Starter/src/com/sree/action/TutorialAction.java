package com.sree.action;

public class TutorialAction {
	
	/**
	 * This is the first method going to execute when struts call happened
	 * struts.xml is like a mapper -- url to the action class
	 * @return : success -->success.jsp and failure --> error.jsp will be called..!!
	 */
	
	public String execute(){
		
		System.out.println("Hello from Struts !!");
		return "success";
	}

}
