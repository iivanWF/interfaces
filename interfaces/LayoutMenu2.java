package primeraEvaluacion.interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class LayoutMenu2 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutMenu2 frame = new LayoutMenu2();
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
	public LayoutMenu2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir Archivo");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Guardar");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Gestion");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Borrar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_1.addActionListener(actionListener);
        mntmNewMenuItem_3.addActionListener(actionListener);
        mntmNewMenuItem.addActionListener(actionListener);
        mnNewMenu_1.addActionListener(actionListener);
        mntmNewMenuItem_2.addActionListener(actionListener);
        mntmNewMenuItem_4.addActionListener(actionListener);
        mntmNewMenuItem_5.addActionListener(actionListener);
	}
	
	ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	JMenuItem source = (JMenuItem) e.getSource();
            JOptionPane.showMessageDialog(null, "Has seleccionado la opción: " + source.getText());
        }
    };


}
