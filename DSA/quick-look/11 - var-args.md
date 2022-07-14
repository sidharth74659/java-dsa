### varargs:
- It's possible to pass an arbitrary number of the same type arguments to a method using the special syntax named varargs (variable-length arguments).
- Varargs can be used when we are unsure about the number of arguments to be passed in a method
- Use 'varargs' for any method (or constructor) that needs an array of T (whatever type T may be) as input.

- One good example is String.format() method. The format string can accept any number of parameters.


```Java
import java.util.Arrays;

public static void printVarArguments(int ...nums) {
  System.out.println(nums.length);
  System.out.println(Arrays.toString(nums));

}

printVarArguments(); // 0, [] : no arguments here
printVarArguments(1); // 1, [1]
printVarArguments(1, 2, 3); // 3, [1, 2, 3]

printVarArguments(new int[] { }); // 0, [] : no arguments here
printVarArguments(new int[] { 1, 2 }); // 2, [1, 2]
```