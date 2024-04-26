package com.startapp;

import com.startapp.networkTest.enums.Os;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;

/* compiled from: Sta */
public class q2 implements Cloneable {
    @ob(complex = true)
    public l1 BluetoothInfo = new l1();
    public String BuildFingerprint = "";
    public String DeviceManufacturer = "";
    public String DeviceName = "";
    public long DeviceUpTime;
    @ob(complex = true)
    public x3 HostAppInfo = new x3();
    public boolean IsRooted;
    @ob(complex = true)
    public y6 MultiSimInfo = new y6();
    public Os OS = Os.Android;
    public String OSVersion = "";
    public String OsSystemVersion = "";
    public int PhoneCount = -1;
    public PhoneTypes PhoneType = PhoneTypes.Unknown;
    public ThreeState PowerSaveMode = ThreeState.Unknown;
    public String SimOperator = "";
    public String SimOperatorName = "";
    public SimStates SimState = SimStates.Unknown;
    public String TAC = "";
    public String UserLocal = "";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
