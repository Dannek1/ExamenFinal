import java.io.*;	
import java.lang.*;

public class examen_201212763{
static String resultado="";
static String contenido="";

public static void main(String[] args)throws IOException{
 
try { 
File inFile = new File(args[0]); 
BufferedReader reader = new BufferedReader(new FileReader(inFile)); 
File archivo=new File("HablandoEnLenguas_201212763.txt");

FileWriter fichero=new FileWriter(archivo,true);
	BufferedWriter buffer =new BufferedWriter(fichero);
		PrintWriter escribir= new PrintWriter(buffer);	

String line = null; 
while ((line=reader.readLine()) != null) { 
traducir(line);
escribir.println(resultado);
} 
escribir.close();
reader.close( ); 
} catch (Exception e) { 
      System.out.println("¡Archivo de texto vacio!");
} 

}
public static void traducir(String cadena){
	resultado="";
	for(int i=0;i<cadena.length();i++){
	resultado=resultado + traductor(cadena.charAt(i))
	}
	
}
public static String traductor(char x){
	switch(x){
		case 'a': return "y";
		case 'b': return "h";
		case 'c': return "e";
		case 'd': return "s";
		case 'e': return "o";
		case 'f': return "c";
		case 'g': return "v";
		case 'h': return "x";	

		case 'i': return "d";	

		case 'j': return "u";	

		case 'k': return "i";	

		case 'l': return "g";	

		case 'm': return "l";	

		case 'n': return "b";	

		case 'o': return "k";	

		case 'p': return "r";	

		case 'q': return "z";	

		case 'r': return "t";	

		case 's': return "n";	

		case 't': return "w";	

		case 'u': return "j";	

		case 'v': return "p";	

		case 'w': return "f";	

		case 'x': return "m";	

		case 'y': return "a";

		default: ;

	}
			
		return " ";


}



}