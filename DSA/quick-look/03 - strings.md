- [ ] Docs  :
  - [ ] [From JavaGuides with Examples](https://www.javaguides.net/2018/08/java-string-class-api-guide.html)
  - [ ] [From Android Developers](https://developer.android.com/reference/java/lang/String)

- [ ] You cannot modify strings(that are declared with String <var_name> = "";) in Java.
- [ ] They are declared as 'final' in Java Source Code(immutable).
- [ ] You can only assign a new value to a variable. or when you pass it to a function/ method it creates a new copy of the string.
 
Example : 
```Java
public static void main(String[] args) {
    String name = "Deepak";
    System.out.println(name); // prints Deepak

    changeName(name);
    System.out.println(name); // prints Deepak
}

static void changeName(String personName) {
    personName = "Jeevan";  // creates a new copy of the string.
}
```
- [ ] Strings :


- [ ] Creation : 
```Java
  /* !String Creation
    1) By string literal : will not create new instance
    2) By new keyword    : will create String object
  */

  String stringByLiteral = "Hello";
  String stringByConstructor = new String("Hello");

  /* The Difference between string literal and string constructor :
  For More Visit: https://stackoverflow.com/a/27519722

    - Each time you create a string literal, the JVM checks the string constant pool first. If the string already exists in the pool, a reference to the pooled instance is returned. If a string doesn't exist in the pool, a new string instance is created and placed in the pool.

    - Each time you create a string constructor, the JVM creates a new string instance. The string instance is placed in the pool.

    Drawbacks of creating a string through constructor :
      - The statement creates a new String instance each time it is executed, and none of those object creations is necessary
      
    Benifits of creating by string literal :
      - Reuse can be both faster and more stylish. 
      - An object can always be reused if it is immutable(String in this case).
  */

  // \t for tab, \n for new-line, + for concat[basic way to do it (optimized under the hood)]
  String welcomeMessage = "hi\tBro..!\nWelcome" + "Home";
```

- [ ] Concatenation :
```Java
  /* !String Builder  : [concatinating strings]
    1) concat[using +],	// basic way to do it (optimized under the hood)
    2) using String Builder[using StringBuilder class]
    3) with String formatter // String.format("%s How %s.", "Hi", "are you?");
  */
  // StringBuilder is efficient when the fully constructed String is not required until the end of some processing.
    StringBuilder stringBuilder = new StringBuilder();	
    String inefficientString = "";
    for (int i = 0 ; i < 10; i++) {
        stringBuilder.append(i).append(" ");
        inefficientString += i + " "; // generates a String on every loop iteration.
    }
    System.out.println(inefficientString);
    System.out.println(stringBuilder.toString());	// only now is the string built
  // 'inefficientString' requires a lot more work to produce, as it generates a String on every loop iteration.
  // Simple concatenation with + is compiled to a StringBuilder and toString()
  // @Note : Avoid string concatenation in loops, instead use StringBuilder.
```      