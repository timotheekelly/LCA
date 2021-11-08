# LCA

##First stage

Implemented an LCA in Java and Python. Given nodes v and u, calculate lowest common ancestor in a binary search tree. Both test for basic functionality and achieve full coverage in tests.

##Second stage

Building upon last stage, allow LCA on Directed Asyclical Graph. Much more complex algorithm. I had to scrap a lot of my last code as it relied on each node having a potential for a left and right child. Luckily I found some useful code and solutions on https://algs4.cs.princeton.edu/42digraph/ that I was able to build off of to complete this excercise.

First it tests to make sure graph is acyclic, then it performs a depth first search to create a pathway for each node. It finds the shared path between these nodes and performs a breadth first search on the reverse of this graph to find the lowest common ancestor. It returns the first common node. This means this method provides the right answer but in cases where there are multiple right answers, it will only provide the first.
