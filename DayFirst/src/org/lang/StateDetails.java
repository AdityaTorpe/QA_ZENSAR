package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("South india");
	}
	public void northIndia() {
		System.out.println("north india");
	}
	public static void main(String[] args) {
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		
	}
}
