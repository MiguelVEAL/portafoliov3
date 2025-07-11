import java.util.Scanner; // 1. Se importa Scanner

public class Codigo5 {

  public static void main(String[] args) { // 2. Se añade el método main

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    String ni = s.nextLine();
    int c = Integer.parseInt(ni); // 3. Se convierte el String a int
    
    int afo = 0;
    int noafo = 0;
    
    // 4. Se usa una variable de numero para el bucle
    int numeroParaBucle = c; 
    while (numeroParaBucle > 0) {
      int digito = numeroParaBucle % 10;
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        afo++;
      } else {
        noafo++; // 5. Se corrige el nombre de la variable
      }
      numeroParaBucle /= 10;
    }
    
    if (afo > noafo) {
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
    s.close();
  }
}