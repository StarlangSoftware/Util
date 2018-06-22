package Util;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;

public class DrawingButton extends JButton {

    /**
     * A constructor of {@link DrawingButton} class.
     *
     * @param currentClass A {@link Class} type input.
     * @param actionListener {@link ActionListener} type input.
     * @param imageName String input.
     * @param actionCommand String input.
     * @param toolTipText String input.
     */
    public DrawingButton(Class currentClass, ActionListener actionListener, String imageName, String actionCommand, String toolTipText) {
        String imgLocation = "/icons/" + imageName + ".png";
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
