package IOStreamExamples_ByteStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOEx2 {

	public static void main(String[] args) throws Exception {
		
		long startTime = System.currentTimeMillis();
		IOEx2  e = new IOEx2();
		e.execute();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("programs finished in millis ::"+executionTime);
	}
	
	
	public void execute() throws Exception {
		InputStream is = null;
		OutputStream os = null;
		try {
		File inputFile = new File("C:\\Users\\admin\\Desktop\\NEW\\abc.txt");
		is = new FileInputStream(inputFile);
		File outFile = new File("C:\\Users\\admin\\Desktop\\NEW\\result.txt");
		os= new FileOutputStream(outFile);
		int readBytesCount;
		byte[] buffer = new byte[1000];
		BufferedInputStream bis =new BufferedInputStream(is);
		while((readBytesCount = bis.read(buffer))>=0) {
			os.write(buffer,0,readBytesCount);
			
			
		}
		System.out.println("done!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(is!=null) {
				is.close();
			}
			if(os!=null) {
				os.close();
			}
		}
		}

	

}
