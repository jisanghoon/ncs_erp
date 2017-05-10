package com.digit.ncs;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MEmpPanel extends JPanel {
	private JTextField txtNum;
	private JTextField txtName;
	private JTextField txtJoin;

	/**
	 * Create the panel.
	 */
	public MEmpPanel() {
		setLayout(new GridLayout(0, 1, 0, 0));

		JPanel row1_1 = new JPanel();
		add(row1_1);
		row1_1.setLayout(null);

		JLabel lblNum = new JLabel("번호");
		lblNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNum.setBounds(192, 10, 57, 15);
		row1_1.add(lblNum);

		txtNum = new JTextField();
		txtNum.setEditable(false);
		txtNum.setBounds(300, 7, 170, 21);
		row1_1.add(txtNum);
		txtNum.setColumns(10);

		JPanel row1_2 = new JPanel();
		add(row1_2);
		row1_2.setLayout(null);

		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(192, 10, 57, 15);
		row1_2.add(lblName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(300, 7, 170, 21);
		row1_2.add(txtName);

		JPanel row1_3 = new JPanel();
		add(row1_3);
		row1_3.setLayout(null);

		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(192, 10, 57, 15);
		row1_3.add(lblTitle);

		JComboBox comboTitle = new JComboBox();
		comboTitle.setBounds(300, 7, 170, 21);
		row1_3.add(comboTitle);

		JPanel row1_4 = new JPanel();
		add(row1_4);
		row1_4.setLayout(null);

		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalary.setBounds(192, 10, 57, 15);
		row1_4.add(lblSalary);

		JSpinner spinSalary = new JSpinner();
		spinSalary.setBounds(300, 7, 170, 22);
		row1_4.add(spinSalary);

		JPanel row1_5 = new JPanel();
		add(row1_5);
		row1_5.setLayout(null);

		JLabel lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setBounds(192, 10, 57, 15);
		row1_5.add(lblGender);

		JRadioButton radioM = new JRadioButton("남");
		radioM.setSelected(true);
		radioM.setBounds(333, 6, 44, 23);
		row1_5.add(radioM);

		JRadioButton radioW = new JRadioButton("여");
		radioW.setBounds(387, 6, 44, 23);
		row1_5.add(radioW);

		JPanel row1_6 = new JPanel();
		add(row1_6);
		row1_6.setLayout(null);

		JLabel lblDep = new JLabel("부서");
		lblDep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDep.setBounds(192, 10, 57, 15);
		row1_6.add(lblDep);

		JComboBox comboDep = new JComboBox();
		comboDep.setBounds(300, 7, 170, 21);
		row1_6.add(comboDep);

		JPanel row1_7 = new JPanel();
		add(row1_7);
		row1_7.setLayout(null);

		JLabel lblJoin = new JLabel("입사일");
		lblJoin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJoin.setBounds(192, 10, 57, 15);
		row1_7.add(lblJoin);

		txtJoin = new JTextField();
		txtJoin.setColumns(10);
		txtJoin.setBounds(300, 7, 170, 21);
		row1_7.add(txtJoin);

		JPanel row2 = new JPanel();
		add(row2);
		row2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnAdd = new JButton("추가");
		row2.add(btnAdd);

		JButton btnCancel = new JButton("입사일");
		row2.add(btnCancel);

		JPanel row3 = new JPanel();
		add(row3);
		row3.setLayout(null);

	}

	public MEmpPanel(ERP_Application mainFrame) {
		mainFrameSetting(mainFrame);

	}

	public MEmpPanel(JFrame mainFrame) {
		// TODO Auto-generated constructor stub
	}

	private void mainFrameSetting(ERP_Application mainFrame) {
		mainFrame.setTitle("사원관리");
	}
}
