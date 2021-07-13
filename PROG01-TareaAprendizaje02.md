# PROG01 Tarea Aprendizaje 02. Estructura básica de un programa en Java

1. **Señala cuáles son palabras reservadas:**
   - double, int.
   - const, goto.
2. **Cuando creamos programas, es recomendable colocar todas las sentencias una detrás de otra, separadas por puntos y comas en una misma línea. De este modo ahorraremos líneas de código.**
    - Falso
3. **¿Cuál de estas palabras se puede utilizar como identificador en Java?**
    - println
    - _desviacion
    - XYZ
    - $456
4. **¿Qué muestra el siguiente código que utiliza \t?**
    ```java
    System.out.println("Nombre\tPeso\tAltura");
    ```
    > *NOTA: \t es la secuencia de escape para el tabulador e introduce espacios en blanco hasta llegar a un número de caracteres múltiplo de 8. Por ejemplo, en la línea "hola\tgracias\thasta mañana\tadios":*
    > + *el primer tabulador introduciría 4 espacios en blanco: hola(4) + espacios (4) = 8*
    > + *el segundo tabulador introduciría 1 espacio en blanco: gracias(7) + espacios(1) = 8*
    > + *el tercer tabulador introduciría 4 espacios en blanco: hasta mañana(12) + espacios(4) = 16*
    - Nombre-2 espacios-Peso-4 espacios-Altura-0 espacios
5. **Un identificador es una secuencia ilimitada sin espacios de _____ que pertenecen al código Unicode.**
    - letras y dígitos
6. **Indica los espacios en blanco que mostraría el siguiente código que utiliza \t**
    ```java
    System.out.println("Productos\tPrecio\tIVA\t");
    ```
    - Productos [7 espacios] Precio [2 espacios] IVA [5 espacios]
7. **Relaciona cada carácter especial con su significado:**
    - '\f' --> Salto de página
    - '\n' --> Salto de línea
    - '\t' --> Tabulador
    - '\b' --> Retroceso
8. **Reescribe el siguiente programa sin los 4 errores:**
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
9. **Elige todos los sitios donde deberías poner comentarios:**
    - Sobre cada método
    - Sobre el encabezado de una clase
    - Para explicar líneas especialmente complicadas
10. **Escribe el programa Coordenadas para que muestre lo siguiente en consola:**
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