/**
* Exemplo0074
*
* Paula Meireles 628072
* @version 01
*/
// ---------------------------------------------- dependencias
 import IO.*;
public class Exemplo0074
{
public static boolean minuscula ( char simbolo )
{
 // definir dado
   boolean resposta = false;
 // testar se letra minuscula
   if ( simbolo >= 'a' && simbolo <= 'z' )
{
   resposta = true;
 } // fim se
 
 public static void metodo14 ( )
   {
   // definir dados
      String x;
      int tamanho;
      int posicao;
      int contador;
      String minusculas;
   // identificar o metodo
      IO.println ( "Metodo 14" );
   // ler cadeia de caracteres do teclado
      x = IO.readString ( "Entrar com uma cadeia de caracteres:" );
      IO.println ( "Valor lido = " + x );
   // obter o tamanho da cadeia 
      tamanho = x.length ( );
   // mostrar o tamanho da cadeia 
      IO.println ("tamanho de" + x + " = " + tamanho);
      minusculas = "";
   contador = 0;
   posicao = 0;
   while ( posicao < tamanho )
   { 
   if (minuscula (x.charAt(posicao)))
   {
   IO.println ( "posicao = " + posicao + "contem " + x.charAt(posicao));
   contador = contador + 1;
   minusculas = minusculas + x.charAt(posicao);
   }// fim se 
   posicao = posicao + 1; 
      }// fim repetir  
      // mostrar a quantidade de letras minusculas 
      IO.println ("letras minusculas = " + contador + "=" + minusculas);
   } // fim metodo14( )
// definicao do metodo principal

public static void main ( String [ ] args )
{
	//identificar 
	IO.println ("Exemplo0074-Programa em Java");
	IO.println ("Autor: Paula Meireles");
    //executar o metodo auxiliar 
    metodo14 ( ); //tratar caracteres
    IO.pause ("Aperte enter para terminar. ");
}//fim do metodo
}//fim
