package CharacterStreamExamples;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOEx4 {
	
	public static void main(String[] args) {
		
		IOEx4 e = new IOEx4();
		e.execute();
	}
	
	public void execute() {
		
		InputStreamReader reader = null;
		OutputStreamWriter writer = null;
		try {
			
			reader = new InputStreamReader(System.in);
			writer = new OutputStreamWriter(System.out);
			int read;
			while((read = reader.read())>=0) {
				writer.write(read);
				writer.flush();
				
				char ch = (char)read;
				if(ch == 'z') {
					break;
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader!=null) {
					reader.close();
				}
				if(writer!=null) {
					writer.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
