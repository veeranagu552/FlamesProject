package projectMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	static JFrame frame = null;
	static JTextField firstNameField = null, secondNameField = null, resultField = null;
	static JButton button = null;
	private static String firstName = null;
	private static String secondName = null;

	public static void main(String[] args) {
		frame = new JFrame("Flames Project");
		firstNameField = new JTextField("Firstname");
		secondNameField = new JTextField("Secondname");
		resultField = new JTextField("Result");
		button = new JButton("Find");
		firstNameField.setBounds(50, 50, 150, 20);
		secondNameField.setBounds(50, 100, 150, 20);
		resultField.setBounds(50, 150, 150, 20);
		resultField.setEditable(false);
		button.setBounds(75, 200, 75, 25);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				firstName = firstNameField.getText().toLowerCase();
				secondName = secondNameField.getText().toLowerCase();
				CancellationLogic cancellationObj = new CancellationLogic(firstName, secondName);
				int difference = cancellationObj.getDifference();
				System.out.println(FlamesLogic.getResult(difference));
				resultField.setText(FlamesLogic.getResult(difference));
			}
		});
		frame.setSize(300, 300);
		frame.add(firstNameField);
		frame.add(secondNameField);
		frame.add(resultField);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
