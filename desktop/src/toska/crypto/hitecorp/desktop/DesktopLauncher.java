package toska.crypto.hitecorp.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import toska.crypto.hitecorp.gameclass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new gameclass(), config);
		//launcher width and height
		config.width = 800;
		config.height = 600;
	}
}
