### Variable Declaration


> Declaration : ```<type> <name>;```

> Initialization : ```<type> <name> = <val>;```

  ``` Java
  int i1 = 1, i2 = 2; // Shorthand for multiple declarations
  ```


> Variable types : 
``` Java
  byte fooByte = 100;		// (-128 <= byte <= 127)	// 8-bit signed two's complement integer
  short fooShort = 10000;	// 16-bit signed two's complement integer
  int bazInt = 1; 		 // 32-bit signed two's complement integer
  long fooLong = 100000L;	// 64-bit signed two's complement integer
  // L is used to denote that this variable value is of type Long;
  // anything without is treated as integer by default.

  // @Note: byte, short, int and long are signed. 
  // They can have positive and negative values.

  // Float - Single-precision 32-bit IEEE 754 Floating Point
  float fooFloat = 234.5f;
  // f or F is used to denote that this variable value is of type float;
  // otherwise it is treated as double.
  
  // Double - Double-precision 64-bit IEEE 754 Floating Point
  double fooDouble = 123.4;
  
  boolean fooBoolean = true; // true & false
  boolean barBoolean = false;

  char fooChar = 'A';  // Char - A single 16-bit Unicode character

  final int HOURS_I_WORK = 8;	// final variables can't be reassigned,
  final double E;	// but they can be initialized later.
  E = 2.71828; 
```

> Note:
  - You can't initialize a primitive data type objects(like int, char, boolean, etc.) with null.
  - However for objects(that hold reference) like String,  Array, etc., you can initialize it with null, or if you just declare their default value would be null.

  ```Java
  int[] intArr = new int[3];
  String[] strArr = new String[3];

  System.out.println("num : " + intArr);  // num : [0, 0, 0]

  System.out.println("str : " + strArr);  // str : [null, null, null]
  ```
