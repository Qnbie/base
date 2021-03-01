import com.google.common.collect.Table;

import java.util.Date;

class tachograph{
    //current time, joystick position, reference speed
    public Table<Date, Float, Float> tachoTable;

    public void addEntry(Date time, Float joyPos, Float refSpeed){
        tachoTable.put(time,joyPos,refSpeed);
    }

    public int getSize(){
        return tachoTable.size();
    }

}