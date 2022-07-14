- [ ] static means that the variable or method marked as such is available at the class level.
- [ ] In other words, you don't need to create an instance of the class to access it.

```java
// For a class Person, contains some methods and properties that are dependent on the class/ obj. 
// those can/supposed to be accessed through an instance of a class(i.e. obj).

// However, for few methods/ properties that are independent of the class, we can make them static.
// such that they can be accessed without creating an instance of the class.

class College {
  public static void main(String[] args) {

    Student s1 = new Student("Nitish");
    s1.info();
    /* So, instead of creating an instance of Student and then calling info like this: */
    s1.greet();


    //You just call the method directly against the class, like so:
    Student.greet();

    // However, this throws error since it is not static, hence need an object to access(i.e., dependent on obj or part of class).
    // Student.info();  
  }
}

public class Student {
  static String name;
  String college = "OU";  // can be accessed only through the instance of the class or methods of the class that are non-static.

  Student(String name) { // constructor
    this.name = name;
  }

  public void info() {
    // dependent on class/ obj
    System.out.println("Student-info");
    System.out.println("\sname : " + name);
    System.out.println("\scollege : " + college);

  }

  public static void greet() {
    // independent to class
    System.out.println("Welcome!!");
    // System.out.println("\scollege : " + college);  // error: you can't access a non-static variable from a static method.
  }
}


OUTPUT:
Student-info
 name : Rakesh
 college : OU
Welcome!!
Welcome!!
```
- [ ] In other words, the idea is
  - static means ***object independent*** and
  - you cannot use object dependent things in object independent things. that's why we add static to certain properties and methods.

```
Note:
  - we have to declare everything outside 'psvm()' as static if
     it is supposed to be used inside 'psvm()'.
  - since you can't access non-static things from static methods
  - psvm() is a static method... Remember🧐.
```