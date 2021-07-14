/* 
   Prog01. Tarea Aprendizaje 03
   DESCOMPOSICIÓN DE PROGRAMAS
     
   Muestra por consola 2 rombos y una X
   Esta verión elimina cualquier redundancia mediante métodos que llaman a métodos
   y crea una estructura más legible
*/

public class FiguraCompleja {
   // main bien estructurado. Utiliza un método para cada pieza de la imagen
   public static void main(String[] args) {
      dibujaRombo();
      System.out.println();
      
      dibujaRombo();
      System.out.println();
      
      dibujaX();
   }
   
   // Método que dibuja un rombo. Llama a otros 2 métodos para evitar la redundancia de código
   public static void dibujaRombo() {
      dibujaVInvertida();
      dibujaV();
   }
   
   // Método que dibuja una X. Llama a otros 2 métodos para evitar la redundancia de código
   public static void dibujaX() {
      dibujaV();
      dibujaVInvertida();
   }
   
   public static void dibujaVInvertida() {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");   
   }
   
   public static void dibujaV() {
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");   
   }
}