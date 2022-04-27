import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UseBufferWriter {

	public static void main(String[] args) throws IOException {
		//1.File Location 2.File Content 
		
		String FileLocation = "BufferWriter.txt";
		String FileContent = "I will win Sure,not Immediately";
		
		//3.FileWriter
		FileWriter filewriter = new FileWriter(FileLocation);
		
		//4.BufferedWriter 
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		
		//5.write
		bufferwriter.write(FileContent);
		//6.Close
		bufferwriter.close();

	}

}
