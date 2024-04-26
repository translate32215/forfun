package com.startapp.networkTest.results;

import com.startapp.db;
import com.startapp.h6;
import com.startapp.ia;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.data.radio.ApnInfo;
import com.startapp.networkTest.data.radio.CellInfo;
import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.CtTestTypes;
import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.ob;
import com.startapp.q2;
import com.startapp.r5;
import com.startapp.x6;
import com.startapp.x9;
import java.util.ArrayList;

/* compiled from: Sta */
public class ConnectivityTestResult extends BaseResult {
    public String AirportCode;
    public String AmazonId = "";
    @ob(type = ArrayList.class, value = ApnInfo.class)
    public ArrayList<ApnInfo> ApnInfo;
    @ob(complex = true)
    public BatteryInfo BatteryInfo;
    public long BytesRead = -1;
    public CallStates CallState;
    @ob(type = ArrayList.class, value = CellInfo.class)
    public ArrayList<CellInfo> CellInfo;
    public String CtId = "";
    @ob(complex = true)
    public q2 DeviceInfo;
    public long DurationDNS = -1;
    public long DurationHttpGetCommand = -1;
    public long DurationHttpReceive = -1;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public long DurationSSL = -1;
    public long DurationTcpConnect = -1;
    public String ErrorReason;
    public int HTTPStatus = -1;
    public long HeaderBytesRead = -1;
    public IdleStates IdleStateOnEnd;
    public IdleStates IdleStateOnStart;
    public int IsAppInForeground;
    public boolean IsKeepAlive = false;
    @ob(complex = true)
    public IspInfo IspInfo;
    public boolean LocalhostPingSuccess = false;
    @ob(complex = true)
    public LocationInfo LocationInfo;
    @ob(complex = true)
    public h6 MemoryInfo;
    @ob(type = ArrayList.class, value = x6.class)
    public ArrayList<x6> MultiCdnInfo;
    @ob(type = ArrayList.class, value = NetworkRegistrationInfo.class)
    public ArrayList<NetworkRegistrationInfo> NetworkRegistrationInfo;
    @ob(complex = true)
    public RadioInfo RadioInfo;
    @ob(complex = true)
    public RadioInfo RadioInfoOnEnd;
    public ScreenStates ScreenState = ScreenStates.Unknown;
    public String ServerFilename = "";
    public String ServerHostname = "";
    public String ServerIp = "";
    public long ServerMultiSuccess;
    @ob(complex = true)
    public x9 SimInfo;
    public String SslException;
    @ob(complex = true)
    public ia StorageInfo;
    public boolean Success = false;
    public String TestTimestamp = "";
    public CtTestTypes TestType = CtTestTypes.Unknown;
    @ob(complex = true)
    public TimeInfo TimeInfo;
    @ob(complex = true)
    public db TrafficInfo;
    public long TruststoreTimestamp;
    public NetworkTypes VoiceNetworkType;
    @ob(complex = true)
    public WifiInfo WifiInfo;

    public ConnectivityTestResult(String str, String str2) {
        super(str, str2);
        IdleStates idleStates = IdleStates.Unknown;
        this.IdleStateOnStart = idleStates;
        this.IdleStateOnEnd = idleStates;
        this.ErrorReason = "";
        this.SslException = "";
        this.CallState = CallStates.Unknown;
        this.VoiceNetworkType = NetworkTypes.Unknown;
        this.ServerMultiSuccess = -1;
        this.AirportCode = "";
        this.IsAppInForeground = -1;
        this.BatteryInfo = new BatteryInfo();
        this.DeviceInfo = new q2();
        this.LocationInfo = new LocationInfo();
        this.MemoryInfo = new h6();
        this.RadioInfo = new RadioInfo();
        this.RadioInfoOnEnd = new RadioInfo();
        this.StorageInfo = new ia();
        this.TrafficInfo = new db();
        this.WifiInfo = new WifiInfo();
        this.TimeInfo = new TimeInfo();
        this.IspInfo = new IspInfo();
        this.SimInfo = new x9();
        this.MultiCdnInfo = new ArrayList<>();
        this.CellInfo = new ArrayList<>();
        this.ApnInfo = new ArrayList<>();
        this.NetworkRegistrationInfo = new ArrayList<>();
    }

    public String toJson() {
        return r5.a(FileTypes.CT, (BaseResult) this);
    }
}
