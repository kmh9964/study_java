package com.hanul.object;

public class Ex43_AccumulatorMain {

	public static void main(String[] args) {

		Ex42_Accumulator acc1 = new Ex42_Accumulator();
		Ex42_Accumulator acc2 = new Ex42_Accumulator();
		
		acc1.accumulator(10);
		acc2.accumulator(5);
		
		
		System.out.println("accumulator : " + acc1.total
				+ "\n acc2total : " + acc2.total
				+ "\n acclgrandtotal : "+ acc1.grandTotal
				+ "\n acc2grandtotal : "+ acc2.grandTotal
				+ "\n grandtotal: "+Ex42_Accumulator.grandTotal);
		
		
		
	}

}
