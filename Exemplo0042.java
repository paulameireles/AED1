/**
* Exemplo0042
*
* Paula Meireles da Costa, 628072
* @version 01
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
class Exemplo0042
{
// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
public static void main ( String [ ] args )
{
// definir dados
double x,y,z,w;
// identificar
IO.println ( "Exemplo0042 - Programa em Java" );
IO.println ( "Autor: Paula Meireles" );
// ler valor inteiro do teclado
x = IO.readdouble ( "Entrar com um valor inteiro: " );
for ( y = x; y >= 1; y = y - 1 )
{
w = IO.readdouble ( "Entrar com valor inteiro: " );
z = IO.readdouble ( "Entrar com valor inteiro: " );
if ( w < z && w != z && w % 2 != 0 && w > -15 && w < 35 && z < 35 && z % 2 != 0 && z > -15 )
{
IO.println ( "" + w + "|" + z );
} 
else
{
IO.println ( "" );
}
while ( x > 0 )
{
IO.println ( "Valor lido = " + x );
x = x - 1;
} // fim repetir
// encerrar 
IO.pause ( "Apertar ENTER para terminar." );
}
 }
 }
 // fim main( )
// fim class Exemplo0042
// ---------------------------------------------- documentacao complementar
//
// ---------------------------------------------- historico
//
// Versao Data Modificacao
// 0.1 21 / 02 esboco
//
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. ( OK ) identificacao de programa e leitura
//
//
// 0.2 01. ( OK ) identificacao de programa
// Valores previstos: 5, 0, -5
//
//
// 0.3 01. ( OK ) identificacao de programa
// Valores previstos: 5, 0, -5
//