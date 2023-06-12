package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void testServer(int port) {
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			ss = new ServerSocket(port);
			while (true) {
				System.out.println("접속 대기중 입니다...");

				sc = ss.accept();
				System.out.println("누군가 접속하였습니다" + sc.getLocalPort() + ", " + sc.getPort());

				is = sc.getInputStream();
				os = sc.getOutputStream();

				br = new BufferedReader(new InputStreamReader(is));
				bw = new BufferedWriter(new OutputStreamWriter(os));
				
				String receivedMsg = null;
				while(true) {
					if((receivedMsg = br.readLine())!= null) {
						System.out.println("받은 메시지 : " + receivedMsg);
						bw.write("메세지를 수신하였습니다.\n");
						bw.flush();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)bw.close();
				if (br != null)br.close();
				if (os != null)os.close();
				if (is != null)is.close();
				if (sc != null)sc.close();
				if (ss != null)ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
