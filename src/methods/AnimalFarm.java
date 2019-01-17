package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
			String grinch = JOptionPane.showInputDialog("which animal do you want");
		
		/* 2. Make it so that the user can keep entering new animals. */
			if (grinch.equals("cow")){
				playMoo();
			}
			if (grinch.equals("duck")){
				playQuack();
			}
			if(grinch.equals("wolf")) {
				playWoof();
			}
			if(grinch.equals("cat")) {
				playMeow();
			}
			if (grinch.equals("llama")) {
				playLlama();
			}
	}

	void playMeow()  {
		playNoise(meowFile);
	}
	void playMoo() {
		playNoise(mooFile);
	}
	void playLlama()  {
		playNoise(llamaFile);
	}
	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
