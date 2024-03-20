package electricity.billing.system;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
	JTextField userText, passwordText;
	Choice loginChoice;
	JButton loginButton, cancelButton, signupButton;
	
	Login(){
		super("Login");
		
		JLabel username = new JLabel("UserName");
		username.setBounds(300, 60, 100, 20);
		add(username);
		
		userText = new JTextField();
		userText.setBounds(400, 60, 150, 20);
		add(userText);
		
		JLabel password = new JLabel("Password");
		password.setBounds(300, 100, 100, 20);
		add(password);
		
		passwordText = new JTextField();
		passwordText.setBounds(400, 100, 150, 20);
		add(passwordText);
		
		
		JLabel loggin = new JLabel("Loggin In As");
		loggin.setBounds(300, 140, 100, 20);
		add(loggin);
		
		loginChoice = new Choice();
		loginChoice.add("Admin");
		loginChoice.add("Customer");
		loginChoice.setBounds(400, 140, 150, 20);
		add(loginChoice);
		
//		buttons
		
		loginButton = new JButton("Login");
		loginButton.setBounds(330, 180, 100, 20);
		add(loginButton);
		
		setSize(640, 300);
		setLocation(400, 200);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
}
