package com.breakoutgdx.main;

import com.badlogic.gdx.Game;

import com.breakoutgdx.game.BreakoutGame;
public class MainScreen extends Game {
	public void create() {
		this.setScreen(new BreakoutGame());
	}
}
