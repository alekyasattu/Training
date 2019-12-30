package IOStreamExamples_ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOEx3 {

	public static void main(String[] args) throws Exception {
	
		IOEx3  e = new IOEx3();
		e.execute();
	}
	
	
	public void execute() throws Exception {
		InputStream is = null;
		OutputStream os = System.out;
		try {
		
		is = System.in;
		int read;
		while((read = is.read())>=0) {
			os.write(read);
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
