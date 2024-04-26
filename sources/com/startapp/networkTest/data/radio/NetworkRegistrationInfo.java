package com.startapp.networkTest.data.radio;

import com.startapp.networkTest.enums.ThreeStateShort;
import java.io.Serializable;

/* compiled from: Sta */
public class NetworkRegistrationInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 9179460790954950419L;
    public int Age;
    public int Arfcn;
    public String AvailableServices;
    public int Bandwidth;
    public ThreeStateShort CarrierAggregation;
    public String CellId;
    public String CellTechnology;
    public ThreeStateShort DcNrRestricted;
    public String Domain = "";
    public boolean EmergencyEnabled = false;
    public ThreeStateShort EnDcAvailable;
    public int MaxDataCalls;
    public String Mcc;
    public String Mnc;
    public String NetworkTechnology = "";
    public ThreeStateShort NrAvailable;
    public String NrState;
    public String OperatorLong;
    public String OperatorShort;
    public String Pci;
    public String ReasonForDenial = "";
    public String RegState = "";
    public String Tac;
    public String TransportType = "";

    public NetworkRegistrationInfo() {
        ThreeStateShort threeStateShort = ThreeStateShort.Unknown;
        this.CarrierAggregation = threeStateShort;
        this.CellTechnology = "";
        this.CellId = "";
        this.Tac = "";
        this.Pci = "";
        this.Arfcn = -1;
        this.Bandwidth = -1;
        this.Mcc = "";
        this.Mnc = "";
        this.OperatorLong = "";
        this.OperatorShort = "";
        this.MaxDataCalls = -1;
        this.AvailableServices = "";
        this.NrState = "Unknown";
        this.DcNrRestricted = threeStateShort;
        this.NrAvailable = threeStateShort;
        this.EnDcAvailable = threeStateShort;
        this.Age = -1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
