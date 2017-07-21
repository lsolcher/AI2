import java.util.List;

public class Node {
	public String name;
	int x;
	int y;
	public List<Edge> connections;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getConnections() {
		return connections;
	}

	public void setConnections(List<Edge> connections) {
		this.connections = connections;
	}

}
