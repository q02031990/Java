
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
		double Tong =0.0;
		int i=1;
		do{
			int token = st.nextToken();
			switch(token){
			case StreamTokenizer.TT_EOF:
				if(i>1){
           		 System.out.println("Durchschnitt: " + Tong/i);
           		 System.out.println("------------------------------------------");
           	 	}
                Tong = 0;
                i=0;
				_ende =true;
				break;
             case StreamTokenizer.TT_WORD:
            	 if(i>1){
            		 System.out.println("Durchschnitt: " + Tong/i);
            		 System.out.println("------------------------------------------");
            	 }
                System.out.println("Word: " + st.sval);
                Tong = 0;
                i=0;
                break;
             case StreamTokenizer.TT_NUMBER:
                System.out.println("Number: " + st.nval);
                i++;
                Tong = Tong + st.nval;
                break;
             default:
            	 System.out.println((char)token + " encountered");
			}
		}while(!_ende);
	}
}
