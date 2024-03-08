| Solved within time limit | Optimal solution | First Attempt Date |
|--------------------------|------------------|--------------------|
| ✅                        | ✅                | 03/07/2024         |

## What I did right
Correctly identified the need for two separate data structures to reach the required runtime. A `Map` to store the frequency, and a `Heap` to efficiently order.

## What needs improvement
Java idiomatic code. I originally used a class `Element` with members `int value; int frequency`. Also used an overly verbose custom definition of `Comparator`.
Remember `Comparator.comparingInt`, and how lambdas seem to "cascade". Line `24` works because `PriorityQueue`'s `Comparator` ultimately looks something like `comparingInt(c1,c2) { return Integer.compare(m.get(c1), m.get(c2)); }`.
