import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.classfile.Constant;

public class model extends DefaultTableModel{
	public model(){
		super(constants.DATA, constants.TABLE_HEADER);
	}
}