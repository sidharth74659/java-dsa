
> For More Info : 
- [ ] https://stackoverflow.com/questions/1200621/how-do-i-declare-and-initialize-an-array-in-java

 - [ ] https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html

> Note: 
  - [ ] 'new' Keyword allocates specified size of memory in heap memory at runtime[Dynamic Memory Allocation]
  - [ ] According to Java Specifications, heap memory is not necessarily contiguous. it depends on JVM which allocates memory at runtime

> Arrays :
```Java
  /*
  - The array size must be decided upon instantiation
  - The following formats work for declaring an array
  - <datatype>[] <var name> = new <datatype>[<array size>];
  - <datatype> <var name>[] = new <datatype>[<array size>];
  */
  // !declaration
  int[] intArray = new int[3];  // [0, 0, 0]
  String[] stringArray = new String[1]; // [null]
  boolean boolArray[] = new boolean[3]; //  [false, false, false]
  int[] sampleArray = new int[]{1, 2, 3};  // [1, 2, 3]

  // !declare & initialize
  int[] y = {9000, 1000, 1337};
  String names[] = {"Bob", "John", "Fred", "Juan Pedro"};
  boolean bools[] = {true, false, false};

  int[] sampleArr;// declaration of array,sampleArr is getting defined in the stack
  sampleArr = new int[5];// initialisation: actually here object is being created in the memory(heap)

  // @Note : with the use of new keyword,
  // the array size can be declared at instantiation. 
  // For Example:
  int[] myIntArray;
  myIntArray = new int[3]; // works OP : [0, 0, 0]
  myIntArray = new int[]{1, 2, 3}; // works OP : [1, 2, 3]

  int[] samples;
  // samples = [1, 2, 3]; // does not work
  
  // !access : using [<index>] // index starts with 0
  intArray[1] = 1;	// arrays are mutable.
```

> Few more things to observe :
```Java

// 1. values of declared array based on datatype

  int[] myIntArray;
  myIntArray = new int[3];

  
  String[] myStringArray;
  myStringArray = new String[3];

  System.out.println(Arrays.toString(myIntArray));  
  // OP : [0, 0, 0]
  System.out.println(Arrays.toString(myStringArray)); 
  // OP : [null, null, null]

  // The reason being, null cannot be assigned to primitive datatypes and
  // is only assigned to non-primitive(reference) or 
  // objects(that hold reference like String, Array, etc)  datatypes.

  // 'null' basically means it is not referencing to any object in the heap
  // or it's just declared but not initialized.

  // and it is the default value for reference datatypes.
```