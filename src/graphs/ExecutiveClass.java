package graphs;

import java.util.*;

public class ExecutiveClass {

	public static void main(String[] args) {

		Graph<String> koledzy = new Graph<>();
		String krzysiek = new String("Krzysztof");
		String maciek = new String("Maciej");
		String tomek = new String("Tomasz");
		String arek = new String("Arkadiusz");
		
		koledzy.addVertex(krzysiek);
		koledzy.addVertex(maciek);
		koledzy.addVertex(tomek);
		koledzy.addVertex(arek);
		
 		koledzy.addEdge(krzysiek, maciek);
 		koledzy.addEdge(krzysiek, tomek);
 		koledzy.addEdge(tomek, maciek);
 		koledzy.addEdge(tomek, arek); 	
 		
 		//koledzy.removeVertex(maciek);
 		//System.out.println(koledzy.findNeighbours(maciek).toString());
 				
 		//System.out.println(koledzy.containsEdge(tomek, maciek));
 		//System.out.println(koledzy.findNeighbours(maciek).toString());
 		//System.out.println(koledzy.findNeighbours(maciek).size());
 		
		//koledzy.removeVertex(krzysiek);
 		//System.out.println(koledzy.toString());
		//koledzy.removeEdge(krzysiek, maciek);
		//System.out.println(koledzy.toString());
		//koledzy.removeVertex(maciek);
 		
 		
		//System.out.println(koledzy.toString());
		
		//System.out.println("Liczba wierzcho³ków: "+koledzy.order()+", Liczba krawedzi: "+koledzy.size());
	}

}
