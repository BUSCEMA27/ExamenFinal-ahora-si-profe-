
package javaapplication26;

public class JavaApplication26 {
    
    public static void main(String[] args) {
        
        Lista l = new Lista();
        
        l.insertarValorPrimer(5);
        l.insertarValorFinal(6);
        l.insertarValorFinal(9);
        l.insertarValorFinal(4);
        
        l.invertir();

    }
}
    
    class Nodo {

    int valor;
    Nodo sig;

    Nodo(int valor) {

        this.valor = valor;
    }

}

class Lista {

    Nodo primero;

    public void insertarValorFinal(int valor) {

        if (vacio() == true) {
            primero = new Nodo(valor);
            return;
        }

        Nodo info = primero;
        while (info.sig != null) {
            info = info.sig;
        }

        info.sig = new Nodo(valor);

    }

    public void insertarValorPrimer(int valor) {

        if (vacio()) {
            primero = new Nodo(valor);
            return;
        }

        Nodo nuevo = new Nodo(valor);
        nuevo.sig = primero;
        primero = nuevo;

    }

    public void borrarValor(int valor) {
        if (vacio()) {
            return;
        }
        if (primero.valor == valor) {
            primero = primero.sig;
            return;
        }

        Nodo info = primero;
        while (info.sig != null) {
            if (info.sig.valor == valor) {
                info.sig = info.sig.sig;
                return;
            }
            info = info.sig;
        }

    }

    public void imprimir() {

        if (vacio()) {
            System.out.println(" La lista esta vacia");
        }
        Nodo info = primero;
        while (info != null) {
            System.out.println(info.valor);
            info = info.sig;
        }

    }

    private boolean vacio() {

        if (primero == null) {
            return true;
        } else {
            return false;
        }

        
        
    }

    private void invertir(Nodo primero){
        Nodo aux = primero;
        if (aux != null){
            invertir(aux.sig);
            System.out.println(aux.valor);
        }
    }
            
    public void invertir(){
        invertir(primero);
    }
}


