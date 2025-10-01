package interface;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Janela extends JFrame{
    public Janela(){
        this.setBounds(0,0, 1920, 1000);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel LoginPanel = new LoginPanel(tela, this);
        PrincipalPanel PrincipalPanel = new PrincipalPanel(telas, this);
    }
    
}
