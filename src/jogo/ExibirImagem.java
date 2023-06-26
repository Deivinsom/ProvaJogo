package src.jogo;

import javax.swing.*;
import java.awt.*;

public class ExibirImagem extends JFrame {
    public void mostrarImagem() {
        setTitle("Exibindo Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/MapaImagem.jpg"));

        JLabel label = new JLabel();
        label.setIcon(icon);

        getContentPane().add(label, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}
