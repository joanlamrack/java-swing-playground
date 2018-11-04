import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class controller implements ActionListener {
	private JTextField searchTermTextField = new JTextField(26);
	private DefaultTableModel model;

	public controller(JTextField searchTermTextField, DefaultTableModel model) {
		super();
		this.searchTermTextField = searchTermTextField;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String searchTerm = searchTermTextField.getText();
		if (searchTerm != null && !"".equals(searchTerm)) {
			Object[][] newData = new Object[constants.DATA.length][];
			int idx = 0;
			for (Object[] o : constants.DATA) {
				if ("*".equals(searchTerm.trim())) {
					newData[idx++] = o;
				} else {
					if (String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim())) {
						newData[idx++] = o;
					}
				}
			}
			model.setDataVector(newData, constants.TABLE_HEADER);
		} else {
			JOptionPane.showMessageDialog(null, "Search term is empty", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}