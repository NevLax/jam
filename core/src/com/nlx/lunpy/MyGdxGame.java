package com.nlx.lunpy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	LoadResorse loader;
	Texture img;
	World world;
	Box2DDebugRenderer debugRenderer;
	SimplePhisikBody simpleBody;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		loader = new LoadResorse();
		img = loader.getBadLogo();
		world = new World(Vector2.Zero, true);
		debugRenderer = new Box2DDebugRenderer();
		simpleBody = new SimplePhisikBody(world);
	}

	@Override
	public void render () {
		world.step(1/60f, 4, 4);
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		//debugRenderer.render(world, camera.combined);

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		loader.dispose();
		world.dispose();
	}
}
