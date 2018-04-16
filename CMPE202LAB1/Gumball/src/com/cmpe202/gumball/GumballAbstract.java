package com.cmpe202.gumball;

abstract class GumballAbstract implements CreateGumballDefinitionInterface{
	public int num_gumballs;
	public Amount has_amount;

	@Override
	public void turnCrank() {
		{
			if ( this.has_amount == Amount.YESCOINS)
			{
				if ( this.num_gumballs > 0 )
				{
					this.num_gumballs-- ;
					this.has_amount = Amount.N0COINS ;
					System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
				}
				else
				{
					System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
				}
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
			}
		}

	}

}
