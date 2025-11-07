#Write a program to input a year and check whether it is a leap year or not. (if-else)
year=int(input("enter the year:"))
if year%4==0 and year%100!=0:
    print("it is leap year")
else:
    print("is not leap year") 