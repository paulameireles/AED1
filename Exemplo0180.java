/**
* Exemplo0180
*
* @Paula Meireles 628072
* @version 0161
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0180
{
   public static int[][] matriz (int linha, int coluna){
   //definir dados 
      int x, y;
      int [][] matriz = null;
      int resp;
   //verificar linhas e colunas 
      if( linha <= 0 || coluna <= 0){
         IO.print("Matriz inválida ");
      }
      else {
         matriz = new int[linha][coluna];
         for (x = 0; x < linha; x++){
            for (y = 0; y < coluna; y++){
               resp = IO.readint ("Entre com um numero inteiro. ");
               while (resp < 0){
                  resp = IO.readint ("Numero invalido, por favor entre com um numero inteiro. ");
               }
               matriz [x][y] = resp;
            }
         }  
      }
      return matriz;
   }
   public static void metodo01 (int [][] matriz, int linha, int coluna){
      int x;
      FILE arquivo = new FILE (FILE.OUTPUT, "DADOS10.TXT");
      int y;
      if (matriz != null && linha > 0 && coluna > 0){
         for(x = 0; x < linha; x++){
            for (y = x+1; y < matriz.length; y = y+1){
               if (matriz [x][y] > 0){
                  arquivo.println ("matriz [" + x + "] [" + y + "] com numeros positivos = " + matriz[x][y]);
                  IO.println ("matriz [" + x + "] [" + y + "] com numeros positivos = " + matriz[x][y]);
               }
               else {
                  arquivo.println ("matriz [" + x + "] [" + y + "] com numeros negativos ou nulos = " + matriz[x][y]);
                  IO.println ("matriz [" + x + "] [" + y + "] com numeros negativos ou nulos = " + matriz[x][y]);
               
               }
            }
         }
      }
   }
   
     
   // ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "Exemplo0180 - Programa em Java" );
      IO.println ( "Autor: Paula Meireles" );
   // executar o metodo auxiliar
      int linha = IO.readint ("Digite uma quantidade de linhas. ");
      int coluna =  IO.readint ("Digite uma quantidade de colunas. ");
      int [][] matriz = matriz (linha, coluna);
      metodo01 (matriz, linha, coluna);
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0180
//fora feita uma multiplicação porémimprimiu o + ao invés de ser x