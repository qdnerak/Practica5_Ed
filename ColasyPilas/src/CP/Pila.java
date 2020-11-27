package CP;

public class Pila {
    Nodo primero;
    public Pila(){
        primero= null;
    }
    public boolean estaVacio(){
        return primero == null;
    }
    public void insertar(Object dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        }
        else {
            Nodo ultimo= primero;
            while (ultimo.getSiguiente() != null){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }
    public void eliminar(){
        if (!estaVacio()){
            Nodo ultimo = primero;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() !=null){
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }

            penultimo.setSiguiente(null);
        }
    }
    public void mostrar(){
        Nodo tmp=primero;
        while (tmp!=null){
            System.out.print(tmp.getDato()+" ");

            tmp=tmp.getSiguiente();
        }
        System.out.println();
    }

}
