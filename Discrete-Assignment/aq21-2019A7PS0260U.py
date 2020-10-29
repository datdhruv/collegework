# Q21. Given a graph and a positive integer n, write a program to determine whether the graph has a cycle of length n.

''' Here is the plan bruv
- we need to implement a dfs generator, which will create all possible paths
  - this will be stored in a dict/list
  - doing this using a linked list
- then we will filter based on length
- and finally from the above step we filter based on whether it has repeated edges and vertices or not (thoda unclear hai here)

some links to help me out
https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
https://www.geeksforgeeks.org/detect-cycle-undirected-graph/?ref=leftbar-rightbar
https://www.geeksforgeeks.org/check-if-a-cycle-of-length-3-exists-or-not-in-a-graph-that-satisfy-a-given-condition/

'''
graph = [[0, 1, 0, 1, 0], 
         [1 ,0 ,1 ,0, 1], 
         [0, 1, 0, 1, 0], 
         [1, 0, 1, 0, 1], 
         [0, 1, 0, 1, 0]] 

class Node:
    nxt = None
    prev = None
    curr = None

node1 = Node()

def DFS(graph : list, node : int):

    Node_List = [0 for i in range(len(graph))]

    for interation in range(len(graph)):
        Node_List[iteration] = Node()
        for i in iteration:
            if i == 1:
                

