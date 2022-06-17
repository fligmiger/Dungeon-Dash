/*
2022-06-07
Matthew, Avinash, Jason
skeleton class
 */
package Enemy;

import finalproject_dungeondash.DrawingSurface;
import finalproject_dungeondash.Entity;

/**
 *
 * @author anusoumyaganapathy
 */
public class Skeleton extends Entity {
// instatntiate nessisary variables 

    int x;
    int y;
    int randomInt;

    /**
     * constructs a new skeleton
     *
     * @param ds the drawing surface variables
     */
    public Skeleton(DrawingSurface ds) {
        super(ds);
        //set all atributes of the skeleton  to its required values

        maxLife = 1;
        life = maxLife;
        sizeX = 64;
        sizeY = 64;
        direction = "up";
        speed = 4;
        spriteDirection = 'l';
        solidArea.x = 16;
        solidArea.y = 44;
        solidArea.width = 32;
        solidArea.height = 20;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        // invoke the get sprites method
        getSprites();
    }

    /**
     * load the images into the file
     */
    public void getSprites() {
        // load all 4 sprites into netbeans 
        idle1 = setup("/meleeEnemySprites/skelet_idle_anim_f0", sizeX, sizeY);
        idle2 = setup("/meleeEnemySprites/skelet_idle_anim_f1", sizeX, sizeY);
        idle3 = setup("/meleeEnemySprites/skelet_idle_anim_f2", sizeX, sizeY);
        idle4 = setup("/meleeEnemySprites/skelet_idle_anim_f3", sizeX, sizeY);
    }

}
