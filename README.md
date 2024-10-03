Flow Of the Parking Lot 

A vehicle arrives at any one entry gate of parking lot -> if parking is not full and appropriate slot is available for the vehicle -> A slot on the appropriate floor is asssigned to the vehicle and ticket is generated -> The bill is calculated on the basis of hours a car is parked -> payment is done at exit gate.

Design Patterns Used As Of Now -

1) Factory Pattern -> Generate different types of vehicles and Slots
2) Singletone Pattern -> Only a single instance of parking lot is needed so singleton instance is used.

The logic is implemented for the above single flow. 

The output looks as follows - 
```
The available spot type on 1 floor are {DISABLED=1, COMPACT=1}
The available spot type on 2 floor are {DISABLED=1, COMPACT=1}
The available spot type on 1 floor are {DISABLED=1, COMPACT=0}
Vehicle with license plate number HR21F0647 is parked on floor 1 and spot F1-1
The available spot type on 1 floor are {DISABLED=0, COMPACT=0}
Vehicle with license plate number HR22F0647 is parked on floor 1 and spot F1-2
The available spot type on 2 floor are {DISABLED=1, COMPACT=0}
Vehicle with license plate number HR23F0647 is parked on floor 2 and spot F2-1
The available spot type on 1 floor are {DISABLED=0, COMPACT=1}
200 paid via upi!
The available spot type on 1 floor are {DISABLED=1, COMPACT=1}
200 paid via cash!
```
