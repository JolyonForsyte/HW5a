package hw5a.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		MyFilter mf = new MyFilter("pdf");

		File source = new File("C:\\Users\\Jolyon\\Desktop\\киев");
		File dest = new File("C:\\Users\\Jolyon\\Desktop\\киев1");
		
		try{
			MyCopy.copyDir(source, dest, mf);
			System.out.println("copied");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
