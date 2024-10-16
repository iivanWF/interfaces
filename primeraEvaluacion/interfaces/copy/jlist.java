package primeraEvaluacion.interfaces.copy;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;

public class jlist extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlist frame = new jlist();
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
	public jlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<String> list = new JList<>();
        list.setModel(new AbstractListModel<String>() {
            String[] values = new String[] {"4", "8", "15", "96", "23", "42"};
            public int getSize() {
                return values.length;
            }
            public String getElementAt(int index) {
                return values[index];
            }
		});
		list.setBounds(10, 11, 119, 118);
		contentPane.add(list);
		
		list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = list.locationToIndex(e.getPoint());
                if (index >= 0) {
                    String value = list.getModel().getElementAt(index);
                    int number = Integer.parseInt(value);
                    boolean isPrime = isPrime(number);
                    String message = isPrime ? number + " es primo." : number + " no es primo.";
                    JOptionPane.showMessageDialog(contentPane, message);
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

}
