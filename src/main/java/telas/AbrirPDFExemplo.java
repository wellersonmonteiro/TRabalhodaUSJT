package telas;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbrirPDFExemplo extends JFrame {

    private JPanel panel;
    private JButton abrirPDFButton;

    public AbrirPDFExemplo() {
        initComponents();
    }

    private void initComponents() {
        panel = new JPanel();
        abrirPDFButton = new JButton("Abrir PDF");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Exemplo de Abrir PDF");
        setSize(300, 200);
        setLocationRelativeTo(null);

        abrirPDFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPDF();
            }
        });

        panel.add(abrirPDFButton);
        add(panel);
    }

    private void abrirPDF() {
        File arquivo = new File("C:\\Users\\wellersonelucas\\Desktop\\merged (pdf.io).pdf");

        if (arquivo.exists()) {
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Arquivo PDF não encontrado!");
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbrirPDFExemplo().setVisible(true);
            }
        });
    }
}
