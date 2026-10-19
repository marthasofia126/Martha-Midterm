Exercise 1 Test Log:
Test ID: E1-T1
Input and Starting State: Ana Lee, 95 minutes, active membership
Predicted Result: 3 complete blocks, 5 remaining minutes, $15.00 final fee
Actual Result: Same as predicted result

Test ID: E1-T2
Input and Starting State: Ana Lee, 120 minutes, inactive membership
Predicted Result: 4 blocks, no discount, $20.00 final fee
Actual Result: Same as predicted result

Test ID: E1-T3
Input and Starting State: Ana Lee, 29 minutes, active membership
Predicted Result: 0 complete blocks, 29 remaining minutes, $0.00 final fee
Actual Result: Same as predicted result

Test ID: E1-T4
Input and Starting State: Empty student name
Predicted Result: Invalid input; no calculations should be made
Actual Result: Same as predicted result

Test ID: E1-T5
Input and Starting State: Ana Lee, 0 minutes
Predicted Result: Invalid input; no calculations should be made
Actual Result: Same as predicted result

Test ID: E1-T6
Input and Starting State: Ana Lee, 150 minutes, active membership
Predicted Result: 5 blocks, $25.00 base fee, $5.00 discount, $20.00 final fee
Actual Result: Same as predicted result

Test ID: E1-T7
Input and Starting State: Ana Lee, 120 minutes, active membership
Predicted Result: 4 blocks, $20.00 base fee, $4.00 discount, $16.00 final fee
Actual Result: Same as predicted result

Exercise 2 Test Log 

Test ID: E2-T1
Input and Starting State: Original matrix, summary.
Predicted Result: Room totals 6, 7, 5; period totals 3, 6, 5, 4; grand total 18; average 1.50; busiest Room 2; 2 busy rooms
Actual Result: Grand total: 36 results. What happend was that I put the variable total before the loop so it was storing the previous results and adding them
I had to declare the total variable inside the loop so it could start as 0 every time the menu run again.

Test ID: E2-T2
Input and Starting State: Search Room 1
Predicted Result: Total of 6 visits; Busy
Actual Result: Same as predicted result

Test ID: E2-T3
Input and Starting State: Search Room 3
Predicted Result: Total of 5 visits; Not Busy
Actual Result: Same as predicted result

Test ID: E2-T4
Input and Starting State: Search Room 0
Predicted Result: Invalid room number; menu continues
Actual Result: Same as predicted result

Test ID: E2-T5
Input and Starting State: Search Room 4
Predicted Result:Invalid room number; menu continues
Actual Result: Same as predicted result

Test ID: E2-T6
Input and Starting State: Enter hello as a menu option
Predicted Result: Invalid numeric input; returns to menu
Actual Result: At first, I didnt see the need of using a try an catch until I was doing the test logs and I saw that when I typed hello instead of  anumber 
cause a NumberFormatException so after that I implemented the try an catch so the program could display the menu even though the value was not valid.

Test ID: E2-T7
Input and Starting State: Choose 3 as exit
Predicted Result: Program ends
Actual Result: Same as predicted result

Test ID: E2-T8
Input and Starting State: Replace matrix with [1,1], [0,2], [0,0]
Predicted Result: Room 1 wins the tie; grand total 4; average 0.67
Actual Result: Same as predicted result

Test ID: E2-T9
Input and Starting State: Enter menu option 9 
Predicted Result: Invalid menu choice; menu continues
Actual Result: Same as predicted result

Exercise 3 Test Log

Test ID: E3-T1
Input and Starting State: Reserve 4; currently 0 reserved
Predicted Result:true; 4 reserved, 2 remaining
Actual Result: Same as predicted result

Test ID:E3-T2
Input and Starting State:Reserve 3; currently 4 reserved
Predicted Result: false; 4 reserved, 2 remaining
Actual Result: Same as predicted result

Test ID:E3-T3
Input and Starting State: Cancel 7; currently 6 reserved
Predicted Result: false; 6 reserved, 0 remaining
Actual Result: Same as predicted result

Test ID: E3-T4
Input and Starting State: Null title
Predicted Result: IllegalArgumentException
Actual Result: Same as predicted result

Test ID:E3-T5
Input and Starting State: Create room with negative capacity
Predicted Result: IllegalArgumentException
Actual Result: Same as predicted result

Exercise 4 Test Log

Test ID: E4-T1
Input and Starting State: Reserve 2 seats in Quiet Study, which has a capacity of 4 and initially 0 reserved seats.
Predicted Result: Reservation accepted. 2 reserved seats and 2 remaining seats.
Actual Result:

Test ID: E4-T2
Input and Starting State: Try to reserve 3 more seats in Quiet Study when only 2 seats are available.
Predicted Result: Reservation rejected
Actual Result: Same as predicted result

Test ID: E4-T3
Input and Starting State: Cancel 1 seat in Quiet Study when 2 seats are reserved.
Predicted Result: Cancellation accepted
Actual Result: Same as predicted result

Test ID: E4-T4
Input and Starting State: Enter resource number 4 and try to reserve 1 seat.
Predicted Result: Invalid resource number
Actual Result: Same as predicted result

Test ID: E4-T5
Input and Starting State: After completing the required actions A–H, select Report.
Predicted Result: Quiet Study: 1 reserved; Computer Lab: 1 reserved; Group Study: 2 reserved. Total revenue: 17.00.
Actual Result: Same as predicted result