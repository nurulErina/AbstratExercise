
package abstractexercise;

abstract class bank {
   
    abstract void getBalance();
    }

class bankA extends bank{
    void getBalance(){
        System.out.println("Balance Bank A: 100");
    }
}

class bankB extends bank{
    void getBalance(){
        System.out.println("Balance Bank B: 150"); 
    }
}

class bankC extends bank{
    void getBalance(){
        System.out.println("Balance Bank C: 200"); 
    }
}

public class ExeAbstract4{
   public static void main(String[] args){
       
       bankA a = new bankA();
       a.getBalance();
       
       bankB b = new bankB();
       b.getBalance();
       
       bankC c = new bankC();
       c.getBalance();
   } 
}