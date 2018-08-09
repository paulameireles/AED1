public class MyString extends MyError implements IMyError{
   protected String cadeia;
   
   public static final MyString EOL = new MyString( "\n" );
   public static final MyString EMPTY = new MyString( "" );
   
   public String read( String msg ){
      return null;
   }
   
   public MyString(){}
   public MyString( String x ){
      this.cadeia = x;
   }
   
   public String toString(){
      String msg = cadeia;
      return ( msg );
   }
   public MyString clone( ){
      MyString copia = new MyString (cadeia);
      return ( copia );
   }
   public int length (){
   return cadeia.length();
   }                    
   public boolean isEmpty(){
      return (cadeia == "");
      ///return true;
   }
   public String get(){
      return ( cadeia );
   }
   public void set (String x){
      cadeia = x;
   }
   public char getCharAt (int position){
    int x;
    char c;
    try
    {
      c = cadeia.charAt(position);
    }
    catch ( Exception e )
    {
      System.out.println("Erro!");
      return '!';
    }
      return cadeia.charAt(position);
   }
   public void setCharAt (int position, char valor){
      String x = "";
      int s;
      if (position < 0|| position >= cadeia.length())
      {
         System.out.println ("nao valido o valor");
      }
      else 
      {
         for (s = 0; s < cadeia.length(); s++)
         {
            if (position == s)
            {
               x = x + valor;
            }
            else
            {
               x = x + cadeia.charAt(s);
            }
         }
         cadeia = x;
      }
   }
   public Object getHead (){
      return (cadeia.charAt(0));
   }
   public MyString getTail(){
      String aux = "";
      int x;
      for (x = 1; x < cadeia.length(); x++){
         aux += cadeia.charAt(x);
      }
      return ( new MyString(aux) );
   }
   public MyString trim ( )
   {
      return new MyString(cadeia.trim());
   } // end trim ( )
   public MyString append (MyString valor){
      MyString x = new MyString(cadeia + valor.toString());
      return ( x );
   }
   public boolean equals (MyString x){
   return cadeia==x.toString();
   }
   public int compareTo (MyString valor){
   return cadeia.compareTo(valor.toString());
   }
   public MyString prepend ( MyString valor )
   {
   // definir dado
      MyString x = new MyString (cadeia + valor.toString() );
   // retornar
      return ( x );
   } // end prepend ( )
   public void tests (){
   // 01. definir dados
      MyString ms1 = new MyString ( );
      MyString ms2 = new MyString ( "de" );
      MyString ms3 = new MyString ( );
      MyString ms4 = null;
      MyString ms5 = null;
      MyString ms6 = new MyString ( "0" );
      MyString ms7 = new MyString ( "" );
      int c;
   // identificar
      System.out.println ( "Modulo de testes da classe MyString: " );
      System.out.println ( );
   // 02. testar atribuicao
      ms1.set ( " a bc " );
   // 03. testar concatenacao posterior
      ms3 = ms1.append ( ms2 );
   // 04. testar concatenacao anterior
      ms4 = ms1.prepend ( ms2 );
   // 05. testar clone
      ms5 = ms3.clone( );
   // 06. testar clone
      ms6.setCharAt( 0, '1' );
   // 07. testar exibicao
      System.out.println ( "01. ms1 = "+ms1.get( ) );
      System.out.println ( "02. ms2 = "+ms2.toString( ) );
      System.out.println ( "03. ms3 = ms1+ms2 = "+ms3 );
      System.out.println ( "04. ms4 = ms2+ms1 = "+ms4 );
      System.out.println ( "05. ms5 = ms3 = " +ms5 );
      System.out.println ( "06. ms6 = "+ms6 );
      System.out.println ( "07. ms7 = "+ms7 );
   // 08. testar existencia de dado
      System.out.println ( "08. isEmpty (ms6) = "+ms6.isEmpty( ) );
      System.out.println ( "09. isEmpty (ms7) = "+ms7.isEmpty( ) );
      System.out.println ( "10. ms6 == ms6? "+(ms6.equals ( ms6 ) ) );
      System.out.println ( "11. ms6 == ms6? "+(ms6.compareTo ( ms6 )==0) );
      System.out.println ( "12. ms6 > ms7? "+(ms6.compareTo ( ms7 )> 0) );
      System.out.println ( "13. ms5 > ms6? "+(ms5.compareTo ( ms6 )> 0) );
   // 09. testar consumo unitario
      System.out.println ( " " );
      while ( ! ms5.isEmpty( ) )
      {
         c = ms5.getCharAt( 0 );
         System.out.println ( "ms5 = "+ms5.getHead( )
            + " + "+ms5.getTail( ).toString( )
            + " ("+(ms5.length( )-1)+")" );
         ms5 = ms5.getTail( );
      } // end while
   // 10. testar erros
      System.out.println ( );
      System.out.println ( "ms5 == \"\" -> "+ms5.isEmpty( ) );
      System.out.println ( "ms5[ 0 ] = '" +ms5.getCharAt( 0 ) + "'" );
      System.out.println ( "ms5[ 0 ] = \"" +ms5.getHead( ) + "\"" );
      System.out.println ( "ms5[1:n] = " +ms5.getTail( ) );
   }
   
   // implementacao obrigatoria de IMyError
   @Override // anotacao para sobrepor metodo
   public String getErrorMsg ( )
   {
      String txt = "[MyString]: ";
      switch ( getError( ) )
      {
         case 0:
            txt = txt+"No errors.";
            break;
         default:
            txt = txt+"Undefined error.";
      } // end switch
      return ( txt );
   } // end getErrorMsg ( )
   public static void main ( String [ ] args )
   {
   // testar
      MyString paula = new MyString ();
      paula.tests ( );
   } // end main ( )
}