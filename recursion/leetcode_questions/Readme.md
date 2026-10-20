# Recursion — LeetCode Problems

## Progress

- **Solved:** 1
- **Revision needed:** 1

## Problems

| #   | Problem                                                             | Difficulty | Status | Approach  | Solution                        |
| --- | ------------------------------------------------------------------- | ---------- | ------ | --------- | ------------------------------- |
| 509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Easy       | Solved | Recursion | [Review](#509-fibonacci-number) |

---

## 509. Fibonacci Number

- **Problem:** [LeetCode 509](https://leetcode.com/problems/fibonacci-number/)
- **Difficulty:** Easy
- **Status:** Solved
- **Pattern:** Recursion
- **Time Complexity:** O(2ⁿ) for naive recursion
- **Space Complexity:** O(n) recursion stack

### Approach

Base cases: `fib(0) = 0` and `fib(1) = 1`.

For all other values:
`fib(n) = fib(n - 1) + fib(n - 2)`

### What I Learned

- Difference between returning a Fibonacci number and printing a sequence.
- How base cases stop recursive calls.
- Why naive recursion repeats calculations.

### Revision Notes

- [ ] Solve again without looking at the solution.
- [ ] Understand the recursion tree.
- [ ] Optimize using memoization or iteration.
