package bank.card;

import java.util.*;
import java.text.*;
	/*
	 * Abstract class for car objects
	 * Creates all information common to Credit and Debit cards
	 */

public abstract class Card {
	private String owner, cardFace;
	private static int nextnum = 0000001;
	private int cardnum;
	private Date exp;
	
	public Card(String owner) { 
		setOwner(owner);
		this.cardnum = this.nextnum++;
	}
	
	public void transaction() {  }
    
    public String getOwner() { return this.owner; }
    public void setOwner(String owner) { this.owner = owner; }
    
    public int getCardNum() { return this.cardnum; }
    
    public String getCardFace() { 
    	String s = "";
    	if(this.cardFace!=null) { s = "\nCustom " + this.cardFace + " design"; }
    	return s; 
    }
    public void setCardFace(String cardFace) { this.cardFace = cardFace; }
    
    public String getExpDateString() {
    	SimpleDateFormat ft = new SimpleDateFormat("MM/yy"); 
    	return ft.format(this.exp);
    }
    public Date getExpDate() { return this.exp; }
    public void setExpDate() {
    	// This will automatically be set in Debit (5 years from date of creation)
    	// and Credit (2 years from date of creation).
    }
	
	
	/* Static method containing information about the Bank that will appear on all cards */

	public static String bankInfo(){
    	String bankName = "Our Bank";
        String assress = "132 Fake Street";
        String city = "Come By Chance";
        String prov = "Newfoundland";
        String post = "A1B2C3";
        String contactNum = "1-800-123-4567";
        
    	return bankName + "\n" + assress + "\n" + city + ",  " + prov 
        		+ "\n" + post + "\nFor Customer Support Call: " + contactNum;
    }
    
    @Override
    public String toString(){
    	return getOwner() + "\n" + getCardNum() + "\nValid Thru: " + getExpDateString() + getCardFace() 
    			+  "\n\n" +  bankInfo();
    }
}