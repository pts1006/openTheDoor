package com.pts.otd;

public class Device {

	private static String[] password = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "*","#"};
	boolean doorOpen = false;
	
	public void open() {
		
		System.out.println("문이 열렸습니다.");
	}
	
	public void fail() {
		
		System.out.println("비밀번호가 다릅니다.");
	}
}
