package primeraEvaluacion.interfaces.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class jtable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	public jtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", null, null, null, null},
				{85, null, "", null, null, 97},
				{null, 73, null, 5, null, null},
				{20, null, null, null, 69, null},
				{null, 20, null, null, null, null},
				{null, null, 12, null, null, null},
				{43, null, null, 19, null, 16},
				{null, null, 7, 11, null, null},
			},
			new String[] {
				"", "", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(32, 26, 351, 144);
		contentPane.add(table);
		
		table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();
                
                Object value = table.getValueAt(row, column);
                if (value instanceof Integer) {
                    int number = (Integer) value;
                    boolean isPrime = isPrime(number);
                    String message = isPrime ? number + " es primo." : number + " no es primo.";
                    JOptionPane.showMessageDialog(contentPane, message);
                } else {
                    JOptionPane.showMessageDialog(contentPane, "No hay un número en esta celda.");
                }
            }
        });
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	jtable frame = new jtable();
            frame.setVisible(true);
        });
	}
}
