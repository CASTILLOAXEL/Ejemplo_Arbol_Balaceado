package org.example;

// Definimos la clase Nodo, que representa los nodos de un árbol
class Nodo {
    int valor;          // Valor almacenado en el nodo
    Nodo izquierda;     // Referencia al hijo izquierdo del nodo
    Nodo derecha;       // Referencia al hijo derecho del nodo

    // Constructor de la clase Nodo
    public Nodo(int item) {
        valor = item;   // Inicializamos el valor del nodo con el parámetro item
        izquierda = derecha = null; // Inicializamos las referencias a los hijos como nulas
    }
}
