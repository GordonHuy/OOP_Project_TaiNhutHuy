package MainGame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSize {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public int getScrWidth() {
		return screenSize.width;
	}

	public int getScrHeight() {
		return screenSize.height;
	}

	public int getYardWidth() {
		return getScrWidth()*50/100;
	}


	public int getYardHeight() {
		return getScrHeight();
	}
    
	
	public int getGameScrWidth() {
		return screenSize.width*50/100;
	}

	public int getGameScrHeight() { return screenSize.height*40/100; }
    
	 
}
