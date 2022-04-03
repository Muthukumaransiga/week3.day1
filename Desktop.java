package org.system;

public class Desktop extends Computer{
	
	public void desktopsSize()
	{
		System.out.println("The desktop size 40inch");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopsSize();

	}

}
