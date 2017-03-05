package graphs;

public class Edge<T> {

    Vertex<T> start;
    Vertex<T> end;
    Edge(Vertex<T> vertex1, Vertex<T> vertex2){
        start = vertex1;
        end = vertex2;
    }
    Edge(T vertex1, T vertex2){
        start = new Vertex<T>(vertex1);
        end = new Vertex<T>(vertex2);
    	start.vertex = vertex1;
    	end.vertex = vertex2;
    }
    
    @Override
    public String toString(){
    	return "("+ start.toString()+", "+end.toString()+")";
    }
}