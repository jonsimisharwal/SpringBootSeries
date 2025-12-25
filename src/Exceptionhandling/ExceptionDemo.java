package Exceptionhandling;

public class ExceptionDemo {
    public static void main(String args[]){

        try{
            //Exception Generating Statements
            int result =10/0;
        }catch (Exception e){
            // Exception handling statements
            System.out.println("in catch block");
        }

        int arr[]={1,2,3,4,5,5};
        try{
            System.out.println(arr[8]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception");
        }
    }
}
