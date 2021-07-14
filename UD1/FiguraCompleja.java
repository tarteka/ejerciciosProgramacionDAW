/* 
   Prog01. Tarea Aprendizaje 03
   DESCOMPOSICI�N DE PROGRAMAS
     
   Muestra por consola 2 rombos y una X
   Esta veri�n elimina cualquier redundancia mediante m�todos que llaman a m�todos
   y crea una estructura m�s legible
*/

public class FiguraCompleja {
   // main bien estructurado. Utiliza un m�todo para cada pieza de la imagen
   public static void main(String[] args) {
      dibujaRombo();
      System.out.println();
      
      dibujaRombo();
      System.out.println();
      
      dibujaX();
   }
   
   // M�todo que dibuja un rombo. Llama a otros 2 m�todos para evitar la redundancia de c�digo
   public static void dibujaRombo() {
      dibujaVInvertida();
      dibujaV();
   }
   
   // M�todo que dibuja una X. Llama a otros 2 m�todos para evitar la redundancia de c�digo
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