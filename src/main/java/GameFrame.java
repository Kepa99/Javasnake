import javax.swing.JFrame;
public class GameFrame extends JFrame{

	GameFrame(){
			
		GamePanel panel = new GamePanel();
		
		this.add(new GamePanel());
		this.setTitle("Snake"); //tytul gry
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); //ustawnianie okna na srodku ekranu
		
	}
}