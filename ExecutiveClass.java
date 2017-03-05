package graphs;

public class ExecutiveClass {

	public static void main(String[] args) {

		Graph<String> koledzy = new Graph<>();
		String krzysiek = new String("Krzysiek");
		String maciek = new String("Maciek");
		String janusz = new String("Janusz");
		String gienek = new String("Eugeniusz");
		

		koledzy.addVertex(krzysiek);
		koledzy.addVertex(maciek);
		koledzy.addVertex(janusz);
		
 		koledzy.addEdge(krzysiek, maciek);
 		koledzy.addEdge(janusz, maciek);
 		//koledzy.addEdge(janusz, gienek); 		
 		System.out.println(koledzy.containsEdge(janusz, maciek));

		//koledzy.removeVertex(krzysiek);
		//System.out.println(koledzy.toString());

		//System.out.println("Liczba wierzchołków: "+koledzy.order()+", Liczba krawedzi: "+koledzy.size());
		//System.out.println(koledzy.containsEdge(janusz, maciek));
	}

}
