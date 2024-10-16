package primeraEvaluacion.interfaces.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class jtable2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jtable2 frame = new jtable2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jtable2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre", "Apellido", "Edad"},
				{"Paca", "Garte", 23},
				{"Ana Lisa", "Melchoto", 12},
				{"Rosa", "Melpito", 43},
				{"Monica", "Galindo", 63},
				{"Lali", "Cuadora", 31},
				{"Mary", "Qiuta Sosyos", 19},
				{"Flor D", "Turra", 26},
				{"Ana", "Tomia", 18},
				{"Evelin", "Mundo", 35},
				{"Roque", "Joso", 27},
				{"German", "Teca", 41},
			},
			new String[] {
				"Nombre", "Apellido", "Edad"
			}
		));
		table.setBounds(42, 11, 345, 192);
		contentPane.add(table);
	}
}
