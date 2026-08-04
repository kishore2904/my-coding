package clientInterview;

import java.lang.annotation.Annotation;

public class FuncInterface {

   public static void main(String[]  args){

       FunctionalInterfaceExample example = message -> System.out.println(message);



       String message = "Hello, Functional Interface!";

       if(FunctionalInterfaceExample.validateMessage(message)){
           example.display(message);
           example.logNotification(message);
       }
   }


}
