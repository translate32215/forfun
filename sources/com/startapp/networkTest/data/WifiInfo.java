package com.startapp.networkTest.data;

import com.startapp.b1;
import com.startapp.networkTest.enums.HotspotStates;
import com.startapp.networkTest.enums.WifiStates;
import com.startapp.networkTest.enums.wifi.WifiAuthAlgorithms;
import com.startapp.networkTest.enums.wifi.WifiDetailedStates;
import com.startapp.networkTest.enums.wifi.WifiGroupCiphers;
import com.startapp.networkTest.enums.wifi.WifiKeyManagements;
import com.startapp.networkTest.enums.wifi.WifiPairwiseCiphers;
import com.startapp.networkTest.enums.wifi.WifiProtocols;
import com.startapp.networkTest.enums.wifi.WifiSupplicantStates;
import java.io.Serializable;

/* compiled from: Sta */
public class WifiInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 8111287616823344527L;
    public HotspotStates HotspotState = HotspotStates.Unknown;
    public boolean MissingPermission = false;
    public WifiAuthAlgorithms WifiAuthAlgorithm = WifiAuthAlgorithms.Unknown;
    public String WifiBSSID = "";
    public transient String WifiBSSID_Full;
    public WifiDetailedStates WifiDetailedState = WifiDetailedStates.Unknown;
    public int WifiFrequency = 0;
    public WifiGroupCiphers WifiGroupCipher = WifiGroupCiphers.Unknown;
    public WifiKeyManagements WifiKeyManagement = WifiKeyManagements.Unknown;
    public int WifiLinkQuality = -1;
    public String WifiLinkSpeed = "";
    public transient long WifiLinkSpeedBps;
    public transient String WifiMacAddress = "";
    public WifiPairwiseCiphers WifiPairwiseCipher = WifiPairwiseCiphers.Unknown;
    public WifiProtocols WifiProtocol = WifiProtocols.Unknown;
    public int WifiRxLev;
    public String WifiSSID = "";
    public transient String WifiSSID_Full;
    public WifiStates WifiState = WifiStates.Unknown;
    public WifiSupplicantStates WifiSupplicantState = WifiSupplicantStates.Unknown;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder a10 = b1.a("WifiState: ");
        a10.append(this.WifiState);
        a10.append("\n");
        sb2.append(a10.toString());
        sb2.append("WifiDetailedState: " + this.WifiDetailedState + "\n");
        sb2.append("WifiSupplicantState: " + this.WifiSupplicantState + "\n");
        sb2.append("WifiProtocol: " + this.WifiProtocol + "\n");
        sb2.append("WifiGroupCipher: " + this.WifiGroupCipher + "\n");
        sb2.append("WifiAuthAlgorithm: " + this.WifiAuthAlgorithm + "\n");
        sb2.append("WifiPairwiseCipher: " + this.WifiPairwiseCipher + "\n");
        sb2.append("WifiFrequency: " + this.WifiFrequency + "\n");
        sb2.append("WifiLinkQuality: " + this.WifiLinkQuality + "\n");
        sb2.append("WifiLinkSpeed: " + this.WifiLinkSpeed + "\n");
        sb2.append("WifiRxLev: " + this.WifiRxLev + "\n");
        sb2.append("WifiBSSID: " + this.WifiBSSID + "\n");
        sb2.append("WifiSSID: " + this.WifiSSID + "\n");
        sb2.append("WifiMacAddress: " + this.WifiMacAddress + "\n");
        return sb2.toString();
    }
}
