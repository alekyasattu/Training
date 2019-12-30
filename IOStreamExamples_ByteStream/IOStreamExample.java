package IOStreamExamples_ByteStream;

import java.io.File;

public class IOStreamExample {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Deloitte\\src\\Deloitte";
		File file = new File(path);
		System.out.println("is dir=" + file.isDirectory());
		System.out.println("is file="+file.isFile());
		System.out.println("is hidden="+file.isHidden());
		System.out.println("..........");
		if(file.isDirectory()) {
			String[] files = file.list();
			for(String f : files) {
				System.out.println(f);
			}
			}
		System.out.println("..........");
		File dirToBeCreated = new File("C:\\Users\\admin\\Desktop\\NEW");
		boolean created = dirToBeCreated.mkdir();
		System.out.println("dir created:"+created);
	}
}
