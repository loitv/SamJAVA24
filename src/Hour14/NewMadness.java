package Hour14;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class NewMadness extends JFrame {

	// set up row 1
		JPanel row1 = new JPanel();
		JComboBox cb = new JComboBox();
//		ButtonGroup option = new ButtonGroup();
//		JCheckBox quickpick = new JCheckBox("Quick Pick", false);
//		JCheckBox persional = new JCheckBox("Persional", true);

		// set up row 2
		JPanel row2 = new JPanel();
		JLabel numbersLabel = new JLabel("Your Pick: ", JLabel.CENTER);
		JTextField[] numbers = new JTextField[6];
		JLabel winnersLabel = new JLabel("Winner: ", JLabel.CENTER);
		JTextField[] winners = new JTextField[6];

		// set up row 3
		JPanel row3 = new JPanel();
		ButtonGroup music = new ButtonGroup();
		JCheckBox stop = new JCheckBox("Stop", false);
		JCheckBox play = new JCheckBox("Play", true);
		JCheckBox reset = new JCheckBox("Reset", false);
//		JButton stop = new JButton("Stop");
//		JButton play = new JButton("Play");
//		JButton reset = new JButton("Reset");

		// set up row 4
		JPanel row4 = new JPanel();
		JLabel got3Label = new JLabel("3 of 6: ", JLabel.CENTER);
		JTextField got3 = new JTextField("0");
		JLabel got4Label = new JLabel("4 of 6: ", JLabel.CENTER);
		JTextField got4 = new JTextField("0");
		JLabel got5Label = new JLabel("5 of 6: ", JLabel.CENTER);
		JTextField got5 = new JTextField("0");
		JLabel got6Label = new JLabel("6 of 6: ", JLabel.CENTER);
		JTextField got6 = new JTextField("0");
		JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.CENTER);
		JTextField drawings = new JTextField("0");
		JLabel yearsLabel = new JLabel("Years: ", JLabel.CENTER);
		JTextField years = new JTextField();

		public NewMadness() {
			super("New Madness");
			setLookAndFeel();
			setSize(550, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GridLayout layout = new GridLayout(5, 1, 10, 10);
			setLayout(layout);
			
			FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER);
			cb.addItem("Quick Pick");
			cb.addItem("Persional");
			row1.setLayout(layout1);
			row1.add(cb);
//			row1.add(persional);
			add(row1);

			GridLayout layout2 = new GridLayout(2, 7, 10, 10);
			row2.setLayout(layout2);
			row2.add(numbersLabel);
			for (int i = 0; i < 6; i++) {
				numbers[i] = new JTextField();
				row2.add(numbers[i]);
			}
			row2.add(winnersLabel);
			for (int i = 0; i < 6; i++) {
				winners[i] = new JTextField();
				row2.add(winners[i]);
			}
			add(row2);

			FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
			row3.setLayout(layout3);
//			stop.setEnabled(false);
			music.add(play);
			music.add(stop);
			music.add(reset);
//			row3.add(play);
			row3.add(play);
			row3.add(stop);
			row3.add(reset);
			add(row3);

			GridLayout layout4 = new GridLayout(2, 3, 20, 10);
			row4.setLayout(layout4);
			row4.add(got3Label);
			got3.setEditable(false);
			row4.add(got3);
			row4.add(got4Label);
			got4.setEditable(false);
			row4.add(got4);
			row4.add(got5Label);
			got5.setEditable(false);
			row4.add(got5);
			row4.add(got6Label);
			got6.setEditable(false);
			row4.add(got6);
			row4.add(drawingsLabel);
			drawings.setEditable(false);
			row4.add(drawings);
			row4.add(yearsLabel);
			years.setEditable(false);
			row4.add(years);
			add(row4);

			setVisible(true);

		}

		private void setLookAndFeel() {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception ex) {
				// ignore Error
			}
		}

		public static void main(String[] args) {

			NewMadness lm = new NewMadness();
		}
}
