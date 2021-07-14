# PROG01 Tarea Aprendizaje 03. Descomposici�n de programas

1. **�Qu� muestra este c�digo por consola? Te puede venir bien dibujar cuantas veces se ejecuta cada m�todo y en que orden.**
    ```java
    public class Programa {
        public static void metodo1() {
            System.out.println("Comienza el m�todo 1");
        }

        public static void metodo2() {
            System.out.println("Comienza el m�todo 2");
            metodo1();
        }
 
        public static void metodo3() {
            System.out.println("Comienza el m�todo 3");
            metodo1();
            metodo2();
        }

        public static void main(String[] args) {
            metodo1();
            metodo3();
            metodo2();
            metodo3();
        }
    }    
    ```
    ```
    Comienza el m�todo 1
    Comienza el m�todo 3
    Comienza el m�todo 1
    Comienza el m�todo 2
    Comienza el m�todo 1
    Comienza el m�todo 2
    Comienza el m�todo 1
    Comienza el m�todo 3
    Comienza el m�todo 1
    Comienza el m�todo 2
    Comienza el m�todo 1
    E```