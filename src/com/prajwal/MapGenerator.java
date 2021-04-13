package com.prajwal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator
{
    // define map
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    // main mapGenerator method
    public MapGenerator (int row, int col)
    {
        map = new int[row][col];

        // create a grid for bricks
        for(int i = 0; i<map.length; i++)
        {
            for(int j =0; j<map[0].length; j++)
            {
                map[i][j] = 1;
            }
        }

        // define brick width and height
        brickWidth = 540/col;
        brickHeight = 150/row;
    }

    // main draw method
    public void draw(Graphics2D g)
    {

        for(int i = 0; i<map.length; i++)
        {
            for(int j =0; j<map[0].length; j++)
            {
                if(map[i][j] > 0)
                {
                    // set properties of bricks
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // show separate brick, game can still run without it
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    // main brick value method
    public void setBrickValue(int value, int row, int col)
    {
        map[row][col] = value;
    }
}
