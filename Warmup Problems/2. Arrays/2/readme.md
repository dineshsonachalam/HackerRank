**Move all zeroes to end of array**

Given an array A of positive integers. Push all the zero’s of a given array to the end of the array.

**Input:**
The first line contains an integer T denoting the total number of test cases. In each test cases, first line is number of elements in array N and next line contains array elements.

**Output:**
Print the array after shifting all 0's at the end.

**Constraints:**
1 <= T <= 100
1 <= N <= 103
0 <= Ai <=103
**Example:Input:**
1
5
3 5 0 0 4

**Output:**
3 5 4 0 0

**Explanation:**
**Testcase 1: **All the zeros are moved to last and then array is as shown in the output.

**Approach 1**:

Iterating a[i] in a and storing the zeroes and non-zero numbers in a separate linked list and iterating them by means of an iterator.

Time complexity: O(n)

**Approach 2**:

1. Use a count variable and assign it to 0.

2. Iterate a[i] in a. 

   ​	if a[i]!=0:

   ​		a[count] = a[i]

   ​	        count++;

   ​        for(int i=count;i<a.length;i++)

   ​	{

   ​		a[i] = 0

   ​	}

   Time Complexity: O(n)

    