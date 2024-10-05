package com.observer.desing;

public class Subscribe implements Observer {

	private String name;
	Subscribe(String name){
		this.name=name;
	}
	@Override
	public void notified(String title) {
		System.out.println("Hello "+this.name+" New View Uploaded :"+title+" notification");
	}

}
