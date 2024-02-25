
package model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Log  {
    private boolean up;
    private Date dateAdjust;

    public Log() {
    }

    public Log(Date dateAdjust, boolean up) {
        this.dateAdjust = dateAdjust;
        this.up = up;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean Up) {
        this.up = Up;
    }

    public Date getDateAdjust() {
        return dateAdjust;
    }

    public void setDateAdjust(Date dateAdjust) {
        this.dateAdjust = dateAdjust;
    }

    @Override
    public String toString() {
        String mark;
        if(up){
            mark = "UP";
        }else{
            mark = "DOWN";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(dateAdjust);
        System.out.printf("| %-10s | %-20s\n" ,mark, date);
        return "";
    }

    
    
    
}
