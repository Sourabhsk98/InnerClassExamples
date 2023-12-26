package com.AnonymousinnerClass;

abstract class AnonymousClass {
        abstract void eat();
    }
    class Inner{
        public static void main(String args[]){
            AnonymousClass a=new AnonymousClass(){
                void eat(){
                    System.out.println("Eat fruits");
                }
            };
            a.eat();
        }
    }