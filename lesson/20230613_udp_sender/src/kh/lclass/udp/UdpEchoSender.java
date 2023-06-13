package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoSender {
	public static void main(String[] args) {
		new UdpEchoSender().senderUdp();
	}

	public void senderUdp() {
		// 포트번호 정함
		int myPort = 5001;
		int destPort = 6001;
		String destName = "localhost";
		DatagramSocket dSock = null;
		try {
			// DatagramSocket 객체 생성
			dSock = new DatagramSocket(myPort); // 매개인자 없으면 자동port 번호 할당. 지정하면 해당 포트 번호로 소켓 생성

			// 전달할 메세지
			String sendMsg = "안녕";

			// 메세지 전달
			// 3. 연결한 클라이언트 IP주소를 사진 InetAddress 객체 생성
			InetAddress destIp = null;
			try {
				destIp = InetAddress.getByName(destName);
				// 4. 전송할 메세지를 byte[]로 바꿈
				byte[] byteMst = sendMsg.getBytes();
				// 5. 전송할 메세지를 DatagramPacket 객체에 담음
				DatagramPacket sendData = new DatagramPacket(byteMst, byteMst.length, destIp, destPort);
				// 6.소켓 래퍼런스를 사용하여 메세지 전송
				dSock.send(sendData);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (SocketException e) {
			e.printStackTrace();
		} finally {
			if (dSock != null)
				dSock.close();
		}
	}
}
