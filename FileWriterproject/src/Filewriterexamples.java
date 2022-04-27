import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriterexamples {

	public static void main(String[] args) throws IOException {
		
		//1.Filelocation 2.FileContent
		
		String Filelocation = "File.txt";
		String FileContent = "Java and selenium is easiest one";
		
		FileWriter fl = new FileWriter(Filelocation);
		
		BufferedWriter buffun = new BufferedWriter(fl);
		
		buffun.write(FileContent);
		buffun.close();

	}

}
