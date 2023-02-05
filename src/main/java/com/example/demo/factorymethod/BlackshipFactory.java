package com.example.demo.factorymethod;

public class BlackshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		return new Blackship();
	}
}
