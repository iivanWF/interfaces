package inter;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ej2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel imageLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej2 frame = new ej2();
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
	public ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnPerro = new JRadioButton("Perro");
        rdbtnPerro.setBounds(33, 63, 109, 23);
        contentPane.add(rdbtnPerro);
        
        JRadioButton rdbtnGato = new JRadioButton("Gato");
        rdbtnGato.setBounds(33, 89, 109, 23);
        contentPane.add(rdbtnGato);
        
        JRadioButton rdbtnTigre = new JRadioButton("Tigre");
        rdbtnTigre.setBounds(33, 115, 109, 23);
        contentPane.add(rdbtnTigre);
        
        JRadioButton rdbtnLeon = new JRadioButton("León");
        rdbtnLeon.setBounds(33, 141, 109, 23);
        contentPane.add(rdbtnLeon);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnPerro);
        group.add(rdbtnGato);
        group.add(rdbtnTigre);
        group.add(rdbtnLeon);
        
        imageLabel = new JLabel("");
        imageLabel.setBounds(168, 67, 214, 162);  
        contentPane.add(imageLabel);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String imagePath = null;
                if (rdbtnPerro.isSelected()) {
                    imagePath = "image/perro.jpg";
                } else if (rdbtnGato.isSelected()) {
                    imagePath = "image/gato.jpg";
                } else if (rdbtnTigre.isSelected()) {
                    imagePath = "image/tigre.jpg";
                } else if (rdbtnLeon.isSelected()) {
                    imagePath = "image/leon.jpg";
                }
                
                if (imagePath != null) {
                    ImageIcon imageIcon = new ImageIcon(imagePath); 
                    imageLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH))); // Ajustar tamaño de la imagen
                }
            }
        };

        rdbtnPerro.addActionListener(actionListener);
        rdbtnGato.addActionListener(actionListener);
        rdbtnTigre.addActionListener(actionListener);
        rdbtnLeon.addActionListener(actionListener);
        
        Button button = new Button("Salir");
        button.setBounds(285, 35, 70, 22);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        contentPane.add(button);
        
        JLabel lblNewLabel = new JLabel("Elija una opcion para ver la imagen");
        lblNewLabel.setBounds(33, 22, 246, 34);
        contentPane.add(lblNewLabel);
    }
}
