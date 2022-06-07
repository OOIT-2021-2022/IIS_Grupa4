package geometry;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import javax.swing.JButton;

public class TestFrm extends JFrame {

	private JPanel contentPane;
	private ButtonGroup btnGroup = new ButtonGroup();
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private DlgColor dlgColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrm frame = new TestFrm();
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
	public TestFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta");
		tglbtnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tglbtnZuta.getText());
			}
		});
		btnGroup.add(tglbtnZuta);
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 0;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);
		
		JLabel lblZuta = new JLabel("Zuta");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 0;
		pnlCenter.add(lblZuta, gbc_lblZuta);
		
		JToggleButton tglbtnCrvena = new JToggleButton("Crvena");
		tglbtnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tglbtnCrvena.getText());
			}
		});
		btnGroup.add(tglbtnCrvena);
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 1;
		pnlCenter.add(tglbtnCrvena, gbc_tglbtnCrvena);
		
		JLabel lblCrvena = new JLabel("Crvena");
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 1;
		pnlCenter.add(lblCrvena, gbc_lblCrvena);
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava");
		tglbtnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tglbtnPlava.getText());
			}
			
		});
		
		
		btnGroup.add(tglbtnPlava);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 2;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);
		
		JLabel lblPlava = new JLabel("Plava");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 2;
		pnlCenter.add(lblPlava, gbc_lblPlava);
		
		JButton btnDodajBoju = new JButton("Dodaj boju");
		btnDodajBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlgColor = new DlgColor();
				dlgColor.setVisible(true);
				if(dlgColor.isOk()) {
					System.out.println("isOk is true");
					int blue = dlgColor.getBlue();
					int red = dlgColor.getRed();
					int green = dlgColor.getGreen();
					
					String colors = dlgColor.getTxtRed().getText() + " " + dlgColor.getTxtGreen().getText() + " " + dlgColor.getTxtBlue().getText();
					dlm.addElement(colors);
					
					pnlCenter.setBackground(new Color(red, green, blue));
				}
				
			}
		});
		GridBagConstraints gbc_btnDodajBoju = new GridBagConstraints();
		gbc_btnDodajBoju.insets = new Insets(0, 0, 5, 0);
		gbc_btnDodajBoju.gridx = 3;
		gbc_btnDodajBoju.gridy = 2;
		pnlCenter.add(btnDodajBoju, gbc_btnDodajBoju);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		
		
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(Color.PINK);
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblZadatak = new JLabel("Zadatak1");
		pnlNorth.add(lblZadatak);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JButton btnKlikniMe = new JButton("Klikni me");
		btnKlikniMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)","Proba dugmeta", JOptionPane.INFORMATION_MESSAGE);				}
		});
		pnlSouth.add(btnKlikniMe);
		
		
		JButton btnIzmeniBoju = new JButton("Izmeni boju");
		btnIzmeniBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				String colors = dlm.get(index);//34 54 56
				String[] splits = colors.split(" ");
				DlgColor dlgC = new DlgColor();
				dlgC.getTxtRed().setText(splits[0]);
				dlgC.getTxtGreen().setText(splits[1]);
				dlgC.getTxtBlue().setText(splits[2]);
				dlgC.setVisible(true);
				
				if(dlgC.isOk()) {
					dlm.remove(index);
					String newColorString = dlgC.getTxtRed().getText() + " " + dlgC.getTxtGreen().getText() + " " + dlgC.getTxtBlue().getText();
					dlm.add(index, newColorString);
					pnlCenter.setBackground(new Color(dlgC.getRed(), dlgC.getGreen(), dlgC.getBlue()));
				}
				
				
			}
		});
		btnIzmeniBoju.setEnabled(false);
		GridBagConstraints gbc_btnIzmeniBoju = new GridBagConstraints();
		gbc_btnIzmeniBoju.insets = new Insets(0, 0, 5, 0);
		gbc_btnIzmeniBoju.gridx = 3;
		gbc_btnIzmeniBoju.gridy = 1;
		pnlCenter.add(btnIzmeniBoju, gbc_btnIzmeniBoju);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				btnIzmeniBoju.setEnabled(true);
			}
		});
	}

}
