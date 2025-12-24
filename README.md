# Java Streams Practice Questions 🚀

A complete collection of Java Stream API practice problems from beginner to expert level.  
Ideal for Java 8+ / Java 17 developers preparing for interviews.

---

## 📌 Prerequisites
- Java 8 or later
- Basics of:
    - Lambda Expressions
    - Collections Framework
    - Functional Interfaces

---

## 🟢 Beginner Level (Warm-up)

1. Filter even numbers from a list
2. Filter odd numbers from a list
3. Square all numbers in a list
4. Convert all strings to uppercase
5. Count strings starting with a given letter
6. Remove duplicate elements from a list
7. Find maximum value in a list
8. Find minimum value in a list
9. Find sum of all numbers in a list
10. Join list of strings into a single string

---

## 🟡 Intermediate Level (Interview Important)

11. Find the second highest number in a list
12. Find the second lowest number in a list
13. Group strings by their length
    - Input: ["java","spring","boot","api"]
    - Output: {4=[java, boot], 6=[spring], 3=[api]}
14. Count frequency of each character in a string
15. Find the first non-repeated character in a string
16. Sort strings by length (ascending)
17. Sort strings by length (descending)
18. Find sum of all odd numbers in a list
19. Partition numbers into even and odd
20. Find duplicate elements in a list
21. Count frequency of each element in a list

---

## 🔵 Advanced Level (Product-Based Companies)

### Employee Stream Problems

Employee class contains:
- id (int)
- name (String)
- department (String)
- salary (double)

22. Find the highest paid employee
23. Find the lowest paid employee
24. Calculate average salary per department
25. Find the department with maximum employees
26. Find employees earning more than department average salary
27. Sort employees by salary (ascending and descending)
28. Find total salary paid per department

---

## 🔹 flatMap Practice

29. Flatten a list of lists into a single list  
    Example input: [[1,2],[3,4],[5,6]]  
    Output: [1,2,3,4,5,6]

30. Find top 3 highest numbers in a list
31. Find top 3 lowest numbers in a list
32. Find the longest string in a list
33. Find the shortest string in a list
34. Convert a list of strings into a list of custom objects
35. Count word frequency in a sentence

---

## 🔴 Expert Level (Interview Favorites)

36. Find the Nth highest number in a list
37. Find the Nth highest salary using streams
38. Check if all elements in a list are unique
39. Find common elements between two lists
40. Sort a Map<String, Integer> by value
41. Find the longest word in a sentence
42. Find the most repeated element in a list
43. Find the least repeated element in a list
44. Group numbers into odd and even and sort each group
45. Convert a list into a map (handle duplicate keys safely)

---

## 🧠 Important Stream Concepts to Master

- map vs flatMap
- filter vs peek
- forEach vs collect
- groupingBy
- partitioningBy
- mapping
- counting
- reducing

---

## ⏱️ Performance Awareness (Interview Tip)

- Sorting streams → O(n log n)
- groupingBy uses hashing internally
- Prefer loops for performance-critical paths
- Use parallel streams carefully

---

## 📂 Suggested Repository Structure

java-streams-practice  
├── README.md  
└── src  
├── beginner  
├── intermediate  
├── advanced  
└── expert

---

## ✅ How to Use This Repository

- Solve problems level by level
- Compare stream vs loop solutions
- Add comments explaining logic
- Add JUnit tests where applicable

---

## 📢 Contribution

Contributions are welcome!
- Add optimized solutions
- Improve readability
- Add test cases

Happy Coding 🚀🔥
