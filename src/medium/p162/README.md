
| Solved within time limit | Optimal Solution | Attempt Date |
| ------------------------ | ---------------- | ------------ |
| 🟥                       | 🟥               | 03/08/2024   |
For this problem, looking for a `O(logN)` solution stumped me. I understood we were looking for some form of binary search implementation, but I could not find the right heuristic within the time limit. 

I should’ve focused more on “**_how_ is a peak formed?**”. Due to out of bound elements counting as `-∞`, any slope will eventually become a peak. So the heuristic to implement binary search, is to follow the slope.
