package com.cmpe202.gumball;

import java.util.ArrayList;

public class GumballMachineA extends GumballAbstract {


	public GumballMachineA( int size )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.has_amount= Amount.N0COINS;
	}


	@Override
	public void insertcoins(ArrayList<Integer> coin) {

		if((coin.size() == 1) && (coin.get(0) == 25 )){
			this.has_amount = Amount.YESCOINS ;
			System.out.println("Please turn the crank"); 
		}
		else if (coin.size() >1) {

			System.out.println("Please clear insert correct coins");   
		}
		else  {
			this.has_amount = Amount.N0COINS ;
		}

	}

}
