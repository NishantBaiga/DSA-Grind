# DSA Notes 

## Data and Information

- **Data** is a collection of raw facts or observations that may not have meaning on their own. Examples include numbers, names, dates, and measurements.
- **Information** is data that has been organized or processed to make it meaningful and useful.

**Example:** `18, 20, 22` is data. “The average age is 20” is information derived from that data.

## What is Structure?

- **Structure** refers to the way data is organized and arranged in memory or storage so it can be processed efficiently.
- Different structures are used for different purposes, such as storing data, retrieving it quickly, or maintaining relationships between items.
- Common data structures include arrays, linked lists, stacks, queues, trees, graphs, and hash tables.

**Example:** An array stores values in a fixed order, while a linked list stores values with pointers to the next item. The choice of structure affects how fast operations like search, insertion, and deletion are performed.


## What Is an Algorithm?


- Well-defined: each step is clear and precise.
- Finite: they stop after a certain number of steps.
- Efficient: they aim to use as little time and memory as possible.

**Example:** Sorting numbers in ascending order using bubble sort or merge sort is an algorithm.

## What Is DSA?

**DSA** stands for **Data Structures and Algorithms**. Data structures organize and store data, while algorithms are step-by-step methods for solving problems or processing data.

### Why Study DSA?

- To solve problems efficiently by choosing approaches that use less time and memory.
- To understand how to store, search, and update data effectively.
- To compare different solutions and choose the right one for a task.
- To build a strong programming foundation; DSA concepts apply across languages and are commonly assessed in technical interviews.

### Uses of DSA

- DSA is used in databases, search engines, route planning, operating systems, file systems, and applications that process large amounts of data. 
- For example, map applications can use graph algorithms to find routes, while search engines use data structures to retrieve results quickly.

## DSA Classification
Data structures are generally classified into two main categories:

### 1. Primitive Data Structures
Basic, low-level data types provided directly by programming languages. They hold single values and are operated on directly by machine instructions.

- **Integer**: Whole numbers (e.g., 10, -5)
- **Float / Double**: Numbers with decimal points (e.g., 3.14)
- **Character**: Single letters, digits, or symbols (e.g., 'A')
- **Boolean**: Logical values representing true or false (True, False)
- **Pointer**: A reference or memory address pointing to another value


### 2. Non-primitive structures are further divided into:
Derived or user-defined data structures built using primitive types. They handle groups of data items and are divided into two main categories: Linear and Non-Linear.

#### A. Linear Data Structures

Elements are arranged in a sequence, and traversal generally proceeds from one element to the next.

- **Array**: Holds elements at indexed positions, often in contiguous memory.
- **Linked list**: Holds elements in nodes connected by links. A node usually points to the next node; some lists also link to the previous node.
- **Stack**: Follows **last in, first out (LIFO)**. Items are added and removed at the top.
- **Queue**: Follows **first in, first out (FIFO)**. Items are added at the back and removed from the front.

#### B. Non-Linear Data Structures

Elements are not arranged in one simple sequence. They can have relationships with multiple other elements, forming hierarchical or network-like arrangements.

- **Tree**: Organizes nodes hierarchically, often through parent-child relationships. Binary trees and heaps are examples.
- **Graph**: Consists of vertices (nodes) and edges (connections), and can represent roads or social networks.
- **Hash table**: Stores key-value pairs and uses a hash function to help locate values. It is commonly grouped with non-linear structures, though implementations can use arrays or linked lists.


### Why This Classification Matters

- Primitive data structures are used for simple single values, while non-primitive data structures are used to organize and manage large sets of data efficiently. 
- Understanding this classification helps in choosing the right structure for a problem and improves problem-solving in DSA.
- Use linear structures for sequential data, trees for hierarchies, and graphs for general connections. 
- The best choice depends on the data and the operations required.

# Searching Algorithms in DSA

Searching is the process of finding a target element in a collection of data. 
A **search algorithm** finds whether a target value exists in a collection and, when it does, returns its position or the matching item. The collection may be an array, string, tree, graph, or other data structure.

## 1. Linear Search

**Concept:** Checks elements one by one until the target is found or the array ends.

**Example:** `[10, 20, 30, 40, 50]`, target = `30`

Check `10` → `20` → `30`. Target found at index `2`.

- **Requirement:** Works on sorted and unsorted arrays.
- **Time Complexity:** Best `O(1)`, Average `O(n)`, Worst `O(n)`.
- **Space Complexity:** `O(1)` auxiliary space.

## 2. Binary Search

**Concept:** Repeatedly divides the search range into two halves.

**Example:** `[10, 20, 30, 40, 50, 60, 70]`, target = `60`

Middle is `40`. Since `60 > 40`, search the right half. Find `60`.

- **Requirement:** Array must be sorted.
- **Time Complexity:** Best `O(1)`, Average `O(log n)`, Worst `O(log n)`.
- **Space Complexity:** Iterative `O(1)`; Recursive `O(log n)`.

## 3. Lower Bound

**Concept:** Finds the index of the first element **greater than or equal to (`>=`) the target** in a sorted array.

**Example:** `[10, 20, 20, 20, 30, 40]`, target = `20`

Result: Index `1` (first occurrence of `20`).

If no element satisfies the condition, returns the array length.

- **Time Complexity:** `O(log n)` worst case.
- **Space Complexity:** `O(1)` with an iterative implementation.

## 4. Upper Bound

**Concept:** Finds the index of the first element **strictly greater than (`>`) the target** in a sorted array.

**Example:** `[10, 20, 20, 20, 30, 40]`, target = `20`

Result: Index `4` (element `30`).

If no element satisfies the condition, returns the array length.

- **Time Complexity:** `O(log n)` worst case.
- **Space Complexity:** `O(1)` with an iterative implementation.

## 5. Quick Comparison

| Algorithm | Purpose | Worst-Case Time | Space |
|---|---|---|---|
| Linear Search | Find an element one by one | `O(n)` | `O(1)` |
| Binary Search | Find an element by halving the range | `O(log n)` | `O(1)` iterative |
| Lower Bound | First element `>= target` | `O(log n)` | `O(1)` |
| Upper Bound | First element `> target` | `O(log n)` | `O(1)` |

### Important Formula

**Number of occurrences of a target:**

`Upper Bound - Lower Bound`

Example: Lower Bound = `1`, Upper Bound = `4`.

Occurrences = `4 - 1 = 3`.

### Key Points

- Linear Search works on unsorted data.
- Binary Search, Lower Bound, and Upper Bound require sorted data.
- Lower Bound finds the first qualifying position.
- Upper Bound finds the position after all occurrences of the target.


# Sorting Algorithms

A sorting algorithm rearranges items into a specified order, usually ascending or descending, based on a key such as a number or name. Sorting makes data easier to search, compare, and analyze.

### Common types

- **Bubble Sort** — Repeatedly swaps adjacent items that are out of order. Simple, but inefficient for large inputs: `O(n²)`.
- **Selection Sort** — Repeatedly selects the smallest remaining item and places it next. `O(n²)` time and `O(1)` extra space.
- **Insertion Sort** — Inserts each item into its correct position in the sorted portion. `O(n²)` worst case; effective for small or nearly sorted inputs.
- **Merge Sort** — Divides the data, sorts each part, then merges the results. `O(n log n)` time and typically `O(n)` extra space.
- **Quick Sort** — Partitions data around a pivot and sorts each part. Average `O(n log n)` time; worst case `O(n²)`.
- **Heap Sort** — Uses a heap to repeatedly select the next item. `O(n log n)` time and `O(1)` extra space for an in-place implementation.
- **Counting Sort** — Counts occurrences of integer keys in a limited range. `O(n + k)` time, where `k` is the key range.
- **Radix Sort** — Sorts keys one digit or character position at a time; performance depends on key length and range.
- **Bucket Sort** — Distributes values into buckets, sorts each bucket, then combines them; works well for suitably distributed data.

Comparison sorts (such as merge sort and quick sort) order items by comparing them. Non-comparison sorts (such as counting sort and radix sort) use properties of the keys. A **stable** sort preserves the relative order of equal items; an **in-place** sort uses little extra memory. Choose an algorithm based on input size, data characteristics, memory limits, and whether stability is required.


# DSA Patterns: 25 Common Approaches

DSA patterns are reusable problem-solving techniques. Recognizing a pattern helps you choose an efficient approach to a new problem.

1. **Two Pointers** — Move two indices through an array or string, often from opposite ends.
2. **Sliding Window** — Track a contiguous subarray or substring with a window that expands or contracts.
3. **Kadane's Algorithm** — Find the maximum subarray sum efficiently using a running total.
3. **Fast and Slow Pointers** — Move pointers at different speeds to detect cycles or find a midpoint.
4. **Prefix Sum** — Precompute cumulative values to answer range-sum queries efficiently.
5. **Difference Array** — Apply multiple range updates efficiently, then reconstruct values with a prefix sum.
6. **Hashing / Frequency Map** — Use a hash map or set for fast lookup, counting, or duplicate detection.
7. **Binary Search** — Repeatedly halve a sorted search space to find a value or boundary.
8. **Binary Search on Answer** — Search for a feasible answer when feasibility changes monotonically.
9. **Sorting and Scanning** — Sort data, then scan it to identify relationships or merge ranges.
10. **Intervals** — Sort and combine, insert, or schedule overlapping time ranges.
11. **Monotonic Stack** — Maintain ordered stack elements to find nearest greater or smaller values.
12. **Monotonic Queue** — Maintain a deque to find minimum or maximum values in a moving window.
13. **Top K / Heap** — Use a heap to find the smallest, largest, or most frequent `k` items.
14. **Merge Intervals** — Sort intervals and combine those that overlap.
15. **Backtracking** — Build candidate solutions incrementally and undo choices when a path fails.
16. **Depth-First Search (DFS)** — Explore a graph or tree deeply before backtracking.
17. **Breadth-First Search (BFS)** — Explore level by level; useful for shortest paths in unweighted graphs.
18. **Tree Traversal** — Visit tree nodes using preorder, inorder, postorder, or level order.
19. **Binary Search Tree (BST) Operations** — Use an ordered tree for search, insertion, and deletion.
20. **Topological Sort** — Order vertices in a directed acyclic graph by dependency.
21. **Union-Find (Disjoint Set Union)** — Track connected components and efficiently merge groups.
22. **Shortest-Path Algorithms** — Find minimum-cost routes using methods such as BFS, Dijkstra, or Bellman–Ford.
23. **Greedy** — Make the best local choice at each step when it leads to a global optimum.
24. **Dynamic Programming (DP)** — Reuse results of overlapping subproblems with memoization or tabulation.
25. **Bit Manipulation** — Use bitwise operations to represent sets or solve problems involving binary values.


# Recursion in DSA

## 1. Quick Revision

**Recursion** is a programming technique in which a function calls itself to solve smaller subproblems.
 Each call handles one part of the problem. The calls stop when they reach a simple case that can be answered directly.

Every recursive function needs:
- **Base Case:** Stops recursion. It gives an answer directly without another recursive call. Every path through the function must eventually reach a base case. Without one, the function keeps calling itself until the program runs out of stack space.
- **Recursive Case:** Calls the function with a smaller or simpler problem.  
The part that calls the function again with a smaller or simpler input.  
Each call must move closer to the base case
- **Progress:** Moves toward the base case.

### How Recursion Works
1. A function calls itself.
2. Each call creates a stack frame in the **call stack**.
3. Calls continue until the base case is reached.
4. The function calls return in reverse order (**unwinding**).

The call stack follows **LIFO (Last In, First Out)**.

When a function calls itself, the computer saves the current call and starts a new one. 
The saved calls are kept in memory in an area called the **call stack**. 
Each active call has a stack frame containing information such as its input, local variables, and where to continue when the next call returns.

When a call returns, its stack frame is removed and the waiting call continues. 
A large number of active calls can use too much stack space and cause a **stack overflow**. 
Recursion therefore uses memory for its active calls, in addition to any memory used by the problem's data.

The function first calls itself with smaller values until it reaches the base case. Then the calls return their answers one by one. This return process is often called **unwinding**.


### Types of Recursion
- **Direct Recursion:** A function calls itself directly.
- **Indirect Recursion:** Functions call each other.
- **Linear Recursion:** Each call makes at most one recursive call.
- **Tree Recursion:** Each call makes multiple recursive calls.
- **Tail Recursion:** The recursive call is the last operation.
- **Non-tail Recursion:** Additional work remains after the recursive call returns.
- **Nested Recursion:** A recursive call is used as an argument to another recursive call.

### Tail vs. Non-tail Recursion

| Feature | Tail Recursion | Non-tail Recursion |
|---|---|---|
| Last operation | Recursive call | Additional work remains |
| Stack optimization | Possible with runtime support | Generally harder |
| Stack space | Can be O(1) if optimized | Often O(n) for linear recursion |

**Note:** Tail-call optimization is not guaranteed in every programming language.

### Common Uses of Recursion
- **Merge sort and quick sort**
- **Trees:** Process a node and its smaller child trees. Preorder, inorder, and postorder tree traversals are common examples.
- **Divide and conquer:** Split a problem into smaller problems, solve them, and combine their answers. Merge sort and quick sort use this idea.
- **Graphs:** Explore paths or connected areas with depth-first search (DFS). A visited set is usually needed to avoid following cycles repeatedly.
- **Backtracking:** Try a choice, continue, and undo the choice when it does not lead to a solution. This is useful for puzzles and for generating combinations.
- **Mathematical problems:** Some definitions, such as factorial, describe an answer using a smaller input. A simple recursive Fibonacci solution repeats work, so memoization or a loop is more efficient for that problem.

Recursion is useful when a problem naturally consists of smaller versions of itself. For simple repeated steps, a loop may be easier to understand and may use less stack space. When writing recursion, make sure the base case is correct and every recursive call gets closer to it.

### Advantages
- Simplifies problems with recursive structures.
- Often produces clean, readable code.
- Useful for trees, graphs, and backtracking.

### Disadvantages
- Uses call stack memory.
- Deep recursion can cause stack overflow.
- Function-call overhead may reduce performance.
- Repeated calculations can be inefficient.
- **Extra memory use:** Each active call needs a stack frame, so deep recursion can use substantial memory or cause a stack overflow.
- **Function-call overhead:** Repeated calls can make recursion slower than an equivalent loop for simple tasks.
- **Repeated work:** A recursive solution may recompute the same results, as a basic Fibonacci implementation does. Memoization can avoid this in suitable problems.
- **Harder to trace:** Nested calls and returns can make bugs and control flow more difficult to follow.

### Recursion vs. Iteration

| Feature | Recursion | Iteration |
|---|---|---|
| Mechanism | Function calls itself | Loops |
| Stopping condition | Base case | Loop condition |
| Memory | Usually uses call stack | Often O(1) extra space |
| Common risk | Stack overflow | Infinite loop |

---

## 2. Detailed Explanation

### How Recursion Works Under the Hood

Every function call creates a **stack frame** containing information such as parameters, local variables, and the return location.

Consider `count(3)`:

```text
count(3)
  count(2)
    count(1)
      count(0) → Base case
```

When `count(0)` finishes, execution returns to `count(1)`, then `count(2)`, and finally `count(3)`.

This returning process is called **stack unwinding**.

### Base Case and Recursive Case

- **Base case:** Defines the smallest problem that can be solved directly.
- **Recursive case:** Reduces the original problem into a smaller problem.

Every recursive function should have a reachable base case, and each recursive call should make progress toward it. Otherwise, recursion may continue until a stack overflow occurs.

### Tail Recursion

The recursive call is the final operation. The current function has no additional work after that call returns.

Example concept:

```text
if n == 0:
    return
process(n)
recurse(n - 1)
```

Here, the recursive call is the last operation.

### Non-tail Recursion

The function performs additional work after the recursive call returns.

Example concept:

```text
if n == 0:
    return
recurse(n - 1)
process(n)
```

Here, `process(n)` runs during stack unwinding.

### Time and Space Complexity

Complexity depends on the number of recursive calls and the work performed by each call.

| Algorithm | Time | Auxiliary Stack Space |
|---|---|---|
| Linear recursive countdown | O(n) | O(n) |
| Recursive factorial | O(n) | O(n) |
| Naive recursive Fibonacci | O(2ⁿ) | O(n) |
| Recursive binary search | O(log n) | O(log n) |

These complexities assume standard implementations without tail-call optimization. Naive Fibonacci has exponential time complexity because it repeatedly calculates the same subproblems.

### How to Solve Recursion Problems

1. Identify the base case.
2. Define how the problem becomes smaller.
3. Write the recursive relationship.
4. Determine what happens after the recursive call returns.
5. Check termination.
6. Calculate time and auxiliary space complexity.

**Key takeaway:** Think of recursion as solving a smaller version of the same problem, stopping at the base case, and then returning through the call stack.


# Recursion Types
Recursion can be classified by whether a function calls itself directly or through another function, and by where or how its recursive calls occur.

### Direct Recursion

A function calls itself directly. Common forms include:

- **Tail recursion:** The recursive call is the final operation; no work remains after it returns.
- **Non-tail (head) recursion:** The function performs pending work, such as addition or multiplication, after the recursive call returns.
- **Tree recursion:** The function makes multiple recursive calls, creating a branching execution tree (for example, Fibonacci or Tower of Hanoi).
- **Nested recursion:** A recursive call is passed as an argument to another call of the same function (for example, `foo(foo(n - 1))`).

### Indirect Recursion

A function calls another function, which eventually calls the first function again.

- **Mutual recursion:** Two or more functions call each other in a cycle. For example, `isEven(n)` calls `isOdd(n - 1)`, and `isOdd(n)` calls `isEven(n - 1)`.

## Tail Recursion

Tail recursion occurs when the recursive call is the final operation performed by the function. There is no remaining work after the recursive call finishes.

### Tail Call Optimization (TCO)

In standard recursion, every call adds a frame to the call stack, which can cause a stack overflow if the input is too large. Compilers that support Tail Call Optimization (TCO) can recognize tail-recursive functions and reuse a stack frame instead of allocating a new one. This can reduce space complexity from `O(n)` to `O(1)`.

### Tail vs. Non-Tail Factorial

The table below contrasts factorial implementations with and without tail-call optimization:

| Attribute | Non-Tail Factorial | Tail-Recursive Factorial |
| --- | --- | --- |
| Code structure | `return n * fact(n - 1);` | `return fact_tail(n - 1, n * accumulator);` |
| Pending work | Multiply by `n` after `fact(n - 1)` returns | None; the sub-call's result is the final result |
| Stack frames | Grow linearly with `n` | Can reuse a frame when TCO is supported |
| Space complexity | `O(n)` | `O(1)` with TCO |


# How to Find Time and Space Complexity of recursion

### Analyzing Complexity in Recursion

To find the time and space complexity of a recursive function, analyze how the function branches and how deep the recursive call stack goes.

### 1. Time Complexity

Time complexity for recursion is determined by the total number of recursive calls and the work performed by each call, excluding its sub-calls.

#### Method A: The Recursive Tree

1. **Draw the tree:** Start with a node for the initial call, then draw branches for every recursive call it makes.
2. **Find the depth (`d`):** Determine how many levels the tree goes down before hitting the base case.
3. **Find the branching factor (`b`):** Count how many recursive calls are made inside a single function execution.
4. **Calculate total nodes:** A tree with branching factor `b` and depth `d` has roughly `O(b^d)` nodes.
5. **Account for internal work:** If the work done inside each function call is `O(1)`, the total time is roughly `O(b^d)`.

#### Method B: Recurrence Relations

1. **Write the equation:** Define a recurrence for the running time, `T(n)`.
2. **Formulate the relation:** For example, a function that splits the input in half and does constant work can be written as:

     `T(n) = T(n/2) + O(1)`

3. **Solve the relation:** Use the Master Theorem or expand it with the substitution method.

#### 2. Space Complexity

The space complexity of a recursive function is determined by the maximum depth of the call stack. Even if a function makes many total calls, they do not all exist at the same time. The computer tracks the active calls from the root to the current leaf node.

- **Identify the deepest path:** Find the maximum number of simultaneous stack frames before hitting the base case.
- **Check memory per frame:** Analyze the local variables created inside each call.
    - If each call uses a constant amount of memory, space is `O(max depth)`.
    - If each call creates a copy of an array of size `n`, space is `O(n × max depth)`.

### Direct Comparison: Two Classic Examples

| Example algorithm | Code logic structure | Time complexity | Space complexity | Explanation |
|---|---|---:|---:|---|
| Linear search / countdown | `foo(n - 1)` (one call per execution) | `O(n)` | `O(n)` | There are `n` total sequential calls, and the stack grows to a depth of `n`. |
| Naive Fibonacci | `fib(n - 1) + fib(n - 2)` (two calls per execution) | `O(2^n)` | `O(n)` | The tree branches twice at each level. The left branch's frames are cleared before the right branch runs, so the maximum stack depth is `n`. |

To analyze a specific function, provide its code or describe its logic to determine its recurrence relation or draw its recursive tree.



# Data Structures 

## Arrays

An **array** is a linear data structure that stores elements in an ordered sequence. Each element is identified by an integer **index**. In a typical array, elements are stored in contiguous memory locations, allowing the computer to calculate an element's position directly from its index.

With zero-based indexing, the first element is `arr[0]` and the element at index `i` is `arr[i]`. For an array of length `n`, valid indices range from `0` to `n - 1`.

### Common Operations and Time Complexity
- **Traversal** : From Start , From End
- **Insertion** : At Start, At End , At Given Position
- **Deletion**  : From Beginning, Given Position, First Occurrence, All occurrences and From End
- **Searching** : Linear Search and Binary Search


| Operation | Time complexity | Explanation |
|---|---:|---|
| Access or update by index | `O(1)` | The position is calculated directly. |
| Traverse all elements | `O(n)` | Each element is visited once. |
| Search an unsorted array | `O(n)` | In the worst case, every element is checked. |
| Search a sorted array | `O(log n)` | Binary search works because indexed access is fast. |
| Insert or delete at the end | `O(1)` amortized for a dynamic array | Resizing may occasionally require `O(n)` time. |
| Insert or delete at the beginning or middle | `O(n)` | Other elements usually need to shift. |

### Static and Dynamic Arrays

#### On the Basis of Size
- **Static array:** Has a fixed capacity. To exceed it, a new array must be created and the elements copied.
- **Dynamic array:** Grows its capacity when needed. Python lists, Java `ArrayList`, and C++ `vector` are examples. Appending is typically `O(1)` amortized, though an occasional resize takes `O(n)` time.

#### On the Basis of Dimension
- **One-dimensional array:** Stores elements in a single sequence and uses one index to access each element, for example `arr[i]`.
- **Two-dimensional array:** Stores elements in rows and columns and uses two indices to access an element, for example `matrix[row][column]`.

### Advantages and Limitations

- Provides fast indexed access and efficient traversal.
- Contiguous storage often gives good cache locality.
- Inserting or removing elements in the middle can be slow because elements must shift.
- Resizing a dynamic array can require allocating new storage and copying elements.

Arrays are useful when order and indexed access matter. They are also building blocks for structures such as heaps, hash tables, and matrices. A **multidimensional array** uses multiple indices, for example `matrix[row][column]` in a two-dimensional array.

### Arrays in C, C++, Java, Python, and JavaScript

All examples use zero-based indexing and update the element at index `1`. C and Java arrays have fixed lengths; C++ `vector`, Python lists, and JavaScript arrays can grow.

#### C

```c
int numbers[] = {10, 20, 30};
numbers[1] = 25;
printf("%d\n", numbers[1]); // 25
```

#### C++

Use `std::array` for a fixed-size array or `std::vector` for a resizable collection.

```cpp
#include <vector>

std::vector<int> numbers{10, 20, 30};
numbers[1] = 25;
std::cout << numbers[1] << '\n'; // 25
```

#### Java
Use `ArrayList` for Dynamic array
```java
int[] numbers = {10, 20, 30};
numbers[1] = 25;
System.out.println(numbers[1]); // 25
```

#### Python

Python's built-in `list` is commonly used as a dynamic array.

```python
numbers = [10, 20, 30]
numbers[1] = 25
print(numbers[1])  # 25
```

#### JavaScript

```javascript
const numbers = [10, 20, 30];
numbers[1] = 25;
console.log(numbers[1]); // 25
```



### Common Array Problem-Solving Patterns

- **Two pointers:** Move two indices through the array, from opposite ends or at different speeds. Useful for sorted pair problems, in-place partitioning, and removing duplicates; often `O(n)` time and `O(1)` extra space.
- **Sliding window:** Maintain a contiguous range and expand or shrink it while scanning. Useful for fixed-size windows and subarray problems with a condition that changes predictably; often `O(n)` time.
- **Prefix sums:** Precompute cumulative totals so range sums can be answered by subtracting prefix values. Useful for repeated range queries and subarray-sum problems; takes `O(n)` preprocessing time and space.
- **Hash map or frequency counting:** Store values, counts, or previously seen indices during a scan. Useful for complements, duplicates, and target-sum subarrays; typically `O(n)` time and `O(n)` extra space.
- **Sort, then scan:** Sorting can expose duplicates or ordering relationships, followed by a linear scan or two pointers. Usually `O(n log n)` time; consider whether changing input order is allowed.
- **Binary search:** Halve a sorted search range, or search a monotonic condition (“binary search on the answer”). Typically `O(log n)` checks, multiplied by the cost of each check.
- **Kadane's algorithm:** Track the best subarray ending at each position and the best overall. Useful for maximum-sum contiguous subarrays; `O(n)` time and `O(1)` extra space.
- **Difference array:** Record range updates at their boundaries, then use a prefix sum to apply them. Useful when many range updates are followed by a final array; typically `O(n + q)` for `q` updates.
- **In-place cyclic placement:** Place values at indices determined by those values when the value range matches the array indices. Useful for missing- or duplicate-number problems; often `O(n)` time and `O(1)` extra space.

Choose a pattern based on the clues: contiguous ranges suggest sliding windows or prefix sums, sorted data suggests two pointers or binary search, and repeated lookups suggest a hash map. Verify constraints and edge cases before applying a pattern.

## String in DSA

## 1. Quick Revision

A **string** is a sequence of characters used to represent text. In DSA, strings are commonly used for character manipulation, searching, and pattern matching.

Example: `"HELLO"`

| Character | H | E | L | L | O |
|---|---|---|---|---|---|
| Index | 0 | 1 | 2 | 3 | 4 |

- **Indexing:** Access a character using its index, usually starting from `0`.
- **Traversal:** Visit each character in a string.
- **Substring:** A continuous sequence of characters within a string.
- **Concatenation:** Joining two strings.
- **Palindrome:** A string that reads the same forward and backward, e.g., `"madam"`.
- **Anagram:** Two strings containing the same characters with the same frequencies, e.g., `"listen"` and `"silent"`.

## 2. Common String Operations

| Operation | Time Complexity |
|---|---|
| Access character by index | `O(1)` |
| Traverse string | `O(n)` |
| Search for a character | `O(n)` |
| Compare strings | `O(n)` worst case |
| Reverse string | `O(n)` |
| Concatenate strings | Typically `O(n + m)` |

Here, `n` and `m` represent string lengths. Actual complexity may depend on the programming language and implementation.

## 3. Mutable vs Immutable Strings

- **Mutable:** The contents can be changed after creation.
- **Immutable:** The contents cannot be changed after creation; modifications create a new string.

Examples:
- Java: `String` is immutable; `StringBuilder` is mutable.
- C++: `std::string` is mutable.
- In C++, string objects are mutable.
- In C/C++, string literals (assigned to pointers) are immutable.
- In Python, Java and JavaScript, strings are immutable.

## 4. Important String Problem-Solving Patterns

- **Two Pointers:** Reverse a string, check palindromes.
- **Sliding Window:** Find the longest substring without repeating characters.
- **Hashing / Frequency Counting:** Check anagrams, count character occurrences.
- **Pattern Matching:** Find a pattern inside a larger string.
- **Prefix and Suffix:** Find the longest common prefix or process string boundaries.

## 5. Practice Problems

### Beginner
1. Reverse a string.
2. Check whether a string is a palindrome.
3. Count vowels and consonants.
4. Count character frequencies.
5. Check whether two strings are anagrams.

### Intermediate
1. Remove duplicate characters.
2. Find the first non-repeating character.
3. Find the longest common prefix.
4. Find the longest substring without repeating characters.
5. Group anagrams.

### Advanced
1. Longest palindromic substring.
2. KMP string matching algorithm.

## 6. Key Takeaways

- String indexing usually starts from `0`.
- Traversing a string takes `O(n)` time.
- Understand string immutability in your programming language.
- Learn two pointers, sliding window, and hashing for string problems.
- Consider edge cases such as empty strings, spaces, uppercase/lowercase, and repeated characters.

## Linked List

## 1. Short Notes (Quick Revision)

A **Linked List** is a linear data structure consisting of nodes. Each node stores data and a reference to another node. Unlike arrays, nodes do not need contiguous memory locations.

### Node Structure
- **Data:** Stores the value.
- **Next:** Stores the reference to the next node.
- **Head:** Points to the first node.
- **Tail:** Refers to the last node, if maintained.
- **NULL:** Indicates the end of a non-circular linked list.

Example:

`Head → 10 → 20 → 30 → NULL`

### Types of Linked Lists
1. **Singly Linked List:** Each node points to the next node.
2. **Doubly Linked List:** Each node has `prev` and `next` references.
3. **Circular Linked List:** The last node points back to the first node.
4. **Circular Doubly Linked List:** Nodes connect in both directions, forming a circle.

### Time Complexity

| Operation | Time Complexity |
|---|---|
| Access by index | O(n) |
| Search | O(n) |
| Insert at beginning | O(1) |
| Delete at beginning | O(1) |
| Insert at end (without tail) | O(n) |
| Insert after a known node | O(1) |
| Reverse a linked list | O(n) |

### Advantages
- Dynamic size.
- Efficient insertion and deletion at known positions.
- Does not require contiguous memory.

### Disadvantages
- No direct indexed access.
- Extra memory required for references.
- Sequential traversal is required.
- Pointer manipulation can be complex.

---

## 2. Detailed Notes

### 2.1 How a Linked List Works

A linked list stores elements in separate nodes connected through references.

For example:

`10 → 20 → 30 → NULL`

Each node points to the next node. The head stores a reference to the first node, and traversal continues until `NULL` is reached.

Unlike arrays, linked list nodes can be stored at different memory addresses.

### 2.2 Node Structure

A singly linked list node contains:

`[ Data | Next ]`

- `Data` stores the actual value.
- `Next` stores a reference to the next node.

The last node's `Next` is `NULL`.

### 2.3 Types of Linked Lists

**Singly Linked List**

Each node points to the next node. Traversal is possible only in the forward direction.

`10 → 20 → 30 → NULL`

**Doubly Linked List**

Each node contains references to both the previous and next nodes.

`NULL ← 10 ⇄ 20 ⇄ 30 → NULL`

It supports forward and backward traversal but requires extra memory.

**Circular Linked List**

The last node points back to the first node instead of pointing to `NULL`.

`10 → 20 → 30 → 10 ...`

**Circular Doubly Linked List**

Each node has previous and next references, and the first and last nodes are connected in both directions.

### 2.4 Array vs Linked List

| Feature | Array | Linked List |
|---|---|---|
| Memory | Usually contiguous | Nodes can be scattered |
| Indexed access | O(1) | O(n) |
| Search | O(n), generally | O(n) |
| Insert at beginning | O(n) | O(1) |
| Memory overhead | Usually lower | Higher due to references |
| Cache locality | Generally better | Generally worse |

**Key difference:** Arrays support fast indexed access, while linked lists support efficient insertion and deletion when the relevant node references are already available.

### 2.5 Basic Operations

**Traversal:** Start at the head and visit nodes one by one until `NULL` is reached. Time: O(n).

**Searching:** Compare each node's data with the target value. Time: O(n) in the worst case.

**Insertion at Beginning:**
1. Create a new node.
2. Point its `next` to the current head.
3. Update the head to the new node.

Time: O(1).

**Insertion at End:** Traverse to the last node and connect it to the new node. Time: O(n) without a tail reference; O(1) with a maintained tail reference.

**Deletion at Beginning:** Update the head to point to the second node. Time: O(1).

**Reversal:** Change the direction of each node's reference so that the last node becomes the new head. Iterative reversal takes O(n) time and O(1) auxiliary space.

### 2.6 Common Interview Problems

Practice these problems in order:

1. Traverse and search a linked list.
2. Insert and delete nodes.
3. Reverse a linked list.
4. Find the middle node using slow and fast pointers.
5. Detect a cycle using Floyd's cycle detection algorithm.
6. Find the k-th node from the end.
7. Merge two sorted linked lists.
8. Remove duplicates.
9. Find the intersection of two linked lists.
10. Check whether a linked list is a palindrome.

### 2.7 Applications

- Implementing stacks and queues.
- Browser navigation using linked structures.
- Music playlists.
- LRU cache implementation with a hash map and doubly linked list.
- Managing collections of dynamically allocated nodes.

### 2.8 Important Interview Points

- Understand `head`, `tail`, `next`, and `NULL`.
- Always handle empty lists and single-node lists.
- Update references in the correct order during insertion and deletion.
- Be careful not to lose the remaining list while reversing pointers.
- Know when an operation requires traversal.
- Distinguish time complexity from auxiliary space complexity.


## Array vs Linked List Detailed Comparsion

| Feature | Array | Linked List |
|---|---|---|
| Definition | Collection of elements stored in indexed positions | Collection of nodes connected using references |
| Memory Allocation | Usually contiguous | Nodes can be non-contiguous |
| Size | Fixed in traditional arrays; dynamic arrays can resize | Dynamic |
| Access by Index | O(1) | O(n) |
| Searching | O(n) for unsorted arrays | O(n) |
| Insertion at Beginning | O(n) | O(1) |
| Insertion at End | O(1) amortized for dynamic arrays | O(n) without tail; O(1) with tail |
| Insertion in Middle | O(n) due to shifting | O(1) after locating the node; O(n) including traversal |
| Deletion at Beginning | O(n) due to shifting | O(1) |
| Deletion in Middle | O(n) due to shifting | O(1) when the required node and predecessor are known; O(n) including traversal |
| Deletion in End  | O(1) | O(1) when the tail and its predecessor are known; O(n) including traversal |
| Memory Overhead | Low | Higher due to references |
| Cache Performance | Generally better | Generally worse |
| Random Access | Supported | Not supported directly |
| Traversal | Forward; backward traversal is possible using indices | Forward in singly linked lists; both directions in doubly linked lists |
| Implementation | Simpler | More complex due to reference management |
| Best Use Case | Frequent indexed access | Frequent insertion/deletion at known positions |

### Key Takeaway

- **Array:** Best when you need fast indexed access and good cache performance.
- **Linked List:** Useful when you need frequent insertions and deletions at known positions without shifting elements.

## Stack

## 1. Short Notes (Quick Revision)

A **Linked List** is a linear data structure consisting of nodes. Each node stores data and a reference to another node. Unlike arrays, nodes do not need contiguous memory locations.

### Node Structure
- **Data:** Stores the value.
- **Next:** Stores the reference to the next node.
- **Head:** Points to the first node.
- **Tail:** Refers to the last node, if maintained.
- **NULL:** Indicates the end of a non-circular linked list.

Example:

`Head → 10 → 20 → 30 → NULL`

### Types of Linked Lists
1. **Singly Linked List:** Each node points to the next node.
2. **Doubly Linked List:** Each node has `prev` and `next` references.
3. **Circular Linked List:** The last node points back to the first node.
4. **Circular Doubly Linked List:** Nodes connect in both directions, forming a circle.

### Time Complexity

| Operation | Time Complexity |
|---|---|
| Access by index | O(n) |
| Search | O(n) |
| Insert at beginning | O(1) |
| Delete at beginning | O(1) |
| Insert at end (without tail) | O(n) |
| Insert after a known node | O(1) |
| Reverse a linked list | O(n) |

### Advantages
- Dynamic size.
- Efficient insertion and deletion at known positions.
- Does not require contiguous memory.

### Disadvantages
- No direct indexed access.
- Extra memory required for references.
- Sequential traversal is required.
- Pointer manipulation can be complex.

---

## 2. Detailed Notes

### 2.1 How a Linked List Works

A linked list stores elements in separate nodes connected through references.

For example:

`10 → 20 → 30 → NULL`

Each node points to the next node. The head stores a reference to the first node, and traversal continues until `NULL` is reached.

Unlike arrays, linked list nodes can be stored at different memory addresses.

### 2.2 Node Structure

A singly linked list node contains:

`[ Data | Next ]`

- `Data` stores the actual value.
- `Next` stores a reference to the next node.

The last node's `Next` is `NULL`.

### 2.3 Types of Linked Lists

**Singly Linked List**

Each node points to the next node. Traversal is possible only in the forward direction.

`10 → 20 → 30 → NULL`

**Doubly Linked List**

Each node contains references to both the previous and next nodes.

`NULL ← 10 ⇄ 20 ⇄ 30 → NULL`

It supports forward and backward traversal but requires extra memory.

**Circular Linked List**

The last node points back to the first node instead of pointing to `NULL`.

`10 → 20 → 30 → 10 ...`

**Circular Doubly Linked List**

Each node has previous and next references, and the first and last nodes are connected in both directions.

### 2.4 Array vs Linked List

| Feature | Array | Linked List |
|---|---|---|
| Memory | Usually contiguous | Nodes can be scattered |
| Indexed access | O(1) | O(n) |
| Search | O(n), generally | O(n) |
| Insert at beginning | O(n) | O(1) |
| Memory overhead | Usually lower | Higher due to references |
| Cache locality | Generally better | Generally worse |

**Key difference:** Arrays support fast indexed access, while linked lists support efficient insertion and deletion when the relevant node references are already available.

### 2.5 Basic Operations

**Traversal:** Start at the head and visit nodes one by one until `NULL` is reached. Time: O(n).

**Searching:** Compare each node's data with the target value. Time: O(n) in the worst case.

**Insertion at Beginning:**
1. Create a new node.
2. Point its `next` to the current head.
3. Update the head to the new node.

Time: O(1).

**Insertion at End:** Traverse to the last node and connect it to the new node. Time: O(n) without a tail reference; O(1) with a maintained tail reference.

**Deletion at Beginning:** Update the head to point to the second node. Time: O(1).

**Reversal:** Change the direction of each node's reference so that the last node becomes the new head. Iterative reversal takes O(n) time and O(1) auxiliary space.

### 2.6 Common Interview Problems

Practice these problems in order:

1. Traverse and search a linked list.
2. Insert and delete nodes.
3. Reverse a linked list.
4. Find the middle node using slow and fast pointers.
5. Detect a cycle using Floyd's cycle detection algorithm.
6. Find the k-th node from the end.
7. Merge two sorted linked lists.
8. Remove duplicates.
9. Find the intersection of two linked lists.
10. Check whether a linked list is a palindrome.

### 2.7 Applications

- Implementing stacks and queues.
- Browser navigation using linked structures.
- Music playlists.
- LRU cache implementation with a hash map and doubly linked list.
- Managing collections of dynamically allocated nodes.

### 2.8 Important Interview Points

- Understand `head`, `tail`, `next`, and `NULL`.
- Always handle empty lists and single-node lists.
- Update references in the correct order during insertion and deletion.
- Be careful not to lose the remaining list while reversing pointers.
- Know when an operation requires traversal.
- Distinguish time complexity from auxiliary space complexity.


## Queue

## 1. Short Notes (Quick Revision)

A **Queue** is a linear data structure that follows **FIFO (First In, First Out)**. The element inserted first is removed first.

**Example:** People standing in a ticket counter line.

### Basic Operations

| Operation | Description | Time |
|---|---|---|
| Enqueue | Insert at rear | O(1) |
| Dequeue | Remove from front | O(1) |
| Peek / Front | View first element | O(1) |
| isEmpty | Check if queue is empty | O(1) |
| Search | Find an element | O(n) |

### Types of Queues

1. **Simple Queue:** Follows FIFO.
2. **Circular Queue:** Reuses array space by connecting the last position logically to the first.
3. **Priority Queue:** Processes elements according to priority.
4. **Deque:** Allows insertion and deletion at both ends.

### Implementation

- **Array:** Uses an array and front/rear indices.
- **Linked List:** Uses nodes and front/rear pointers.

### Applications

- BFS (Breadth-First Search)
- CPU scheduling
- Printer job scheduling
- Request and message processing
- Data buffering

---

## 2. Detailed Notes

### What Is a Queue?

A queue is a linear data structure where insertion takes place at the **rear** and deletion takes place at the **front**.

Example:

`Front → [10, 20, 30] ← Rear`

- Enqueue 40: `[10, 20, 30, 40]`
- Dequeue: `[20, 30, 40]`

The element `10` is removed first because it was inserted first.

### Queue Operations

- **Enqueue(x):** Adds element `x` at the rear.
- **Dequeue():** Removes the front element.
- **Peek():** Returns the front element without removing it.
- **isEmpty():** Checks whether the queue contains any elements.
- **isFull():** Checks whether a fixed-capacity queue is full.

**Underflow:** Attempting to remove an element from an empty queue.

**Overflow:** Attempting to insert an element into a full, fixed-capacity queue.

### Types of Queues

#### 1. Simple Queue
Follows FIFO. Elements are inserted at the rear and removed from the front.

#### 2. Circular Queue
The last array position connects logically to the first position. This allows freed positions to be reused efficiently.

#### 3. Priority Queue
Elements are removed according to their priority rather than strictly by insertion order. Equal-priority elements may follow FIFO, depending on the implementation.

#### 4. Deque
A double-ended queue that supports insertion and deletion at both the front and rear.

### Queue Implementation

**Array-based Queue**
- Stores elements in contiguous array positions.
- Uses indices to track the front and rear.
- A simple linear implementation may waste space after deletions.
- A circular queue helps reuse available space.

**Linked-list-based Queue**
- Each node stores data and a reference to the next node.
- Maintains front and rear pointers.
- Enqueue and dequeue can both take O(1) time when these pointers are maintained properly.

### Time and Space Complexity

| Operation | Complexity |
|---|---|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peek | O(1) |
| isEmpty | O(1) |
| Search | O(n) |
| Space | O(n) |

*Note: These operation complexities assume an efficient implementation. Removing the first element by shifting array elements takes O(n).*

### Queue vs Stack

| Feature | Queue | Stack |
|---|---|---|
| Principle | FIFO | LIFO |
| Insertion | Rear | Top |
| Deletion | Front | Top |
| Example | People in a line | Stack of plates |
| Application | BFS | DFS |

### Important Applications

1. **BFS:** Explores graph or tree nodes level by level.
2. **Scheduling:** Manages tasks waiting for execution.
3. **Buffering:** Temporarily stores data during transfer.
4. **Message Queues:** Enables communication between services.
5. **Request Handling:** Holds requests waiting to be processed.

### Key Takeaways

- Queue follows FIFO.
- Enqueue inserts at the rear; dequeue removes from the front.
- Circular queues improve space reuse in array-based implementations.
- Priority queues process elements based on priority.
- Queues are essential for BFS and many scheduling problems.


## Tree Data Structure

A **tree** is a non-linear data structure that organizes data hierarchically. It consists of **nodes** connected by **edges**. Examples include folders and files on a computer, an organization chart, and the structure of an HTML document.

In a rooted tree, the top node is the **root**. Each node other than the root has exactly one **parent** and may have zero or more **children**. A node with no children is a **leaf**. A **subtree** is a node together with all its descendants. The **depth** of a node is the number of edges from the root to it; the **height** of a node is the number of edges on its longest path to a leaf. The tree's height is the height of its root. Some references count nodes instead of edges when defining height, so follow the convention used in a problem.


- **General tree:** A node can have any number of children. This is useful for representing hierarchies.
- **Binary tree:** Each node has at most two children. Many specialized trees use this structure.
- **Full binary tree:** Every node has either zero or two children.
- **Complete binary tree:** Every level is full except possibly the last, which is filled from left to right. Heaps have this shape.
- **Perfect binary tree:** Every internal node has two children, and all leaves are at the same depth.
- **Balanced binary tree:** The height is kept approximately logarithmic in the number of nodes, helping operations remain efficient. AVL and red-black trees are examples.
- **Binary search tree (BST):** Values in the left subtree follow the ordering rule for values smaller than the node, and values in the right subtree follow it for larger values. Search, insertion, and deletion take `O(h)`, where `h` is the height: typically `O(log n)` when balanced, but as much as `O(n)` when skewed.
- **Heap:** A complete binary tree following a heap-order rule. In a min-heap each parent is no greater than its children; in a max-heap each parent is no less. Heaps are commonly used to implement priority queues.
- **Trie (prefix tree):** Stores strings by sharing paths for common prefixes; useful for dictionaries and autocomplete.
- **B-tree and B+ tree:** Balanced multiway search trees that store multiple keys per node, commonly used in databases and file systems.
- **Segment tree and Fenwick tree:** Structures used for efficient range queries and updates on arrays. A Fenwick tree is also called a binary indexed tree.
- **N-ary tree:** Each node has at most `N` children.

### Tree Representation and Traversal

- **Preorder (root, left, right):** Visit a node before its children; useful for copying or serializing a tree.
- **Inorder (left, root, right):** In a BST, visits values in sorted order.
- **Postorder (left, right, root):** Visit children before their parent; useful when deleting a tree or evaluating an expression tree.
- **Level order:** Visit one level at a time using a queue; this is breadth-first search (BFS).

       / \
      2   3
     / \ / \
    4  5 6  7
       / \   \
      8  9   10
```

- Preorder: `1 2 4 5 8 9 3 6 7 10`
- Inorder: `4 2 8 5 9 1 6 3 7 10`
- Postorder: `4 8 9 5 2 6 10 7 3 1`
- Level order: `1 2 3 4 5 6 7 8 9 10`

**Depth-first search (DFS)** follows one branch as far as possible before backtracking. Preorder, inorder, and postorder are DFS traversal orders; DFS is typically implemented recursively or with a stack. 

**Breadth-first search (BFS)** visits nodes in order of their distance from the starting node, finishing one level before moving to the next. It uses a queue and is useful for finding the shortest path in an unweighted graph.

Traversing `n` nodes takes `O(n)` time. Recursive DFS uses `O(h)` call-stack space, where `h` is the tree height; BFS may use `O(n)` queue space.

## Heap

A **heap** is a specialized tree-based data structure that is always a **complete binary tree**. It follows a heap-order property:

- In a **min-heap**, every parent is less than or equal to its children.
- In a **max-heap**, every parent is greater than or equal to its children.

This means the root always stores the smallest value in a min-heap or the largest value in a max-heap. A heap is not fully sorted; it only guarantees the ordering between each node and its children.

Because the heap is complete, it can be stored very efficiently in an array:

- Parent of index `i` is at `(i - 1) / 2`
- Left child is at `2 * i + 1`
- Right child is at `2 * i + 2`

This array representation makes heap operations fast and memory-efficient.

Common heap operations:

- **Insert:** Add a value and restore heap order: `O(log n)`
- **Extract min / max:** Remove the root and rebuild the heap: `O(log n)`
- **Peek:** View the root without removing it: `O(1)`
- **Heapify:** Convert an array into a valid heap: `O(n)`

Heaps are mainly used for **priority queues**, where the highest-priority item is always at the root. They are also used in **heap sort** and in graph algorithms such as **Dijkstra's** and **Prim's**.

A heap is efficient because it stays balanced as a complete tree, so its height is only `O(log n)`.

## Min Heap Implementation

A simple heap can be implemented using an array, where the root is always at index `0` and child-parent relationships are computed with index math.
```java
import java.util.Arrays;

class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap() {
        this.heap = new int[10];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == heap.length) {
            resize();
        }

        heap[size] = value;
        int i = size;
        size++;

        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] <= heap[i]) {
                break;
            }
            swap(parent, i);
            i = parent;
        }
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return min;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest == i) {
            return;
        }

        swap(i, smallest);
        heapify(smallest);
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize() {
        int[] newHeap = new int[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }
}

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        int[] values = {5, 3, 8, 1, 9, 2};
        for (int value : values) {
            heap.insert(value);
        }

        System.out.println(heap.peek());
        System.out.println(heap.extractMin());
        heap.printHeap();
    }
}
```

This Java implementation has the same behavior:

- `insert`: `O(log n)`
- `extractMin`: `O(log n)`
- `peek`: `O(1)`
- `heapify` from an array: `O(n)`

## Max Heap Implementation

A max heap uses the same array representation, but keeps each parent greater than or equal to its children. The root is therefore the largest value.

```java
import java.util.Arrays;

class MaxHeap {
    private int[] heap = new int[10];
    private int size;

    public void insert(int value) {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, heap.length * 2);
        }

        int i = size++;
        heap[i] = value;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] >= heap[i]) {
                break;
            }
            swap(parent, i);
            i = parent;
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[--size];
        if (size > 0) {
            siftDown(0);
        }
        return max;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    private void siftDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }
            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }
            if (largest == i) {
                return;
            }

            swap(i, largest);
            i = largest;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
```

- `insert`: `O(log n)`
- `extractMax`: `O(log n)`
- `peek`: `O(1)`


