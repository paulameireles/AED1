/*
Exemplo0155
Paula Meireles
*/
import IO.*;
public class Exemplo0155{
public static void array (){
   int x = 0;
   int y = 0;
   int [] array = new int [x];
   int maior = -250;
   int tamanho;
   tamanho = IO.readint ("Entre com o tamanho do array. ");
   if (tamanho <= 0){
      IO.println ("O arranjo nao e valido ");
   }while (tamanho > 0){
      for (x = 0; x < tamanho; x++){
         y = array.length;
        y = IO.readint ("Entre com valores ");
         if (maior < y){
            maior = y;
         }
      }
      IO.println (y);
   }
}
  public static void main(String [] args){
    String arquivo;
    IO.println("Exemplo0155 - Programa em Java");
    IO.println("Autor: Paula Meireles");
    array ();
    IO.pause("Aperte ENTER para terminar");
  }
}
