# DSA Notes 

## Data and Information

- **Data** is a collection of raw facts or observations that may not have meaning on their own. Examples include numbers, names, dates, and measurements.
- **Information** is data that has been organized or processed to make it meaningful and useful.

**Example:** `18, 20, 22` is data. “The average age is 20” is information derived from that data.

## Structure

- **Structure** refers to the way data is organized and arranged in memory or storage so it can be processed efficiently.
- Different structures are used for different purposes, such as storing data, retrieving it quickly, or maintaining relationships between items.
- Common data structures include arrays, linked lists, stacks, queues, trees, graphs, and hash tables.

**Example:** An array stores values in a fixed order, while a linked list stores values with pointers to the next item. The choice of structure affects how fast operations like search, insertion, and deletion are performed.


## What Is an Algorithm?

An algorithm is a step-by-step procedure or set of instructions used to solve a problem or complete a task. It defines the exact sequence of operations to take input and produce the required output.

Algorithms are usually:

- Well-defined: each step is clear and precise.
- Finite: they stop after a certain number of steps.
- Efficient: they aim to use as little time and memory as possible.

**Example:** Sorting numbers in ascending order using bubble sort or merge sort is an algorithm.

## What Is DSA?

**DSA** stands for **Data Structures and Algorithms**. Data structures organize and store data, while algorithms are step-by-step methods for solving problems or processing data.

## Why Study DSA?

- To solve problems efficiently by choosing approaches that use less time and memory.
- To understand how to store, search, and update data effectively.
- To compare different solutions and choose the right one for a task.
- To build a strong programming foundation; DSA concepts apply across languages and are commonly assessed in technical interviews.

## Uses of DSA

DSA is used in databases, search engines, route planning, operating systems, file systems, and applications that process large amounts of data. For example, map applications can use graph algorithms to find routes, while search engines use data structures to retrieve results quickly.

## DSA Classification

Data structures are generally classified into two main categories:

### 1. Primitive Data Structures

- These are the basic data types provided by a programming language.
- They store simple values and are directly supported by the language.
- Examples include:
  - `int`
  - `float`
  - `char`
  - `bool`

These are used to represent single values such as numbers, characters, or true/false conditions.

#### Types of Primitive Data Structures

- **Integer (`int`)**: Stores whole numbers, such as `-5`, `0`, and `42`.
- **Floating-point (`float` or `double`)**: Stores numbers with fractional parts, such as `3.14`. `double` usually offers more precision than `float`.
- **Character (`char`)**: Stores a single character, such as `'A'` or `'7'`.
- **Boolean (`bool`)**: Stores a truth value, usually `true` or `false`.

Primitive type names and ranges vary by programming language. Each holds a simple value rather than a collection of elements.

### 2. Non-Primitive Data Structures

- These are more complex data structures built using primitive data types.
- They are used to store collections of related data and represent relationships between elements.
- Examples include:
  - Arrays
  - Linked Lists
  - Stacks
  - Queues
  - Trees
  - Graphs
  - Hash Tables

Non-primitive structures are further divided into:

- Linear data structures: array, stack, queue, linked list
- Non-linear data structures: tree, graph

### Linear Data Structures

Elements are arranged in a sequence, and traversal generally proceeds from one element to the next.

- **Array**: Holds elements at indexed positions, often in contiguous memory.
- **Linked list**: Holds elements in nodes connected by links. A node usually points to the next node; some lists also link to the previous node.
- **Stack**: Follows **last in, first out (LIFO)**. Items are added and removed at the top.
- **Queue**: Follows **first in, first out (FIFO)**. Items are added at the back and removed from the front.

### Non-Linear Data Structures

Elements are not arranged in one simple sequence. They can have relationships with multiple other elements, forming hierarchical or network-like arrangements.

- **Tree**: Organizes nodes hierarchically, often through parent-child relationships. Binary trees and heaps are examples.
- **Graph**: Consists of vertices (nodes) and edges (connections), and can represent roads or social networks.
- **Hash table**: Stores key-value pairs and uses a hash function to help locate values. It is commonly grouped with non-linear structures, though implementations can use arrays or linked lists.

Use linear structures for sequential data, trees for hierarchies, and graphs for general connections. The best choice depends on the data and the operations required.

### Why This Classification Matters

Primitive data structures are used for simple single values, while non-primitive data structures are used to organize and manage large sets of data efficiently. Understanding this classification helps in choosing the right structure for a problem and improves problem-solving in DSA.

## Time Complexity

Time complexity describes how the running time of an algorithm grows as the size of the input increases. It helps us compare algorithms without depending on the speed of a specific machine.

It is commonly written using Big O notation:

- `O(1)` = constant time; execution time stays the same even if input size increases.
- `O(log n)` = logarithmic time; the time grows very slowly.
- `O(n)` = linear time; the time grows directly with input size.
- `O(n log n)` = common in efficient sorting algorithms like merge sort.
- `O(n^2)` = quadratic time; the time grows quickly as input size increases.

### Example

If an algorithm checks each item in a list once, it is `O(n)`. If it compares each item with every other item, it may become `O(n^2)`.

Time complexity is important because it helps us choose efficient solutions, especially when dealing with large amounts of data.

### Why Do We Use Time Complexity?

- To understand how an algorithm's running time grows as the input size increases.
- To compare algorithms without relying on a specific computer or programming language.
- To spot approaches that may become too slow for large inputs.
- To choose an efficient solution when multiple algorithms solve the same problem.

Time complexity describes growth in the number of operations, not an exact runtime in seconds. Actual runtime also depends on factors such as hardware and implementation.





## How to Find Time Complexity

Use these steps to estimate an algorithm's time complexity:

1. **Identify the input size.** Use `n` for one input, or use separate variables (such as `n` and `m`) for inputs of different sizes.
2. **Count the work that grows with the input.** Focus on basic operations such as comparisons, assignments, and arithmetic. Constant-time operations do not affect the final growth rate.
3. **Analyze loops.** A loop that runs `n` times is `O(n)`. Nested loops multiply their iteration counts, so two `n`-iteration loops nested together are `O(n^2)`. Consecutive loops add their costs.
4. **Analyze conditionals.** For worst-case complexity, consider the more expensive branch. Add the cost of evaluating the condition if it grows with the input.
5. **Analyze recursion.** Express the work using a recurrence and solve it. For example, `T(n) = T(n - 1) + O(1)` gives `O(n)`.
6. **Keep the dominant term.** Drop constant factors and lower-order terms: `3n^2 + 5n + 2` simplifies to `O(n^2)`. Specify best, average, or worst case when relevant.

**Example:** Two separate loops that each run `n` times take `O(n) + O(n) = O(n)`. If one loop is nested inside the other, they take `O(n * n) = O(n^2)`.

## Time Complexity Cheat Sheet

### 1. Big-O Notation at a Glance

Big O notation tells us how the runtime of an algorithm grows as the input size increases. It focuses on the dominant growth rate and ignores constant factors.

Common complexity classes:

- `O(1)` — Constant time
  - Runtime does not change with input size.
  - Examples: array indexing, stack push/pop, hash map lookup (average case)

- `O(log n)` — Logarithmic time
  - Runtime grows very slowly.
  - Examples: binary search, balanced tree search

- `O(sqrt n)` — Square-root time
  - Seen in some number theory and optimization problems.

- `O(n)` — Linear time
  - Runtime grows directly with input size.
  - Examples: scanning a list, finding the maximum value

- `O(n log n)` — Linearithmic time
  - Very efficient for larger datasets.
  - Examples: merge sort, heap sort, quicksort (average case)

- `O(n^2)` — Quadratic time
  - Runtime grows as the square of input size.
  - Examples: nested loops, bubble sort, insertion sort, selection sort

- `O(n^3)` — Cubic time
  - Common in triple nested loops and matrix multiplication

- `O(2^n)` — Exponential time
  - Grows extremely fast.
  - Examples: recursive Fibonacci without memoization, subset generation

- `O(n!)` — Factorial time
  - Practically impossible for large input sizes.
  - Examples: brute-force permutation generation

### 2. Quick Rules for Simplifying Complexity

#### Rule 1: Ignore constants

If an algorithm does 3 passes over `n` items, it is still `O(n)`, not `O(3n)`.

```python
for i in range(n):
    print(i)

for j in range(n):
    print(j)
```

This is `O(n + n) = O(2n) = O(n)`.

#### Rule 2: Ignore lower-order terms

`O(n^2 + n + 10)` becomes `O(n^2)`.

`O(n log n + n)` becomes `O(n log n)`.

#### Rule 3: Sequential loops add

If one loop takes `O(n)` and another loop takes `O(n)`, and they run one after the other, total cost is still `O(n)`.

```python
for i in range(n):
    print(i)

for j in range(n):
    print(j)
```

Total: `O(n + n) = O(n)`

#### Rule 4: Nested loops multiply

A loop inside another loop multiplies the work.

```python
for i in range(n):
    for j in range(n):
        print(i, j)
```

This is `O(n * n) = O(n^2)`.

#### Rule 5: If/else uses the worst branch

```python
if condition:
    do_linear_work()
else:
    do_quadratic_work()
```

Worst-case complexity is `O(max(O(n), O(n^2))) = O(n^2)`.

#### Rule 6: Recursive algorithms need recurrence analysis

```python
def countdown(n):
    if n == 0:
        return
    countdown(n - 1)
```

This is `O(n)` because each recursive call reduces `n` by 1.

### 3. Common Complexity Patterns

#### Single loop

```python
for i in range(n):
    print(i)
```

Time: `O(n)`

#### Two loops one after another

```python
for i in range(n):
    print(i)

for j in range(n):
    print(j)
```

Time: `O(n)`

#### Nested loops

```python
for i in range(n):
    for j in range(n):
        print(i, j)
```

Time: `O(n^2)`

#### Loop with halving each time

```python
i = n
while i > 0:
    i //= 2
```

This runs `log2(n)` times.

Time: `O(log n)`

#### Loop with doubling each time

```python
i = 1
while i < n:
    i *= 2
```

Also runs in `O(log n)` time.

### 4. Complexity of Common Data Structures

#### Array

- Access by index: `O(1)`
- Search by value: `O(n)`
- Insert at end: `O(1)` amortized
- Insert in middle: `O(n)`
- Delete from middle: `O(n)`

#### Linked List

- Search: `O(n)`
- Insert at head: `O(1)`
- Insert at tail: `O(1)` if tail pointer exists
- Delete by value: `O(n)`

#### Stack

- Push: `O(1)`
- Pop: `O(1)`
- Peek: `O(1)`

#### Queue

- Enqueue: `O(1)`
- Dequeue: `O(1)`
- Front/Rear access: `O(1)`

#### Hash Table / Hash Map

Average case:

- Insert: `O(1)`
- Search: `O(1)`
- Delete: `O(1)`

Worst case (due to collisions): `O(n)`

#### Binary Search Tree (BST)

- Search: `O(h)`
- Insert: `O(h)`
- Delete: `O(h)`

Where `h` is the tree height.

- Balanced BST: `O(log n)`
- Unbalanced BST: `O(n)`

#### Heap

- Insert: `O(log n)`
- Extract min/max: `O(log n)`
- Peek: `O(1)`

#### Graph

- DFS: `O(V + E)`
- BFS: `O(V + E)`
- Dijkstra: `O((V + E) log V)`
- Floyd-Warshall: `O(V^3)`

Where:

- `V` = number of vertices
- `E` = number of edges

### 5. Sorting Algorithm Complexity

| Algorithm | Best Case | Average Case | Worst Case |
| --- | --- | --- | --- |
| Bubble Sort | `O(n)` | `O(n^2)` | `O(n^2)` |
| Selection Sort | `O(n^2)` | `O(n^2)` | `O(n^2)` |
| Insertion Sort | `O(n)` | `O(n^2)` | `O(n^2)` |
| Merge Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` |
| Quick Sort | `O(n log n)` | `O(n log n)` | `O(n^2)` |
| Heap Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` |
| Counting Sort | `O(n + k)` | `O(n + k)` | `O(n + k)` |
| Radix Sort | `O(nk)` | `O(nk)` | `O(nk)` |

### 6. Recursion and Complexity

Recursion often creates a tree of calls. The time complexity depends on the branching factor and the depth of recursion.

#### Linear recursion

```python
def countdown(n):
    if n == 0:
        return
    countdown(n - 1)
```

Time: `O(n)`
Space: `O(n)` due to recursion stack

#### Binary recursion

```python
def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)
```

This is exponential.

Time: `O(2^n)`

#### Divide and conquer recursion

```python
def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    return merge(left, right)
```

Time: `O(n log n)`

### 7. Best, Average, and Worst Case

An algorithm can have different complexities for different inputs.

- Best case: minimum possible runtime
- Average case: typical runtime over many inputs
- Worst case: maximum possible runtime

Example: Linear Search

- Best case: `O(1)`
- Average case: `O(n)`
- Worst case: `O(n)`

Example: Quick Sort

- Best case: `O(n log n)`
- Average case: `O(n log n)`
- Worst case: `O(n^2)`

### 8. Space Complexity

Space complexity measures the extra memory needed by an algorithm.

- `O(1)` — constant extra memory
- `O(log n)` — recursion in divide-and-conquer algorithms
- `O(n)` — storing a list, stack, or recursion stack
- `O(n^2)` — 2D matrix or dynamic programming table

Example:

```python
arr = [0] * n
```

Space: `O(n)`

### 9. How to Estimate Time Complexity Quickly

Use this checklist:

1. Identify the input size, usually `n`
2. Look for loops and count how many times they run
3. Check whether loops are nested or sequential
4. Analyze recursion and divide-and-conquer patterns
5. Ignore constants and smaller terms
6. Keep the dominant term

Examples:

- `3n + 5` → `O(n)`
- `n^2 + 4n + 7` → `O(n^2)`
- `5n log n + 2n` → `O(n log n)`
- `2^n + n^10` → `O(2^n)`
- `n + n log n + 1000` → `O(n log n)`

### 10. Real-World Interpretation

Time complexity helps answer:

- Does this algorithm scale for large inputs?
- Which solution is more efficient?
- Is a brute-force approach too slow?
- Should I use a hash map, BST, array, or graph structure?

A solution with `O(n^2)` might still be fine for small datasets, but `O(2^n)` or `O(n!)` is usually not acceptable for large inputs.

### 11. Very Short Cheat Sheet

- Single loop: `O(n)`
- Nested loops: `O(n^2)`
- Binary search: `O(log n)`
- Merge sort: `O(n log n)`
- Bubble sort: `O(n^2)`
- Hash map lookup: average `O(1)`
- DFS/BFS: `O(V + E)`
- Recursive Fibonacci: `O(2^n)`
- Permutations: `O(n!)`

### 12. Final Rule of Thumb

- If you scan a list once: `O(n)`
- If you halve or double the size repeatedly: `O(log n)`
- If you combine two loops: usually `O(n)`
- If you loop inside another loop: often `O(n^2)`
- If you divide the problem into halves: usually `O(n log n)`
- If you explore all possible combinations: likely exponential or factorial

Understanding time complexity is essential for choosing efficient algorithms and writing scalable code.

## Search Algorithms

A **search algorithm** finds whether a target value exists in a collection and, when it does, returns its position or the matching item. The collection may be an array, string, tree, graph, or other data structure.

### Types of Search

- **Linear (sequential) search** checks items one at a time. It works with unsorted data and most collection types.
- **Binary search** repeatedly halves the search range. It requires the data to be sorted (or a search space with a monotonic condition).
- Other approaches include **hash-based lookup** and graph/tree searches such as **DFS** and **BFS**.

### Linear Search

Start at the first item and compare each item with the target until it is found or the collection ends.

```java
public static int linearSearch(int[] items, int target) {
    for (int i = 0; i < items.length; i++) {
        if (items[i] == target) {
            return i;
        }
    }
    return -1;
}
```

- Works on sorted or unsorted data.
- Time: `O(n)` worst and average; `O(1)` best when the first item matches.
- Extra space: `O(1)`.

### Binary Search

Compare the target with the middle item of a **sorted** collection. If they differ, discard the half that cannot contain the target and repeat on the remaining half.

```java
public static int binarySearch(int[] items, int target) {
    int left = 0;
    int right = items.length - 1;

    while (left <= right) {
        int middle = left + (right - left) / 2;

        if (items[middle] == target) {
            return middle;
        }
        if (items[middle] < target) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
    }

    return -1;
}
```

- Requires sorted data and efficient access to the middle item, as in an array.
- Time: `O(log n)`; extra space: `O(1)` for this iterative version.
- For example, searching for `7` in `[1, 3, 5, 7, 9]` checks the middle value `5`, then searches the right half and finds `7`.

Use linear search for small or unsorted collections. Use binary search when data is sorted and you need faster repeated lookups; include the cost of sorting if the data is not already sorted.

### Lower Bound and Upper Bound

Lower and upper bound searches find insertion positions in sorted data, including when the target occurs more than once:

- **Lower bound** returns the first index whose value is greater than or equal to the target.
- **Upper bound** returns the first index whose value is strictly greater than the target.

Both return `items.length` if no such index exists. The half-open search range `[left, right)` makes that end position a valid result.

```java
public static int lowerBound(int[] items, int target) {
    int left = 0;
    int right = items.length;

    while (left < right) {
        int middle = left + (right - left) / 2;
        if (items[middle] < target) {
            left = middle + 1;
        } else {
            right = middle;
        }
    }
    return left;
}

public static int upperBound(int[] items, int target) {
    int left = 0;
    int right = items.length;

    while (left < right) {
        int middle = left + (right - left) / 2;
        if (items[middle] <= target) {
            left = middle + 1;
        } else {
            right = middle;
        }
    }
    return left;
}
```

For `[1, 3, 3, 3, 5]` and target `3`, the lower bound is `1` and the upper bound is `4`. Thus, the target's matching range is `[lowerBound, upperBound)`, and its count is `upperBound - lowerBound`. Each search takes `O(log n)` time and `O(1)` extra space.



## Sorting Algorithms

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


## DSA Patterns: 25 Common Approaches

DSA patterns are reusable problem-solving techniques. Recognizing a pattern helps you choose an efficient approach to a new problem.

1. **Two Pointers** — Move two indices through an array or string, often from opposite ends.
2. **Sliding Window** — Track a contiguous subarray or substring with a window that expands or contracts.  
**Kadens's Algo**
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








