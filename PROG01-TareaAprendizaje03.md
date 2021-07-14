# PROG01 Tarea Aprendizaje 03. Descomposición de programas

1. **¿Qué muestra este código por consola? Te puede venir bien dibujar cuantas veces se ejecuta cada método y en que orden.**
    ```java
    public class Programa {
        public static void metodo1() {
            System.out.println("Comienza el método 1");
        }

        public static void metodo2() {
            System.out.println("Comienza el método 2");
            metodo1();
        }
 
        public static void metodo3() {
            System.out.println("Comienza el método 3");
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
    Comienza el método 1
    Comienza el método 3
    Comienza el método 1
    Comienza el método 2
    Comienza el método 1
    Comienza el método 2
    Comienza el método 1
    Comienza el método 3
    Comienza el método 1
    Comienza el método 2
    Comienza el método 1
    E```