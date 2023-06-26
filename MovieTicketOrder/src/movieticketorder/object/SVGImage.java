/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MovieTicketOrder.object;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class SVGImage extends JLabel{
    private FlatSVGIcon svgIcon;
    private Timer timer;
    private int iconColor = 0;
    public void setSvgImage(String image, int width, int height){
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon(svgIcon);
    }
    
     public void animation() {
        if (svgIcon != null) {
            svgIcon.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
                @Override
                public Color apply(Color t) {
                    iconColor += 1;
                    iconColor %= 255;
                    return Color.getHSBColor(iconColor / 255f, 1, 1);
                }
            }));
            timer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SVGImage.this.repaint();
                }
            });
            timer.start();
        }
    }
}
