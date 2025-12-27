package versioncontrol;

import java.util.Optional;

public class NPEDemo {
    //NPE- null pointer Exception
    public static void main(String args[]){
        //primitive type cannot be null only non primitive
        //how null values are handle
        //optional use - to avoid nullpointer Exception
        String name=null;


        //optionals-is a container object which has a value or not.
        Optional<String> otpionalstring=Optional.of("java");
        System.out.println(otpionalstring);

        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe=Optional.ofNullable(null);
        System.out.println(mayBe);
        //checking values
        System.out.println(otpionalstring.isPresent());
        System.out.println(mayBe.isEmpty());

        System.out.println(otpionalstring.get());
        // orElse("default-value")
        System.out.println(otpionalstring.orElse("default"));
        System.out.println(mayBe.orElse("default"));
        //orElseGet(<supplier>)
        String result=mayBe.orElseGet(()->{
            System.out.println("Generating default value");
            return "default";
        });
        System.out.println(result);

        //orElseThrow
        String newResult= mayBe.orElseThrow(()-> new RuntimeException("Not found"));
        System.out.println(newResult);



    }
}
