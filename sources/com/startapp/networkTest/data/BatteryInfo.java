package com.startapp.networkTest.data;

import com.startapp.b1;
import com.startapp.networkTest.enums.BatteryChargePlugTypes;
import com.startapp.networkTest.enums.BatteryHealthStates;
import com.startapp.networkTest.enums.BatteryStatusStates;
import java.io.Serializable;

/* compiled from: Sta */
public class BatteryInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = -937846764179533362L;
    public int BatteryCapacity;
    public BatteryChargePlugTypes BatteryChargePlug = BatteryChargePlugTypes.Unknown;
    public int BatteryCurrent;
    public BatteryHealthStates BatteryHealth = BatteryHealthStates.Unknown;
    public float BatteryLevel;
    public long BatteryRemainingEnergy;
    public BatteryStatusStates BatteryStatus = BatteryStatusStates.Unknown;
    public String BatteryTechnology = "";
    public String BatteryTemp = "";
    public int BatteryVoltage;
    public boolean MissingPermission = false;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        StringBuilder a10 = b1.a("BatteryLevel: ");
        a10.append(this.BatteryLevel);
        a10.append("% BatteryStatus: ");
        a10.append(this.BatteryStatus);
        a10.append(" BatteryHealth: ");
        a10.append(this.BatteryHealth);
        a10.append(" BatteryVoltage: ");
        a10.append(this.BatteryVoltage);
        a10.append(" mV BatteryTemp: ");
        a10.append(this.BatteryTemp);
        a10.append(" °C BatteryChargePlug: ");
        a10.append(this.BatteryChargePlug);
        a10.append(" BatteryTechnology: ");
        a10.append(this.BatteryTechnology);
        a10.append(" Battery Current ");
        a10.append(this.BatteryCurrent);
        a10.append(" mA BatteryCapacity ");
        a10.append(this.BatteryCapacity);
        a10.append(" mAh BatteryRemainingEnergy ");
        a10.append(this.BatteryRemainingEnergy);
        a10.append(" nWh");
        return a10.toString();
    }
}
