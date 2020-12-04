class Node:

    destination = []
    source = []
    
    def __init__(self, id):
        """ pass the id """
        self.id = id
    
    def addSourceEdge(self, source):
        self.source.append(source)

    def addDestEdge(self, destination):
        self.destination.append(destination)

class Graph:
    graph = []
    graph[0] = Node(0)
    graph
    









graph = [[0, 1, 0, 1, 0],
        [1 ,0 ,1 ,0, 1],
        [0, 1, 0, 1, 0],
        [1, 0, 1, 0, 1],
        [0, 1, 0, 1, 0]]
