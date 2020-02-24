package mada1q2;
import java.util.ArrayList;
import java.util.Scanner;
                                    
public class MADA1Q2
  {

    public static void main(String[] args)
    {
        Dog d=new Dog();
        Bird b=new Bird();
        Rabbit r=new Rabbit();
        
        Animal a[]=new Animal[3];
        a[0]=d; a[1]=b; a[2]=r;
        
         for (int j = 0; j < a.length; j++)
        {

            a[j].eat();
            a[j].breathe();
            a[j].isPet();
            a[j].canPlayTrick();
            
        }
         d.walk();
         b.walk();
         b.makenest();
         r.hop();
         
    }
    
  }
