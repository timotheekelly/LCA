# LCA

##First stage

Implemented an LCA in Java and Python. Given nodes v and u, calculate lowest common ancestor in a binary search tree. Both test for basic functionality and achieve full coverage in tests.

##Second stage

Building upon last stage, allow LCA on Directed Asyclical Graph. Much more complex algorithm. I had to scrap a lot of my last code as it relied on each node having a potential for a left and right child. 

First it tests to make sure graph is acyclic, then it performs a depth first saerch to create a pathway for each node. It finds the shared path between these nodes and performs a breadth first search to find the lowest common ancestor. This method provides the right answer but in cases where there are multiple right answers, it will only provide the first.
