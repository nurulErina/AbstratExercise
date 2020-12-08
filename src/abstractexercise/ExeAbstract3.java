
package abstractexercise;

abstract class Parent  {
    // Abstract method(does not have a body)
      abstract void message();
      public void printMessage(){//concrete methods are still allowed in abstract classes
          System.out.println("Message");
    }
}

class  O extends Parent{
   public void message(){
        System.out.println("This is first subclass");
        
    }
}
    

class D extends Parent{
    public void message(){
       System.out.println("This is second subclass"); 
    }
}

public class ExeAbstract3{
    public static void main(String args[]){
        
       O obj1 = new O();
       obj1.message();
       D obj2 = new D();
       obj2.message();
      
       
    }
}