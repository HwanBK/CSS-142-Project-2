import java.awt.Graphics;
import java.awt.Color;

/**
 * Creates two panels with images constructed with graphics.
 *
 * @author  Hwansu Kim (Billy)
 * @version 01/14/2022
 */

public class GraphicsProject {

    public static void main(String[] args) {
        drawPartOne();
        drawPartTwo();
    }

    public static void drawPartOne() {
        final int PANEL_SIZE = 600;
        DrawingPanel myPanel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
        Graphics myGraphics = myPanel.getGraphics();
        
        int myRed = 120;
        int myGreen = 215;
        int myBlue = 230;
        Color myColor = new Color(myRed, myGreen, myBlue);
        
        myPanel.setBackground(Color.BLACK);
        myGraphics.setColor(myColor);
        myGraphics.drawLine(0, 0, 599, 599);
        myGraphics.drawLine(599, 0, 0, 599);

        int xCoorOne = 3, yCoorOne = 3, xCoorTwo = 303, yCoorTwo = 303;
        int xCoorThree = 597, yCoorThree = 597, xCoorFour = 297, yCoorFour = 297;
        for (int lineCount = 1; lineCount <= 100; lineCount++) {
            myGraphics.setColor(myColor);
            myGraphics.drawLine(xCoorOne, yCoorOne, xCoorTwo, yCoorFour);
            myGraphics.drawLine(xCoorThree, yCoorOne, xCoorTwo, yCoorTwo);

            myGraphics.drawLine(xCoorThree, yCoorThree, xCoorFour,yCoorTwo);
            myGraphics.drawLine(xCoorOne, yCoorThree, xCoorFour, yCoorFour);

            xCoorOne += 3;
            yCoorOne += 3;

            xCoorTwo += 3;
            yCoorTwo += 3;

            xCoorThree -= 3;
            yCoorThree -= 3;

            xCoorFour -= 3;
            yCoorFour -= 3;
            
            myRed -= 1;
            myGreen -= 1;
            
            myColor = new Color(myRed, myGreen, myBlue);
        }
    }

    public static void drawPartTwo() {
        DrawingPanel secondPanel = new DrawingPanel(800, 800);
        Graphics secondGraphics = secondPanel.getGraphics();

        secondPanel.setBackground(new Color(20, 20, 100));

        drawRain(secondGraphics, Color.CYAN, 1, 1, 50, 150);
        
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 0, 0, 160, 100);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 80, 0, 120, 160);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 100, 0, 160, 120);
        
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 200, 0, 160, 120);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 280, 0, 120, 160);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 300, 0, 160, 120);
        
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 400, 0, 160, 120);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 480, 0, 120, 160);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 500, 0, 160, 120);
        
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 600, 0, 160, 120);
        drawCloud(secondGraphics, Color.LIGHT_GRAY, 680, 0, 130, 105);
        
        drawShirt(secondGraphics, Color.BLACK, 100, 695, 799, 300);
        drawHead(secondGraphics, Color.YELLOW);
        drawFace(secondGraphics, Color.BLACK, Color.RED);
    }

    public static void drawRain(Graphics graphObj, Color rainColor, int startX, int startY, int width, int height) {
        graphObj.setColor(rainColor);

        for (int xPos = startX; xPos <= 790; xPos = xPos + 40) {
            for (int yPos = startY; yPos <= 790; yPos += 100) {
                graphObj.fillArc(xPos, yPos, width, height, 270, 10);
            }
        }
    }

    public static void drawCloud(Graphics graphObj, Color cloudColor, int xPos, int yPos, int width, int height) {
        graphObj.setColor(cloudColor);
        graphObj.fillOval(xPos, yPos, width, height);
    }

    public static void drawShirt(Graphics graphObj, Color shirtColor, int xPos, int yPos, int width, int height) {
        graphObj.setColor(shirtColor);
        graphObj.fillOval(xPos, yPos, width, height);
    }
    
    public static void drawHead(Graphics graphObj, Color skinColor) {
        // Neck
        graphObj.setColor(skinColor);
        graphObj.fillRoundRect(350, 550, 200, 200, 100, 100);

        // Head
        graphObj.setColor(skinColor);
        graphObj.fillRoundRect(80, 50, 700, 600, 100, 100);
    }
    
    public static void drawFace(Graphics graphObj, Color eyeColor, Color mouthColor) {
        // Eyes
        graphObj.setColor(eyeColor);        
        graphObj.fillRoundRect(150, 200, 50, 200, 120, 100);
        graphObj.fillRoundRect(550, 200, 50, 200, 120, 100);

        // Brows
        graphObj.fillRoundRect(100, 200, 200, 100, 100, 100);
        graphObj.fillRoundRect(500, 200, 200, 100, 100, 100);

        // Mouth
        graphObj.setColor(mouthColor);
        graphObj.fillArc(250, 600, 300, 60, 45, 10);
    }
}
