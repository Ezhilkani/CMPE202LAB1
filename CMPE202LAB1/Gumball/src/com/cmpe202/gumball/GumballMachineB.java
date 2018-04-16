package com.cmpe202.gumball;

import java.util.ArrayList;

public class GumballMachineB extends GumballAbstract {


	public GumballMachineB( int size )
	{
		// initialise instance variables
		this.num_gumballs = size;
		this.has_amount= Amount.N0COINS;
	}

	@Override
	public void insertcoins(ArrayList<Integer> coin) { 

		if (this.has_amount == Amount.N0COINS)
		{	
			if ( coin.size() == 2 && coin.get(0)== 25  && coin.get(1)== 25)
			{
				System.out.println( "Please turn the crank" );
				this.has_amount = Amount.YESCOINS ;
			}
			else if ( coin.size() ==1 && coin.get(0)== 25 )
			{
				this.has_amount =  Amount.PARTIALCOINS;
				System.out.println( "Please insert more coins" );
			}
			else if (coin.size() ==1 && coin.get(0)!= 25 )
			{
				System.out.println("Please clear insert correct coins");

			}
			else if ((coin.get(0)!= 25 && coin.get(1)== 25) ||
					(coin.get(0) == 25 && coin.get(1) != 25))
			{
				System.out.println("Please clear insert correct coins");
			}

			else if(coin.size()>2)
			{
				System.out.println("Please clear insert correct coins");

			}
			else	
				this.has_amount =  Amount.N0COINS;
		}

		else if(this.has_amount == Amount.PARTIALCOINS)

		{
			if ( coin.size() ==1 && coin.get(0)== 25) 
			{
				System.out.println( "Please turn the crank" );
				this.has_amount =  Amount.YESCOINS;
			}
			else if (coin.size() ==1 && coin.get(0)!= 25 ) 
			{
				System.out.println("Please clear insert correct coins");
			}
			else if(coin.size() >1) {
				System.out.println("Please clear insert correct coins");
			}
			else	{
				this.has_amount =  Amount.N0COINS;
			}
		}
	}
}
