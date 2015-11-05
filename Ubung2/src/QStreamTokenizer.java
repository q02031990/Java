
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
public class QStreamTokenizer {
	public static void main(String[] arg) throws IOException{
		String TextFile  ="1.txt";
		
		//creat a new token
		Reader qReader = new FileReader(TextFile);
		StreamTokenizer st = new StreamTokenizer(qReader);
		
		boolean _ende = false;
		do{
			int token = st.nextToken();
			switch(token){
			case StreamTokenizer.TT_EOF:
				System.out.println("End of file");
				_ende =true;
				break;
             case StreamTokenizer.TT_WORD:
                System.out.println("Word: " + st.sval);
                break;
             case StreamTokenizer.TT_NUMBER:
                System.out.println("Number: " + st.nval);
                break;
             default:
            	 System.out.println((char)token + " encountered");
			}
		}while(!_ende);
	}
}
