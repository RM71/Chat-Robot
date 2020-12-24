package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chatbot1 extends JFrame {
	static JTextArea txt=new JTextArea();
	static JTextField field=new JTextField();
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setTitle("PLESASE PROVIDE YOUR ID NO");
		frame.add(field);
		frame.add(txt);
		txt.setLocation(1,1);
		txt.setSize(400,300);
		field.setLocation(1,300);
		field.setSize(400,60);
		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String msg=field.getText();
				txt.append("You = "+msg+"\n");
				field.setText("");
				if(msg.toLowerCase().contains("181-115-001"))
				{
				txt.append("Bot = What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-002")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				
				else if (msg.toLowerCase().contains ("181-115-003")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				
				else if (msg.toLowerCase().contains ("181-115-004")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				
				else if (msg.toLowerCase().contains ("181-115-005")) {
					txt.append ("Bot =  What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-006")) {
					txt.append ("Bot =  What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-007")) {
					txt.append ("Bot =  What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-008")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-009")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("181-115-010")) {
					txt.append ("Bot = What is Your department please.Example:cse\n");
				}
				else if (msg.toLowerCase().contains ("cse")) {
				    txt.append ("Bot = What is Your batch please.Example:34\n");
			    }
				else if (msg.toLowerCase().contains ("44")) {
					txt.append ("Bot = Welcome to your class!!\n");
				}
			    else {
			    	txt.append("Bot = Please provide correct information. \n");
			    }
			} 
		});

}
	
}