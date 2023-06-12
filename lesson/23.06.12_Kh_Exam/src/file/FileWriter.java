package file;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class FileWriter {
	public void fileWrite() {
		String filePath = "D:/data1/a.txt";
		FileOutputStream fos = null;
		OutputStreamWriter osr = null;
		BufferedWriter bw = null;
			try {
				fos = new FileOutputStream(filePath);
				osr = new OutputStreamWriter(fos);
				bw = new BufferedWriter(osr);
				
				bw.write("Hello, world");
				bw.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(bw != null) bw.close();
					if(osr != null) osr.close();
					if(fos != null) fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}
