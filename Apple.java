import java.awt.Graphics;
import java.awt.Color;
public class Apple
{
  private int xCoor,yCoor,width,height;
  public Apple(int xCoor,int yCoor,int tilesize)
  {
      this.xCoor=xCoor;
      this.yCoor=yCoor;
      width = tilesize;
      height = tilesize;

  }
  
  public void draw(Graphics g)
  {
    g.setColor(Color.RED);
    g.fillRect(xCoor*width,yCoor*height,width,height);
  }
  public void setxCoor(int xCoor)
  {
    this.xCoor=xCoor;
  }
  public void setyCoor(int yCoor)
  {
    this.yCoor=yCoor;
  }
  public int getxCoor()
  {
    return this.xCoor;
  }
  public int getyCoor()
  {
    return this.yCoor;
  }
}
