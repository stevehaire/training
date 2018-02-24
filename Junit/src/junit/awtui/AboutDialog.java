package junit.awtui;

import java.awt.*;
import java.awt.event.*;

import junit.runner.Version;

class AboutDialog extends Dialog {
	public AboutDialog(Frame parent) {
		super(parent);

		setResizable(false);
		setLayout(new GridBagLayout());
		setSize(330, 138);
		setTitle("About");

		Button button = new Button("Close");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});


		GridBagConstraints constraintsLabel2 = new GridBagConstraints();
		constraintsLabel2.gridx = 2;
		constraintsLabel2.gridy = 1;
		constraintsLabel2.gridwidth = 2;
		constraintsLabel2.gridheight = 1;
		constraintsLabel2.anchor = GridBagConstraints.CENTER;
		add(label2, constraintsLabel2);

		GridBagConstraints constraintsButton1 = new GridBagConstraints();
		constraintsButton1.gridx = 2;
		constraintsButton1.gridy = 2;
		constraintsButton1.gridwidth = 2;
		constraintsButton1.gridheight = 1;
		constraintsButton1.anchor = GridBagConstraints.CENTER;
		constraintsButton1.insets = new Insets(8, 0, 8, 0);
		add(button, constraintsButton1);

		GridBagConstraints constraintsLogo1 = new GridBagConstraints();
		constraintsLogo1.gridx = 2;
		constraintsLogo1.gridy = 0;
		constraintsLogo1.gridwidth = 1;
		constraintsLogo1.gridheight = 1;
		constraintsLogo1.anchor = GridBagConstraints.CENTER;
		add(logo, constraintsLogo1);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}