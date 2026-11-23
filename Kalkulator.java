import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Imut Zasqia088");
        frame.setSize(380, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());

        JLabel labelJudul = new JLabel("Kalkulator Dua Angka <3", SwingConstants.CENTER);
        labelJudul.setFont(new Font("Arial", Font.BOLD, 18));
        labelJudul.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));

        JPanel panelInput = new JPanel(new GridLayout(3, 2, 10, 10));
        panelInput.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JLabel labelAngka1 = new JLabel("Angka 1:");
        JTextField fieldAngka1 = new JTextField();
        JLabel labelAngka2 = new JLabel("Angka 2:");
        JTextField fieldAngka2 = new JTextField();
        JLabel labelHasil = new JLabel("Hasil:");
        JTextField fieldHasil = new JTextField();
        fieldHasil.setEditable(false);

        panelInput.add(labelAngka1);
        panelInput.add(fieldAngka1);
        panelInput.add(labelAngka2);
        panelInput.add(fieldAngka2);
        panelInput.add(labelHasil);
        panelInput.add(fieldHasil);

        JPanel panelTombol = new JPanel(new FlowLayout());

        JButton tombolTambah = new JButton("Tambah");
        JButton tombolKurang = new JButton("Kurang");
        JButton tombolReset = new JButton("Reset");

        panelTombol.add(tombolTambah);
        panelTombol.add(tombolKurang);
        panelTombol.add(tombolReset);

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(fieldAngka1.getText());
                    double b = Double.parseDouble(fieldAngka2.getText());
                    fieldHasil.setText(String.valueOf(a + b));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Isi kedua kolom dengan angka ya!");
                }
            }
        });

        tombolKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(fieldAngka1.getText());
                    double b = Double.parseDouble(fieldAngka2.getText());
                    fieldHasil.setText(String.valueOf(a - b));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Isi kedua kolom dengan angka ya!");
                }
            }
        });

        tombolReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldAngka1.setText("");
                fieldAngka2.setText("");
                fieldHasil.setText("");
            }
        });

        frame.add(labelJudul, BorderLayout.NORTH);
        frame.add(panelInput, BorderLayout.CENTER);
        frame.add(panelTombol, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
