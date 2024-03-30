A _strictly_ increasing subsequence means no duplicates.
For any given subsequence of range 1 to n, where i is an index
subsequence[i-1] < subsequence[i] < subsequence[i+1]

Define nums range as 0 ... n.
Define subsequence as: sub with range b ... m.
L(m) = length of the subsequence ending at index m.
L(m) ::= L(m-1) + 1

First approach:
Forward iteration.
sub[0] = 1
for index 1 ... n:
  check elements prior
  if element is smaller, subsequence ending at index = sub[element] + 1
