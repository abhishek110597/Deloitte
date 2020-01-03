package ioDemos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile file=new RandomAccessFile("friday.txt","rw");
	file.writeUTF("Today is friday");
	System.out.println(file.getFilePointer());
	file.seek(0);
	System.out.println(file.getFilePointer());
	String str=file.readUTF();
	long x=file.length();
	System.out.println(str);
	file.seek(x);
	System.out.println(file.getFilePointer());

	file.writeUTF("Abhishek");
	file.seek(0);
	System.out.println(file.getFilePointer());

	str=file.readUTF();
	System.out.println(str);
	file.seek(x);

	System.out.println(file.getFilePointer());
	str=file.readUTF();
	
	file.close();
	System.out.println(str);
	
}
}
