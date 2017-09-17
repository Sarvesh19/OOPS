package com.polymorphism;


//Class declaration
//
//A class is a template for manufacturing objects. You declare a class by specifying the class keyword followed by a non-reserved identifier that names it. A pair of matching open and close brace characters ({ and }) follow and delimit the class's body. This syntax appears below:
//
//class identifier
//{
//   // class body
//}


//A class's body is populated with fields, methods, and constructors. Combining these language features into classes is known as encapsulation





////A simple Java program to demonstrate multiple
////inheritance through default methods.
//interface PI1
//{
// // default method
// default void show()
// {
//     System.out.println("Default PI1");
// }
//}
//
//interface PI2
//{
// // Default method
// default void show()
// {
//     System.out.println("Default PI2");
// }
//}
//
////Implementation class code
//class TestClass implements PI1, PI2
//{
// // Overriding default show method
// public void show()
// {
//     // use super keyword to call the show
//     // method of PI1 interface
//     PI1.super.show();
//
//     // use super keyword to call the show
//     // method of PI2 interface
//     PI2.super.show();
// }
//
// public static void main(String args[])
// {
//     TestClass d = new TestClass();
//     d.show();
// }
//}