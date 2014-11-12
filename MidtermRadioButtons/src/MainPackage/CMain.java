package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class CMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CMain frame = new CMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton RadioButton1 = new JRadioButton("Small");
		RadioButton1.setBounds(146, 72, 109, 23);
		contentPane.add(RadioButton1);
		
		JRadioButton RadioButton2 = new JRadioButton("Medium");
		RadioButton2.setBounds(146, 120, 109, 23);
		contentPane.add(RadioButton2);
		
		JRadioButton RadioButton3 = new JRadioButton("Large");
		RadioButton3.setBounds(146, 177, 109, 23);
		contentPane.add(RadioButton3);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(RadioButton1);
		buttonGroup.add(RadioButton2);
		buttonGroup.add(RadioButton3);
		RadioButton1.setSelected(true);
	}
}
