# PROG01 Tarea Aprendizaje 02. Estructura básica de un programa en Java

1. **Una misma sentencia puede ocupar varias líneas en el programa**
    - Verdadero
2. **Los tipos de comentarios que hay son:**
    - Una sola línea (//), múltiples líneas (/* */) y Javadoc (/** */)
3. **Si en nuestro código fuente, comenzamos un comentario con los caracteres /* deberemos finalizar el comentario con //**
   - Falso
4. **Señala cuáles son palabras reservadas:**
   - double, int.
   - const, goto.
5. **Cuando creamos programas, es recomendable colocar todas las sentencias una detrás de otra, separadas por puntos y comas en una misma línea. De este modo ahorraremos líneas de código.**
    - Falso
6. **¿Cuál de estas palabras se puede utilizar como identificador en Java?**
    - println
    - _desviacion
    - XYZ
    - $456
7. **¿Qué muestra el siguiente código que utiliza \t?**
    ```java
    System.out.println("Nombre\tPeso\tAltura");
    ```
    > *NOTA: \t es la secuencia de escape para el tabulador e introduce espacios en blanco hasta llegar a un número de caracteres múltiplo de 8. Por ejemplo, en la línea "hola\tgracias\thasta mañana\tadios":*
    > + *el primer tabulador introduciría 4 espacios en blanco: hola(4) + espacios (4) = 8*
    > + *el segundo tabulador introduciría 1 espacio en blanco: gracias(7) + espacios(1) = 8*
    > + *el tercer tabulador introduciría 4 espacios en blanco: hasta mañana(12) + espacios(4) = 16*
    - Nombre-2 espacios-Peso-4 espacios-Altura-0 espacios
8. **¿Qué mostrarían las siguientes líneas de código?**
    ```java
    System.out.println("Palabra \\//");
    ```
    - Palabra \//
9. **¿Qué mostrarían las siguientes líneas de código?**
    ```java
    System.out.println("Esto es un poco '\"lioso' \"\\\" !");
    ```
    - Esto es un poco '"lioso' "\" !
10. **¿Qué mostrarían las siguientes líneas de código?**
    ```java
    System.out.println("\"Palabra\"");
    ```
    - "Palabra"
11. **Un identificador es una secuencia ilimitada sin espacios de _____ que pertenecen al código Unicode.**
   - letras y dígitos
11. **No se suelen utilizar identificadores que comiencen con "$" o "_".¿Verdadero o falso?**
    - Verdadero
12. **Indica los espacios en blanco que mostraría el siguiente código que utiliza \t**
    ```java
    System.out.println("Productos\tPrecio\tIVA\t");
    ```
    - Productos [7 espacios] Precio [2 espacios] IVA [5 espacios]
13. **Relaciona cada carácter especial con su significado:**
    - '\f' --> Salto de página
    - '\n' --> Salto de línea
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
16. **Elige todos los sitios donde deberías poner comentarios:**
    - Sobre cada método
    - Sobre el encabezado de una clase
    - Para explicar líneas especialmente complicadas
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