public class MyError extends AMyError implements IMyError{

   public final static String NO_ERROR = "No_error";
   
   int erro;
   
   public MyError(){
      setError(0);   
   }
   
   /**
      Metodo da classe MyError
   */
   public String toString(){
      return (""+erro);
   }
   
   /**
      Implementacao do metodo da classe abstrata
   */
   public int getError(){
      return (erro);
   }
   
   /**
      Implementacao do metodo da classe abstrata
   */
   public void setError( int codigo ){
      erro = codigo;
   }
   
   /**
      Implementacao do metodo da classe abstrata
   */
   public boolean hasError(){
      return( erro != 0 );
   }
   
   /**
      Implementacao do metodo da interface
   */ 
   public String getErrorMsg(){
      return( NO_ERROR );
   }
}