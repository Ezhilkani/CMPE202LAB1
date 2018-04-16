package com.cmpe202.gumball;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/** Gumball Machine A**/
		System.out.println("\n/** Gumball Machine A**/\n");
		GumballMachineA gumballA = new GumballMachineA(5);
		ArrayList<Integer> coinArray = new ArrayList<>();		
		coinArray.add(25);
		gumballA.insertcoins(coinArray);
		gumballA.turnCrank();
		
		/** Gumball Machine B**/
		System.out.println("\n/** Gumball Machine B**/\n");
		GumballMachineB gumballB = new GumballMachineB(5);
		ArrayList<Integer> coinArrayb1 = new ArrayList<>();		
		coinArrayb1.add(25);
		coinArrayb1.add(25);
		gumballB.insertcoins(coinArrayb1);
		gumballB.turnCrank();
		
		ArrayList<Integer> coinArrayb2 = new ArrayList<>();		
		coinArrayb2.add(10);
		coinArrayb2.add(25);
		gumballB.insertcoins(coinArrayb2);
		
	
		/** Gumball Machine C**/
		System.out.println("\n/** Gumball Machine C**/\n");
		GumballMachineC gumballC = new GumballMachineC(5);
		ArrayList<Integer> coinArrayc1 = new ArrayList<>();		
		coinArrayc1.add(25);
		coinArrayc1.add(10);
		gumballC.insertcoins(coinArrayc1);
		coinArrayc1.add(10);
		coinArrayc1.add(5);
		gumballC.insertcoins(coinArrayc1);
		gumballC.turnCrank();
		
		
		ArrayList<Integer> coinArrayc2 = new ArrayList<>();		
		coinArrayc2.add(25);
		coinArrayc2.add(10);
		coinArrayc2.add(25);
		coinArrayc2.add(5);
		gumballC.insertcoins(coinArrayc2);
			
	}	
}
