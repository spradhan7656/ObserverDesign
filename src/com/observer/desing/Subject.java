package com.observer.desing;

public interface Subject {
	
	void subsicribe(Observer ob);
	void unsubsicribe(Observer ob);
	void newVideoUpload(String title);
	
}
