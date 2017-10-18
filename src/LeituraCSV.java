import java.io.*;
import java.util.Scanner;


public class LeituraCSV {
	
	public static File arquivo = new File("participantes.csv"); //colocar o arquivo na mesma pasta

	public static void main(String[] args) throws IOException {
		
    	InputStream is = new FileInputStream(arquivo);
    	InputStreamReader isr =  new InputStreamReader(is);
    	BufferedReader br = new BufferedReader(isr);
    	String s = br.readLine();
    	
    	while(s!=null){
    		
    		System.out.print(s);
    		s = br.readLine();
    		
		Scanner ler = new Scanner(System.in);
	
	}

}
	
}
