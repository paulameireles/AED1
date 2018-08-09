/**
* Exemplo00020
*
* @author Paula Meireles, 628272 
* @version 02
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo00020
{
// ---------------------------------------------- definicao de metodos
// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // definicao de dados
      IO.println ( "EXEMPLO00020 - Programa em Java" );
      IO.println ( "Autor: Paula Meireles" );
      double x, y;
      int a, b;
      String z;
      a = IO.readint("Entre com o valor inteiro");
      b = IO.readint("Entre com o valor inteiro");
      z = IO.readString ( "Entrar com uma sequencia de dígitos: " );
      x = IO.getdouble ( z );
      y = IO.readdouble ("Entre com o o valor");
      z = "(" + x + "," + a + ")";
      z = z+ "(" +y + "," + b+")";
      IO.println("z="+z);
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo00020
// ---------------------------------------------- documentacao complementar
//
// ---------------------------------------------- historico
//
// Versao    Data   Modificacao
// 0.1      15/02    esboco
// 0.2      01/08    mudança de versão
//
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. ( OK )  identificacao de programa
// 0.2 01. ( OK )  identificacao de programa
//     02. ( OK )  introdução de dado inteiro
//     03. ( OK )  introdução de dado inteiro com valor inicial
//     04. ( OK )  introdução de dado inteiro com valor inicial com operação