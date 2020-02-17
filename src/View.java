
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	JButton Calc,Clear;
	JTextField  tf1, tf2;
	JTextArea tf3;
	int number;
	public View() {
		super("Calculation");
		setBounds(100, 100, 500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calc = new JButton("Calc");
		Clear = new JButton("Clear");
		JPanel buttonPanel = new JPanel(new FlowLayout());
		JPanel fieldPanel = new JPanel(new FlowLayout());
		buttonPanel.add(Calc);
		buttonPanel.add(Clear);
		add(buttonPanel, BorderLayout.SOUTH);
		JLabel label1 = new JLabel("Distance");
		fieldPanel.add(label1);
		add(fieldPanel,BorderLayout.WEST);
		tf1 = new JTextField(11);
		fieldPanel.add(tf1,BorderLayout.CENTER);
		JLabel label2 = new JLabel("Speed");
		fieldPanel.add(label2);
		add(fieldPanel,BorderLayout.WEST);
		tf2 = new JTextField(11);
		fieldPanel.add(tf2);
		JLabel label = new JLabel("Time");
		fieldPanel.add(label);
		add(fieldPanel,BorderLayout.WEST);
		tf3 = new JTextArea();
		fieldPanel.add(tf3);
		
		Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action action = new Action();
				String disT = tf1.getText();
				String speedT = tf2.getText();
				tf3.setText(action.act1(disT, speedT));					
			}
		});
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
		});
	}

}
