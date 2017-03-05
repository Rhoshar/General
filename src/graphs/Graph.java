package graphs;

import java.util.*;

public class Graph<T>{
	
    private Set<Vertex<T>> vertices;
    private Set<Edge<T>> edges;
    
    Graph(){
    	this.vertices = new HashSet<>();
    	this.edges = new HashSet<>();
    }
    
    private Vertex<T> convertToVertex(T vertex){
    	Vertex<T> temp = null;
    	for(Vertex<T> v: this.vertices){
    		if(v.vertex == vertex){
    			temp = v;
    			break;
    		}
    	}
    	if(temp == null){
    		System.out.println();
            throw new NullPointerException("Wierzchołek "+vertex.toString()+
            			" nie istnieje w danym grafie!");
    	}
    	return temp;
    }
    
    private Edge<T> convertToEdge(T vertex1, T vertex2){
    	Edge<T> temp = null;
    	for(Edge<T> e: this.edges){
    		if((e.start.vertex == vertex1 && e.end.vertex == vertex2) ||
    			(e.start.vertex == vertex2 && e.end.vertex == vertex1)){
    			temp = e;
    			break;
    		}
    	}
    	if(temp == null){
    		System.out.println(this.edges.toString());
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
    	for(Edge<T> e: this.edges){
    		if(e.start == temp || e.end == temp)
    			this.edges.remove(e);
    	}
    	this.vertices.remove(temp);
    }
    
    public boolean containsVertex(T vertex){
    	return this.vertices.contains(this.convertToVertex(vertex));
    }
    
    public boolean containsEdge(T vertex1, T vertex2){
    	return edges.contains(this.convertToEdge(vertex1, vertex2));
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
    	napis = "Wierzchołki:\n";
    	for(Vertex<T> t : this.vertices)
    		napis = napis+t.toString()+", ";
    	
    	napis = napis+"\nKrawędzie:\n";
    	for(Edge<T> t : this.edges)
    	napis = napis+t.toString()+", ";	
    	
    	return napis;
    }

}