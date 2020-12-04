# Missing_Number

Inspiration from Educative.io "Cracking the top Amazon coding interview questions" https://www.educative.io/blog/crack-amazon-coding-interview-questions

1. Find the missing number in the array
You are given an array of positive numbers from 1 to n, such that all 
numbers from 1 to n are present except one number x. You have to find x.
 The input array is not sorted. Look at the below array and give it a try
 before checking the solution.

Sample Array:
3
7
1
2
8
4
5

Sample Solution: n = 8 missing number = 6


Questions about the Questions
------------------------------------------
- Will this always be inputs of 0 to n-1 or 1 to n? 
- Does 0 count as a positive number in this case? (Only if the input includes a 0 otherwise no)
- Will these be positive or negative numbers? 
- Will I need to consider variations such as 2,4,6,8,__,12 where they are a pattern?
- How do you want this to be returned?

Assumptions
------------------------------------------
- Positive numbers
- Presented in an array 
- Unsorted array

Ideas 
-------------------------------------------
- Initially, I think this can be done sorting the list and then iterating through 
to see where the number is missing by adding one to my current count. This is 
scrapped quickly after considering the amount of memory and time this will take. 
Approximately O(n) for memory and O(nlogn) for time. I think we can do better. 

- Next, I would like to consider iterating through the list and placing this into
a hashMap and then iterating through this list to see what is missing. Again, this 
does not seem much better then above because we are still using the same amount of 
memory and a tad better on the time O(n). I think we can still do better if we work 
smarter on this one. 

- Finally, if we look at this we know our numbers will be 1 to n which means this can
constantly and consistently be calculated using n! (n factorial). As there are no 
classes in java for this calculation, we would need to calculate this using two 1. 
three variables in a for loop and then iterating through the list and subtracting
the values provided in the list.... To improve on this thought, why not use one for
loop to iterate through the array and add and subtract at the same time so the time 
will be O(n) and the memory will be O(1). Hey! we improved the memory too! 

Test Cases 
--------------------------------------------
- Would this work if we shifted the values? No, we would need to modify this so it would
cover negative values, zeros and circumstances where the array values may not start at 1. 
Will need to include error message for this in the meantime. 
- Does it solve the example? Yes
- What happens if the array is size 1? Still will be O(n) time and O(1) memory and should 
go through the for loop 

Reading over the question and solutions, this is my best solution. Let's code this sucker!



