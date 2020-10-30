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

already_visited = [0]

def connector(graph : list ):
    """ Return a list with connections"""
    node = [[] for i in range(len(graph))]
    for i in range(len(graph)):
        for j in range(len(graph[0])):
            if graph[i][j] == 1:
                node[i].append(j)
       
    return node

connect = connector(graph)

def DFS_link(a : list):
    global already_visited
    
    for i in a:
        
        if i not in already_visited:
            already_visited.append(i)
            print(i) 
            DFS_link(connect[i])
        else:
            continue

nonsense = DFS_link(connect[0])
            


def undirected_DFS(graph : list): 
    global connect
    
    '''DFS = [[] for i in range(len(node))]
    
    for i in range(len(node)):
        DFS[i].append(i)

            

print(undirected_DFS(graph))
'''



