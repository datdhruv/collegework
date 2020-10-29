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

def connector(graph : list ):
    node = [[] for i in range(len(graph))]
    for i in range(len(graph)):
        for j in range(len(graph[0])):
            if graph[i][j] == 1:
                node[i].append(j)
    return node
    

print(DFS(graph))
