package Hour13;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	public MainFrame() {
		
		super("Main Frame");
		setLookAndFeel();
		setSize(350, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton okButton = new JButton("OK");
		add(okButton);
		JButton play = new JButton("Play");
		add(play);
		JLabel hoTen = new JLabel("Ho va Ten", JLabel.LEFT);
		add(hoTen);
		JTextField name = new JTextField("Tran",20);
		add(name);
		JCheckBox check = new JCheckBox("Do you love her?", true);
		add(check);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
	}
}
