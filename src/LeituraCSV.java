import java.io.*;
import java.util.Scanner;


public class LeituraCSV {
	
	public static File arquivo = new File("participantes.csv"); //colocar o arquivo na mesma pasta
	private static BufferedReader reader;

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
    	InputStream is = new FileInputStream(arquivo);
    	InputStreamReader isr =  new InputStreamReader(is);
    	reader = new BufferedReader(isr);
    	String linha = reader.readLine();
    	
    	while(linha!=null){
    		
    		System.out.println(linha);
    		linha = reader.readLine();

	
	}
    	

}
	
}
