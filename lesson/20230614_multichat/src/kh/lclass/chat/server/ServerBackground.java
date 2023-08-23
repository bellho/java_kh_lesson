package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ServerBackground {
	private ServerSocket server; // 서버소켓
	private ServerGUI gui;

	// Client 여려명을 관리 : socket + nickName --> nickN
	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
	// map.put("socket", sockete);
	// map.put("nickname", "ej");
	// mapList.add(map);
	// 위에 List를 사용하지 않아도
	// map.put("ej", socket);
	// map.put("hj", socket);
	// 닉네임과 소켓으로만 사용하여, 맵만 사용
	private Socket socket;

	private int count; // 현재 접속자 수

	// 서버 생성 및 설정
	public void setting() {
		Collections.synchronizedMap(mapClients);
		try {
			server = new ServerSocket(7777);
			// 방문자 접속을 계속 받아들임. 무한반복함. GUI 프로그램경우 창 닫힐 때 까지 계속 반복됨. break 없음.
			while (true) {
				// 접속자 대기 중
				socket = server.accept(); // 클라이언트 받음
				new Client(socket).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void removeClient(String nickname) {
		gui.appendMsg(nickname + "님이 나가셨습니다.");
	}

	public void addClient(String nickName) {
		gui.appendMsg(nickName + "님이 접속했습니다.");
	}

	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}

	public void sendMessage(String msg) {
		Set<String> keys = mapClients.keySet();
		for (String key : keys) {
			BufferedWriter bw = mapClients.get(key);
			try {
				bw.write(msg + "\n");
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/////////////////////////// innerClass ////////////////////////
	class Client extends Thread {
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickName;

		public Client(Socket socket) {
			// 초기값 설정
			// Client와 입/출력 통로 생성
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				// 클라이언트 nickName이 바로 이어서 들어옴.
				nickName = br.readLine();
				// server 화면에 출력
				addClient(nickName);
				// client outputStream 관리 map에 추가
				mapClients.put(nickName, bw);
				// client map 모두에게 접속 정보 전달
				sendMessage(nickName + "님이 접속했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			// Client마다 각각에서 전달되어오는 메시지 확인하고 화면에 출력
			// Client와 입력 통로가 끊어지지 않았다면 계속 반복확인함.
			// Client에서 수신받은 msg
			try {
				while (br != null) {
					String msg = br.readLine();
					gui.appendMsg(msg);
					sendMessage(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				removeClient(nickName);
				mapClients.remove(nickName);
				sendMessage(nickName+"님 나갔습니다.");
			}

		}
	}
}
