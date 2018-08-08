package hw5a.files;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyCopy {
	
	public static void copyFiles(File in, File out)throws IOException{
		if(in==null||out == null){
			throw new IllegalArgumentException();
		}
		try(InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)){
			
			byte[] buffer = new byte[1024*1024];
			int readByte = 0;
			
			for(;(readByte = is.read(buffer))>0;) {
				os.write(buffer,0, readByte);
			}
			
		}catch(IOException e) {
			throw e;
		}
	}
	
	public static void copyDir(File source, File dest, FileFilter mf)throws IOException {
		if(source==null||dest == null||mf == null){
			throw new IllegalArgumentException();
		}
		
		File[] files = source.listFiles(mf);
		
		for (File file : files) {
			copyFiles(file, new File(dest, file.getName()));
		}
	}
}

