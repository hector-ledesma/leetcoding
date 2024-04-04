## Naive approach (TLE):
build every possible path, return the shortest.
For every num in nums, exhaustively search each possible path
store steps in steps[n]
if steps taken < steps[n]:
  steps[n] = steps taken
return steps[n-1]

## Final solution:
At any given step:
  for each of our possible steps:
      we want to go towards the step with the highest potential.

So we simply check the maximum potential of each of our possible steps, and we move to that one.
