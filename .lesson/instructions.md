# Instructions  

  As you are already aware, Constructors are special methods which are called when objects are created. Constructors are typically used to initialize fields on an object as it is created. 
  
So far, we have experienced default constructors (constructors provided automatically by Java if you do not define your own), which take no arguments, and you have created your own parameterized constructors. In this lab, we will create multiple constructors in the same class using the concept of 'overloading'. This allows you to intialize objects in different ways depending on what parameters we pass to the constructor.

  ## Steps
  1. Using the new file button, create a new file called 'Vehicle.java', and copy the following code into that file:
```Java
class Vehicle{
  String make;
  String model;
  int manufactured;

  public String toString(){
    return "This " + this.make +
            ", " + this.model +
            " was made in the year " + this.manufactured;
  }
}
```
<br>

  2. Now, add the following code to your Vehicle class:
```Java
public Vehicle (String make, String model, int manufactured) {
  this.make = make;
  this.model = model;
  this.manufactured = manufactured;
}
```
Here, we've created the first of (3) three constructors. This constructor takes three parameters, one for each field on the class; and can be used to fully initialize a vehicle object with all the data it needs.
<br>

  3. Lets test the functionality we have so far. In your `main()` method in the Main.java file, add the following code and run your program:
```Java
Vehicle car1 = new Vehicle("Honda", "Civic", 2020);
System.out.println(car1);
```
You should see the following output based on the implemented `toString()` method provided:
```
This Honda, Civic was made in the year 2020
```
<br>

  4. Now add the following code to your main() method, beneath the code you have already written:
```Java
Vehicle car2 = new Vehicle("Tesla", "Model S");
System.out.println(car2);
```
Adding this code should result in an error message, don't worry we can fix that by adding another constructor to the Vehicle class!

  5. Your Turn! In the Vehicle.java file, create another constructor which takes two String parameters, one for the `make` and one for the `model`. Make sure that the constructor assigns the parameters to the corresponding field on the class (i.e. `this.make = make` etc...).
<br><br>
  6. Return to your Main.java file and run your program. Make sure that you see the following output in addition to the previous output:
```
This Tesla, Model S was made in the year 0
```
Notice that the manufactured year of the Car is 0, since the two-argument constructor you just created does not initialize the value of the field `manufactured`.

  7. Next, create a third parameterized constructor in your Vehicle.java file. This constructor should only define a single String parameter for `make`. Again, make sure this constructor initializes the corresponding field `make` to the parameter defined.
<br><br>
  8. In your `main()` method in the Main.java file, create a third car object with this newly created constructor. Pass the argument "Ford" to this constructor.
<br><br>
  9. Using a println statement, print the third Vechicle object to the console. Run the program and make sure you see the following output at the end of your console:
```
This Ford, null was made in the year 0
```
Since the newly created constructor does not initialize the `model` nor `manufactured` fields, the values for those variables are null and 0 respectively.

## Tests
  Use the test provided.

### Sample Output
```
This Honda, Civic was made in the year 2020
This Tesla, Model S was made in the year 0
This Ford, null was made in the year 0
```