package com.MemberInnerClass;

 class MemberClass {

        //we can create class inside the class outside the method
        private int a = 30;
        class Inner {
            void msg(){
                System.out.println(a);
            }
        }
            public static void main(String args[]) {
                MemberClass obj = new MemberClass();
                MemberClass.Inner in = obj.new Inner();
                in.msg();
            }
        }
