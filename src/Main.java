import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Random random = new Random();

       int[] Arr = new int[5];

        for (int i = 0; i < Arr.length; i++) {
           Arr[i] = random.nextInt(10) + 1;
        }

      for(int numeri : Arr){
          System.out.println(numeri);
      }

        Scanner scanner = new Scanner(System.in);

      try { System.out.println("Inserisci un numero nell'array:");
          int numeroScelto = scanner.nextInt();

          System.out.println("Inserisci una posizione dove inserire il numero");
          int posizioneScelta = scanner.nextInt();

          if (posizioneScelta < 1 || posizioneScelta > 5) {
              throw new IllegalArgumentException("Posizione non valida. Inserisci un valore tra 1 e 5.");
          }

          if (posizioneScelta== 0){
              scanner.close();
          }

          Arr[posizioneScelta - 1]= numeroScelto;
      } catch (Exception e){
          System.out.println("Errore nella scelta");

      }
      finally {
          scanner.close();
      }
        System.out.println("Array aggiornato:");
        for (int numeri : Arr) {
            System.out.print(numeri + " ");
        }




    }
}