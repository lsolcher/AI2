import lenz.htw.kipifub.ColorChange;
import lenz.htw.kipifub.net.NetworkClient;

public class GameMain {
	static NetworkClient networkClient = new NetworkClient("localhost", "Teamname");

	public static void main(String[] args) {
		networkClient.getMyPlayerNumber(); // 0 = rot, 1 = grün, 2 = blau

		int rgb = networkClient.getBoard(0, 0); // 0-1023 ->
		int b = rgb & 255;
		int g = (rgb >> 8) & 255;
		int r = (rgb >> 16) & 255;
		int w = 255 * 65536 + 255 * 256 + 255;

		networkClient.getInfluenceRadiusForBot(0); // -> 40

		networkClient.getScore(0); // Punkte von rot

		networkClient.isWalkable(0, 0); // begehbar oder Hinderniss?

		networkClient.setMoveDirection(0, 1, 0); // bot 0 nach rechts
		networkClient.setMoveDirection(1, 0.23f, -0.52f); // bot 1 nach rechts unten

		Graph graph = new Graph(1024);
		for (int y = 0; y < 1023; y++)
			for (int x = 0; x < 1023; x++) {
				if (networkClient.getBoard(x, y) == w) {
					Node node = new Node(x, y);
					graph.addNode(node);
				}
			}
		for (int y = 0; y < 256; y++) {
			for (int x = 0; x < 256; x++) {

			}
		}

		ColorChange colorChange;
		while ((colorChange = networkClient.pullNextColorChange()) != null) {
			colorChange.player = 1;
			colorChange.bot = 1;
			colorChange.x = 1;
			colorChange.y = 1;
			//verarbeiten von colorChange
			// colorChange.player, colorChange.bot, colorChange.x, colorChange.y
		}
	}

}
