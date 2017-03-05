package graphs;

public class Edge<T> {

    Vertex<T> start;
    Vertex<T> end;
    Edge(Vertex<T> vertex1, Vertex<T> vertex2){
        this.start = vertex1;
        this.end = vertex2;
    }
    Edge(T vertex1, T vertex2){
        this.start = new Vertex<T>(vertex1);
        this.end = new Vertex<T>(vertex2);
    	this.start.vertex = vertex1;
    	this.end.vertex = vertex2;
    }
    public String toString(){
    	return "("+ start.toString()+", "+end.toString()+")";
    }
}