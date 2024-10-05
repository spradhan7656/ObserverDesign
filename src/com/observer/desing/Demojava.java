package com.observer.desing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demojava {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Subject channel=new YoutubeChannek();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1 Press to add new video");
			System.out.println("2 Press to add new Subscriber");
			System.out.println("3 Press to Unscribe");
			System.out.println("4 Press to Exit");
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				System.out.println("Enter the title of video");
				String title=br.readLine();
				channel.newVideoUpload(title);
			}
			else if(c==2) {
				System.out.println("Entet the Suscriber name");
				String name=br.readLine();
				channel.subsicribe(new Subscribe(name));
			}
			else if(c==3) {
				System.out.println("Entet the Suscriber name");
				String name=br.readLine();
				channel.unsubsicribe(new Subscribe(name));
			}
			else {
				break;
			}
			
		}
	}
}
