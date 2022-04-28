import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameFrame extends JFrame{
    
    //constructor
    GameFrame(){
    	GamePanel panel = new GamePanel();
    	this.add(panel);
    	this.setTitle("Pong Game");
    	//set the picture of the frame
    	ImageIcon image = new ImageIcon("ping-pong.png");
    	this.setIconImage(image.getImage());
    	
    	this.setResizable(false);
    	this.setBackground(Color.black);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//this.setLocationRelativeTo(null);
    	this.pack();
    	this.setVisible(true);
    }
}
