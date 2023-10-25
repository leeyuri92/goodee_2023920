package bclass.board;
class G{
	int i=1;	
	static int j =10;
}
public class GMain {
	public static void main(String[] args) {
		G g = new G();
		System.out.println(g.i);
		System.out.println(G.j);
		g.i++;
		G.j++;

		g = new G();
		System.out.println(g.i);
		System.out.println(G.j);
		g.i++;
		G.j++;
		
		g = new G();
		System.out.println(g.i);
		System.out.println(G.j);
	}
}
