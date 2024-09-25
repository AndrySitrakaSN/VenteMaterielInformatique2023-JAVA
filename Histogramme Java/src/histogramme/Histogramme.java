
package histogramme;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Histogramme extends JFrame {

    private List<Client> clients;
    private Map<Integer, Integer> histogramme;

    public Histogramme() {
        clients = new ArrayList<>();
        histogramme = new HashMap<>();

        // Ajout de clients à la liste
        clients.add(new Client("Jean", "Dupont", 5));
        clients.add(new Client("Alice", "Martin", 8));
        clients.add(new Client("Paul", "Dubois", 3));
        clients.add(new Client("Emma", "Leroy", 5));
        clients.add(new Client("Luc", "Bernard", 2));
        clients.add(new Client("Julie", "Thomas", 8));

        construireHistogramme();

        setTitle("Histogramme");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                afficherHistogramme(g);
            }
        };

        getContentPane().add(panel);
        setVisible(true);
    }

    private void construireHistogramme() {
        for (Client client : clients) {
            int valeur = client.getValeur();
            histogramme.put(valeur, histogramme.getOrDefault(valeur, 0) + 1);
        }
    }

    private void afficherHistogramme(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int barWidth = 40;
        int barSpacing = 20;
        int maxBarHeight = getHeight() - 40;

        int x = 40;
        for (Map.Entry<Integer, Integer> entry : histogramme.entrySet()) {
            int valeur = entry.getKey();
            int occurrence = entry.getValue();
            int barHeight = (int) (maxBarHeight * (occurrence / (double) clients.size()));

            g2d.setColor(Color.BLUE);
            g2d.fillRect(x, getHeight() - barHeight, barWidth, barHeight);

            g2d.setColor(Color.BLACK);
            g2d.drawString(String.valueOf(valeur), x + barWidth / 2 - 5, getHeight() - 5);

            x += barWidth + barSpacing;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Histogramme::new);
    }
}

class Client {
    private String nom;
    private String prenom;
    private int valeur;

    public Client(String nom, String prenom, int valeur) {
        this.nom = nom;
        this.prenom = prenom;
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }
}
