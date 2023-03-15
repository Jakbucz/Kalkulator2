import java.util.Scanner;

public class Main {

public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
 
  
  System.out.print("Wybierz opcje (1 - pole prostokata, 2 - pole trojkata): ");
  
  int wybór = scanner.nextInt();

  System.out.print("Podaj pierwszą liczbę; ");
  double liczba1 = scanner.nextDouble();

  System.out.print("Podaj drugą liczbę: ");
  double liczba2 = scanner.nextDouble();

  double wynik = 0.0;

  switch (wybór) {
    
    case 1:
      wynik = liczba1 * liczba2;
      break;
    
    case 2:
      wynik = liczba1 * liczba2 / 2;
      break;


      
  
      
      
  }
  System.out.println("wynik: " + wynik);
}
}