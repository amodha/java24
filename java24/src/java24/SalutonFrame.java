package java24;
import javax.swing.*;
import java.awt.*;


public class SalutonFrame extends JFrame {
	public SalutonFrame() {
		super("Saluton Mondo!");
		setLookAndFeel();
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		add(play);
		add(stop);
		
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception exc) {
			//ignore error
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalutonFrame sal = new SalutonFrame();
	}

}
