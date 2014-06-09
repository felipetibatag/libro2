import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;


public class Calculadora extends Frame{
	TextField Tdisplay;
	public Calculadora(){
		super("Calculadora");
		setLayout(new BorderLayout());
		Tdisplay=new TextField();
		add(Tdisplay,BorderLayout.NORTH);
		add(_creaBotones(),BorderLayout.CENTER);
		pack();
		setSize(300,300);
		setVisible(true);
		
	}
	private Panel _creaBotones() {
		// TODO Auto-generated method stub
		Panel p;
		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmas,bmenos,bpunto,bdiv,bmult,bigual;
		p=new Panel(new GridLayout(4,4));
		b1=new Button("1");		
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");		
		b0=new Button("0");
		bmas=new Button("+");
		bmenos=new Button("-");
		bmult=new Button("*");
		bdiv=new Button("/");
		bpunto=new Button(".");
		bigual=new Button("=");
		//fila 1
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bdiv);
		//fila2
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bmult);
		//fila 3
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bmenos);
		//fila 4
		p.add(b0);
		p.add(bpunto);
		p.add(bmas);
		p.add(bigual);
		return p;
	}
	public static void main(String[] args) {
		Calculadora c=new Calculadora();
	}

}
