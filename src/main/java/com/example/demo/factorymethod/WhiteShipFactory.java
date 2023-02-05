package com.example.demo.factorymethod;

public class WhiteShipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		return new Whiteship();
	}

	
	
}
