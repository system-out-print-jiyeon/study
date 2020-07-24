package com.kh.chap01_poly.part2_electronic.model.vo;

public class NoteBook extends Electronic {

	private int usbPort;
	
	public NoteBook() {}
	
	public NoteBook(String brand, String name, int price, int usbPort){
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	public int getUsbPort() {
		return usbPort;
	}
	
	
	public String toString() {
		return super.toString() + ", usb포트 수 : " + usbPort + "개";
	}
	
}
