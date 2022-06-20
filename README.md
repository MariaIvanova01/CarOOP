# CarOOP

Car Info
---------------

Create a class named Car.
The class should have public fields for:

•	Brand: String

•	Model: String

•	Horsepower: int

Change the access modifiers of all class fields to private.

Create getters and setters for each class field. 

Test the Program 
----------------

Read cars objects, add them to the collection of your choice, and print each one on the console using the carInfo() method. The input consists of a single integer N the number of lines representing car objects. One each line you will read car info in the following format "{brand} {model} {horsePower}" separated by single space.

Input |	Output
-------|-------
3 | The car is: Chevrolet Impala - 390 HP.
Chevrolet Impala 390 | The car is: Mercedes Benz - 500 HP.
Mercedes Benz 500 | The car is: Volga 24 - 49 HP.
Volga 24 49 |
5 |The car is: This Car - 1 HP.
This Car 1 | The car is: Was Made - 2 HP.
Was Made 2 | The car is: Only For - 3 HP.
Only For 3 | The car is: Test Purposes - 4 HP.
Test Purposes 4 | The car is: No Way - 5 HP.
No Way 5 |

Car Constructors
-----------------

Make proper constructors for the Car class so you can create car objects with a different types of input information.
If you miss information about the field of type String set the value to "unknown", and for an integer, fieldset -1.
First, declare a constructor which takes only the car brand as a parameter:

Also, create a constructor which sets all the fields.


Read information about cars the same way as the previous task, however, this time uses constructors to create the objects, not creating an object with the default constructor. You should be able to handle different types of input, the format will be the same as the previous task, but this time some of the data may be missing. For example, you can get only the car brand – which means you have to set the car model to "unknown" and the Horsepower value to -1. There will be lines with complete car data, declare constructor which sets all the fields. 
You have to add the car objects to a collection of your choice and print the data as in the previous task. The input will always have one or three elements on each line.

Input |	Output
-----|------
2 | The car is: Chevrolet unknown - -1 HP.
Chevrolet | The car is: Golf Polo - 49 HP.
Golf Polo 49 |
4 | The car is: Was unknown - -1 HP.
Was | The car is: Only For - 3 HP.
Only For 3 | The car is: Test Purposes - 4 HP.
Test Purposes 4 |The car is: No Way - 5 HP.
No Way 5|

