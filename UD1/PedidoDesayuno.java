// El programa calcula el precio del pedido de un desayuno.
// Incluye un 10% de impuestos y un 5% de descuento por "cliente habitual"
public class PedidoDesayuno {
   public static void main(String[] args) {
      // zumo (1euros), tostadas (1,5euros), café (2euros)
      int cafe = 2;
      int zumo = 1;
      double tostadas = 1.5;
      
      double subtotal = cafe + zumo + tostadas;
      double iva = subtotal * 0.1;
      double descuento = subtotal * 0.05;
      double total = subtotal - descuento + iva;
      
      System.out.println("Subtotal: " + subtotal + " euros");
      System.out.println("IVA: " + iva + " euros");
      System.out.println("Descuento: (" + descuento + " euros)");
      System.out.println("TOTAL: " + total + " euros");
   }
}