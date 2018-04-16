package com.cmpe202.gumball;

import java.util.ArrayList;

public class GumballMachineC extends GumballAbstract {

	 static int total;
	public GumballMachineC( int size )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.has_amount= Amount.N0COINS;
	}

	@Override
	public void insertcoins(ArrayList<Integer> coin) {  	

		if (this.has_amount == Amount.N0COINS || this.has_amount == Amount.PARTIALCOINS)
		{	
			for (int i = 0; i <coin.size(); i++) {
				total = total + coin.get(i);		
			}
			System.out.println(" total coins inserted: "+ total);
			
			if (total == 50)
			{
				System.out.println( "Please turn the crank" );
				this.has_amount =  Amount.YESCOINS;
			
			}
			else if (total > 50) 
			{
				System.out.println("Please clear insert correct coins");
			}
			else if (total < 50) 
			{
				this.has_amount =  Amount.PARTIALCOINS;
				System.out.println( "Please insert more coins" );
			}
			total =0;
		}
	}
}



