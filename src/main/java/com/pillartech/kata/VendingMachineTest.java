package com.pillartech.kata;

import static org.junit.Assert.*;

import org.junit.Test;


public class VendingMachineTest {

	@Test
	public void Test() {
		VendingMachine vmObj = new VendingMachine();
		assertEquals(true, vmObj.isValidCoin(Coin.PENNY));
	}
	
	
	@Test
	public void insertCoinTest(){
		VendingMachine vmObj = new VendingMachine();
		assertEquals(false, vmObj.insertCoin(Coin.PENNY));
		System.out.println(vmObj.display());
		assertEquals(true, vmObj.insertCoin(Coin.QUARTER));
		System.out.println(vmObj.display());
		assertEquals(true, vmObj.insertCoin(Coin.DIME));
		System.out.println(vmObj.display());
		assertEquals(true, vmObj.insertCoin(Coin.NICKLE));
		System.out.println(vmObj.display());
	}

}
