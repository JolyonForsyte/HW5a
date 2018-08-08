package hw5a.files;

import java.io.File;
import java.io.FileFilter;

/*
1. Ќапишите программу, котора€ скопирует файлы с заранее
определенным расширением(например, только doc) из
каталога источника в каталог приемник.
*/
public class MyFilter implements FileFilter {
	
	private String [] arr;
	
	

	public MyFilter(String... arr) {
		super();
		this.arr = arr;
	}
	
	private boolean check(String ext) {
		for (String stringExt : arr) {
			if(stringExt.equals(ext)) {
				return true;
			}
			
		}
		return false;
	}



	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if(pointerIndex == -1) {
		return false;
	}
		String ext = pathname.getName().substring(pointerIndex+1);
		return check(ext);

}
}
