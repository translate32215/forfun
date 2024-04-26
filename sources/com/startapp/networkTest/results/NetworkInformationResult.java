package com.startapp.networkTest.results;

import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.data.radio.CellInfo;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.ob;
import java.util.ArrayList;

/* compiled from: Sta */
public class NetworkInformationResult extends BaseResult {
    public CallStates CallState = CallStates.Unknown;
    public double CellIdDeltaDistance = -1.0d;
    @ob(type = ArrayList.class, value = CellInfo.class)
    public ArrayList<CellInfo> CellInfo = new ArrayList<>();
    @ob(complex = true)
    public LocationInfo LocationInfo = new LocationInfo();
    public String NirId = "";
    public String PrevCellId = "";
    public String PrevLAC = "";
    public String PrevMCC = "";
    public String PrevMNC = "";
    public NetworkTypes PrevNetworkType = NetworkTypes.Unknown;
    public String PrevNirId = "";
    public int PrevRXLevel;
    @ob(complex = true)
    public RadioInfo RadioInfo = new RadioInfo();
    public ScreenStates ScreenState = ScreenStates.Unknown;
    @ob(complex = true)
    public TimeInfo TimeInfo = new TimeInfo();
    public String Timestamp = "";
    public TriggerEvents TriggerEvent = TriggerEvents.Unknown;
    @ob(complex = true)
    public WifiInfo WifiInfo = new WifiInfo();
    public transient long timestampMillis;

    public NetworkInformationResult(String str, String str2) {
        super(str, str2);
    }
}
