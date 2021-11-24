package toska.crypto.hitecorp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class gameclass extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	OrthographicCamera camera;
	Control control;

	// Display Size
	private int displayW;
	private int displayH;

	// Temp x and y co-ords
	int x, y;

	// For Movement
	int direction_x, direction_y;
	int speed = 3;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		// CAMERA
		displayW = Gdx.graphics.getWidth();
		displayH = Gdx.graphics.getHeight();

		// For 800x600 we will get 266*200
		int h = (int) (displayH/Math.floor(displayH/160));
		int w = (int) (displayW/(displayH/ (displayH/Math.floor(displayH/160))));

		camera = new OrthographicCamera(w,h);
		camera.zoom = .4f;

		// Used to capture Keyboard Input
		control = new Control(displayW, displayH, camera);
		Gdx.input.setInputProcessor(control);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
