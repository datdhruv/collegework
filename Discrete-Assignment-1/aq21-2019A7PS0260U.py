def DFS(graph, visited, n, v, start, count): 

	visited[v] = True

	if n == 0: 
		visited[v] = False
		if graph[v][start] == 1: 
			count = count + 1
			return count 
		else: 
			return count 

	for i in range(V): 
		if visited[i] == False and graph[v][i] == 1: 
			count = DFS(graph, visited, n-1, i, start, count) 
	visited[v] = False
	return count 

def isCycle( graph, n): 

    visited = [False] * V 

    count = 0
    for i in range(V-(n-1)): 
        count = DFS(graph, visited, n-1, i, i, count) 

        visited[i] = True
	
        if count > 0:
            return True
        else:
            return False


#V = len(graph[0])
#n = int(input("Enter the length of cycles to check "))

with open('aq21ip-2019A7PS0260U.txt','r') as f:
    a = '0'
    b = '0'
    graph = []
    while b != 'Terminate\n':
        graph.clear()
        while a != '\n': 
            a = f.readline()
            graph.append(a.strip().split(sep=','))
        graph.pop()
        n = f.readline().strip()

        for i in range(len(graph)):
            for j in range(len(graph[i])):
                graph[i][j] = int(graph[i][j])

        V = len(graph[0])

        with open("aq21op-2019A7PS0260U.txt","a") as op:

            op.write("Is there a cycle of length "+ str(n) +" in the provided graph? "+str(isCycle(graph, int(n)))+"\n")
       
        a = '0'
        b = f.readline()





