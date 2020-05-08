public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )  // Q#1 This "n" loop changes faster
            {
                System.out.println( c + " " + n ); // Q#2 The letters cycle through faster
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )         // Q#3 It printed each pair on a separate line
        {
            for ( int b=1; b <= 3; b++ )  
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();    // * You will add a line of code here.
        }

        System.out.println("\n");  // Q#4 1-1 1-2 1-3
                                       // 2-1 2-1 2-3
                                       // 3-1 3-2 3-3  

    }
}