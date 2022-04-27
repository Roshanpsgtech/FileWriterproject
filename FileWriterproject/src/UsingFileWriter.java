import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		//1.File Location 2.File Content 
		 String filelocation="usingfilewriter.txt";
		 String content ="I will Learn all concepts in Java selenium";
		//3.Use FileWriter
		FileWriter fw = new FileWriter(filelocation);
		//4.write 
		fw.write(content);
        //5.close
		fw.close();
	}

}
