package lanSimulation.internals;

public class Printer extends Node {

	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}

	public Printer(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
}
