1. Check if there is duplicate element in a string (with better time complexity).

   (or)

   Determine string has all unique characters.

   Eg 1: apple

   Here "P" repeats twice. So the string is a duplicate String.

   Eg 2: orange

   Here no character repeats twice. So the string is not a duplicate string.

Approach 1:

1. Sort the string lexicographically. (O(nlogn) -> Quick Sort)

2. Now iterate the array and compare it with the next element. If they match the string doesn't have unique character else it has unique characters(O(n))

   Total Time Complexity = O(n)

   ​

Approach 2 (Brute Force Approach):

1. Run two loops with variable i and j. Compare str[i] and str[j] . If they become equal at any point return False

   Total Time Complexity = O(n^2)













​         





