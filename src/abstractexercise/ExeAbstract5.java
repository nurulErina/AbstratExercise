
package abstractexercise;

abstract class Marks {
   
   abstract void getPercentage();
}

class A extends Marks{

   double percentage;
   double mark1;
   double mark2;
   double mark3;
   
   A(double m1, double m2, double m3){
       this.mark1 = m1;
       this.mark2 = m2;
       this.mark3 = m3;
}

    void getPercentage(){
   
       percentage = (mark1 + mark2 + mark3)/300*100;
       System.out.println("Class A percentage of marks for student: "+percentage +"%");
        
    }
}

 class B extends Marks{
    
   double percentage;
   double mark1;
   double mark2;
   double mark3;
   double mark4;
   
   B(double m1, double m2, double m3, double m4){
       this.mark1 = m1;
       this.mark2 = m2;
       this.mark3 = m3;
       this.mark4 = m4;
   }
       
    void getPercentage(){
   
       percentage = (mark1 + mark2 + mark3 + mark4)/400*100;
       System.out.println("Class B percentage of marks for student: "+percentage +"%");
        
    }
}
public class ExeAbstract5{
   public static void main(String[] args){
       
       A obj = new A(50,70,60);
          
       obj.getPercentage();
       
       B obj1 = new B(45,67,80,85); 
          
       obj1.getPercentage();
       
   } 
}
