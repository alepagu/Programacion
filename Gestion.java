package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Gestion implements Cadenas{//LLAMAMOS A LA INTERFAZ
	
	//CREAMOS CON ENCAPSULAMIENTO LAS LIBRERÍAS PARA PILAS Y COLAS.
	private Stack<Object> pila;
	private Queue<Object> cola;
	
	//CONTRUCTOR DE LA CLASE
	public Gestion()
	{
		pila = new Stack<>();
		cola = new LinkedList<>();
	}
	
	//MÉTODOS DE LA INTERFAZ
	@Override
	public void push(String elemento) 
	{
		pila.push(elemento);
	}

	@Override
	public Object pop() 
	{
	    return pila.pop();
	}

	@Override
	public void agregar(String objeto) 
	{	
		cola.add(objeto);
	}

	@Override
	public Object remove() {
		return cola.remove();
	}
	
	//CREAMOS UN MÉTODO PARA ESCRIBIR UN FICHERO.
	
	public void escribirTexto ()
	{
		BufferedWriter out = null;
		//TRY y CATCH MANEJO DE EXCEPCIONES.
		try
		{
			out = new BufferedWriter(new FileWriter("C:\\Users\\aleja\\Desktop\\p\\Mensaje.txt"));
			String cad = "Esta tienda se especializa en los instrumentos de viento y de cuerda";
			for (int i = 0; i < cad.length(); i++)
			{
				out.write(cad.charAt(i));//Escribimos carácter por carácter.
			}
			
		}catch (IOException ex)
		{
			System.out.println(ex.getMessage());
			
		}finally //EN CASO DE NO TERMINAR LA ESCRITURA.
		{
			if (out != null)//SI NO SE CIERRA LA ESCRITURA
			{//TRY Y CATCH
				try 
				{
					out.close();//CERRAMOS LA ESCRITURA 
					
				}catch (IOException ex)
				{
					System.out.println(ex);
				}
			}
		}
		
	}
	
	public void leerTexto()
	{
		//DECLARACIÓN DE VARIABLES Y APERTURA DEL BUFFER.
		String texto = "";
		BufferedReader in = null;//Se abre un Buffer sin VALOR.
		
		//TRY Y CATCH --> MANEJO DE EXCEPCIONES.
		try 
		{
			in = new BufferedReader(new FileReader("C:\\Users\\aleja\\Desktop\\p\\Mensaje.txt"));
			String linea = in.readLine();
			
			while (linea != null)//MINETRAS NO TERMINE DE LEER
			{
				texto = texto + linea;
				linea = in.readLine();
			}
		}catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}finally
		{
			if (in != null)
			{
				try
				{
					in.close();
				}catch (IOException ex)
				{
					System.out.println(ex);
				}
			}
		}
		
		System.out.println(texto);
	}	
}