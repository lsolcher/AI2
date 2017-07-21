import java.util.ArrayList;
import java.util.List;

public class Graph {
	List<Node> nodes;

	public Graph(int size) {
		nodes = new ArrayList<Node>();
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

}
