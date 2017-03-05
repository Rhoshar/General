package graphs;

public class Vertex<T> {
    T vertex;
    int label;
    int degree;
    
    Vertex(){
        vertex = null;
        //label = 0;
        degree = 0;
    }
    
    Vertex(T vertex){
        this.vertex = vertex;
        label = 0;
        degree = 0;
    }
    Vertex(Vertex<T> vertex){
    	this.vertex = vertex.vertex;
    }
    
    public void increaseDegree(){
    	this.degree++;
    }
    public String toString(){
    	return vertex.toString();
    }
}