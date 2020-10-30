def DFS(graph, marked, n, vert, start, count): 

	marked[vert] = True

	if n == 0: 
		marked[vert] = False
		if graph[vert][start] == 1: 
			count = count + 1
			return count 
		else: 
			return count 

	for i in range(V): 
		if marked[i] == False and graph[vert][i] == 1: 
			count = DFS(graph, marked, n-1, i, start, count) 
	marked[vert] = False
	return count 

def checkCycle( graph, n): 

    marked = [False] * V 

    count = 0
    for i in range(V-(n-1)): 
        count = DFS(graph, marked, n-1, i, i, count) 

        marked[i] = True
	
        if count > 0:
            return True
        else:
            return False

graph = [[0, 1, 0, 1, 0], 
        [1 ,0 ,1 ,0, 1], 
	[0, 1, 0, 1, 0], 
	[1, 0, 1, 0, 1], 
	[0, 1, 0, 1, 0]] 
			

V = len(graph[0])
n = int(input("Enter the number of cycles to check "))

print("Is there a cycle of length ",n," in the provided graph? ",checkCycle(graph, n)) 


