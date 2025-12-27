package basics;
/*
   what is control flow?
   it means how your program executes statements based on conditions or loops.istead of running code line by line blindly,you can tell java.

   jvaa gives three main types:
   1. Decision-making -> if,else if,else,switch
   2. loops(Iteration) -> for,while,do-while,enhanced for-each
   3. jump statements-> break,continue
 */
// Ternary => (condition): (TRUE) ? (FALSE)
 public class controlflow {
    public static void main(String args[]){
        String[] fruits={"Apples","Banana"};
        for(String fruit:fruits){
            System.out.println("Fruit:"+ fruit);
        }
    }
}
