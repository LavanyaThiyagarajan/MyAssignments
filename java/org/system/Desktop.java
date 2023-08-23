package org.system;

public class Desktop extends Computer
{
	public void desktopSize() {
		System.out.println("Desktop Size is 10 inch");
	}

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktopSize();
		obj.computerModel();
	}
}
