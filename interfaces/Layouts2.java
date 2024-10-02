package primeraEvaluacion.interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layouts2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layouts2 frame = new Layouts2();
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
	public Layouts2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JButton boton1 = new JButton("Primero");
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Segundo");
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Tercero");
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("Cuarto");
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("Quinto");
		contentPane.add(boton5);
		
		ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                JOptionPane.showMessageDialog(null, "Has pulsado el botón: " + source.getText());
            }
        };
        
        boton1.addActionListener(actionListener);
        boton2.addActionListener(actionListener);
        boton3.addActionListener(actionListener);
        boton4.addActionListener(actionListener);
        boton5.addActionListener(actionListener);

	}

}
