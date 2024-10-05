
package com.observer.desing;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannek implements Subject{

	List<Observer> subscriber=new ArrayList<>();

	@Override
	public void subsicribe(Observer ob) {
		this.subscriber.add(ob);
		
	}

	@Override
	public void unsubsicribe(Observer ob) {
		this.subscriber.remove(ob);
		
	}

	@Override
	public void newVideoUpload(String title) {
		// TODO Auto-generated method stub
		for(Observer ob:this.subscriber) {
			ob.notified(title);
		}
		
	}
	
}
