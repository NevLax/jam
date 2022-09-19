package com.nlx.lunpy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nlx.lunpy.player.Player;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	LoadResorse loader;
	World world;
	Box2DDebugRenderer debugRenderer;
	SimplePhisikBody simpleBody;
	Viewport viewport;
	Camera camera;
	Player player;
	
	@Override
	public void create () {
		loader = new LoadResorse();
		world = new World(Vector2.Zero, true);

		batch = new SpriteBatch();
		debugRenderer = new Box2DDebugRenderer();
		camera = new OrthographicCamera();
		viewport = new ExtendViewport(1280, 720, camera);

		player = new Player(world, loader);
	}

	@Override
	public void render () {
		player.update();
		world.step(1/60f, 4, 4);

		ScreenUtils.clear(0.1f, 0.1f, 0.22f, 0f);
		batch.begin();
		player.draw(batch);
		batch.end();

		debugRenderer.render(world, camera.combined);
	}

	public void resize(int width, int height) {
		viewport.update(width, height);
	}

	@Override
	public void dispose () {
		batch.dispose();
		loader.dispose();
		world.dispose();
		simpleBody.dispose();
	}
}