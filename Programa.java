package proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Programa { /*Tienda de instrumentos musicales*/
	
	//CREACIÓN DE FUNCIONES.
	

	public static void main(String[] args) {
		
		//Declaración del Scanner para poder LEER con el Usuario.
		Scanner leer = new Scanner(System.in);
		
		//Declaración de VARIABLES con sus IDENTIFICADORES.
		boolean salir = false;
		String familia;
		
		//DO WHILE para permitir entrar en varias opciones del SWITCH
		System.out.println("Bienvenido a nuestro menú de la tienda musical --> Padilla Music: ");
		do
		{ /* ♥ */
			System.out.println(" ************************** ");
			System.out.println("Opción 0: Para salir del menú y cerrar el programa");
			//ARRAY UNIDIMENSIONAL
			System.out.println("Opción 1: Muestra una lista, con las ramas de instrumentos que se ofrecen.");
			//IF ANIDADOS Y LIBRERÍA .EQUALS()
			System.out.println("Opción 2: Enseña las características de cada familia de instrumentos instrumentos.");
			//HERENCIA
			System.out.println("Opción 3: Se centra en la ampliación de las ramas sobre las familias musicales.");
			//ARRAY MULTIDIMENSIONAL
			System.out.println("Opción 4: Muestra un par de tipos de intrumentos según la familia a la que pertenecen.");
			System.out.println("Opción 5: Enseña el proceso de producción de instrumentos.");
			
			System.out.println("Introduzca la opción que desee dentro de las estabelcidas en el menú: ");
			int opcion = leer.nextInt();
			System.out.println(" ");
			//USO DEL SWITCH
			switch (opcion)
			{//Los BREAK finalizan las acciones de los CASES, para evitar errores o0 saltos al siguiente Case del SWITCH
			
			case 1: 
				//En esta opción se hace el uso de un ARRAY UNIDIMENSIONAL.
				System.out.println("A día de hoy solo se conocen 3 familias musicales:");
				//Se crea el ARRAY con los valores establecidos.
				String musical [] = {"Viento", "Cuerda", "Percusión", "Eléctricos"};
				//Se utiliza la librería ARRAYS:SHORT para ORDENAR.
				Arrays.sort(musical);
				//Imprimimos el ARRAY ORDENADO. Uso del TO STRING
				System.out.println(Arrays.toString(musical) + "\n");//+ Salto de línea
				//Se imprime un mensaje para dar más entendimiento al usuario.
				System.out.print("Dentro de las familias se han incorporado recientemente los instrumentos eléctricos, ");
				System.out.print("ya que a pesar de ser de las familias musicales de siempre,\ntienen otro tipo de sonido ");//Contiene un salto de línea.
				System.out.println("y se están empezando a clasificar por separado, no obstante se encuentran aún dentro de sus géneros musicales.");
				//Salto de línea.
				System.out.println();
				break;
				
			case 2:
				//Uso de la VARIABLE FAMILIA y el SCANNER para leer por teclado.
				System.out.println("Escriba una familia musical de las mostradas en la primera opción:");
				familia = leer.next();
				//Uso del .EQUALS(), para comparar que la varible lea por teclado.
				//Uso los IF ANIDADOS.
				if(familia.equals("Viento") || familia.equals("viento") )
				{
					System.out.println("Dentro de esta familia se conocen Viento-Madera y Viento-Metal");
				}
				else if (familia.equals("Cuerda") || familia.equals("cuerda"))
				{
					System.out.println("Dentro de esta familia, se separan en Cuerda-Fricción y Cuerda-Punteada");
				}
				else if (familia.equals("Percusión") || familia.equals("percusión"))
				{
					System.out.println("Dentro de esta familia tenemos Percutivos (con baquetas), Chocados y Agitados");
				}
				else if (familia.equals("Eléctricos") || familia.equals("eléctricos"))
				{
					System.out.println("Se caracterizan por ser una parte separada de las familias anteriores.");
				}
				else
				{
					System.out.println("Esa familia me suena que no existe, pruebe a ver la lista de la Opción 1 de nuevo.");
				}
				//Salto de línea.
				System.out.println();
				break;
				
			case 3:
				break;
				
			case 4:
				//Se crea una ARRAY MULTIDIMENSIONAL y se imprime por pantalla.
				
				//INSTRUMENTOS DE VIENTO
				String Viento [][] = new String [3][5];
				Viento [0][0] = "Tipo de Viento";
				Viento [0][1] = "Instrumento 1";
				Viento [0][2] = "Instrumento 2";
				Viento [0][3] = "Instrumento 3";
				Viento [0][4] = "Instrumento 4";
				Viento [1][0] = "Viento-Madera";
				Viento [1][1] = "Fagots";
				Viento [1][2] = "Oboes";
				Viento [1][3] = "Saxofones";
				Viento [1][4] = "Clarinetes";
				Viento [2][0] = "Viento-Metal";
				Viento [2][1] = "Trompetas";
				Viento [2][2] = "Trombones";
				Viento [2][3] = "Tubas";
				Viento [2][4] = "Cornetas";
				
				//INSTRUMENTOS DE CUERDA
				String Cuerda [][] = new String [3][4];
				Cuerda [0][0] = "Tipo de Cuerda";
				Cuerda [0][1] = "Instrumento 1";
				Cuerda [0][2] = "Instrumento 2";
				Cuerda [0][3] = "Instrumento 3";
				Cuerda [0][4] = "Instrumento 4";
				Cuerda [1][0] = "Cuerda-Punteada";
				Cuerda [1][1] = "Piano";
				Cuerda [1][2] = "Bajo";
				Cuerda [1][3] = "Guitarra";
				Cuerda [2][0] = "Cuerda-Fricción";
				Cuerda [2][1] = "Violín";
				Cuerda [2][2] = "Violonchelo";
				Cuerda [2][3] = "Viola";
				
				//INSTRUMENTOS DE PERCUSIÓN
				String Percusion [][] = new String [4][4];
				Percusion [0][0] = "Tipo de Percusión";
				Percusion [0][1] = "Instrumento 1";
				Percusion [0][2] = "Instrumento 2";
				Percusion [0][3] = "Instrumento 3";
				Percusion [0][4] = "Instrumento 4";
				Percusion [1][0] = "Percutivos";
				Percusion [1][1] = "Xilófono";
				Percusion [1][2] = "Batrías";
				Percusion [1][3] = "Tambores";
				Percusion [2][0] = "Chocados";
				Percusion [2][1] = "Platillos";
				Percusion [2][2] = "Triángulos";
				Percusion [2][3] = "Castañuelas";
				Percusion [3][0] = "Agitados";
				Percusion [3][1] = "Maracas";
				Percusion [3][2] = "Cascabeles";
				Percusion [3][3] = "Cencerro";
				
				//INSTRUMENTOS ELECTRICOS
				String Electricos [][] = new String [6][4];
				Electricos [0][0] = "Tipo Derivado";
				Electricos [0][1] = "Viento";
				Electricos [0][2] = "Cuerda";
				Electricos [0][3] = "Percusión";
				Electricos [1][0] = "Saxofones";
				Electricos [1][1] = "Saxofón Eléctrico";
				Electricos [2][0] = "Clarinete";
				Electricos [2][1] = "Clarinete Eléctrico";
				Electricos [3][0] = "Guitarra";
				Electricos [3][2] = "Guitarra";
				Electricos [4][0] = "Bajo";
				Electricos [4][2] = "Bajo Eléctricos";
				Electricos [5][0] = "Batería";
				Electricos [5][3] = "Batería Eléctrica";
				
				break;
		
			case 5: 
				break;
				
			case 0: 
				//Esta opción es exclusivamente para salir del menú.
				salir = true;
				//Mostramos una serie de mensajes por pantalla.
				System.out.println("Vamos a proceder a salir del menú y cerrar la aplicación");
				System.out.println("Muchas gracias por contar con nosotros");
				System.out.println(" *** ¡HASTA LA PRÓXIMA! ***");
				System.out.println(" ************************** ");
				break;
				
			default:
				//En caso de error al introducir una opción incorrecta.
				System.out.println("Su opción no se encuentra en el menú, introduzca una opción válida");
				break;
			
			}
			
		}while(salir != true);//Te permite elegir opciones hasta introducir un 0, que es donde se cambia el valor del booleano.
		
		leer.close();//CERRAMOS EL LEER POR TECLADO.
	}

}