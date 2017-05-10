package com.digit.ncs;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.digit.ncs.setting.service.ExportSettingService;
import com.digit.ncs.setting.service.ImportSettingService;
import com.digit.ncs.setting.service.InitSettingService;
import com.digit.ncs.setting.service.ServiceSetting;

@SuppressWarnings("serial")
public class SettingFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnInit;
	private JButton btnBackUp;
	private JButton btnRestore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingFrame frame = new SettingFrame();
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
	public SettingFrame() {
		setTitle("DB관리메뉴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);

		btnInit = new JButton("초기화");
		btnInit.addActionListener(this);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(btnInit);

		btnBackUp = new JButton("백업");
		btnBackUp.addActionListener(this);
		panel.add(btnBackUp);

		btnRestore = new JButton("복원");
		btnRestore.addActionListener(this);
		btnRestore.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(btnRestore);
	}

	public void actionPerformed(ActionEvent e) {

		ServiceSetting create = null;
		String msg = "";

		if (e.getSource() == btnRestore) {
			create = new ImportSettingService();
			msg = "데이터 복원 완료";

		} else if (e.getSource() == btnBackUp) {
			create = new ExportSettingService();
			msg = "데이터 백업 완료";

		} else if (e.getSource() == btnInit) {
			create = new InitSettingService();
			msg = "초기화 완료";
		}

		create.initSetting();
		JOptionPane.showMessageDialog(null, msg);
	}

}
