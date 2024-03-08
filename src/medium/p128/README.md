| Solved within time limit | Optimal solution | First Attempt Date |
|--------------------------|------------------|--------------------|
| ✅                        | 🟥               | 03/07/2024         |

Due to a lot of tinkering with IntelliJ and Neovim, I ran up the clock on this problem.

## What I did right
Recognizing that a desired `O(N)` runtime indicated certain limitations -> No sorting the array, no sort-on-insertion data structures.

## Major Mistakes
**Iterating**: Frustration + distraction due to technical problems led to breaking my "workflow". Need to be "reinforce" my mental fortitude to ensure I can re-focus and continue explaining my thought process out loud (I look crazy alone in my room) and drafting visualizations of my ideas.

**Runtime limitations != space limitations**: Another pitfall of the distractions. I considered a `hashmap`, but stopped there. I should've realized that I could use a `Set` for my needs.

## Takeaways
Go straight to using a datastructure that trades memory for runtime. Even if there's an optimal algorithm, it's easier to hit the "target" of `O(N)` first, and then look for it. Part of the interview/challenge is showing an ability to associate existing data structures to the problem at hand and not just about finding an obscure optimal algorithm.
