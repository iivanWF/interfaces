package inter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ej1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej1 frame = new ej1();
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
	public ej1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);


		ButtonGroup group = new ButtonGroup();

		contentPane.setLayout(null);



		JLabel lblNewLabel = new JLabel("Generar numeros");

		lblNewLabel.setBounds(0, 11, 130, 30);

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		

		contentPane.add(lblNewLabel);



		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Entre 0 y 100", false);

		rdbtnNewRadioButton_1.setBounds(73, 48, 113, 23);

		rdbtnNewRadioButton_1.setAlignmentX(CENTER_ALIGNMENT);

		contentPane.add(rdbtnNewRadioButton_1);



		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Entre 100 y 200");

		rdbtnNewRadioButton_2.setBounds(73, 73, 124, 23);

		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));

		rdbtnNewRadioButton_2.setAlignmentX(CENTER_ALIGNMENT);

		contentPane.add(rdbtnNewRadioButton_2);



		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Entre 200 y 500");

		rdbtnNewRadioButton_3.setBounds(73, 97, 124, 23);

		rdbtnNewRadioButton_3.setAlignmentX(CENTER_ALIGNMENT);

		contentPane.add(rdbtnNewRadioButton_3);


		group.add(rdbtnNewRadioButton_1);

		group.add(rdbtnNewRadioButton_2);

		group.add(rdbtnNewRadioButton_3);



		JButton btnNewButton = new JButton("Generar");

		btnNewButton.setBounds(73, 127, 91, 23);

		btnNewButton.addActionListener(new ActionListener() {

			

			public void actionPerformed(ActionEvent e) {

				Random random = new Random();

                int numeroGenerado = 0;

				if (rdbtnNewRadioButton_1.isSelected()) {

                    numeroGenerado = random.nextInt(101);

                } else if (rdbtnNewRadioButton_2.isSelected()) {

                    numeroGenerado = random.nextInt(101) + 100;

                } else if (rdbtnNewRadioButton_3.isSelected()) {

                    numeroGenerado = random.nextInt(301) + 200; 

                }



                textField.setText(String.valueOf(numeroGenerado)); 

			}

		});

		contentPane.add(btnNewButton);

		

		textField = new JTextField();

		textField.setBounds(73, 161, 126, 43);

		contentPane.add(textField);

		textField.setColumns(10);
	}
}


