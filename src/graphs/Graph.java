package graphs;

import java.util.*;

public class Graph<T>{
	
    private Set<Vertex<T>> vertices;
    private Set<Edge<T>> edges;
    
    Graph(){
    	vertices = new HashSet<>();
    	edges = new HashSet<>();
    }
    
    private Vertex<T> convertToVertex(T vertex){
    	Vertex<T> temp = null;
    	for(Vertex<T> v: this.vertices){
    		if(v.vertex.equals(vertex)){
    			temp = v;
    			break;
    		}
    	}
    	if(temp == null){
    		throw new NullPointerException("Wierzcho³ek "+vertex.toString()+
            			" nie istnieje w danym grafie!");
    	}
    	return temp;
    }
    
    private Edge<T> convertToEdge(T vertex1, T vertex2){
    	Edge<T> temp = null;
    	for(Edge<T> e: this.edges){
    		if((e.start.vertex.equals(vertex1) && e.end.vertex.equals(vertex2)) ||
    			(e.start.vertex.equals(vertex2) && e.end.vertex.equals(vertex1))){
    			temp = e;
    			break;
    		}
    	}
    	if(temp == null){
    		throw new NullPointerException("Krawedz ("+vertex1.toString()+", "+vertex2.toString()+
            			") nie istnieje w danym grafie!");
    	}
    	return temp;
    }
    
    public void addVertex(T vertex){
    	this.vertices.add(new Vertex<T>(vertex));
    }
    
    public void addEdge(T vertex1, T vertex2){
    	this.edges.add(new Edge<T>(vertex1, vertex2));
    	this.convertToVertex(vertex1).increaseDegree();
    	this.convertToVertex(vertex2).increaseDegree();
    }
    
    public void removeEdge(T vertex1, T vertex2){
    			this.edges.remove(this.convertToEdge(vertex1, vertex2));       		
    }
    
    public void removeVertex(T vertex){
    	Vertex<T> temp = this.convertToVertex(vertex);
    	Set<Edge<T>> toRemove = new HashSet<>();
    	for(Edge<T> e: this.edges){
    		if(temp.equals(e.start) || temp.equals(e.end))
    			toRemove.add(e);
    	}
    	for(Edge<T> e: toRemove)
    		this.edges.remove(e);
    	this.vertices.remove(temp);
    }
    
    public boolean containsVertex(T vertex){
    	return vertices.contains(this.convertToVertex(vertex));
    }
    
    public boolean containsEdge(T vertex1, T vertex2){
    	return edges.contains(this.convertToEdge(vertex1, vertex2));
    }
    
    public Set<Vertex<T>> findNeighbours(T vertex){
    	Vertex<T> tempVertex = this.convertToVertex(vertex);
    	Set<Vertex<T>> neighbours = new HashSet<Vertex<T>>();
    	for(Edge<T> e: edges){
        	if(tempVertex.equals(e.start))
    			neighbours.add(e.end);
    		else if(tempVertex.equals(e.end))
    			neighbours.add(e.start);
    	}
    	return neighbours;
    }
    
    public int vertexDegree(T vertex){
    	return this.convertToVertex(vertex).degree;
    }
    
    // Number of vertices
    public int order(){
    	return this.vertices.size();
    }
    
    // Number of edges
    public int size(){
    	return this.edges.size();
    }
    
    public String toString(){
    	String napis = new String("");
    	napis = "Wierzcho³ki:\n";
    	for(Vertex<T> t : this.vertices)
    		napis = napis+t.toString()+", ";
    	
    	napis = napis+"\nKrawêdzie:\n";
    	for(Edge<T> t : this.edges)
    	napis = napis+t.toString()+", ";	
    	
    	return napis;
    }

}