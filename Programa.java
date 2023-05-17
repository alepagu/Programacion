package proyecto;

import java.util.Scanner;
import java.util.Arrays;

public class Programa { /* Tienda de instrumentos musicales */

	// CREACIÓN DE FUNCIONES.
	private static void imprimirArray(String[][] arr) {
		for (int i = 0; i < arr.length; i++)// BUCLE FOR para controlar la impresión.
		{
			for (String valor : arr[i])// FOR EACH PARA imprimir las filas
			{
				System.out.print(valor + " - ");
			}
			System.out.println();// Salto de Línea
		}
	}

	public static void main(String[] args) {

		// Declaración del Scanner para poder LEER con el Usuario.
		Scanner leer = new Scanner(System.in);

		// Declaración de VARIABLES con sus IDENTIFICADORES.
		boolean salir = false;
		String familia;

		// DECLARACIÓN DE ARRAYS

		// Se crean una ARRAYS MULTIDIMENSIONAL.

		// INSTRUMENTOS DE VIENTO
		String Viento[][] = new String[3][5];
		Viento[0][0] = "Tipo de Viento";
		Viento[0][1] = "Instrumento";
		Viento[0][2] = "Instrumento";
		Viento[0][4] = "Instrumento";
		Viento[0][3] = "Instrumento";
		Viento[1][0] = "Viento-Madera";
		Viento[1][1] = "Fagots";
		Viento[1][2] = "Oboes";
		Viento[1][3] = "Saxofones";
		Viento[1][4] = "Clarinetes";
		Viento[2][0] = "Viento-Metal";
		Viento[2][1] = "Trompetas";
		Viento[2][2] = "Trombones";
		Viento[2][3] = "Tubas";
		Viento[2][4] = "Cornetas";

		// INSTRUMENTOS DE CUERDA
		String Cuerda[][] = new String[3][5];
		Cuerda[0][0] = "Tipo de Cuerda";
		Cuerda[0][1] = "Instrumento 1";
		Cuerda[0][2] = "Instrumento 2";
		Cuerda[0][3] = "Instrumento 3";
		Cuerda[0][4] = "Instrumento 4";
		Cuerda[1][0] = "Cuerda-Punteada";
		Cuerda[1][1] = "Piano";
		Cuerda[1][2] = "Bajo";
		Cuerda[1][3] = "Guitarra";
		Cuerda[2][0] = "Cuerda-Fricción";
		Cuerda[2][1] = "Violín";
		Cuerda[2][2] = "Violonchelo";
		Cuerda[2][3] = "Viola";

		// INSTRUMENTOS DE PERCUSIÓN
		String Percusion[][] = new String[4][5];
		Percusion[0][0] = "Tipo de Percusión";
		Percusion[0][1] = "Instrumento 1";
		Percusion[0][2] = "Instrumento 2";
		Percusion[0][3] = "Instrumento 3";
		Percusion[0][4] = "Instrumento 4";
		Percusion[1][0] = "Percutivos";
		Percusion[1][1] = "Xilófono";
		Percusion[1][2] = "Batrías";
		Percusion[1][3] = "Tambores";
		Percusion[2][0] = "Chocados";
		Percusion[2][1] = "Platillos";
		Percusion[2][2] = "Triángulos";
		Percusion[2][3] = "Castañuelas";
		Percusion[3][0] = "Agitados";
		Percusion[3][1] = "Maracas";
		Percusion[3][2] = "Cascabeles";
		Percusion[3][3] = "Cencerro";

		// INSTRUMENTOS ELECTRICOS
		String Electricos[][] = new String[6][4];
		Electricos[0][0] = "Tipo Derivado";
		Electricos[0][1] = "Viento";
		Electricos[0][2] = "Cuerda";
		Electricos[0][3] = "Percusión";
		Electricos[1][0] = "Saxofones";
		Electricos[1][1] = "Saxofón Eléctrico";
		Electricos[2][0] = "Clarinete";
		Electricos[2][1] = "Clarinete Eléctrico";
		Electricos[3][0] = "Guitarra";
		Electricos[3][2] = "Guitarra";
		Electricos[4][0] = "Bajo";
		Electricos[4][2] = "Bajo Eléctricos";
		Electricos[5][0] = "Batería";
		Electricos[5][3] = "Batería Eléctrica";

		// DO WHILE para permitir entrar en varias opciones del SWITCH
		System.out.println("Bienvenido a nuestro menú de la tienda musical --> Padilla Music: ");
		do { /* ♥ */
			System.out.println(" ************************** ");
			System.out.println("Opción 0: Para salir del menú y cerrar el programa");
			// ARRAY UNIDIMENSIONAL
			System.out.println("Opción 1: Muestra una lista, con las ramas de instrumentos que se ofrecen.");
			// IF ANIDADOS Y LIBRERÍA .EQUALS()
			System.out.println("Opción 2: Enseña las características de cada familia de instrumentos musicales.");
			// HERENCIA
			System.out.println("Opción 3: Se centra en la ampliación de las ramas sobre las familias musicales.");
			// ARRAY MULTIDIMENSIONAL Y FUNCIÓN. SWITCH. DO WHILE. FOR EACH. FOR
			System.out.println("Opción 4: Muestra un par de tipos de intrumentos según la familia a la que pertenecen.");
			//PILAS Y COLAS.
			System.out.println("Opción 5: Enseña el proceso de producción de Saxofones.");
			//MANEJO DE FICHEROS. Y MANEJO DE EXCEPCIONES.
			System.out.println("Opción 6: Muestra un texto, con la opinión de la tienda.");
			//PARA PEDIRLE LA OPCIÓN DESEADA AL USUARIO.
			System.out.println("Introduzca la opción que desee dentro de las estabelcidas en el menú: ");
			int opcion = leer.nextInt();
			System.out.println(" ");
			// USO DEL SWITCH
			switch (opcion) {// Los BREAK finalizan las acciones de los CASES, para evitar errores o saltos al siguiente Case del SWITCH

			case 1:
				// En esta opción se hace el uso de un ARRAY UNIDIMENSIONAL.
				System.out.println("A día de hoy solo se conocen 3 familias musicales:");
				// Se crea el ARRAY con los valores establecidos.
				String musical[] = { "Viento", "Cuerda", "Percusión", "Eléctricos" };
				// Se utiliza la librería ARRAYS:SHORT para ORDENAR.
				Arrays.sort(musical);
				// Imprimimos el ARRAY ORDENADO. Uso del TO STRING
				System.out.println(Arrays.toString(musical) + "\n");// + Salto de línea
				// Se imprime un mensaje para dar más entendimiento al usuario.
				System.out
						.print("Dentro de las familias se han incorporado recientemente los instrumentos eléctricos, ");
				System.out.print("ya que a pesar de ser de las familias musicales de siempre,\ntienen otro tipo de sonido ");// Contiene un salto de																													// línea.
				System.out.println("y se están empezando a clasificar por separado, no obstante se encuentran aún dentro de sus géneros musicales.");
				// Salto de línea.
				System.out.println();
				break;

			case 2:
				// Uso de la VARIABLE FAMILIA y el SCANNER para leer por teclado.
				System.out.println("Escriba una familia musical de las mostradas en la primera opción:");
				familia = leer.next();
				// Uso del .EQUALS(), para comparar que la varible lea por teclado.
				// Uso los IF ANIDADOS.
				if (familia.equals("Viento") || familia.equals("viento")) {
					System.out.println("Dentro de esta familia se conocen Viento-Madera y Viento-Metal");
				} else if (familia.equals("Cuerda") || familia.equals("cuerda")) {
					System.out.println("Dentro de esta familia, se separan en Cuerda-Fricción y Cuerda-Punteada");
				} else if (familia.equals("Percusión") || familia.equals("percusión")) {
					System.out.println("Dentro de esta familia tenemos Percutivos (con baquetas), Chocados y Agitados");
				} else if (familia.equals("Eléctricos") || familia.equals("eléctricos")) {
					System.out.println("Se caracterizan por ser una parte separada de las familias anteriores.");
				} else {
					System.out.println("Esa familia me suena que no existe, pruebe a ver la lista de la Opción 1 de nuevo.");
				}
				// Salto de línea.
				System.out.println();
				break;

			case 3:
				//USO DE CLASES.
				//SUPERCLASE
				Instrumento pasion = new Instrumento("_", "_", 0);
				System.out.println("Se van a mostrar las presentaciones de la siguiente forma:");
				pasion.datos();
				System.out.println("También se le darán valores apropiados y se le añadirá información.");
				System.out.println();//SALTO DE LÍNEA
				//SUBCLASE/SUPERCLASE VIENTO.
				Viento pasionViento = new Viento("Instrumento", "Viento", 0);
				pasionViento.datos();
				System.out.println();
				//SUBCLASE DE VIENTO --> VIENTO METAL.
				Viento_Metal pasionMetal = new Viento_Metal("Trompeta", "Viento Metal", 250);
				pasionMetal.datos();
				System.out.println();//Salto de línea.
				System.out.println("¿Cuántas boquillas me preparo?");
				pasionMetal.boquilla(4);//Asignamos número de Boquillas
				System.out.println("Lo normal es entre 2 y " + pasionMetal.numBoquilllas());
				System.out.println("¿Cuánto tiempo diario puedo invertir?");
				pasionMetal.tiempos("Entre media hora o 2 horas diarias");
				System.out.println("Se recomienda variar entorno este margen de tiempo " + pasionMetal.tiempoInvertido());
				System.out.println();
				//SUBCLASE DE VIENTO --> VIENTO MADERA
				Viento_Madera pasionMadera = new Viento_Madera("Saxofón", "Viento Madera", 480);
				pasionMetal.datos();
				System.out.println();//Salto de línea.
				System.out.println("¿Qué dureza de cañas me preparo?");
				pasionMadera.numCañas(2.5);;//Asignamos número de Boquillas
				System.out.println("Lo ideal es " + pasionMadera.obtenerCañas());
				System.out.println("Y se recomienda llevar entre 4 y 6 cañas por lo que pueda pasar.");
				System.out.println("¿Qué tipo de arneses es recomendable tener?");
				pasionMadera.tipoArnes("Tras mucho tiempo es mejor de cuello y acolcahado, si estás empezando arnes de cuerpo.");
				System.out.println(pasionMadera.arneses());
				System.out.println();
				//SUBCLASE/SUPERCLASE CUERDA
				Cuerda miCuerda = new Cuerda("Instrumento", "Cuerda", 0);
				miCuerda.datos();
				System.out.println();
				//SUBCLASE CUERDA FRICCIÓN
				Cuerda_Friccion violin = new Cuerda_Friccion("Violín", "Cuerda Fricción", 120);
				violin.datos();
				violin.numCuerdas(4);
				System.out.println("Este instrumento se caracteriza por tener " + violin.obtenerCuerdas() + " cuerdas.");
				System.out.println();
				System.out.println("¿Cuál es la medida perfecta de arco?");
				violin.medidaArco(32.5);
				System.out.println("La medida ideal es oscilando los " + violin.obtenerMedida() + " cm");
				//SUBCLASE CUERDA PUNTEADA.
				Cuerda_Punteada guitarra = new Cuerda_Punteada("Guitarra", "Cuerda Punteada", 40);
				guitarra.datos();
				guitarra.numPuas(5);
				System.out.println("Para la gente que use púas, no se recomienda tener más de " + guitarra.obtenerPuas());
				System.out.println();
				System.out.println("¿Cuántas cuerdas tiene una guitarra?");
				guitarra.numCuerdas(6);
				System.out.println("Lo normal es que tengan " + guitarra.obtenerCuerdas() + " cuerdas");
				guitarra.numCuerdas(24);
				System.out.println("Pero hay variantes que tienen hasta " + guitarra.obtenerCuerdas() + " cuerdas");
				//SUBCLASE/SUPERCLASE PERCUSIÓN
				Percusion palillos = new Percusion("Instrumentos", "Percusión", 0);
				palillos.datos();
				//SUBCLASE PERCUTIVOS.
				Percutivos tambor = new Percutivos("Tambor", "percutivo", 550);
				tambor.datos();
				System.out.println("Dentro de los instrumentos de percusión las baterías y tambores son los que requieren mantenimiento.");
				tambor.luthier();
				System.out.println();
				break;

			case 4:
				// Declaro una variable para crear un pequeño menú.
				// Se le asigna un valor falso por defecto.
				boolean irse = false;
				int op;
				// Creo un BUCLE DO WHILE para poder elegir en el menú, la opción que quiera.
				do {
					System.out.println("En este mini menú puedes elegir de que familia de la que quieres ver algunos instrumentos:");
					System.out.println("Opción 0: Para salir del mini menú.");
					System.out.println("Opción 1: Familia de Viento");
					System.out.println("Opción 2: Familia de Cuerda");
					System.out.println("Opción 3: Familia de Percusión");
					System.out.println("Opción : Familia de Eléctricos");
					// Preguntamos al usuario que desea hacer.
					System.out.println("¿Qué opción desea?");
					op = leer.nextInt();// Leemos la opción por teclado.
					// Creamos un SWITCH.
					switch (op) {// LOS BREAK INTERRUMPEN LAS ACCIONES DE LOS CASE PARA NO PRODUCIR FALLOS.
					case 1:
						System.out.println("Se va a mostrar una tabla de instrumentos de viento:");
						System.out.println();
						// SE LLAMA A LA FUNCIÓN.
						imprimirArray(Viento);
						// SALTO DE LÍNEA.
						System.out.println();
						break;

					case 2:
						System.out.println("Se va a mostrar una tabla de instrumentos de cuerda:");
						System.out.println();
						// SE LLAMA A LA FUNCIÓN.
						imprimirArray(Cuerda);
						// SALTO DE LÍNEA.
						System.out.println();
						break;

					case 3:
						System.out.println("Se va a mostrar una tabla de instrumentos de percusión:");
						System.out.println();
						// SE LLAMA A LA FUNCIÓN.
						imprimirArray(Percusion);
						// SALTO DE LÍNEA.
						System.out.println();
						break;

					case 4:
						System.out.println("Se va a mostrar una tabla de instrumentos de eléctricos:");
						System.out.println();
						// SE LLAMA A LA FUNCIÓN
						imprimirArray(Electricos);
						// SALTO DE LÍNEA
						System.out.println();
						break;

					case 0:
						irse = true;
						System.out.println("Espero que le haya servido de utilidad estos pequeños ejemplos.");
						break;

					default:
						System.out.println("Introduzca una opción válida por favor.");
						break;
					}
				} while (irse != true);

				break;

			case 5:
				//DESDE LA CLASE QUE CONTIENE LA INTERFAZ, CREAMOS UN OBJETO.
				System.out.println("Se van a mostrar los componentes que se requieren para la fabricación de un saxofón");
				Gestion pila = new Gestion();
				//AÑADIMOS ESTOS ELEMENTOS A LA PILA.
				pila.push("Boquilla");
				pila.push("Tudel");
				pila.push("Cuerpo");
				
				//ELIMINAMOS EL ELEMENTO SUPERIOR DE LA PILA, MIENTRAS SE VAN ELIMINANDO.
				System.out.println("El primer componente de la fabricación es el " + pila.pop() + "\n");//Salto de línea
				
				//CREAMOS OTRO OBJETO LLAMADO COLA.
				Gestion cola = new Gestion();
				//COLA CON LOS COMPONENTES DEL CUERPO.
				cola.agregar("Estructura del cuerpo");
				cola.agregar("Llaves principales con acolchado");
				cola.agregar("Llaves secundarias con acolchado");
				cola.agregar("Muelles");
				cola.agregar("Resto de componentes no imprescindibles");
				
				//Mostramos como se compone.
				System.out.println("Su salida para ser montado es en el siguiente orden: ");
				System.out.println("Primer elemento: " + cola.remove());
				System.out.println("Segundo elemento: " + cola.remove());
				System.out.println("Tercer elemento: " + cola.remove());
				System.out.println("Cuarto elemento: " + cola.remove());
				System.out.println("Elementos finales: " + cola.remove());
				System.out.println();
				//Mostramos un mensaje al usuario.
				System.out.println("Si el primer componente del instrumento tras ser montado no tiene fallos, pasamos al siguiente: " + pila.pop());
				
				//AÑADIMOS LOS NUEVOS ELEMENTOS QUE VAN A CMPONER LA COLA.
				cola.agregar("Pieza Tudel");
				cola.agregar("Mecanismo de Agudos/Octava");
				//MOSTRAMOS EL ORDEN DE SALIDA
				System.out.println("El primer elemento es la: " + cola.remove());
				System.out.println("Lo último es: " + cola.remove());
				
				//MENSAJE AL USUARIO.
				System.out.println("Si ambas piezas se juntan en el montaje sin problema, añadimos la última pieza: " + pila.pop());
				System.out.println("Está pieza no tiene componentes sale de una pieza.");
				System.out.println();
				break;
				
			case 6: 
				//Declaramos un nuevo OBJETO, de la clase que implementa la INTERFAZ.
				Gestion escribir = new Gestion();
				//Mediante el objeto llamamos al MÉTODO DE LA CLASE QUE CONTIENE LA ESCRITURA.
				escribir.escribirTexto();
				
				//SE CREA UN NUEVO OBJETO
				Gestion lectura = new Gestion();
				//Ahora LLAMAMOS AL MÉTODO QUE LEE LO QUE SE ACABA DE ESCRIBIR.
				lectura.leerTexto();
				//SALTO DE LÍNEA
				System.out.println();
				break;

			case 0:
				// Esta opción es exclusivamente para salir del menú.
				salir = true;
				// Mostramos una serie de mensajes por pantalla.
				System.out.println("Vamos a proceder a salir del menú y cerrar la aplicación");
				System.out.println("Muchas gracias por contar con nosotros");
				System.out.println(" *** ¡HASTA LA PRÓXIMA! ***");
				System.out.println(" ************************** ");
				break;

			default:
				// En caso de error al introducir una opción incorrecta.
				System.out.println("Su opción no se encuentra en el menú, introduzca una opción válida");
				break;

			}

		} while (salir != true);// Te permite elegir opciones hasta introducir un 0, que es donde se cambia el valor del BOOLEAN.

		leer.close();// CERRAMOS EL LEER POR TECLADO.
	}

}
