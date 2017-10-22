import java.io.*;
import java.util.Scanner;


public class LeituraCSV {
	
	public static File arquivo = new File("participantes.csv"); //colocar o arquivo na mesma pasta
	private static BufferedReader reader;

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
    	InputStream importa = new FileInputStream(arquivo);
    	InputStreamReader input =  new InputStreamReader(importa);
    	reader = new BufferedReader(input);
    	String linhacsv = reader.readLine();
    	
    	try{
    	   	while(linhacsv!=null){
        		
        		System.out.println(linhacsv);
        		linhacsv = reader.readLine();	
    	   	}
    	}catch(FileNotFoundException arquivoNaoEncontrado){
  
    		System.out.println("Arquivo não encontrado...");
    	}

	}
	
}
