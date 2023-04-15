# OPPS 

<p><strong>Notes</strong></p>

<!-- TOC -->
* [OPPS](#opps-)
  * [Inheritance](#inheritance)
  * [Polymorphism](#polymorphism)
  * [Static](#static-)
  * [Abstraction](#abstraction-)
  * [Encapsulation](#encapsulation-)
    * [Public, Private and Protected - access modifier](#public-private-and-protected---access-modifier-)
  * [**Cheat sheet**](#cheat-sheet-)
<!-- TOC -->

class - class is short of a templete of object.

object - object are the instance of a class.

instence variable - variable inside the object are called as the instance variable.

student[] Saikat = new student[]; => `new` -> dynamically allocates memory and return a reference to it.

student[]; -> Constructor is a special type of method that is used to initialize objects of a class.

this ->  `this` is a keyword that refers to the current object instance. 

In java primitive data types are stored in stack memory.

`final` -> final keyword makes the object value constant(It cannot be modified). You can't change the value if you had used final keyword.

`static` -> when a member is declared static, it can be accessed before any of the object is being is created before refrencing to that object. static variable doesn't depend on the object.

Singleton class -> means you are allowed to create only one object.

Properties.Inheritance -> when child class inherit properties of base class then it is called as inheritance.

Child class -> is a class that is created by inheriting or extending the features of another class, which is called the "base class".
             
-> child class will have base class properties and properties of its own.

`super` -> super keyword is used to reference the class which is above the current class.

Base class -> base class is a AbstractMethod.parent class or superclass through which child class extend the properties of base class.

## Inheritance

Single inheritance -> one class extends another class or base class having one child class.

Multilevel inheritance -> in multilevel inheritance every class will be acting as a base class to the classes that are below to the other.

Multiple inheritance -> when the child class is being extended from two base class that is known as multiple inheritance.

In multiple inheritance if one AbstractMethod. parent class **A** assign n = 3 and other AbstractMethod.parent class **B** assign n = 0, then child class **C**.n will not be able to decide which n to choose that why there is no Multiple inheritance in Java.

`Java doesn't suppport multiple inheritance`

Hierachial inheritance -> one class is inherited from multiple class. E.g. Multiple child class is being inherited from base class or any other base class.

Hybrid inheritance -> combination of single and multiple inheritance. 

`Java doesn't suppport Hybrid inheritance`

Cyclic inheritance -- A class cannot be its own super class.

`Java doesn't suppport Cyclic inheritance`

## Polymorphism

Polymorphism -> Act of representing same thing in multiple ways.

Super class's reference variable can refer to an object of subclass.

Types of polymorphism

1. Compile time / static Polymorphism -> Achieved via method overloading.
Mothod overloading -> same name but types, arguments but ordering can be different E.g. Multiple constructor

2. Run time / Dynamic Polymorphism -> achieved via method overriding. 

How Java know which method to call ? (object) 
* By dynamic method dispatch -> it's just a mechanism by which a call to an overridden method is resolved at runtime rather than compile time.

## Static 

``Static method can't be overridden``

* Suppose All those static method that were being inherited there is no point in inheriting in the child class coz the method in the AbstractMethod.parent class will always run no matter from which object you call
it's not dependent on object coz its static.

* <strong> Overriding depends on object, Static method doesn't depend on object hence static method can't be overridden.</strong>

## Abstraction 

Abstraction is a feature of OOPS that hides unnecessary details but shows the essential information.

## Encapsulation 

Encapsulation is also a feature of OOPS. It hides the code and data into a single entity or unit so that the data can be protected from the outside world.

### Public, Private and Protected - access modifier 

1. [x] Public - you can access the method or data type from anywhere.
2. [x] Private - When a member is marked as private, it can only be accessed within the class in which it is defined. we can use getter and setter method to access private access modifier.
3. [x] Protected - When a member is marked as protected, it can be accessed by any subclass of the class in which it is defined, regardless of the package in which the subclass is located.

what if any access modifier is not present?

* If no access modifier is specified for a class member (field, method, or nested class), then it is given the default access level.

* In Java, the default access level is package-private.

* Members can be accessed within the same package as the class in which they are defined, but not outside that package.
This means that any other class in a different package will not be able to access or modify.

## **Cheat sheet** 

![Screenshot (9).png](..%2F..%2F..%2FUsers%2Fnayek%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%289%29.png)

Instance operator - `instanceof` is used to check if the subclass or any class is a instance of AbstractMethod.parent class.

## Abstract method 

* An abstract method is a method that is declared without a body. An abstract method is only declared in an abstract class or an interface, and it does not have a method body.
Instead, it is left to the implementing class to provide the method body.
* You can't create objetc of abstract class.
* In abstract class - 

1. you can't create abstract constructor.
2. you can't create abstract static method.  
3. if one the method is abstract then the class needs to be abstract.