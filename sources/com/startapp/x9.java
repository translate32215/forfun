package com.startapp;

import com.startapp.networkTest.enums.SimStates;

/* compiled from: Sta */
public class x9 implements Cloneable {
    public String Apn = "";
    public String ApnTypes = "";
    public String CarrierName = "";
    public String CountryIso = "";
    public boolean DataRoaming = false;
    public String GroupIdentifierLevel1 = "";
    public String IMSI = "";
    public String IccId = "";
    public int Mcc = -1;
    public int Mnc = -1;
    public int SimSlotIndex = -1;
    public SimStates SimState = SimStates.Unknown;
    public int SubscriptionId = -1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
