package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {
		// 원인 : 생성자 없음
		// 조치내용 : 1 . singleton 확인 (주로 getInstance(), create() 메소드 지원 확인)
		// 2 . static method 즉 클래스메소드 지원 확인
		// 생성자 없이 static method 즉 클래스메소드지원이 됨
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";
		try {
			InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
			System.out.println(loopbackAddress);
			System.out.println("=============");
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp);
			boolean isLoopback = localIp.isLoopbackAddress();
			System.out.println("=============");
			InetAddress lb = InetAddress.getByName("localhost");
			System.out.println(isLoopback);
			System.out.println("=============");
			boolean lbIsLoopback = lb.isLoopbackAddress();
			System.out.println(lbIsLoopback);
			
			
			
			InetAddress[] ipAll = InetAddress.getAllByName(host1);
			System.out.println(Arrays.toString(ipAll));
			for(InetAddress ip : ipAll) {
				System.out.println(ip);
				byte[] ipAddr = ip.getAddress();
				for(int i = 0; i < ipAddr.length; i++) {
					if(ipAddr[i] < 0) {
						System.out.print(ipAddr[i] + 256);
					} else {
						System.out.print(ipAddr[i]);
					}
					if(i != ipAddr.length - 1) {
						System.out.print(".");
					}
				}
				System.out.println();
				byte[] byteArr = new byte[] {(byte)192,(byte)168,10,11};
 				System.out.println(byteArr[0]);
 				InetAddress byteArr2 = InetAddress.getByAddress(byteArr);
 				System.out.println(byteArr2);
 				String byteArr2HostName = byteArr2.getHostName();
 				System.out.println("================");
 				System.out.println(byteArr2HostName);
 				
 				
 				for(int i = 0; i < ipAddr.length; i++) {
					if(byteArr[i] < 0) {
						System.out.print(byteArr[i] + 256);
					} else {
						System.out.print(byteArr[i]);
					}
					if(i != byteArr.length - 1) {
						System.out.print(".");
					}
				}
			}
			System.out.println ();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
