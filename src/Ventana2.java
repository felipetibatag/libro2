import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


public class Ventana2 extends Frame{
	Button Boeste,Beste,Bnorte,Bsur,Bcentro;
	public Ventana2(){
		super("Ventana BorderLayout");
		setLayout(new BorderLayout());
		Boeste=new Button("Oeste");
		Beste=new Button("Este");
		Bnorte=new Button("Norte");
		Bsur=new Button("Sur");
		Bcentro=new Button("Centro");
		add(Boeste,BorderLayout.WEST);
		add(Beste,BorderLayout.EAST);
		add(Bnorte,BorderLayout.NORTH);
		add(Bsur,BorderLayout.SOUTH);
		add(Bcentro,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);

	}
	public static void main(String[] args) {
		Ventana2 ven2=new Ventana2();
	}
	
	

}
