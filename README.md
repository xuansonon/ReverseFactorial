# Reverse Factorial
A simple Java-based console application that finds a factorial value for a certain inputted value. If the inputted value does not have a factorial value, the application will return a message indiciating that it does not have a valid factorial operation associated with that input value.
<br />
<br />
### How to operate the application ###
Prior to usage users will need to have the Java SDK (version 1.8.0_102 as of 25-Nov) on their computer. The application relies on arguments at start so users will need to input numbers along with the starting command:
```
java reverseFactorial a b c d e etc.
```
A, B, C, D, E, etc. are the arguments that users can input. This application allows for any number of arguments.
<br />
<br />
### Example Input and Outputs ###
```
java reverseFactorial 120 873 6
```
The above command will return the following output:
```
Reverse factorial of 120: 5!
873 is not a factorial result.
Reverse factorial of 6: 3!
```
<br />
```
java reverseFactorial 120 3 a 24
```
The above command will return the following output:
```
Reverse factorial of 120: 5!
3 is not a factorial result.
a is an invalid integer. Required: Integer.
Reverse factorial 24: 4!
```
### Still to do ###
- ~~Implement threads to allow for multiple arguments~~
- Fix the concurrent thread order (it is current not in order of input)
- ~~Implement proper input validation (entire application terminates if any argument is invalid)~~
