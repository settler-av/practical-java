-------------------------
#Q. WAP to generate user defined exception using “throw” and “throws” keyword.

-----------------------

##1. Throw vs Throws in java
1. Throws clause is used to declare an exception, which means it works similar to the try-catch block. On the other hand throw keyword is used to throw an exception explicitly.

2. If we see syntax wise than throw is followed by an instance of Exception class and throws is followed by exception class names.

i.e.
```
throw new ArithmeticException("Arithmetic Exception");  
```
and
```
throws ArithmeticException;  
```
Link: 
https://beginnersbook.com/2013/04/difference-between-throw-and-throws-in-java/

##2. User defined exceptions

---------------
Following are few of the reasons to use custom exceptions:

- To catch and provide specific treatment to a subset of existing Java exceptions.
- Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for the application users or the developers to understand the exact problem.