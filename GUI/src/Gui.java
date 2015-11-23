import java.awt.*;
import javax.swing.*;
import Model.*;

import Controller.GUIController;
//import View.InputView
import View.*;

public class Gui {
	static public void main(String arg[]) {
		//goi view dskdkljsk
		GUIView View = new GUIView();
		GUIModel Model = new GUIModel();
		
		GUIController controller = new GUIController(View,Model);
		View.setVisible(true);
	}
}
