#Write a program to display the sum of all even numbers between 1 and 50 using a loop.
sum=0
for i in range (1,51):
    if i%2==0:
        sum +=i
        print(sum)
