
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class qString {
	
	public static void main(String[] arg)
	{
		try(BufferedReader Br = new BufferedReader(new FileReader("1.txt")))
		{
			String str;
			while((str = Br.readLine())!=null){
				String[] s =  str.split(" ");
				float Tong = 0;
				int i=0;
				for(String ss:s){
					System.out.println(ss);
					if(isFload(ss)){
						float x = Float.parseFloat(ss);
						Tong = Tong + x;
						System.out.println("Tong : " + Tong);
						i++;
					}
					
				}
				
				System.out.println("Durchschnitt: " + Tong/i);
				System.out.println("---------------------------------------");
			}
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	
	public static boolean isFload(String s){
		try{
			Float i = Float.parseFloat(s);
			return true;
		}catch(NumberFormatException er){
			return false;
		}
	}
	
}
