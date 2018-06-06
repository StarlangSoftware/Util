package Util;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;

public class DrawingButton extends JButton {

    public DrawingButton(Class currentClass, ActionListener actionListener, String imageName, String actionCommand, String toolTipText) {
        String imgLocation = "/icons/"+ imageName + ".png";
        URL imageURL = currentClass.getResource(imgLocation);
        setFocusable(false);
        setActionCommand(actionCommand);
        setToolTipText(toolTipText);
        addActionListener(actionListener);
        if (imageURL != null) {
            setIcon(new ImageIcon(imageURL));
        } else {
            setText(toolTipText);
            System.err.println("Resource not found: " + imgLocation);
        }
    }

}
