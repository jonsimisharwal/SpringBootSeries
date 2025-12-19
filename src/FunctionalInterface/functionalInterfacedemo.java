package FunctionalInterface;
// only one abstract method is ther
//An interface in Java is a blueprint of a class that contains only abstract methods (before Java 8) and constants.

//It is used to achieve abstraction and multiple inheritance.
@FunctionalInterface
interface BookAction{
    void perform();
}
//functional interface with parameters
@FunctionalInterface
interface Operation{
    int add(int a,int b);
}

 // lambda syntac ()-> {} parameter -> expression body
public class functionalInterfacedemo {
    public static void main(String args[]){
        //Step 1
      BookAction action=new BookAction(){
          @Override
          public void perform(){
              System.out.println("Action performed");
          }
      };
      //Step-2
        BookAction action2 =() ->{
            System.out.println("Action performed");
        };
        //Step-3
        BookAction action3 =()-> System.out.println("Action performed");
      action3.perform();

      Operation op1 = new Operation(){
         @Override
            public int add(int a,int b) {
             return a+b ;
         }
        };
      op1.add(3,4);

      Operation op2= (int a,int b)-> { return a+b; };
      op2.add(3,5);

      //Thread - runnable interface
       new Thread(()-> System.out.println("New Thread cre created"));
    }
}
