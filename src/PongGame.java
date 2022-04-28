import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class PongGame {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		GameFrame game = new GameFrame();
		
		//---------adding a background music-----------
		File file = new File("0.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		
		clip.start();
		while(true) {}
		//------------end--------------------- = = 
	}
}
