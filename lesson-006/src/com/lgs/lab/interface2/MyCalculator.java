package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	
	@Override
	public void plus() {
		System.out.println("Plus: 10 + 25 = 35");
	}

	@Override
	public void minus() {
		System.out.println("Minus: 50 - 35 = 15");
	}

	@Override
	public void multiply() {
		System.out.println("Multiply: 15 * 15 = 225");
	}

	@Override
	public void devide() {
		System.out.println("Devide: 225 / 225 = 1");
	}
	
	

}
