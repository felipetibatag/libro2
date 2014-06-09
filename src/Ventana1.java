import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


public class Ventana1 extends Frame{
	private Button b1,b2,b3;
	
	public Ventana1(){
		//constructor del padre recibe el titulo de la ventana
		super("Esta es la ventana");
		//definir layour que tendra la ventana
		setLayout(new FlowLayout());
		//se instancia el primer boton y se agrega al container
		b1=new Button("Boton 1");
		add(b1);
		b2=new Button("Boton 2");
		add(b2);
		b3=new Button("Boton 3");
		add(b3);
		//definir el size de la ventana y hacer la visible
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana1 ven1=new Ventana1();
	}
	
	
}


