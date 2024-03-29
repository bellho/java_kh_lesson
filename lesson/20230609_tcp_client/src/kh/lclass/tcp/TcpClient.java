package kh.lclass.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient {
	public void testTcpClient(String ip, int port) {
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		//Scanner와 유사한 기능
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); // console에 입력한 문자 읽어들이기 위한 객체
		try {
			socket = new Socket(ip, port);
			System.out.println("접속성공");
			in = socket.getInputStream();
			out = socket.getOutputStream();
			// 6. 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(in));
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			String sendMsg = null;
			System.out.print("메시지 >> ");
			sendMsg = stdIn.readLine(); // console에 입력한 문자 읽어들이기
			
			pw.println(sendMsg);
			pw.flush();
			
			String receivedMsg = br.readLine();
			System.out.println("서버로 부터온 메시지 : " + receivedMsg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stdIn != null) stdIn.close();
				if(pw!=null)pw.close();
				if(br!=null)br.close();
				if(out!=null)out.close();
				if(in!=null)in.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
