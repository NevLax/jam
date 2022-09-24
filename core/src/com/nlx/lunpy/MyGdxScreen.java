package com.nlx.lunpy;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nlx.lunpy.player.Player;

public class MyGdxScreen implements Screen {
	final MainGame game;
	SpriteBatch batch;
	LoadResourse loader;
	World world;
	Box2DDebugRenderer debugRenderer;
	Viewport viewport;
	Camera camera;
	Player player;

	MyGdxScreen(final MainGame mainGame, MyInput input) {
		game = mainGame;

		loader = new LoadResourse();
		world = new World(Vector2.Zero, true);
		player = new Player(world, loader, input);
		viewport = new ExtendViewport(1280, 720);

		debugRenderer = new Box2DDebugRenderer();
		camera = new OrthographicCamera(1280,720);
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
	}

	@Override
	public void render(float delta) {
		player.update();
		world.step(1/60f, 4, 4);

		ScreenUtils.clear(0.1f, 0.1f, 0.22f, 0f);
		batch.begin();
		player.draw(batch);
		batch.end();

		debugRenderer.render(world, camera.combined);
	}

	public void resize(int width, int height) {
		viewport.update(1280, 720);
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void show() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose () {
		batch.dispose();
		loader.dispose();
		world.dispose();
		player.dispose();
	}
}