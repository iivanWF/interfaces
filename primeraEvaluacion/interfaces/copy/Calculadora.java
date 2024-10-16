package primeraEvaluacion.interfaces.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

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
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button7.setBounds(67, 86, 47, 31);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button8.setBounds(124, 86, 47, 31);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button9.setBounds(184, 86, 47, 31);
		contentPane.add(button9);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button4.setBounds(67, 128, 47, 31);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button5.setBounds(124, 128, 47, 31);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button6.setBounds(184, 128, 47, 31);
		contentPane.add(button6);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button1.setBounds(67, 170, 47, 31);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button2.setBounds(124, 170, 47, 31);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button3.setBounds(184, 170, 47, 31);
		contentPane.add(button3);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button0.setBounds(67, 212, 47, 31);
		contentPane.add(button0);
		
		JButton resul = new JButton("Calcular");
		resul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		resul.setBounds(124, 212, 107, 31);
		contentPane.add(resul);
		
		JButton sum = new JButton("+");
		sum.setBounds(245, 86, 47, 31);
		contentPane.add(sum);

		JButton res = new JButton("-");
		res.setBounds(245, 128, 47, 31);
		contentPane.add(res);

		JButton mult = new JButton("*");
		mult.setBounds(245, 170, 47, 31);
		contentPane.add(mult);

		JButton div = new JButton("/");
		div.setBounds(245, 212, 47, 31);
		contentPane.add(div);

		ActionListener operatorListener = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = textField.getText();
		        String lastChar = currentText.length() > 0 ? currentText.substring(currentText.length() - 1) : "";
		        
		        if (!lastChar.equals("+") && !lastChar.equals("-") && !lastChar.equals("*") && !lastChar.equals("/")) {
		            textField.setText(currentText + ((JButton)e.getSource()).getText());
		        }
		    }
		};

		sum.addActionListener(operatorListener);
		res.addActionListener(operatorListener);
		mult.addActionListener(operatorListener);
		div.addActionListener(operatorListener);
		
		textField = new JTextField();
		textField.setBounds(67, 40, 164, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton delete = new JButton("<-");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
		        if (currentText.length() > 0) {
		            textField.setText(currentText.substring(0, currentText.length() - 1));
		        }
			}
		});
		delete.setBounds(245, 40, 47, 35);
		contentPane.add(delete);

	}
	
	public void calcular() {
		String input = textField.getText().trim(); 

	    String[] operands;
	    char operator = ' '; 

	    if (input.contains("+")) {
	        operands = input.split("\\+");
	        operator = '+';
	    } else if (input.contains("-")) {
	        operands = input.split("-");
	        operator = '-';
	    } else if (input.contains("*")) {
	        operands = input.split("\\*");
	        operator = '*';
	    } else if (input.contains("/")) {
	        operands = input.split("/");
	        operator = '/';
	    } else {
	        textField.setText("Error");  
	        return;
	    }
		
		if (operands.length == 2) {
	        try {
	            double num1 = Double.parseDouble(operands[0].trim()); 
	            double num2 = Double.parseDouble(operands[1].trim());
	            double result = 0;

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                    } else {
	                        textField.setText("No valido");
	                        return;
	                    }
	                    break;
	            }

	            textField.setText(String.valueOf(result));

	        } catch (NumberFormatException e) {
	            textField.setText("Formato inválido");
	        }
	    } else {
	        textField.setText("Formato inválido");
	    }
        
	}
	
}
