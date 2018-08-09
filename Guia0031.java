/**
* Guia0031
*
* Paula Meireles, 628072
* @version 02
*/
//
/**
* metodo para mover o robot em um retangulo.
*/

// Lista de dependecias
//
import jkarel.World;
import jkarel.Robot;
import IO.*;
/**
* Exemplo de programa para uso com a classe JKarel.
*/
public class Guia0031 extends Robot
{
/**
* metodo para coletar marcadores.
*/
public void pickBeepers( )
{
// definir dado local
int contador = 0;
// repetir (com teste no inicio)
// enquanto houver marcador proximo
while ( nextToABeeper( ) )
{
// coletar um marcador
pickBeeper ( );
// e contar mais um coletado
contador = contador + 1;
} // end while
// informar quantos foram coletados
if ( contador > 0 )
{
// mostrar quantidade
IO.println ( "Beepers = "+ contador );
// pausa
IO.pause ( "Apertar ENTER para continuar." );
} // fim se
} // end pickBeepers( )
/**
* metodo para mover o robot em um retangulo.
*/
public void doRectangle( )
{
// definir dado local
int vezes; // para contar
// executar acoes repetidas vezes
// repetir (com teste no inicio e variacao)
for ( vezes=1; vezes<=4; vezes=vezes+1 )
{
// mover-se tres vezes ...
moveN( 3 );
// coletar marcadores, se houver
pickBeepers( );
// ... e virar 'a direira
turnRight( );
} // end for
} // end doRectangle( )/**
/**
* metodo para executar um comando.
* @param option - comando a ser executado
*/
public void execute( int option )
{
// executar a opcao de comando
switch ( option )
{
case 0: // terminar
// nao fazer nada
break;
case 1: // virar para a esquerda
if ( leftIsClear ( ) )
{
turnLeft( );
} // end if
break;
case 2: // virar para o sul
while ( ! facingSouth( ) )
{
turnLeft( );
} // end while
break;
case 3: // virar para a direita
if ( rightIsClear ( ) )
{
turnRight( );
} // end if
break;
case 4: // virar para o oeste
while ( ! facingWest( ) )
{
turnLeft( );
} // end while
break;
case 5: // mover
if ( frontIsClear ( ) )
{
move( );
} // end if
break;
case 6: // virar para o leste
while ( ! facingEast( ) )
{
turnLeft( );
} // end while
break;
case 7: // pegar marcador
if ( nextToABeeper( ) )
{
pickBeeper( );
} // end if
break;
case 8: // virar para o norte
while ( ! facingNorth( ) )
{
turnLeft( );
} // end while
break;
case 9: // colocar marcador
if ( anyBeepersInBeeperBag( ) )
{
putBeeper( );
} // end if
break;
default:// nenhuma das alternativas anteriores
// comando invalido
IO.println ( "ERROR: Invalid command." );
} // end switch
} // end execute( )
public void moveI( )
{
// definir dados
int option;
// apresentar comandos
IO.println ( );
IO.println ( "JKarel commands:" );
IO.println ( );
IO.println ( "0 - turnOff" );
IO.println ( "1 - turnLeft 2 - to South" );
IO.println ( "3 - turnRight 4 - to West " );
IO.println ( "5 - move 6 - to East " );
IO.println ( "7 - pickBeeper 8 - to North" );
IO.println ( "9 - putBeeper" );
IO.println ( );
// repetir (com testes no fim)
// enquanto opcao diferente de zero
do
{
// ler opcao
option = IO.readint ( "Command? " );
// executar commando
execute ( option );
// escolher acao dependente da opcao
switch ( option )
{
case 0: // terminar
// nao fazer nada
break;
case 1: // virar para a esquerda
if ( leftIsClear ( ) )
{
turnLeft( );
} // end if
break;
case 2: // virar para o sul
while ( ! facingSouth( ) )
{
turnLeft( );
} // end while
break;
case 3: // virar para a direita
if ( rightIsClear ( ) )
{
turnRight( );
} // end if
break;
case 4: // virar para o oeste
while ( ! facingWest( ) )
{
turnLeft( );
} // end while
break;
case 5: // mover
if ( frontIsClear ( ) )
{
move( );
} // end if
break;
case 6: // virar para o leste
while ( ! facingEast( ) )
{
turnLeft( );
} // end while
break;
case 7: // pegar marcador
if ( nextToABeeper( ) )
{
pickBeeper( );
} // end if
break;
case 8: // virar para o norte
while ( ! facingNorth( ) )
{
turnLeft( );
} // end while
break;
case 9: // colocar marcador
if ( anyBeepersInBeeperBag( ) )
{
putBeeper( );
} // end if
break;
default:// nenhuma das alternativas anteriores
// comando invalido
IO.println ( "ERROR: Invalid command." );
} // end switch
}
while ( option != 0 );
} // end moveI( )
/**
* construtor padrao da classe Guia0031.
* @param avenue - uma das coordenadas da posicao inicial
* @param street - outra das coordenadas da posicao inicial
* @param direction - direcao inicial
* @param beepers - quantidade inicial de marcadores
*/
public Guia0031( int avenue, int street, int direction, int beepers )
{
// metodo para repassar dados
// ao construtor padrao da classe original (Robot)
super( avenue, street, direction, beepers );
} // end Guia0031( )
/**
* metodo para criar configuracoes do ambiente.
* @param nome do arquivo onde guardar a configuracao
*/
public static void createWorld( String nome )
{
// o executor deste metodo (World - agente)
// ja' foi definido na classe original (Robot)
World.reset( ); // limpar configuracoes
// para nao exibir os passos de criacao do ambiente
World.setTrace( false ); // (opcional)
// para colocar marcadores
World.placeBeepers( 4, 4, 3 ); // em (4,4), tres marcadores
// para guardar em arquivo
World.saveWorld( nome ); // gravar configuracao
} // end createWorld( )
/**
* metodo para virar 'a direita (com repeticao).
*/
public void turnRight( )
{
// definir dado local
int vezes = 1; // para contar quantas vezes
// o executor deste metodo
// devera' virar tres vezes 'a esquerda
// repetir (com teste no inicio)
while ( vezes <= 3 )
{
// virar uma vez ...
turnLeft( );
// ... e contar mais uma feita
vezes = vezes + 1;
} // end while
} // end turnRight( )
/**
* metodo para mover repetidas vezes.
* @param vezes para executar
*/
public void moveN( int vezes )
{
// repetir (com teste no inicio)
while ( vezes > 0 )
{
// mover-se uma vez ...
move ( );
// ... e descontar uma das ainda por fazer
vezes = vezes - 1;
} // end while
} // end moveN( )
/**
* metodo para mover o robot interativamente
* e guardar a descricao da tarefa em arquivo.
* @param filename - nome do arquivo
*/
public void learn( String filename )
{
// definir dados
int option;
// definir arquivo onde gravar comandos
FILE archive = new FILE ( FILE.OUTPUT, filename );
// apresentar comandos
IO.println ( );
IO.println ( "JKarel commands:" );
IO.println ( );
IO.println ( "0 - turnOff" );
IO.println ( "1 - turnLeft 2 - to South" );
IO.println ( "3 - turnRight 4 - to West " );
IO.println ( "5 - move 6 - to East " );
IO.println ( "7 - pickBeeper 8 - to North" );
IO.println ( "9 - putBeeper" );
IO.println ( );
// repetir enquanto a quantidade de
// passos for maior que zero
do
{
// ler opcao
option = IO.readint ( "Command? " );
// testar se opcao valida
if ( 0 <= option && option <= 9 )
{
// executar comando
execute ( option );
// guardar o comando em arquivo
archive.println( ""+option );
} // end if
}
while ( option != 0 );
// fechar o arquivo
// INDISPENSAVEL para a gravacao
archive.close( );
} // end learn( )
/**
* Acao principal: executar a tarefa descrita acima.
*/
/**
* metodo para receber comandos de arquivo.
* @param filename - nome do arquivo
*/
public void read( String filename )
{
// definir dados
int option;
FILE archive = new FILE ( FILE.INPUT, filename );
String line;
// repetir enquanto houver dados
line = archive.readln ( ); // tentar ler a primeira linha
while ( ! archive.eof( ) ) // testar se nao encontrado o fim
{
// decodificar a linha
option = IO.getint( line );
// guardar mais um comando
execute ( option );
// tentar ler a proxima linha
line = archive.readln( ); // tentar ler a proxima linha
} // end for
// fechar o arquivo
// RECOMENDAVEL para a leitura
archive.close( );
} // end read( )
/**
* metodo para traduzir um comando.
* @param option - comando a ser traduzido
*/
public String dictionary( int option )
{
// definir dado
String word = ""; // palavra vazia
// identificar comando
switch ( option )
{
case 1: // virar para a esquerda
word = "turnLeft( );";
break;
case 2: // virar para o sul
word = "faceSouth( );";
break;
case 3: // virar para a direita
word = "turnRight( );";
break;
case 4: // virar para o oeste
word = "faceWest( );";
break;
case 5: // mover
word = "move( );";
break;
case 6: // virar para o leste
word = "faceEast( );";
break;
case 7: // pegar marcador
word = "pickBeeper( );";
break;
case 8: // virar para o norte
word = "faceNorth( );";
break;
case 9: // colocar marcador
word = "putBeeper( );";
break;
} // end switch
// retornar palavra equivalente
return ( word );
} // end dictionary( )
/**
* metodo para receber comandos de arquivo e traduzi-los.
* @param filename - nome do arquivo
*/
public void translate( String filename )
{
// definir dados
int option;
FILE archive = new FILE ( FILE.INPUT, filename );
String line;
// repetir enquanto houver dados
line = archive.readln ( ); // tentar ler a primeira linha
while ( ! archive.eof( ) ) // testar se nao encontrado o fim
{
// decodificar a linha
option = IO.getint( line );
// tentar traduzir um comando
IO.println ( dictionary ( option ) );
// guardar mais um comando
execute ( option );
// tentar ler a proxima linha
line = archive.readln( ); // tentar ler a proxima linha
} // end for
// fechar o arquivo
// RECOMENDAVEL para a leitura
archive.close( );
} // end translate( )
public static void main( String [ ] args )
{
// criar o ambiente com escada
// OBS.: executar pelo menos uma vez,
// antes de qualquer outra coisa
// (depois de criado, podera' ser comentado)
createWorld( "Guia0031.txt" );
// comandos para tornar o mundo visivel
World.reset( ); // limpar configuracoes
World.setSpeed ( 7 ); // escolher velocidade
World.readWorld( "Guia0031.txt" ); // ler configuracao do ambiente
// definir o objeto particular para executar as acoes (agente)
Guia0031 JK = new Guia0031( 1, 1, NORTH, 0 );
JK.doRectangle( );
JK.learn( "Tarefa0001.txt" );
JK.translate( "Tarefa0001.txt" );
// executar acoes repetidas vezes
} // end main( )
} // end class
// ---------------------------------------------- testes

//Versao Teste
// 0.1 01. ( OK ) - teste inicial
// 0.2 01. ( OK ) teste da repeticao para virar 'a direita
// 0.3 01. ( OK ) teste da repeticao para percorrer um quadrado
// nao sei fazer paredes dos exercicios que o senhor entregou, me desculpe