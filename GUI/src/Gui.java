import java.awt.*;
import javax.swing.*;
import Model.*;
import View.*;

import Controller.GUIController;
//import View.InputView
import View.*;

public class Gui {
	static public void main(String arg[]) {
		//goi view dskdkljsk
		GUIView theView = new GUIView();
		GUIModel theModel = new GUIModel();
		
		GUIController controller = new GUIController(theView,theModel);
		theView.setVisible(true);
	}
}
