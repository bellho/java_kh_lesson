package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 6521300218799647804L;

	private JTextArea jta = new JTextArea(40, 25);
	private JTextField jtf = new JTextField(25);
	
	private String nickName;	// Client nickName
	private ClientBackground cb = new ClientBackground();	// 채팅socket기능을 담당할 객체
	 
	public ClientGUI(String nickName) {
		this.nickName = nickName;
		
		
		setBounds(200, 100, 400, 600);
		setTitle(nickName + "님의 창");
		
		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18));
		jta.setBackground(new Color(230, 255, 230));
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		cb.setNickName(nickName);
		cb.setGui(this);
		cb.connection();
	}
	//TODO 새 메시지를 받았을 때 메소드 호출됨.
	public void appendMsg(String msg) {
		// jta (채팅창)에 msg를 추가함.
		jta.append(msg);
		jta.append("\n");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = jtf.getText();
		System.out.println(msg + "\n");
		jtf.setText("");
		cb.sendMessage(msg);
	}
		// server에 전달하기 위해 background
}
