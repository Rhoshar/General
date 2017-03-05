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
    
    @Override
    public boolean equals(Object obj){
    if (obj instanceof Vertex<?>){
        if ( ((Vertex<?>)obj).vertex.equals(vertex) ){
            return true;
        }
    }
    return false;  
    }
    
    @Override
    public int hashCode(){
    	return this.vertex.hashCode();
    }
    
    @Override
    public String toString(){
    	return this.vertex.toString();
    }
}