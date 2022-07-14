
- [ ] Nothing in java is passed by reference.
- [ ] Java only passes by value, not by reference. because it's a primitive type. that means it's a copy of the value. it's not a pointer. unlike C++.  which is a pointer. 
  ![pass-by-reference-vs-pass-by-value-animation.gif](https://blog.penjee.com/wp-content/uploads/2015/02/pass-by-reference-vs-pass-by-value-animation.gif)


- [ ] For primitive types (like byte , short , int , long , float , double , boolean and char) Java passes these as values but not reference. Like :

```java
// using primitive type : int
public static void main(String[] args) {
  int a = 10;
  System.out.println("initial value: " + a);


  changeNumber(a);
  System.out.println("after change: " + a);
}

// pass-by-value based on primitive type : int
static void changeNumber(int num1) {
  num1 = 20;
  // changes are scoped to this method only, not to the main method.

  System.out.println("in change: " + num1);
}

OUTPUT : 
  initial value:  10
  in change:      20
  after change:   10
```


```java
// using non-primitive type : String
public static void main(String[] args) {
  String name = "Deepak";
  System.out.println("initial value: " + name);


  changeName(name);
  System.out.println("after change: " + name);
}

// pass-by-value based on primitive type : int
static void changeName(String personName) {
  personName = "Jeevan";
  // changes are scoped to this method only, not to the main method.

  System.out.println("in change: " + personName);
}

OUTPUT :
  initial value:  Deepak
  in change:      Jeevan
  after change:   Deepak
```

```Java
// pass-by-value based on non-primitive type : Array
import java.util.Arrays;  // for Arrays.toString()

public static void main(String[] args) {
  int[] arr = new int[2]; // int array of size 2
  arr[0] = 4;
  arr[1] = 5;

  System.out.print("Initial : ");
  System.out.println(Arrays.toString(arr));

  changeRef(arr);
  System.out.print("changeRef : "); // Changing the reference doesn't reflect change here..
  System.out.println(Arrays.toString(arr));

  changeContent(arr);
  System.out.print("changeContent : ");
  System.out.println(Arrays.toString(arr));
}

static void changeRef(int[] arr) {
  // here arr is pointing to the same memory location as the original array.

  // However, If we change the reference, it will reflect the change in the original array(i.e., in main()).
  arr = new int[2];
  arr[0] = 15;
}

static void changeContent(int[] arr) {
  // here arr is pointing to the same memory location as the original array.

  // If we change the content of arr wtihout changing the reference, it will change the array in main()
  arr[0] = 10;
}


OUTPUT : 
  Initial :       [4, 5]
  changeRef :     [4, 5]
  changeContent : [10, 5]
```