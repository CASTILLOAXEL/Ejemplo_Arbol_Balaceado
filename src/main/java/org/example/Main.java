package org.example;

public class Main {
            // Método main, punto de entrada del programa
            public static void main(String[] args) {
                // Creamos una instancia de la clase ArbolBalanceado
                ArbolBalanceado arbol = new ArbolBalanceado();

                // Construimos el árbol con algunos nodos
                arbol.raiz = new Nodo(1);                   // Raíz con valor 1
                arbol.raiz.izquierda = new Nodo(2);         // Hijo izquierdo de la raíz con valor 2
                arbol.raiz.derecha = new Nodo(3);           // Hijo derecho de la raíz con valor 3
                arbol.raiz.izquierda.izquierda = new Nodo(4);   // Hijo izquierdo del hijo izquierdo de la raíz con valor 4
                arbol.raiz.izquierda.derecha = new Nodo(5);     // Hijo derecho del hijo izquierdo de la raíz con valor 5

                // Imprimimos el árbol en orden
                System.out.println("Árbol en orden:");
                arbol.imprimirEnOrden(arbol.raiz);
            }
        }


