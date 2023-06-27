package src.jogo;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;   //imports ¯\_(ツ)_/¯
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExibirImagem extends JFrame {
    public void mostrarImagem() {
        setTitle("Exibindo Imagem");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/MapaImagem.jpg"));// Mostra a imagem independente de qual PC esteja.

        JLabel label = new JLabel(); // cria uma nova janela.
        label.setIcon(icon);

        getContentPane().add(label, BorderLayout.CENTER);
        pack();
        setVisible(true);

        // Adiciona um WindowListener a janela da imagem
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false); // Oculta a janela ao invés de fechar, no qual interrompia o progama
            }
        });
    }
}
