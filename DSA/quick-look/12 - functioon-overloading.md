ear### Function/ Method Overloading :

- when two functions have the same name, 
  - a function is called based on the function that has
  - parameters of same count or same type as arguments.

- It happens during the time of compilation

```Java
class Playground {
  public static void main(String[] args) {
    sum(1, 2);
    sum("Deepak", "Mishra");
  }

  static void sum(int num1, int num2) {
    System.out.println(num1 + num2); // 3
  }

  static void sum(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName); // Deepak Mishra
  }
}
```