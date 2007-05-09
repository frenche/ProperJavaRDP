/* PatBltOrder.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision$
 * Author: $Author$
 * Date: $Date$
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: 
 */
package net.propero.rdp.orders;

public class PatBltOrder extends DestBltOrder {

    private int bgcolor = 0;
    private int fgcolor = 0;
    private Brush brush = null;

    public PatBltOrder() {
	super();
	brush = new Brush();
    }

    public int getBackgroundColor() {
	return this.bgcolor;
    }
    
    public int getForegroundColor() {
	return this.fgcolor;
    }
    
    public Brush getBrush(){
   	return this.brush;
    }

    public void setBackgroundColor(int bgcolor) {
	this.bgcolor = bgcolor;
    }
    
    public void setForegroundColor(int fgcolor) {
	this.fgcolor = fgcolor;
    }

    public void reset() {
	super.reset();
	bgcolor = 0;
	fgcolor = 0;
	brush.reset();
    }
}
