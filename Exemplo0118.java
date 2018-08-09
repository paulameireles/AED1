/**
* Exemplo0118
*
* @author
* @version 01
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0118
{
// ---------------------------------------------- definicao de metodo auxiliar
   public static void metodo01 ( int x )
   {
   // testar se valor positivo
      if ( x > 0 )
      {
      // mostrar valor
         IO.println ( "Valor lido = " + x );
      // tentar fazer de novo com valor menor
         metodo01 ( x-1 );
      } // fim se
   } // fim metodo01( )
   public static void metodo02 ( int x )
   {
   // testar se valor positivo
      if ( x > 0 )
      {
      // tentar fazer de novo com valor menor
         metodo02 ( x-1 );
      // mostrar valor ( acao pendente )
         IO.println ( "Valor = " + x );
      } // fim se
   } // fim metodo02( )
   public static void metodo03 ( int x )
   {
   // testar se contador valido
      if ( x > 1 )
      {
      // mostrar valor relativo
         IO.print ( " " + x );
      // tentar fazer de novo com valor menor
         metodo03 ( x-1 ); // motor da recursividade
      }
      else
      {
      // mostrar ultimo
         IO.println ( " " + x ); // base da recursividade
      } // fim se
   } // fim metodo03( )
   public static void metodo04 ( int x )
   {
   // testar se contador valido
      if ( x > 1 )
      {
      // mostrar valor relativo
         IO.print ( " " + 2*(x-1) );
      // tentar fazer de novo com valor menor
         metodo04 ( x-1 );
      }
      else
      {
      // mostrar ultimo
         IO.println ( " 1" );
      } // fim se
   } // fim metodo04( )
   public static void metodo05 ( int x )
   {
   // testar se contador valido
      if ( x > 1 )
      {
      // tentar fazer de novo com valor menor
         metodo05 ( x-1 );
      // mostrar valor relativo
         IO.print ( " + " + (2*(x-1)) + "/" + (2*x-1) );
      }
      else
      {
      // mostrar ultimo valor (primeiro na sequencia)
         IO.print ( " 1" );
      } // fim se
   } // fim metodo05( )
   public static int funcao01 ( int x )
   {
   // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( x > 1 )
      {
      // tentar fazer de novo com valor menor
         resposta = x + funcao01 ( x-1 );
      // mostrar valor relativo
         IO.print ( " + " + x );
      }
      else
      {
      // mostrar ultimo
         IO.print ( " 1" );
      // ultima resposta
         resposta = 1;
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao01( )
   public static double funcao02 ( int x )
   {
   // definir dado
      double resposta = 0.0;
   // testar se contador valido
      if ( x > 1 )
      {
      // calcular termo e tentar fazer de novo com valor menor
         resposta = (2.0*(x-1) / (2.0*x-1)) + funcao02 ( x-1 );
      // mostrar valor relativo
         IO.print ( " + " + 2*(x-1) + "/" + (2*x-1) );
      }
      else
      {
      // ultima resposta
         resposta = 1.0;
      // mostrar ultimo
         IO.print ( " 1" );
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao02( )
   public static int funcao03 ( int x )
   {
   // definir dado
      int resposta = 1; // base
   // testar se contador valido
      if ( x >= 10 )
      {
      // tentar fazer de novo com valor menor
         resposta = 1 + funcao03 ( x/10 ); // motor 1
      }
      else
      {
         if ( x < 0 )
         {
         // fazer de novo com valor absoluto
            resposta = funcao03 ( -x ); // motor 2
         } // fim se
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao03( )
   public static int funcao04 ( int x )
   {
   // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( x == 1 || x == 2 )
      {
      // primeiros dois valores iguais a 1
         resposta = 1; // bases
      }
      else
      {
         if ( x > 1 )
         {
         // fazer de novo com valor absoluto
            resposta = funcao04 ( x-1 ) + funcao04 ( x-2 );
         } // fim se
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao04( )
   public static int funcao05 ( String cadeia, int x )
   {
   // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( 0 <= x && x < cadeia.length( ) )
      {
      // testar se letra minuscula
         if ( cadeia.charAt (x) >= 'a' &&
         cadeia.charAt (x) <= 'z' )
         {
         // fazer de novo com valor absoluto
            resposta = 1;
         } // fim se
         resposta = resposta + funcao05 ( cadeia, x+1 );
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao05( )
   public static void metodo11 (int x, int impar)
   {
      if (x > 0)
      {
         IO.println ("" + impar);
         metodo11 ( x - 1, impar + 2);
      }
   }
   public static void metodo12(int x)
   {
      if (x > 0)
      {
         IO.println ("" + x*5);
         metodo12 (x - 1);
      }
   }
   public static void metodo13 (int x)
   {
      if (x > 0)
      {
         if (x > 1)
         {
            IO.println ("" + (x*5 - 5));
            metodo13 (x - 1);
         }
         else 
         {
            IO.println ("" + x);
         }
      }
   }
   public static void metodo14 (int x)
   {
      if (x > 0)
      {
         if (x > 1)
         {
            IO.println ("1/" + (int)(Math.pow(5, x - 1)));
            metodo14 (x - 1);
         }
         else 
         {
         IO.println ("" + x);
         }
      }
   }
   public static void metodo15 (String x, int z)
   {
      if ( z < x.length ( ))
      {
      char y = x.charAt (z);
      IO.println ( "" + y);
      metodo15 ( x, z + 1);
      } 
   }
   public static double metodo17 ( double x )
   {
      // definir dados
      double y = 0;
      if ( x > 0 )
      {
         y = (double) 1/(2*x+1) + metodo17 ( x - 1 );
         
      }
      return y; 
   } 
   public static int funcao ( )
   {
   
   }
   public static void metodo18
   {
   
   }
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   { 
   // identificar
      IO.println ( "Exemplo0118 - Programa em Java" );
      IO.println ( "Autor: Paula Meireles" );
      int x;
      String y;
      double z;
   // executar o metodo auxiliar
      //metodo01 ( 5 );
      //metodo02 ( 7 );
      //metodo03 ( 9 );
      //metodo04 ( 10 );
      //metodo05 ( 12 );
      //IO.println ( " = " + funcao01 ( 5 ) );
      //IO.println ( " = " + funcao02 ( 5 ) );
      //IO.println ( " Digitos = " + funcao03 ( 123 ) );
      //IO.println ( " Digitos = " + funcao03 ( 0 ) );
      //IO.println ( " Digitos = " + funcao03 ( -12 ) );
      //IO.println ( " Fibonacci = " + funcao04 ( 1 ) );
      //IO.println ( " Fibonacci = " + funcao04 ( 2 ) );
      //IO.println ( " Fibonacci = " + funcao04 ( 3 ) );
      //IO.println ( " Fibonacci = " + funcao04 ( 4 ) );
      //IO.println ( " Fibonacci = " + funcao04 ( 5 ) );
      //IO.println ( "Minusculas (\"abc\",0) = " + funcao05 ( "abc" , 0 ) );
      //IO.println ( "Minusculas (\"aBc\",0) = " + funcao05 ( "aBc" , 0 ) );
      //IO.println ( "Minusculas (\"AbC\",0) = " + funcao05 ( "AbC", 0 ) );
      
      //x = IO.readint ("Entrar com um valor inteiro");
      //metodo11 ( x,5 );
      //x = IO.readint ("Entre com um valor inteiro. ");
      //metodo12 ( x );
      //x = IO.readint ("Entre com um valor inteiro: ");
      //metodo13 ( x );
      //x = IO.readint ("Entre com um valor inteiro: ");
      //metodo14 ( x );
      //y = IO.readString ("Entre com uma palavra: ");
      //metodo15 ( y,0 );
      z = IO.readdouble ("Entre com um numero: ");
      IO.println (metodo17 ( z ));
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0118