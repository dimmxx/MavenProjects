package mate.academy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PuffSmall extends Puff {

    private int shiftX = 73;
    private int shiftY = 60;
    private int hitBoxWidth = 155;
    private int hitBoxHeight = 52;

    public PuffSmall() {
        super();
        hitBox = new Rectangle(posX + shiftX, posY + shiftY, hitBoxWidth, hitBoxHeight);

        try {
            //image[0] = ImageIO.read(new File("src/res/plane/cloud2.png"));
            image[0] = ImageIO.read(getClass().getResource("/cloud2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void drawItem(Graphics g) {
        posX -= speed;
        hitBox.x = posX + shiftX;
        g.drawImage(image[0], posX, posY, null);
        if(posX < 0 - 250) reInit();
        if(CheckCollision.checkCollision(this.hitBox)){
            CheckCollision.isCollision = true;
            PanelGame.getPlane().setHealth(PanelGame.getPlane().getHealth() - 1);
        }
        //g.setColor(new Color(0, 0, 0));
        //g.drawRect(hitBox.x, hitBox.y, hitBox.width, hitBox.height);
    }

    @Override
    protected void reInit() {
        posX = GameFrame.FRAME_WIDTH + 200;
        posY = RndEng.rndEng(0, 450);
        speed = RndEng.rndEng(1, 11);
        hitBox.x = posX + shiftX;
        hitBox.y = posY + shiftY;
    }
}
