

import javax.swing.JApplet;

/**
 *
 * @author Ace_GCR_
 */
public class CirCalc extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setContentPane(new CircleCalculator());// TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
