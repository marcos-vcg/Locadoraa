import javax.swing.JInternalFrame;

public class Categoria extends JInternalFrame {
	static final int xPosition = 30, yPosition = 30;

	public Categoria() {
		super("Categoria", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(300, 300);
		setLocation(xPosition, yPosition);
	}
}