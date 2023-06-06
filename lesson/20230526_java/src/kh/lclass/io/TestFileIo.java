package kh.lclass.io;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.lclass.exception.UserException;
import kh.lclass.oop.sample.Person;

public class TestFileIo {
	public void testFileOutputStreamObject() {
		// 파일에 사람들 자료를 저장함.
		Person p1 = new Person("홍길동", 23, '남');
		Person p2 = new Person("영희", 27, '여');
		String filePath = "D:/data1/aaa.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void testFileInputStreamObject() {
		// 파일에 사람들 자료를 저장함.
		String filePath = "D:/data1/aaa.txt";
		FileInputStream ios = null;
		ObjectInputStream ois = null;
		try {
			ios = new FileInputStream(filePath);
			ois = new ObjectInputStream(ios);
			Object a = null;
			if ((a = ois.readObject()) instanceof Person) {
				Person p = (Person) a;
				System.out.println(p);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (ios != null)
					ios.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void testRamda() throws UserException {
		int[] arr = { 2, 3, 4 };
		int[] arr2 = new int[] { 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (arr.length > 2) {
			throw new UserException("오류입니다.");
			// 오류 발생하고 죽어버림
		}
	}

	public void testFileReadData() {
		String filepath = "D:/data1/aaa.txt";
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filepath));) {
			long temp = 0L;
			while (dis.readLong() != temp) {
				System.out.println(String.valueOf(temp));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void testfileRead3() {
		// String filePath = "D:/data1/aaa.txt";
		// BufferedReader br = null;

		try (BufferedReader br = new BufferedReader(new FileReader("D:/data1/aaa.txt"))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			try {
//				if(br != null) br.close();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}

	public void testFileRead2() {
		// 보조스트림
		String filePath = "D:/data1/aaa.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 생성 순서 : 메인스트림 --> 보조스트림
			fis = new FileInputStream(filePath); // 메인스트림 먼저 생성
			isr = new InputStreamReader(fis); // 보조스트림 생성
			br = new BufferedReader(isr);

//			br = new BufferedReader (new InputStreamReader(new FileInputStream(filePath)));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 해제 순서( 생성 반대 순서)
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void testFileRead() {
		String filePath = "D:/data1/aaa.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(filePath); // (File과 java 프로그램의 resource 통로)
//				방법 1
//				int a = -1;
//				while((a = fr.read()) > -1) {
//					System.out.println((char)a);
//			}
//				방법 2-3
			int cntPerRead = 30;
			char[] readCharArr = new char[1000];
			for (int i = 0; i < readCharArr.length / cntPerRead; i++) {
				int readCnt = fr.read(readCharArr, i * cntPerRead, 50);
				System.out.println(readCnt);
				if (readCnt < cntPerRead) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("폴더를 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=================");
	}

	public void testFile() {
		String path = "D:/data1/aaa.txt";
		String filename = "aaa.txt";

		new File(path).mkdirs(); // 디렉토리 생성
		File f2 = new File(path, filename);
		FileWriter fw = null;
		try {
			f2.createNewFile(); // 파일생성

			fw = new FileWriter(f2); // File에 문자 형태 전송이 가능한 OutputStream
			fw.write("한글 한"); // 전송하고자 하는 문자를 작성
			fw.flush(); // 전송한 문자가 담긴 버퍼를 깨끗하게 밀어내기 OutputStream (File과 java 프로그램의 통로)
		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close(); // 통로를 닫기
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
