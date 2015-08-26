package Hour13;

import java.awt.FlowLayout;

import javax.swing.*;

public class TextArea extends JFrame {

	public TextArea() {
		super("Text Area");
		setLookAndFeel();
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea textArea = new JTextArea("I should have been a pair\n"
				+ "of ragged claws.", 2, 30);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(textArea);
//		JPanel topRow = new JPanel();
//		FlowLayout flo = new FlowLayout();
//		setLayout(flo);
//		add(topRow);
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
		TextArea ta = new TextArea();
	}
	
}
