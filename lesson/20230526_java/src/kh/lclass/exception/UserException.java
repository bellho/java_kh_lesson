package kh.lclass.exception;

import kh.lclass.io.TestFileIo;

@SuppressWarnings("serial")
public class UserException extends Exception {
	public UserException() {
		super("유저익셉션 메세지입니다");
	}
	public UserException(String msg) {
		super(msg);
	}
	
}

