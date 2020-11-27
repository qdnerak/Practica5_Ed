package CP;

public class Nodo {
    protected Object dato;
    protected Nodo siguiente;

    public Nodo(Object dato, Nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
