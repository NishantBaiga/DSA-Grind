# Time Complexity in DSA

## Contents

- [Time Complexity](#time-complexity-in-dsa)
    - [1. Quick Revision](#1-quick-revision)
    - [2. Detailed Explanation](#2-detailed-explanation)
    - [2.1 Constant Time — `O(1)`](#21-constant-time--o1)
    - [2.2 Linear Time — `O(n)`](#22-linear-time--on)
    - [2.3 Quadratic Time — `O(n²)`](#23-quadratic-time--on2)
    - [2.4 Cubic Time — `O(n³)`](#24-cubic-time--on3)
    - [2.5 Logarithmic Time — `O(log n)`](#25-logarithmic-time--olog-n)
    - [2.6 Linearithmic Time — `O(n log n)`](#26-linearithmic-time--on-log-n)
    - [3. Consecutive Loops](#3-consecutive-loops)
    - [4. Nested Loops: Multiplication vs. Summation](#4-nested-loops-multiplication-vs-summation)
    - [5. Simplifying Big O Expressions](#5-simplifying-big-o-expressions)
    - [6. Time Complexity of Recursion](#6-time-complexity-of-recursion)
    - [7. Best, Average, and Worst Case](#7-best-average-and-worst-case)
    - [8. Complexity of Common Data Structures](#8-complexity-of-common-data-structures)
    - [9. Sorting Algorithm Complexity](#9-sorting-algorithm-complexity)
    - [10. Common Mistakes](#10-common-mistakes)
    - [11. Interview Approach](#11-interview-approach)
- [Space Complexity](#space-complexity)
    - [1. Quick Revision](#1-quick-revision-1)
    - [2. Detailed Explanation](#2-detailed-explanation-1)
    - [2.1 Constant Space — `O(1)`](#21-constant-space--o1)
    - [2.2 Linear Space — `O(n)`](#22-linear-space--on)
    - [2.3 Quadratic Space — `O(n²)`](#23-quadratic-space--on2)
    - [2.4 Logarithmic Space — `O(log n)`](#24-logarithmic-space--olog-n)
    - [2.5 Recursive Space — `O(n)`](#25-recursive-space--on)
    - [3. Input Space vs. Auxiliary Space](#3-input-space-vs-auxiliary-space)
    - [4. Does a Loop Increase Space Complexity?](#4-does-a-loop-increase-space-complexity)
    - [5. Rules for Simplifying Space Complexity](#5-rules-for-simplifying-space-complexity)
    - [6. Common Interview Mistakes](#6-common-interview-mistakes)
    - [7. Interview Checklist](#7-interview-checklist)


# Time Complexity in DSA

## 1. Quick Revision

**Time Complexity** describes how the number of operations performed by an algorithm grows as the input size (`n`) increases.

We use **Big O notation** to express the growth rate of an algorithm.

### Common Time Complexities

| Time Complexity | Name | Example |
|---|---|---|
| `O(1)` | Constant | Accessing an array element |
| `O(log n)` | Logarithmic | Binary search |
| `O(n)` | Linear | Single loop |
| `O(n log n)` | Linearithmic | Merge sort |
| `O(n²)` | Quadratic | Two nested loops |
| `O(n³)` | Cubic | Three nested loops |
| `O(2ⁿ)` | Exponential | Recursive Fibonacci (naive) |
| `O(n!)` | Factorial | Generating all permutations |

### Rules to Find Time Complexity

1. **Constant operations:** `O(1)`
2. **Single loop running `n` times:** `O(n)`
3. **Nested loops:** Multiply iteration counts when each loop runs independently.
4. **Consecutive loops:** Add their complexities.
5. **Loop variable doubles or halves:** Often `O(log n)`.
6. **Drop constant factors:** `O(2n)` becomes `O(n)`.
7. **Keep the dominant term:** `O(n² + n)` becomes `O(n²)`.

---

## 2. Detailed Explanation

### 2.1 Constant Time — `O(1)`

The number of operations remains constant regardless of input size.

```cpp
int a = 10;
int b = 20;
int sum = a + b;
```

Even if the input size increases, these statements perform a fixed amount of work.

**Time Complexity:** `O(1)`

### 2.2 Linear Time — `O(n)`

The number of operations grows proportionally to the input size.

```cpp
for (int i = 0; i < n; i++) {
    cout << i << endl;
}
```

The loop executes `n` times.

If `n = 10`, it executes 10 times. If `n = 100`, it executes 100 times.

**Time Complexity:** `O(n)`

### 2.3 Quadratic Time — `O(n²)`

Quadratic complexity commonly occurs when one loop is nested inside another loop.

```cpp
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        cout << i << " " << j << endl;
    }
}
```

- Outer loop executes `n` times.
- Inner loop executes `n` times for each outer iteration.
- Total operations: `n × n = n²`.

**Time Complexity:** `O(n²)`

### 2.4 Cubic Time — `O(n³)`

Three nested loops, each executing `n` times, usually result in cubic complexity.

```cpp
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            cout << i << j << k;
        }
    }
}
```

Total operations: `n × n × n = n³`.

**Time Complexity:** `O(n³)`

### 2.5 Logarithmic Time — `O(log n)`

Logarithmic complexity occurs when the problem size is repeatedly divided by a constant factor.

```cpp
while (n > 1) {
    n /= 2;
}
```

For example, if `n = 16`, the values are:

`16 → 8 → 4 → 2 → 1`

The number of iterations is approximately `log₂(n)`.

**Time Complexity:** `O(log n)`

Another example is binary search on a sorted array.

### 2.6 Linearithmic Time — `O(n log n)`

This complexity often appears when an algorithm performs logarithmically many levels of work, with linear work at each level.

Common examples include merge sort and heap sort.

```cpp
for (int i = 1; i < n; i *= 2) {
    for (int j = 0; j < n; j++) {
        cout << j;
    }
}
```

- Outer loop: `O(log n)`
- Inner loop: `O(n)`
- Total: `O(n log n)`

**Time Complexity:** `O(n log n)`

---

## 3. Consecutive Loops

When loops execute one after another, add their complexities.

```cpp
for (int i = 0; i < n; i++) {
    cout << i;
}

for (int j = 0; j < n; j++) {
    cout << j;
}
```

Total operations:

`O(n) + O(n) = O(2n)`

Drop the constant factor:

**Time Complexity:** `O(n)`

Another example:

```cpp
for (int i = 0; i < n; i++) {
    cout << i;
}

for (int j = 0; j < n * n; j++) {
    cout << j;
}
```

Total complexity:

`O(n) + O(n²) = O(n²)`

The dominant term determines the final complexity.

---

## 4. Nested Loops: Multiplication vs. Summation

### Independent nested loops

```cpp
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        cout << i << j;
    }
}
```

Total operations: `n × n = n²`.

**Complexity:** `O(n²)`

### Dependent nested loops

```cpp
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        cout << j;
    }
}
```

The inner loop executes a different number of times for each outer iteration.

Total operations:

`0 + 1 + 2 + ... + (n - 1)`

Using the arithmetic series formula:

`n(n - 1) / 2`

After simplification:

**Complexity:** `O(n²)`

**Important:** Nested loops do not always mean `O(n²)`. Analyze the actual iteration counts.

---

## 5. Simplifying Big O Expressions

### Rule 1: Drop constant factors

`O(5n) = O(n)`

`O(100) = O(1)`

### Rule 2: Keep the dominant term

`O(n² + n) = O(n²)`

`O(n³ + n² + n) = O(n³)`

### Rule 3: Add consecutive operation costs

`O(n) + O(n²) = O(n²)`

### Rule 4: Multiply independent nested loop costs

`O(n) × O(n) = O(n²)`

These rules apply when simplifying asymptotic growth rates.

---

## 6. Time Complexity of Recursion

For recursive algorithms, analyze how many recursive calls are made and how much work occurs per call.

### Example 1: Recursion with one call

```cpp
void solve(int n) {
    if (n <= 0) return;
    solve(n - 1);
}
```

The function decreases `n` by one per call, resulting in approximately `n` calls.

**Time Complexity:** `O(n)`

### Example 2: Recursion with two calls

```cpp
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```

The function branches into two recursive calls, creating an exponentially growing recursion tree.

**Time Complexity:** `O(2ⁿ)` as a common upper bound.

---

## 7. Best, Average, and Worst Case

Time complexity can depend on the input.

Consider linear search:

```cpp
for (int i = 0; i < n; i++) {
    if (arr[i] == target) {
        return i;
    }
}
```

- **Best case:** The target is the first element — `O(1)`.
- **Average case:** The target is found after examining a proportional number of elements — `O(n)`.
- **Worst case:** The target is last or absent — `O(n)`.

Big O is commonly used to express an asymptotic upper bound, and in interviews it is often used when discussing worst-case complexity.

---


## 8. Complexity of Common Data Structures

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





### 9. Sorting Algorithm Complexity

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


## 10. Common Mistakes

1. Counting lines instead of counting operations as input size grows.
2. Assuming every nested loop is `O(n²)`.
3. Multiplying consecutive loops instead of adding their costs.
4. Forgetting that a loop that doubles its variable is often `O(log n)`.
5. Keeping constant factors, such as writing `O(2n)` instead of `O(n)`.
6. Ignoring recursion and the number of recursive calls.
7. Confusing time complexity with space complexity.

---

## 11. Interview Approach

When solving a DSA problem, follow these steps:

1. Identify the input size, usually `n`.
2. Analyze each loop and its iteration count.
3. Determine whether nested loops multiply or form a sum.
4. Add the costs of consecutive operations.
5. Analyze recursive calls, if any.
6. Simplify the expression by removing constants and lower-order terms.
7. State the final time complexity and explain why.

### Quick Examples

| Code Pattern | Time Complexity |
|---|---|
| Fixed number of operations | `O(1)` |
| One loop up to `n` | `O(n)` |
| Two consecutive loops up to `n` | `O(n)` |
| Two independent nested loops up to `n` | `O(n²)` |
| Three independent nested loops up to `n` | `O(n³)` |
| Repeatedly divide `n` by 2 | `O(log n)` |
| Linear loop inside a logarithmic loop | `O(n log n)` |
| Sum from `0` to `n - 1` | `O(n²)` |

**Final takeaway:** Time complexity measures how an algorithm's work grows with input size, not its exact execution time in seconds.


# Space Complexity

## 1. Quick Revision

**Space Complexity** is the amount of memory an algorithm requires as the input size grows.

**Auxiliary Space** is the extra memory used by an algorithm, excluding the input space (depending on the convention being used).

### Common Space Complexities

| Complexity | Description | Example |
|---|---|---|
| `O(1)` | Constant space | Using a fixed number of variables |
| `O(log n)` | Logarithmic space | Recursive binary search |
| `O(n)` | Linear space | Creating an array of size `n` |
| `O(n²)` | Quadratic space | Creating an `n × n` matrix |

### How to Find Space Complexity

1. Identify the input size, usually represented by `n`.
2. Identify extra memory allocations, such as variables, arrays, maps, and recursion stacks.
3. Determine how the memory usage grows with the input size.
4. Express the growth using Big O notation.
5. Ignore constant factors and lower-order terms.

**Important:** A loop does not automatically increase space complexity. Count the memory used, not the number of iterations.

---

## 2. Detailed Explanation

### 2.1 Constant Space — `O(1)`

The algorithm uses a fixed amount of extra memory, regardless of the input size.

```cpp
int sum(int a, int b) {
    int result = a + b;
    return result;
}
```

**Analysis:**
- Uses a fixed number of variables.
- No additional data structure grows with the input size.

**Space Complexity:** `O(1)`

### 2.2 Linear Space — `O(n)`

Memory usage grows proportionally to the input size.

```cpp
vector<int> copyArray(vector<int>& arr) {
    vector<int> result;

    for (int i = 0; i < arr.size(); i++) {
        result.push_back(arr[i]);
    }

    return result;
}
```

**Analysis:**
- If the input contains `n` elements, the new vector stores `n` elements.
- The loop variable requires constant space.

Total auxiliary space: `O(n)`

### 2.3 Quadratic Space — `O(n²)`

Memory usage grows proportionally to the square of the input size.

```cpp
vector<vector<int>> createMatrix(int n) {
    vector<vector<int>> matrix(
        n, vector<int>(n, 0)
    );

    return matrix;
}
```

**Analysis:**

The matrix contains `n` rows and `n` columns.

Space = `n × n` = `n²`

**Space Complexity:** `O(n²)`

### 2.4 Logarithmic Space — `O(log n)`

Memory usage can be logarithmic when recursive calls reduce the problem size by a constant factor.

```cpp
int binarySearch(int arr[], int low, int high, int target) {
    if (low > high) return -1;

    int mid = low + (high - low) / 2;

    if (arr[mid] == target) return mid;

    if (arr[mid] > target)
        return binarySearch(arr, low, mid - 1, target);

    return binarySearch(arr, mid + 1, high, target);
}
```

**Analysis:**
- Each recursive call reduces the search range approximately by half.
- The maximum recursion depth is `O(log n)`.
- Each call uses constant additional memory.

**Auxiliary Space:** `O(log n)`

An iterative binary search, by contrast, uses `O(1)` auxiliary space.

### 2.5 Recursive Space — `O(n)`

```cpp
int factorial(int n) {
    if (n <= 1) return 1;

    return n * factorial(n - 1);
}
```

**Analysis:**
- Each call reduces `n` by one.
- Approximately `n` calls can remain on the call stack.
- Each call uses constant local memory.

**Auxiliary Space:** `O(n)`

---

## 3. Input Space vs. Auxiliary Space

### Input Space

Memory occupied by the input provided to the algorithm.

### Auxiliary Space

Additional memory required by the algorithm to solve the problem, excluding the input itself.

Example:

```cpp
int findMax(vector<int>& arr) {
    int maximum = arr[0];

    for (int x : arr) {
        maximum = max(maximum, x);
    }

    return maximum;
}
```

**Analysis:**
- The input array contains `n` elements.
- The algorithm uses only a fixed number of additional variables.
- It does not create another array.

| Measurement | Complexity |
|---|---|
| Auxiliary space | `O(1)` |
| Total space including the input array | `O(n)` |

In interviews, clarify whether the input memory is included when the question is ambiguous.

---

## 4. Does a Loop Increase Space Complexity?

No. A loop affects time complexity according to its iterations, but space complexity depends on memory allocation.

| Code Pattern | Space Complexity | Reason |
|---|---|---|
| One loop with a fixed number of variables | `O(1)` | Variables do not grow with `n` |
| One loop that stores `n` elements | `O(n)` | A collection grows with the input |
| Two nested loops without growing storage | `O(1)` | Only a fixed number of variables are used |
| An `n × n` matrix | `O(n²)` | Stores `n²` elements |
| Recursion reducing `n` by one | Often `O(n)` | Linear recursion depth |
| Recursion reducing `n` by half | Often `O(log n)` | Logarithmic recursion depth |

These examples assume constant-size variables and no other growing allocations.

---

## 5. Rules for Simplifying Space Complexity

Big O notation describes the growth rate of memory usage.

- Ignore constant factors: `O(2n)` → `O(n)`
- Ignore lower-order terms: `O(n² + n)` → `O(n²)`
- Combine independent allocations by addition: `O(n) + O(n)` → `O(n)`
- Nested data structures may multiply: an `n × n` matrix requires `O(n²)` space.

### Example

If an algorithm allocates an array of size `n` and also uses a fixed number of variables:

Total auxiliary space = `O(n) + O(1)` = `O(n)`

---

## 6. Common Interview Mistakes

1. **Counting loop iterations instead of memory:** Two nested loops can have `O(n²)` time and `O(1)` auxiliary space.
2. **Ignoring recursion stacks:** Recursive calls consume memory even if no new array is created.
3. **Confusing input space with auxiliary space:** An algorithm may process an existing array without allocating another one.
4. **Ignoring dynamically growing collections:** A vector, map, set, or list can consume additional memory proportional to its contents.
5. **Assuming every recursive algorithm uses `O(n)` space:** Space depends on recursion depth and the memory used by each call.

---

## 7. Interview Checklist

When analyzing an algorithm, ask:

- What is the input size (`n`)?
- Are any new arrays, strings, maps, sets, or other data structures created?
- How many elements can these structures store?
- Is recursion used? What is the maximum call-stack depth?
- Are variables fixed in number, or does their number grow with `n`?
- Am I calculating auxiliary space or total space?

### Final Rule

**Space complexity measures how memory usage grows with input size, not how many operations the algorithm performs.**



