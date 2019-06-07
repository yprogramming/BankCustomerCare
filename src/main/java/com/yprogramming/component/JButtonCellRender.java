/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.component;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author yProgramming
 */
public class JButtonCellRender implements TableCellRenderer {
    String buttonText;
    public JButtonCellRender(){}
    public JButtonCellRender(String text){
        buttonText = text;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JButton cellButton = new JButton(buttonText);
        cellButton.setFont(new Font("Saysettha OT", Font.BOLD, 12));
        return cellButton;
    }
    
}
