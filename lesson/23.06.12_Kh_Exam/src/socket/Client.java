package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void testClient(String ip, int port) {
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		//Scanner와 유사한 기능
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); // console에 입력한 문자 읽어들이기 위한 객체
		try {
			sc = new Socket(ip, port);
			System.out.println(sc.getLocalPort());
			System.out.println("접속성공");
			is = sc.getInputStream();
			os = sc.getOutputStream();
			// 6. 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			
			String sendMsg = null;
			System.out.print("메시지 >> ");
			sendMsg = stdIn.readLine(); // console에 입력한 문자 읽어들이기
			
			bw.write(sendMsg+"\n");
			bw.flush();
			
			String receivedMsg = br.readLine();
			System.out.println("서버로 부터온 메시지 : " + receivedMsg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stdIn != null) stdIn.close();
				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sc!=null)sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
