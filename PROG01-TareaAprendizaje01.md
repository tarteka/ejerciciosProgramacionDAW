# PROG01 Tarea Aprendizaje 01. Mi primer programa

1. **Tras la compilaci�n, se obtiene el c�digo fuente.**
   - FALSO
2. **Cuando compilamos c�digo fuente Java se obtiene...**
   - C�digo m�quina
3. **Un lenguaje compilado recibe tambi�n el nombre de _____ y debe ser traducido a un c�digo que pueda entender la m�quina.**
    - Lenguaje de alto nivel
4. **Un programa escrito en lenguaje Java es directamente ejecutable. ¿Verdadero o falso?**
   - FALSO
5. **Los programas escritos en lenguaje m�quina eran �nicamente v�lidos para un tipo de procesador u ordenador.**
    - VERDADERO
6. **El lenguaje m�quina es directamente interpretable por:**
    - Un circuito microprogramable
7. **Para el desarrollo de programas en Java, es necesario el Java Development Kit, que provee un compilador y el Java Runtime Environment.**
    - VERDADERO
8. **El c�digo fuente es traducido por el compilador.**
    - VERDADERO
9.  **Cuando los pasos que permiten resolver un problema est�n escritos en alg�n lenguaje de programaci�n, estamos hablando de...**
    - PROGRAMAS
10. **�Cu�l es la diferencia entre los ficheros MiPrograma.java y MiPrograma.class?**
    - El programador escribe el fichero .java, y el .class se crea luego autom�ticamente.
11. **Seg�n las convenciones, �cu�l de los siguientes nombres ser�a valido para una *clase* en Java?**
    - HolaMundo
12. **Seg�n las convenciones, �cu�l de los siguientes nombres ser�a valido para un *m�todo* en Java?**
    - holaMundo
13. **Cuando guardo un fichero fuente de Java, puedo elegir el nombre que quiera sin tener nada m�s en cuenta**
    - FALSO
14. **Empareja cada l�nea de c�digo con su funci�n dentro del programa:**
    ```java
    public class HolaMundo {} /* Crea un nuevo programa */
    ```
    ```java
    public static void main (String[] args) {} /* Crea el m�todo por el que empiza el programa */
    ```
    ```java
    System.out.println("Kaixo! �C�mo te llamas?"); /* Muestra un mensaje por consola */
    ```
15. **Rellena los huecos:**
    ```java
    public class HolaMundo {
        public static void main (String[] args) {
            System.out.println("Hola mundo!");
        }
    }
    ```
16. �Cu�l es la sintaxis correcta para mostrar un mensaje por consola?
    - System.out.println("Mensaje");
17. Identifica el error de cada l�nea del programa:
    ```java
    public class HolaMundo /* Falta { */
    public static void main (string[] args) { /* Debería ser mayúscula en vez de minúscula */
    System.out.printn("Hola Mundo!"); /* Palabra mal escrita */
    }} /* Línea correcta */
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