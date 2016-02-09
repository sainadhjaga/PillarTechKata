package com.pillartech.kata;

public class VendingMachine {
	
	private int totalCents = 0;
	
	public VendingMachine() {
	}
	
	public boolean insertCoin(Coin coin){
		if(isValidCoin(coin)){
			totalCents = totalCents + coin.getValue();
			display();
			return true;
		}else{
			displayInvalidCoinAndBalance();
			return false;
		}
	}
	
	public void displayInvalidCoinAndBalance(){
		System.out.println("Invalid Coin. We accept only Querters, Dime or Nickel. Current balance is : "+totalCents);
	}
	
	public String display(){
		if(totalCents == 0){
			return "Insert Coin";
		}else{
			return "Value : "+totalCents;
		}
	}
	
	public boolean isValidCoin(Coin coin){
		if(coin == Coin.QUARTER){
			return true;
		}else if(coin == Coin.DIME){
			return true;
		}else if(coin == Coin.NICKLE){
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
