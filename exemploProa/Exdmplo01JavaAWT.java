package exemploProa;
import java.awt.*;
public class Exdmplo01JavaAWT extends Frame {

	Exdmplo01JavaAWT(){
		Button b = new Button("Clica ai!!");
		b.setBounds(30,200,80,30);
		add(b);
		setSize(300,300);
		setTitle("This is your basic AWT example");
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		Exdmplo01JavaAWT f = new Exdmplo01JavaAWT();
	}

}
