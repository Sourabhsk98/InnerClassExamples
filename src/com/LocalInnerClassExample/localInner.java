package com.LocalInnerClassExample;

public class localInner {

        private int data=30;//instance variable
        void display(){
            class Local{
                void msg(){
                    System.out.println("This method of innerclass is : "+data);
                }
            }
            Local l=new Local();
            l.msg();
        }
        public static void main(String args[]){
            localInner obj=new localInner();
            obj.display();
        }
    }


