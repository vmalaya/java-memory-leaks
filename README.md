# Memory leaks

In order to identify ML you can use
 1. -verbose:gc parameter to the JVM configuration of application
 2. Do Profiling (Visual VM for example)
 3. Performance testing -> Load testing (Apache benchmark tool)
 
### Memory usage calculation algorithm
+ Calculate the memory used before your code execution

````java
long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
````

+ Calculate the memory used after your code execution
 
````java
long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
````

 + Calculate difference
 
 ````java
long actualMemUsed=afterUsedMem-beforeUsedMem;
```` 
