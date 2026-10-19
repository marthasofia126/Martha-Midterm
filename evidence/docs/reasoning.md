Exercise 1 Pseudocode:
1. Declare variables such as student name, min studied, active or inactive membership
2. Validate information and make sure the code does not allow empty responses or numbers that are less than 0
3. Clean the students name with .trim() and display its initial
4. Calculate how many complete codes a student has done and how many minutes are left from a complete block
5. Calculate the original fee by multiplying the complete block by 5
6. Verify if a student has an active membership and at least 4 blocks to apply a discount 
7. print all the information

Questions for Exercise 1:

Answer E1-R1: Why does the eligibility rule require AND rather than OR? 
Give an input where OR would grant an incorrect discount. 
A= We use AND because the user or the student needs to meet both conditions. 
If we put OR only one condition has to be true to grant the discount.
That is what we do not want to do. For the exercise 1 a student membership has to be active AND needs at least 4 study blocks for a discount to be granted
If we would've used OR it would give him the discount with just having a membership or just having 4 study blocks. 

Answer E1-R2: Explain why a discount rate represented by integer
division of 20 by 100 would cause an error.
A= When Java divides two whole numbers, like 20 / 100, the answer is 0 because Java removes the decimal part. 
This means the student would get no discount, even if they qualify. 
That is why we should use 0.20 instead, so the 20% discount is calculated correctly.

Exercise 2 Pseudocode: 
1. Creation a two-dimensional array, storing number of visits per room and per period
2. Create methods to calculate the total attendance per room and period. 
3. Find the grand total, average, busiest room and rooms that are currently busy
4. Create a menu using switch and while 
5. Validate information before accessing the array

Answer E2-R1: Where must a row accumulator be reset, and why?
A= Since it ensures that each room's attendance is calculated separately. 
If it is not reset, the previous room's attendance would be added to the next room's total, producing incorrect results.

Answer E2-R2 Explain the displayed-number-to-index conversion and why validation must happen first.
The displayed room numbers start at 1, but Java array indices start at 0. 
Therefore, we subtract 1 from the room number entered by the user to find the correct array index.

Answer E2-R3 Explain how your comparison preserves the stated tie rule.
Comparison preserves the stated tie rule, meaning that the busiest room is updated only when another room has a strictly higher attendance total. 
If two rooms have the same total, the first room remains selected. 

Exercise 3 Pseudocode: 
1. Create a class that has three private fields
2. Create a constructor that recives as arguments title and capacity
3. Validate that title is not empty and the capacity is not greater than 0
4. Create a constructor that only assigns a default capcity if only a title is types
5. Create getter methods
6. Create methods that allow a user to reserve and cancel seats. I need to make sure the reserved seats are not greater than the capacity or that the cancelled seats are not greater than the reserved seats.
7. I test the constructors, reservation, cancellation and inputs.

Answer E3-R1: Why can changing state before validation violate the invariant?
Changing the object's state before validating the information can cause it to contain invalid values.
This violates the rule that reservations cannot be negative or exceed the room's capacity. By validating first, we make sure the object's information remains correct.

Answer E3-R2: How are the two reserve methods an example of overloading?
The two reserve() methods demonstrate overloading because they have the same name but different parameters.
Both perform the same general task, but they can be called differently.

Answer E3-R3:
I create two independent StudyRoom objects, each with its own reservation information.
Then I create an alias that references the first room.When I make a reservation through the alias, the first room's reserved seats increase because the alias and the first reference point to the same object in memory.
The second independent room remains unchanged because it is a separate object.

Exercise 4 pseudocode: 
1. Create an interface called Priced that has a method to get the fee per seat.
2. Create an abstract class called CampusResource that inherits from StudyRoom and implements the Priced interface.
3. Create methods that calculate the revenue and occupancy percentage based on the number of reserved seats.
4. Create two classes called StudySpace and ComputerLab. Each class has a different fee per seat.
5. Create an array that contains three resources: Quiet Study, Computer Lab, and Group Study. The array must be created before the menu loop so the reservations are not lost.
6. Create a menu using a while loop and switch statement that allows the user to reserve seats, cancel reservations, view a report, or exit.
7. Validate the resource number and the number of seats entered by the user. If the input is invalid, the program should reject it without crashing.
8. Use the reserve and cancel methods to update the number of reserved seats
9. Use a for loop and StringBuilder to create a report that displays the title, reserved seats, remaining seats, revenue, and occupancy.
10. Use a for loop and StringBuilder to create a report that displays the title, reserved seats, remaining seats, revenue, and occupancy of each resource.
11. Calculate the total revenue of all the resources and display it at the end of the report.
12. Test the reservations, cancellations, invalid inputs, and report to make sure the program works correctly.

Answer E4-R1: Explain why a CampusResource reference can produce two different fee values. Distinguish overriding from overloading in Exercise 3.
A= Because both StudySpace and ComputerLab override the feeperseat method. This is called method overriding since StudySpace has a different value 
than ComputerLab. The difference between overloading and overriding is that overloading is having the same name of method but with different parameters

E4-R2: Explain the different responsibilities of abstract CampusResource and interface Priced.
A= The campus resource abstract class provides functionality for campus resources such as calculating revenue and occupancy. 
It also inherits reservation methods from StudyRoom. On the other hand, the Priced interface establishes a rule that implementing 
classes must provide a feePerSeat() method.

E4-R3: Explain how cancellation affects revenue and why summing every historically accepted reservation would be incorrect.
A= When a reservation is canceled, the number of reserved seats decreases, which also decreases the revenue calculated by getRevenue().
This is because revenue is calculated by multiplying the current reserved seats by the fee per seat. 
Adding every reservation that was ever accepted would be incorrect because some reservations may have been canceled.

E4-R4: Explain why rebuilding the catalog inside the menu loop would lose reservations.
A= Rebuilding the catalog inside the menu loop would create new resource objects every time the menu appears. 
Since new objects start with zero reserved seats, all previous reservations would be lost.