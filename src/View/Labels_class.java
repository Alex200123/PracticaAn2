package View;

import java.awt.Font;

import javax.swing.JLabel;

public class Labels_class 
{
	private JLabel main_label1;
	private JLabel main_label2;
	private JLabel main_label3;
	
	
	Labels_class()
	{
		main_label1 = new JLabel("Find the best games that fit your preference");
		main_label1.setBounds(300, 100, 400, 25);
		main_label1.setFont(new Font("Serif", Font. BOLD, 20));
		main_label2 = new JLabel("Rate existing games");
		main_label2.setBounds(300, 125, 400, 25);
		main_label2.setFont(new Font("Serif", Font. BOLD, 20));
		main_label3 = new JLabel("Add games that we don't have here");
		main_label3.setBounds(300, 150, 400, 25);
		main_label3.setFont(new Font("Serif", Font. BOLD, 20));
	}
	
	
	public JLabel Get_main_label1()
	{
		return main_label1;
	}
	
	public JLabel Get_main_label2()
	{
		return main_label2;
	}
	
	public JLabel Get_main_label3()
	{
		return main_label3;
	}
}
