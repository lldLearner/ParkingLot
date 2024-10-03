Flow Of the Parking Lot 

A vehicle arrives at any one entry gate of parking lot -> if parking is not full and appropriate slot is available for the vehicle -> A slot on the appropriate floor is asssigned to the vehicle and ticket is generated -> The bill is calculated on the basis of hours a car is parked -> payment is done at exit gate.

Design Patterns Used As Of Now -

1) Factory Pattern -> Generate different types of vehicles and Slots
2) Singletone Pattern -> Only a single instance of parking lot is needed so singleton instance is used.

The logic is implemented until ticket generation as of now.
