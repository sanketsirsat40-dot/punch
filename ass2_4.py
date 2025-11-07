#Write a program to input marks and display grade according to the following rules: 
# Marks >= 90:A, Marks >= 80: B, Marks >= 70: C, Marks >= 60: D, else: Fail. (if-else ladder)

mark=int(input("enter the mark"))
if mark>=90:
    print("A")
elif mark>=80:
    print("B")
elif mark>=70:
    print("C")
elif mark>=60:
    print("D")
else:
    print("Fail")