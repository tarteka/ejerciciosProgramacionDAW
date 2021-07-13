# PROG01 Tarea Aprendizaje 02. Estructura b�sica de un programa en Java

1. **Se�ala cu�les son palabras reservadas:**
   - double, int.
   - const, goto.
2. **Cuando creamos programas, es recomendable colocar todas las sentencias una detr�s de otra, separadas por puntos y comas en una misma l�nea. De este modo ahorraremos l�neas de c�digo.**
    - Falso
3. **�Cu�l de estas palabras se puede utilizar como identificador en Java?**
    - println
    - _desviacion
    - XYZ
    - $456
4. **�Qu� muestra el siguiente c�digo que utiliza \t?**
    ```java
    System.out.println("Nombre\tPeso\tAltura");
    ```
    > *NOTA: \t es la secuencia de escape para el tabulador e introduce espacios en blanco hasta llegar a un n�mero de caracteres m�ltiplo de 8. Por ejemplo, en la l�nea "hola\tgracias\thasta ma�ana\tadios":*
    > + *el primer tabulador introducir�a 4 espacios en blanco: hola(4) + espacios (4) = 8*
    > + *el segundo tabulador introducir�a 1 espacio en blanco: gracias(7) + espacios(1) = 8*
    > + *el tercer tabulador introducir�a 4 espacios en blanco: hasta ma�ana(12) + espacios(4) = 16*
    - Nombre-2 espacios-Peso-4 espacios-Altura-0 espacios
5. **Un identificador es una secuencia ilimitada sin espacios de _____ que pertenecen al c�digo Unicode.**
    - letras y d�gitos
6. **Indica los espacios en blanco que mostrar�a el siguiente c�digo que utiliza \t**
    ```java
    System.out.println("Productos\tPrecio\tIVA\t");
    ```
    - Productos [7 espacios] Precio [2 espacios] IVA [5 espacios]
7. **Relaciona cada car�cter especial con su significado:**
    - '\f' --> Salto de p�gina
    - '\n' --> Salto de l�nea
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
9. **Elige todos los sitios donde deber�as poner comentarios:**
    - Sobre cada m�todo
    - Sobre el encabezado de una clase
    - Para explicar l�neas especialmente complicadas
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