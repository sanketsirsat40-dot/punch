# Write a program to input the marks of 5 subjects and display the total and average marks.

mark1=int(input("Enter the mark:"))
mark2=int(input("Enter the mark:"))
mark3=int(input("Enter the mark:"))
mark4=int(input("Enter the mark:"))
mark5=int(input("Enter the mark:"))

total=mark1+mark2+mark3+mark4+mark5
aver=total/5
print(f"average mark:{aver}")
