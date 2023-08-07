# Game Map
""" To develop a small game using this search algorithm, 
 let's consider a simple scenario 
  where the graph represents a game map with nodes 
  representing locations and the costs associated
 with each edge representing the distances between the locations.
"""
graph = [['A','B',1,3],['A','C',2,4],['A','H',7,0],['B','D',4,2],['B','E',6,6],['C','F',3,3],['C','G',2,1],['D','E',7,6],['D','H',5,0],['F','H',1,0],['G','H',2,0]]

# Function to perform A* search
def A_star_search(graph, start_node, goal_node):
    temp = []
    temp1 = []
    for i in graph:
        temp.append(i[0])
        temp1.append(i[1])
    nodes = set(temp).union(set(temp1))
    # Initialize costs, path, open, closed
    costs = {}
    path = {}
    for node in nodes:
        costs[node] = 999999
        path[node] = ' '
    open_set = set()
    closed_set = set()
   
    open_set.add(start_node)
    path[start_node] = start_node
    costs[start_node] = 0
    
    # A* search algorithm

    def A_star(graph, costs, open_set, closed_set, cur_node):
        if cur_node in open_set:
            open_set.remove(cur_node)
        closed_set.add(cur_node)
        for i in graph:
            if (i[0] == cur_node and costs[i[0]] + i[2] + i[3] < costs[i[1]]):
                open_set.add(i[1])
                costs[i[1]] = costs[i[0]] + i[2] + i[3]
                path[i[1]] = path[i[0]] + '->' + i[1]
        costs[cur_node] = 999999
        small = min(costs, key=costs.get)
        if small not in closed_set:
            A_star(graph, costs, open_set, closed_set, small)
    
    # Run A* search algorithm