
package sharedarraytest;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;



public class SharedArrayTest 
{

    public static void main(String[] args) 
    {
        //construct the shared object
        SimpleArray sharedSimpleArray = new SimpleArray( 6 );
        
        //create two task to write to the shared SimpleAray
        ArrayWriter writer1 = new ArrayWriter( 1, sharedSimpleArray );
        ArrayWriter writer2 = new ArrayWriter( 11, sharedSimpleArray );
        
        //execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute( writer1 );
        executor.execute( writer2 );
        
        executor.shutdown();
        
        try
        {
            //wait 1 minute for both wirters to finish executing
            boolean taskEnded = executor.awaitTermination( 
            1, TimeUnit.MINUTES );
            
            if( taskEnded )
                System.out.println( sharedSimpleArray ); //print contents
            else
                System.out.println(
                    "Timed out while waiting for tasks to finish" );
        }//end try
        catch ( InterruptedException ex )
        {
            System.out.println(
                "Interrupted while waiting for tsks to finish." );
        }//end catch
    }//end main
}//end class SharedArrayTest


double num;
Scanner sc = new Scanner( System.in );

for( ;; ){
    System.out.print( "Enter double > 0:  " );
    while( !sc.hasNextDouble() ){
        System.out.print( "Input has to be a number " );
        sc.next();
    }
    num = sc.nextDouble();
    if( num < 0){
        System.out.print( "number needs to be bigger than 0 " );
        continue;
    }   
    break;
}

}