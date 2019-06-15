[Given an array A[] of n numbers and another number x, determine whether or not there exist two elements in A whose sum is exactly x.](https://practice.geeksforgeeks.org/problems/key-pair/0)



**Input:**

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and X,N is the size of array.
The second line of each test case contains N integers representing array elements C[i].
**Output:**

Print "Yes" if there exist two elements in A whose sum is exactly x, else "No" without quotes.

**Constraints:**

1 ≤ T ≤ 200
1 ≤ N ≤ 200
1 ≤ C[i] ≤ 1000
**Example:**

**Input:**
2
6 16
1 4 45 6 10 8
5 10
1 2 4 3 6

**Output:**
Yes
Yes

**Approach 1 (Brute Force):**

1. Run two loops with variable i and j. ADD str[i] and str[j] . If they become equal to the sum at any point return Yes else return No.

   Total Time Complexity = O(n^2)

**Approach 2 (Using Hash Table):**

1. Initialize an empty  Hash table h

2. For each element in a[i] in a

   (I) Find the difference between sum and a[i].

   (II) Check (diff>=0 && h.contains(diff)) --> True --> return Yes. If there is no match return No

   Total Time Complexity = O(n)



**HashTable**:

Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects. Some examples of how hashing is used in our lives include:

- In universities, each student is assigned a unique roll number that can be used to retrieve information about them.
- In libraries, each book is assigned a unique number that can be used to determine information about the book, such as its exact position in the library or the users it has been issued to etc.

Hash Table is 

​				key => value lookup

​				name(String) => person(Object)

​			Eg:   'Alice' => new person(id=179,adress='Infinite loop')

​				'Bob' =>  new person(id=579,address='Hacker way')

​				hashtable.put('Alice',new person(id=179,address='Infinite loop')) -> Inserting to hash table

​				hashtable.get('Alice') -> To get data 

Time Complexity:

O(1) -> For good hash table.

O(n) -> For a terrible hash table

​			



**Declaration of HashSet:**



```java
HashSet<Integer> h =  new HashSet<Integer>();

// adding array element to hashset
h.add(a[i]);

// Checking if an array element present in hashset 
h.contains(a[i]);
```

