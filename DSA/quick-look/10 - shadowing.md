```Java
public class Shadowing {
  // this will be shadowed 
  static int x = 90; 
  // when a variable with same name is declared inside another method.

  public static void main(String[]args) {
    System.out.println(x); // 90

    int x = 40;
    System.out.println(x); // 40

    printX();
  }


  static void printX() {
    System.out.println(x); // 90 : since it is not in the scope of main()
  }
}
```

- basically, lower-level is overriding the higher-level.

