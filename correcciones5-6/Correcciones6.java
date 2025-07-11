import java.util.Scanner; // Se importa Scanner

public class codigo6 {

  public static void main(String[] args) { // 1. Se añade el método main

    int[] n = new int[20]; // 2. Forma correcta para crear el array

    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    
    // 5. Se usa scanner para leer la opción del usuario
    Scanner sc = new Scanner(System.in); 
    System.out.println("\n¿Qué números quiere resaltar?"); // 3. Se corrige println
    System.out.print("(1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    int opcion = sc.nextInt();

    int multiplo = (opcion == 1) ? 5 : 7;

    // 4. Forma correcta del bucle for each y tipo de dato int
    for (int e : n) { 
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " "); // 3. Se corrige el método de impresión
      }
    }
    
    sc.close();
  }
}