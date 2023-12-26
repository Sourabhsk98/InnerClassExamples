package com.StaticNested;

import com.LocalInnerClassExample.localInner;

 class Staticnested {
   static int data=45;//instance variable

       static  class Inner {
           void display() {
               System.out.println("Static nested data is :"+data);
           }

        }

    public static void main(String args[]){
        Staticnested .Inner obj = new Inner();
        obj.display();
    }
}


