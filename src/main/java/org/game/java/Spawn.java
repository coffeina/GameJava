package org.game.java;

import java.util.Random;

/**
 * Created by andrzejdubaj on 13.03.2017.
 */
public class Spawn {
    private Handler handler;
    private HUD hud;
    private int scoreKeep = 0;
    private Random r = new Random();

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreKeep++;
        if (scoreKeep >= 100) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            if (hud.getLevel() == 2) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 3) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 4) {
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
            }
        }
    }

}