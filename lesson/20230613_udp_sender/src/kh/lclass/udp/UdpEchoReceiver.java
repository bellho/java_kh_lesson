package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoReceiver {
	public static void main(String[] args) {
		new UdpEchoReceiver().receiverUdp();
		
	}
	public void receiverUdp() {
		// 포트번호 정함
		int myPort = 6001;
//		int destPort = 6001;
//		String destName = "localhost";
		DatagramSocket dSock = null;
		try {
			// DatagramSocket 객체 생성
			dSock = new DatagramSocket(myPort); // 매개인자 없으면 자동port 번호 할당. 지정하면 해당 포트 번호로 소켓 생성
			byte[] byteMsg = new byte[1024];	// 비어있는 byte타입의 배열 작성
			// 메세지 수신
			while(true) {
				DatagramPacket receiveData = new DatagramPacket(byteMsg, byteMsg.length);
				// 비어있는 배열를 추가
				dSock.receive(receiveData);
				
				System.out.println(byteMsg.length);
				System.out.println(receiveData.getData().length);
				System.out.println(receiveData.getLength());
				
				String receivedStr = new String(receiveData.getData());
				System.out.println("수신메시지 : " + receivedStr);
				
			}
			

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (dSock != null)
				dSock.close();
		}
	}
}
