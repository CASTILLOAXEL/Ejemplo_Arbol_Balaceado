package org.example;

// Definimos la clase ArbolBalanceado, que representa un árbol balanceado
public class ArbolBalanceado {
    Nodo raiz;  // Nodo raíz del árbol

    // Constructor de la clase ArbolBalanceado
    ArbolBalanceado() {
        raiz = null;    // Inicializamos la raíz del árbol como nula
    }

    // Método para imprimir el árbol en orden
    void imprimirEnOrden(Nodo nodo) {
        if (nodo != null) {
            // Recorremos el árbol en orden (izquierda, raíz, derecha)
            imprimirEnOrden(nodo.izquierda);    // Imprimimos el subárbol izquierdo
            System.out.print(nodo.valor + " "); // Imprimimos el valor del nodo actual
            imprimirEnOrden(nodo.derecha);      // Imprimimos el subárbol derecho
        }
    }
}
