import CP.Cola;
import CP.Pila;

public class Main {
    public static void main(String[]args){
        //Colas
        System.out.println("* C O L A S *");
        Cola cola = new Cola();
        System.out.println(cola.estaVacio());

        for (int i = 1; i <=5 ; i++) {
            cola.insertar(i);
        }
        cola.mostrar();

        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
        System.out.println("--------------");
//-------------------------------------------------------------------------------
        //Pilas
        System.out.println("* P I L A S *");
        Pila pila = new Pila();
        System.out.println(pila.estaVacio());

        for (int i = 1; i <=5 ; i++) {
            pila.insertar(i);
        }
        pila.mostrar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();

    }
}
