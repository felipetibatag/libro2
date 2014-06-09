import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Evento1 extends Frame{
	private Button Boton=new Button("Boton");
	public Evento1(){
		super("1er Evento");
		
		//agrego listener al boton
		Boton.addActionListener(new EscuchaBoton());
		setLayout(new FlowLayout());
		add(Boton);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Evento1 a=new Evento1();
	}
	class EscuchaBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Se presiono el boton");
			//dimension ventana
			Dimension dimVentana=getSize();
			//dimension pantalla
			Dimension dimPantalla=getToolkit().getScreenSize();
			//coordenadas aletorias para ubicar la ventana
			int x=(int)(Math.random()*dimPantalla.width - dimVentana.width);
			int y=(int)(Math.random()*dimPantalla.width - dimVentana.width);
			//cambiar la ubicacion de la ventana
			setLocation(x,y);
			
		}
		
	}
	
	

}
