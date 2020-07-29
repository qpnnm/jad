package jaddress.io;

import java.io.File;

public class FolderTest {
	public static void main(String[] args) {
		AddressTest at = new AddressTest();
		File path = new File("C:\\Users\\Administrator\\Downloads\\address");
		if (path.isDirectory()) {
			File[] files = path.listFiles();
			for (File file : files) {
				if (!file.isDirectory() && file.getName().indexOf("jibun_") == 0) {
					int cnt = at.insertAddress(file);
					System.out.println(file.getName() + " 입력갯수 : " + cnt);
				}
			}
		}
	}
}
