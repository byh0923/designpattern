package com.example.demo.factorymethod;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.print(new WhiteShipFactory(), "Whiteship", "keesun@mail.com");
		client.print(new BlackshipFactory(), "Blackship", "keesun@mail.com");
		
		Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
		System.out.println(whiteship);
		
		Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
		System.out.println(blackship);
	}
	
	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name,  email));
	}
	
}
