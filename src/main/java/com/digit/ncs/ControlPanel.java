package com.digit.ncs;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel implements ActionListener {
	JButton btnMEmp, btnMDep, btnMTitle;
	JFrame mainFrame;

	/**
	 * Create the panel.
	 */
	public ControlPanel() {
	}

	public ControlPanel(ERP_Application mainFrame) {
		mainFrameSetting(mainFrame);

		setBorder(new EmptyBorder(20, 20, 20, 20));
		setLayout(new GridLayout(1, 3, 20, 0));

		btnMEmp = new JButton("사원관리");
		btnMEmp.addActionListener(this);
		add(btnMEmp);

		btnMDep = new JButton("부서관리");
		btnMDep.addActionListener(this);
		add(btnMDep);

		btnMTitle = new JButton("직책관리");
		btnMTitle.addActionListener(this);
		add(btnMTitle);
	}

	private void mainFrameSetting(ERP_Application mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.setTitle("대구아이티ERP");
		// mainFrame.setBounds(100, 100, 400, 150);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMEmp) {
			btnMEmpActionPerformed(e);
		} else if (e.getSource() == btnMDep) {
			btnMDepActionPerformed(e);
		} else if (e.getSource() == btnMTitle) {
			btnMTitleActionPerformed(e);
		}
	}

	protected void btnMEmpActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "직원 관리 선택");
		JPanel contentPane = (JPanel) mainFrame.getContentPane();
		contentPane.removeAll();

		MEmpPanel mEmpPanel = new MEmpPanel(mainFrame);
		contentPane.add(mEmpPanel);
		mainFrame.revalidate();
	}

	protected void btnMDepActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "부서관리 선택");
	}

	protected void btnMTitleActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "직책관리 선택");
	}

}
