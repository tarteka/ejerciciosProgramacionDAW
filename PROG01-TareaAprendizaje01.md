# PROG01 Tarea Aprendizaje 01. Mi primer programa

1. **Tras la compilación, se obtiene el código fuente.**
   - FALSO
2. **Cuando compilamos código fuente Java se obtiene...**
   - Código máquina
3. **Un lenguaje compilado recibe también el nombre de _____ y debe ser traducido a un código que pueda entender la máquina.**
    - Lenguaje de alto nivel
4. **Un programa escrito en lenguaje Java es directamente ejecutable. Â¿Verdadero o falso?**
   - FALSO
5. **Los programas escritos en lenguaje máquina eran únicamente válidos para un tipo de procesador u ordenador.**
    - VERDADERO
6. **El lenguaje máquina es directamente interpretable por:**
    - Un circuito microprogramable
7. **Para el desarrollo de programas en Java, es necesario el Java Development Kit, que provee un compilador y el Java Runtime Environment.**
    - VERDADERO
8. **El código fuente es traducido por el compilador.**
    - VERDADERO
9.  **Cuando los pasos que permiten resolver un problema están escritos en algún lenguaje de programación, estamos hablando de...**
    - PROGRAMAS
10. **¿Cuál es la diferencia entre los ficheros MiPrograma.java y MiPrograma.class?**
    - El programador escribe el fichero .java, y el .class se crea luego automíticamente.
11. **Según las convenciones, ¿cuál de los siguientes nombres sería valido para una *clase* en Java?**
    - HolaMundo
12. **Según las convenciones, ¿cuál de los siguientes nombres sería valido para un *método* en Java?**
    - holaMundo
13. **Cuando guardo un fichero fuente de Java, puedo elegir el nombre que quiera sin tener nada más en cuenta**
    - FALSO
14. **Empareja cada lí­nea de código con su función dentro del programa:**
    ```java
    public class HolaMundo {} /* Crea un nuevo programa */
    ```
    ```java
    public static void main (String[] args) {} /* Crea el método por el que empiza el programa */
    ```
    ```java
    System.out.println("Kaixo! ¿Cómo te llamas?"); /* Muestra un mensaje por consola */
    ```
15. **Rellena los huecos:**
    ```java
    public class HolaMundo {
        public static void main (String[] args) {
            System.out.println("Hola mundo!");
        }
    }
    ```
16. ¿Cuál es la sintaxis correcta para mostrar un mensaje por consola?
    - System.out.println("Mensaje");
17. Identifica el error de cada línea del programa:
    ```java
    public class HolaMundo /* Falta { */
    public static void main (string[] args) { /* DeberÃ­a ser mayÃºscula en vez de minÃºscula */
    System.out.printn("Hola Mundo!"); /* Palabra mal escrita */
    }} /* LÃ­nea correcta */
    ```
18. Ordena el siguiente programa para que muestre los siguientes mensajes en consola:
    >Ordena
    >
    >este mensaje
    ```java
    public class Ordenar {
        public static void main (String[] args) {
            System.out.println("Ordena");
            System.out.println();
            System.out.println("este mensaje");
        }
    }
    ```