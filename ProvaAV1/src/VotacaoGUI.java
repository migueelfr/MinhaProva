import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JComponent;


import static java.lang.reflect.Array.get;

public class VotacaoGUI extends JFrame {
    private final JPanel contentPane;
    private final ArrayList<String> participantes = new ArrayList<>();
    private final ArrayList<Integer> votos = new ArrayList<>();
    final JTextArea Resultado;
    /*private final JLabel Vencedor;*/
    private final JLabel Eliminado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VotacaoGUI frame = new VotacaoGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VotacaoGUI() {
        setSize(1200, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(new Color(34, 45, 52));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panelBotoes = new JPanel();
        contentPane.add(panelBotoes, BorderLayout.NORTH);
        panelBotoes.setLayout(new GridLayout(0, 1, 0, 10));
        JScrollPane scrollPane1 = new JScrollPane();
        panelBotoes.add(scrollPane1);

        panelBotoes = new JPanel();
        scrollPane1.setViewportView(panelBotoes);


        participantes.add("Aline Dias");
        participantes.add("Beatriz Reis");
        participantes.add("Davi Brito");
        participantes.add("Deniziane Ferreira");
        participantes.add("Fernanda Bande");
        participantes.add("Giovanna Lima");
        participantes.add("Giovanna Pitel");
        participantes.add("Isabella Nogueira");
        participantes.add("Juninho");
        participantes.add("Leidy Elin");
        participantes.add("Lucas Henrique");
        participantes.add("Lucas Luigi");
        participantes.add("Lucas Pizani");
        participantes.add("Mascus Vinicius");
        participantes.add("Matteus Amaral");
        participantes.add("Maycon Cosmer");
        participantes.add("MC Bin Laden");
        participantes.add("Michel Nogueira");
        participantes.add("Nizan");
        participantes.add("Raquele Cardoso");
        participantes.add("Rodriguinho");
        participantes.add("Thalyta Alves");
        participantes.add("Vanessa Lopes");
        participantes.add("Vinicius Rodrigues");
        participantes.add("Wanessa Camargo");
        participantes.add("Yasmin Brunet");


        for (int i = 0; i < participantes.size(); i++) {
            votos.add(0);
            String participante = participantes.get(i);
            JButton Votar = new JButton("Votar em " + participante);
            Votar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int index = participantes.indexOf(participante);
                    votos.set(index, votos.get(index) + 1);
                    mostrarResultado();
                    verEliminado();
                }
            });
            panelBotoes.add(Votar);
            Votar.setPreferredSize(new Dimension(200, 50));
            Votar.setBackground(Color.LIGHT_GRAY);

        }

        JPanel panelResultados = new JPanel();
        contentPane.add(panelResultados, BorderLayout.CENTER);
        panelResultados.setLayout(new GridLayout(0, 1, 0, 0));

        JScrollPane scrollPane = new JScrollPane();
        panelResultados.add(scrollPane);

        Resultado = new JTextArea();
        scrollPane.setViewportView(Resultado);

        Eliminado = new JLabel("");
        panelResultados.add(Eliminado);
    }

    private void verEliminado() {
            int totalVotos = 0;
            String eliminado = "";
            for (int i = 0; i < votos.size(); i++) {
                if (votos.get(i) > totalVotos) {
                    totalVotos = votos.get(i);
                    eliminado = participantes.get(i);
                }
            Eliminado.setText("com " + totalVotos + " votos ,é você quem sai é você " + eliminado);
            }


        }
    private void mostrarResultado() {
        StringBuilder resultados = new StringBuilder("Resultados da votação:\n");
        for (int i = 0; i < participantes.size(); i++) {
            resultados.append(participantes.get(i)).append(": ").append(votos.get(i)).append(" votos\n");
        }
        Resultado.setText(resultados.toString());
    }
}


