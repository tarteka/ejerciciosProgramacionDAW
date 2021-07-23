// Este programa incluye diferentes m�todos que demuestran
//   distintos usos de los bucles for.
public class BuclesFor {
   public static void main(String[] args) {
      /* for (int i = 1; i <= 5; i++) {
         System.out.println("Otra l�nea...");
      }
      System.out.println();*/
   
      //contar();
      //dibujarCuadrados();
      //cuentaAtras();
      //cuentaAtras2();
      dibujarCuadro();
      dibujarCuadro2();
      dibujarMediaPiramide();
      dibujarPiramide();
      problema();
   }
   
   public static void problema() {
      int total = 25;
      for (int num = 1; num <= (total / 2); num++) {
         total = total - 2 * num;
         System.out.println(total + " " + num);
      }
   }
   
   // Cuenta del 1 al 10.
   //   Fijate en c�mo funciona la variable.
   public static void contar() {
      for (int i = 1; i <= 10; i++) {
         System.out.println("Vamos " + i);
      }
      System.out.println();   
   }
   
   // Muestra los cuadrados de los n�meros del 1 al 10. Uno por l�nea
   public static void dibujarCuadrados() {
      for (int i = 1; i <= 10; i++) {
         int cuadrado = i * i;
         System.out.println(i + " al cuadrado es " + cuadrado);
      } 
      System.out.println();   
   }
   
   // Muestra la cuenta atr�s desde 10 a 1, seguido por "Hemos llegado al final"
   //   Cada n�mero se mostrar� en una l�nea diferente.
   public static void cuentaAtras() {
      for (int i = 10; i > 0; i--) {
         System.out.println(i);
      }    
      System.out.println("Hemos llegado al final");
      System.out.println();
   }
   
   // Muestra la cuenta atr�s desde 10 a 1, seguido por "Hemos llegado al final"
   //   Todos los n�meros se muestran en la misma l�nea.
   public static void cuentaAtras2() {
      for (int i = 10; i > 0; i--) {
         System.out.print(i + ", ");
      }    
      System.out.println("Hemos llegado al final");
      System.out.println();
   }
   
   // Muestra un cuadrado de 5 x 10 asteriscos.
   public static void dibujarCuadro() {
      for (int i = 1; i <= 5; i++) {
         System.out.println("**********");
      }
      System.out.println();
   }
   
   // Muestra un cuadrado de 5 x 10 asteriscos.
   //   Esta vez utilizando bucles for anidades.
   public static void dibujarCuadro2() {
      for (int i = 1; i <=5; i++) {
         for (int j = 1; j <= 10; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   // Dibuja una media pir�mide de 10 filas de asteriscos
   public static void dibujarMediaPiramide() {
      for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   // Dibuja una pir�mide de 6 filas de astericos
   public static void dibujarPiramide() {
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < (6 - i); j++) {
            System.out.print(" ");
         }
         for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}