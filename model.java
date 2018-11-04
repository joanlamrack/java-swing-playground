import javax.swing.table.DefaultTableModel;

public class model extends DefaultTableModel{
	public model(){
		super(constants.DATA, constants.TABLE_HEADER);
	}
}