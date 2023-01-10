import java.util.Scanner;

public class App {
    public static void main(String args[]) {
      Scanner numero = new Scanner(System.in);
      System.out.println("Ate que numero deseja fazer a semi piramide de numeros?");

      int inicio = 1;
      int ultimo = numero.nextInt();

      System.out.println("==========================================================================");
      
      for (int i = inicio; i <= ultimo; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(i);
          }
          System.out.println("");
      }
    }
}