package entornomanager;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class MyListCellThing extends DefaultListCellRenderer {

    public MyListCellThing() {
      
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        MySelectedObject valuetmp = (MySelectedObject) value;
        value = valuetmp.getValue();
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(valuetmp.isExist()){
            c.setForeground(Color.BLUE);
        } 
        if (isSelected) {
             c.setBackground(Color.LIGHT_GRAY);
        }
        return c;
    }
 
}