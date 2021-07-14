# PROG01 Tarea Aprendizaje 02. Estructura b�sica de un programa en Java

1. **Una misma sentencia puede ocupar varias l�neas en el programa**
    - Verdadero
2. **Los tipos de comentarios que hay son:**
    - Una sola l�nea (//), m�ltiples l�neas (/* */) y Javadoc (/** */)
3. **Si en nuestro c�digo fuente, comenzamos un comentario con los caracteres /* deberemos finalizar el comentario con //**
   - Falso
4. **Se�ala cu�les son palabras reservadas:**
   - double, int.
   - const, goto.
5. **Cuando creamos programas, es recomendable colocar todas las sentencias una detr�s de otra, separadas por puntos y comas en una misma l�nea. De este modo ahorraremos l�neas de c�digo.**
    - Falso
6. **�Cu�l de estas palabras se puede utilizar como identificador en Java?**
    - println
    - _desviacion
    - XYZ
    - $456
7. **�Qu� muestra el siguiente c�digo que utiliza \t?**
    ```java
    System.out.println("Nombre\tPeso\tAltura");
    ```
    > *NOTA: \t es la secuencia de escape para el tabulador e introduce espacios en blanco hasta llegar a un n�mero de caracteres m�ltiplo de 8. Por ejemplo, en la l�nea "hola\tgracias\thasta ma�ana\tadios":*
    > + *el primer tabulador introducir�a 4 espacios en blanco: hola(4) + espacios (4) = 8*
    > + *el segundo tabulador introducir�a 1 espacio en blanco: gracias(7) + espacios(1) = 8*
    > + *el tercer tabulador introducir�a 4 espacios en blanco: hasta ma�ana(12) + espacios(4) = 16*
    - Nombre-2 espacios-Peso-4 espacios-Altura-0 espacios
8. **�Qu� mostrar�an las siguientes l�neas de c�digo?**
    ```java
    System.out.println("Palabra \\//");
    ```
    - Palabra \//
9. **�Qu� mostrar�an las siguientes l�neas de c�digo?**
    ```java
    System.out.println("Esto es un poco '\"lioso' \"\\\" !");
    ```
    - Esto es un poco '"lioso' "\" !
10. **�Qu� mostrar�an las siguientes l�neas de c�digo?**
    ```java
    System.out.println("\"Palabra\"");
    ```
    - "Palabra"
11. **Un identificador es una secuencia ilimitada sin espacios de _____ que pertenecen al c�digo Unicode.**
   - letras y d�gitos
11. **No se suelen utilizar identificadores que comiencen con "$" o "_".�Verdadero o falso?**
    - Verdadero
12. **Indica los espacios en blanco que mostrar�a el siguiente c�digo que utiliza \t**
    ```java
    System.out.println("Productos\tPrecio\tIVA\t");
    ```
    - Productos [7 espacios] Precio [2 espacios] IVA [5 espacios]
13. **Relaciona cada car�cter especial con su significado:**
    - '\f' --> Salto de p�gina
    - '\n' --> Salto de l�nea
    - '\t' --> Tabulador
    - '\b' --> Retroceso
14. **Reescribe el siguiente programa sin los 4 errores:**
    ```
    public class Errores {
        public static main(string[] args) {
            System.out.println("Corrige los ");
            System.out.println("4 errores);
    }
    ```
    - Respuesta:
    ```java
    public class Errores {
        public static void main(String[] args) {
            System.out.println("Corrige los ");
            System.out.println("4 errores");
        }
    }
    ```
15. **Reescribe el siguiente programa sin los 3 errores:**
    ```
    public ErroresPrograma {
        public static void main(String[] args) {
            System.out.println("Corrige los errores")
            System.out.Println("de este programa.");
        }
    }
    ```
    - Respuesta:
    ```java
    public class ErroresPrograma {
        public static void main(String[] args) {
            System.out.println("Corrige los errores");
            System.out.println("de este programa.");
        }
    }
    ```
16. **Elige todos los sitios donde deber�as poner comentarios:**
    - Sobre cada m�todo
    - Sobre el encabezado de una clase
    - Para explicar l�neas especialmente complicadas
17. **Escribe el programa Coordenadas para que muestre lo siguiente en consola:**
    ```
    Las coordenadas son:

    27 grados 59'17" Norte

    86 grados 55'31" Este
    ```
    -Respuesta:
    ```java
    public class Coordenadas {
        public static void main(String[] args) {
            System.out.println("Las coordenadas son:");
            System.out.println();
            System.out.println("27 grados 59'17\" Norte");
            System.out.println();
            System.out.println("86 grados 55'31\" Este");
        }
    }
    ```
18. **Escribe el programa Monte para que muestre lo siguiente en consola:**
    ```
     /\
    /  \
    ```
    ```java
    public class Monte {
        public static void main(String[] args) {
            System.out.println(" /\\");
            System.out.println("/  \\");
        }
    }
    ```