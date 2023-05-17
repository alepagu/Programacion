package proyecto;

public interface Cadenas {
	
	//CREAMOS LOS MÉTODOS VACÍOS DE LA INTERFAZ.
	//ABSTRACCIÓN
	
	//MÉTODOS PARA LA PILA
	abstract void push(String elemento);//AÑADE ELEMENTOS A LA PILA
	
	public Object pop();//ELIMINA EL ELEMENTO DE LA CIMA DE LA PILA
	
	//MÉTODOS PARA LA COLA
	abstract void agregar(String elemento);//AÑADE ELEMENTO EN LA COLA
	
	public Object remove();//ELIMINA EL ELEMNTO SUPERIOR DE LA COLA
	
}
