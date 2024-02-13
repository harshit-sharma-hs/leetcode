/*
 * Clone an Undirected Graph
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;

class CloneGraph{
    Node cloneGraph(Node node){
    	Node root = node;
    	HashSet<Node> visited = new HashSet<>();
    	HashMap<Node,Node> map = new HashMap<>();
    	
    	dfs(root,visited,map);
    	
    	addEdges(map);
		return map.get(root);
        
    }
    void addEdges(HashMap<Node,Node> map)
    {
    	for(Node n:map.keySet())
    	{
    		map.get(n).neighbors.add(n);
    	}
    }
    void dfs(Node root,HashSet<Node> visited ,HashMap<Node,Node> map)
    {
    	visited.add(root);
    	Node copy = new Node(root.val);
    	map.put(root, copy);
    	for(Node child : root.neighbors)
    	{
    		if(!visited.contains(child))
    			dfs(child,visited,map);
    	}
    }
}
