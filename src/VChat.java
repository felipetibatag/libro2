import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;


public class VChat extends Frame{
	private Label Lnick,Lconversacion,Lmensaje;
	private Button Blogin,Blogout,Benviar;
	private TextField Tnick,Tmensaje;
	private List Ltconversacion;
	
	public VChat(){
		super("Chat");
		setLayout(new BorderLayout());
		add(_pNorte(),BorderLayout.NORTH);
		add(_pCentro(),BorderLayout.CENTER);
		add(_pSur(),BorderLayout.SOUTH);
		setSize(300,300);
		//pack();
		setVisible(true);
	}
	
	private Panel _pNorte(){
		Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
		Lnick=new Label("Nick");
		Tnick=new TextField(10);
		Blogin=new Button("Login");
		Blogout=new Button("Logout");
		p.add(Lnick);
		p.add(Tnick);
		p.add(Blogin);
		p.add(Blogout);
		return p;
	}
	
	private Panel _pCentro(){
		Panel p=new Panel(new BorderLayout());
		Lconversacion=new Label("Conversación");
		Ltconversacion=new List();
		p.add(Lconversacion,BorderLayout.NORTH);
		p.add(Ltconversacion,BorderLayout.CENTER);
		return p;
	}
	private Panel _pSur(){
		Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
		Lmensaje=new Label("Mensaje");
		Tmensaje=new TextField(10);
		Benviar=new Button("Enviar");
		p.add(Lmensaje);
		p.add(Tmensaje);
		p.add(Benviar);
		return p;
	}
	public static void main(String[] args) {
		VChat chat=new VChat();
	}
}
