package pilas;

public class Pila {

    private int capacidad;
    private Libro[] elementos;
    private int cima;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new Libro[capacidad];
        this.cima = -1;
    }

    public void push(Libro libro) {
        if (estaLlena()) {
            System.out.println("Error: La pila está llena.");
            return;
        }
        cima++;
        elementos[cima] = libro;
        System.out.println("Libro " + libro.getTitulo() + " apilado.");
    }

    public Libro pop() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        Libro libro = elementos[cima];
        cima--;
        System.out.println("Libro " + libro.getTitulo() + " desapilado.");
        return libro;
    }

    public Libro peek() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        System.out.println("Libro en la cima: " + elementos[cima]);
        return elementos[cima];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.print("Contenido de la pila: ");
        for (int i = cima; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}