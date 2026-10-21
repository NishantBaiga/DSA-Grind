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

- **Integer (`int`)**: Stores whole numbers, such as `-5`, `0`, and `42`.
- **Floating-point (`float` or `double`)**: Stores numbers with fractional parts, such as `3.14`. `double` usually offers more precision than `float`.
- **Character (`char`)**: Stores a single character, such as `'A'` or `'7'`.
- **Boolean (`bool`)**: Stores a truth value, usually `true` or `false`.
- These are more complex data structures built using primitive data types.
- They are used to store collections of related data and represent relationships between elements.
- Examples include:
  - Arrays
  - Linked Lists
  - Stacks
  - Queues
  - Strings
  - Trees
  - Graphs
  - Hash Tables and HashMap
  - Heap

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

# Search Algorithms

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

# Recursion

**Recursion** is a way to solve a problem by having a function call itself on a smaller version of the same problem. Each call handles one part of the problem. The calls stop when they reach a simple case that can be answered directly.

## The Parts of Recursion

A recursive function usually has two important parts:

1. **Base case:** The stopping condition. It gives an answer directly without another recursive call. Every path through the function must eventually reach a base case. Without one, the function keeps calling itself until the program runs out of stack space.
2. **Recursive case:** The part that calls the function again with a smaller or simpler input. Each call must move closer to the base case.

For example, the factorial of a non-negative number `n` is the product of the positive numbers up to `n`. We define `factorial(0) = 1`; for a number greater than zero, `factorial(n) = n * factorial(n - 1)`:

```text
factorial(n):
        if n == 0:                 // base case
                return 1
        return n * factorial(n-1)  // recursive case
```

For `factorial(3)`, the calls and results are:

```text
factorial(3) = 3 * factorial(2)
                         = 3 * 2 * factorial(1)
                         = 3 * 2 * 1 * factorial(0)
                         = 3 * 2 * 1 * 1
                         = 6
```

The function first calls itself with smaller values until it reaches the base case. Then the calls return their answers one by one. This return process is often called **unwinding**.

## How Recursion Works Under the Hood

When a function calls itself, the computer saves the current call and starts a new one. The saved calls are kept in memory in an area called the **call stack**. Each active call has a stack frame containing information such as its input, local variables, and where to continue when the next call returns.

For `factorial(3)`, the stack grows and then unwinds like this:

```text
factorial(3) waits for factorial(2)
    factorial(2) waits for factorial(1)
        factorial(1) waits for factorial(0)
            factorial(0) returns 1
        factorial(1) returns 1 * 1 = 1
    factorial(2) returns 2 * 1 = 2
factorial(3) returns 3 * 2 = 6
```

When a call returns, its stack frame is removed and the waiting call continues. A large number of active calls can use too much stack space and cause a **stack overflow**. Recursion therefore uses memory for its active calls, in addition to any memory used by the problem's data.

## Common Uses of Recursion

- **Trees:** Process a node and its smaller child trees. Preorder, inorder, and postorder tree traversals are common examples.
- **Divide and conquer:** Split a problem into smaller problems, solve them, and combine their answers. Merge sort and quick sort use this idea.
- **Graphs:** Explore paths or connected areas with depth-first search (DFS). A visited set is usually needed to avoid following cycles repeatedly.
- **Backtracking:** Try a choice, continue, and undo the choice when it does not lead to a solution. This is useful for puzzles and for generating combinations.
- **Mathematical problems:** Some definitions, such as factorial, describe an answer using a smaller input. A simple recursive Fibonacci solution repeats work, so memoization or a loop is more efficient for that problem.

Recursion is useful when a problem naturally consists of smaller versions of itself. For simple repeated steps, a loop may be easier to understand and may use less stack space. When writing recursion, make sure the base case is correct and every recursive call gets closer to it.

### Cons of Recursion

- **Extra memory use:** Each active call needs a stack frame, so deep recursion can use substantial memory or cause a stack overflow.
- **Function-call overhead:** Repeated calls can make recursion slower than an equivalent loop for simple tasks.
- **Repeated work:** A recursive solution may recompute the same results, as a basic Fibonacci implementation does. Memoization can avoid this in suitable problems.
- **Harder to trace:** Nested calls and returns can make bugs and control flow more difficult to follow.

# Data Structures 



## Array Data Structure

An **array** is a linear data structure that stores elements in an ordered sequence. Each element is identified by an integer **index**. In a typical array, elements are stored in contiguous memory locations, allowing the computer to calculate an element's position directly from its index.

With zero-based indexing, the first element is `arr[0]` and the element at index `i` is `arr[i]`. For an array of length `n`, valid indices range from `0` to `n - 1`.

### Common Operations and Time Complexity

| Operation | Time complexity | Explanation |
|---|---:|---|
| Access or update by index | `O(1)` | The position is calculated directly. |
| Traverse all elements | `O(n)` | Each element is visited once. |
| Search an unsorted array | `O(n)` | In the worst case, every element is checked. |
| Search a sorted array | `O(log n)` | Binary search works because indexed access is fast. |
| Insert or delete at the end | `O(1)` amortized for a dynamic array | Resizing may occasionally require `O(n)` time. |
| Insert or delete at the beginning or middle | `O(n)` | Other elements usually need to shift. |

### Static and Dynamic Arrays

- **Static array:** Has a fixed capacity. To exceed it, a new array must be created and the elements copied.
- **Dynamic array:** Grows its capacity when needed. Python lists, Java `ArrayList`, and C++ `vector` are examples. Appending is typically `O(1)` amortized, though an occasional resize takes `O(n)` time.

### Advantages and Limitations

- Provides fast indexed access and efficient traversal.
- Contiguous storage often gives good cache locality.
- Inserting or removing elements in the middle can be slow because elements must shift.
- Resizing a dynamic array can require allocating new storage and copying elements.

Arrays are useful when order and indexed access matter. They are also building blocks for structures such as heaps, hash tables, and matrices. A **multidimensional array** uses multiple indices, for example `matrix[row][column]` in a two-dimensional array.

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


## Linked List 




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


