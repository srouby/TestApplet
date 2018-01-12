import java.applet.Applet;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AppletLancerPoids extends Applet implements ActionListener {

	//private JPanel contentPane;
	private Container contentPane;
	private JLabel lblDistanceenM;
	private JLabel lblSexefOu;
	private JTextField txtDist;
	private JTextField txtSexe;
	private JButton btnCalculer;
	private JLabel lblNote;
	private JTextField txtNote;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public void init() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 397, 249);
		//contentPane = new JPanel();
		contentPane=this;
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDistanceenM = new JLabel("Distance (en m) :");
		lblDistanceenM.setBounds(32, 32, 99, 28);
		contentPane.add(lblDistanceenM);
		
		lblSexefOu = new JLabel("Sexe (F ou M) :");
		lblSexefOu.setBounds(32, 71, 99, 28);
		contentPane.add(lblSexefOu);
		
		txtDist = new JTextField();
		txtDist.setBounds(125, 36, 86, 20);
		contentPane.add(txtDist);
		txtDist.setColumns(10);
		
		txtSexe = new JTextField();
		txtSexe.setText("");
		txtSexe.setBounds(125, 75, 86, 20);
		contentPane.add(txtSexe);
		txtSexe.setColumns(10);
		
		btnCalculer = new JButton("Calculer");
		btnCalculer.addActionListener(this);
		btnCalculer.setBounds(32, 121, 89, 23);
		contentPane.add(btnCalculer);
		
		lblNote = new JLabel("Note :");
		lblNote.setBounds(164, 125, 46, 14);
		contentPane.add(lblNote);
		
		txtNote = new JTextField();
		txtNote.setBounds(216, 122, 86, 20);
		contentPane.add(txtNote);
		txtNote.setColumns(10);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		float d;
		char s;
		if (txtDist.getText().isEmpty() || txtSexe.getText().isEmpty() )
			txtNote.setText("");
		else
		{
			d = Float.parseFloat(txtDist.getText());
			s = txtSexe.getText().charAt(0);
			txtNote.setText(String.valueOf(Outils.Note(d, s)));
		}
	}
}
