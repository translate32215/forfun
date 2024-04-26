package com.startapp.networkTest.results;

import com.startapp.db;
import com.startapp.h6;
import com.startapp.i8;
import com.startapp.j8;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.ConnectionTypes;
import com.startapp.networkTest.enums.IpVersions;
import com.startapp.networkTest.enums.MeasurementTypes;
import com.startapp.networkTest.enums.NetworkGenerations;
import com.startapp.networkTest.enums.SpeedtestEndStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointBase;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.ob;
import com.startapp.q2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Sta */
public class P3TestResult extends BaseResult {
    public int AvgValue;
    @ob(complex = true)
    public BatteryInfo BatteryInfoOnEnd = new BatteryInfo();
    @ob(complex = true)
    public BatteryInfo BatteryInfoOnStart = new BatteryInfo();
    public String CampaignId = "";
    public long ConnectingTimeControlServer = -1;
    public long ConnectingTimeTestServerControl = -1;
    public long ConnectingTimeTestServerSockets = -1;
    public String CustomerID = "";
    @ob(complex = true)
    public q2 DeviceInfo = new q2();
    public String IMEI = "";
    public String IMSI = "";
    public IpVersions IpVersion = IpVersions.Unknown;
    public int IsAppInForeground = -1;
    @ob(complex = true)
    public LocationInfo LocationInfoOnEnd = new LocationInfo();
    @ob(complex = true)
    public LocationInfo LocationInfoOnStart = new LocationInfo();
    public int MaxValue;
    public MeasurementTypes MeasurementType = MeasurementTypes.Unknown;
    public int MedValue;
    @ob(complex = true)
    public h6 MemoryInfoOnEnd = new h6();
    @ob(complex = true)
    public h6 MemoryInfoOnStart = new h6();
    public String Meta = "";
    public int MinValue;
    @ob(type = ArrayList.class, value = i8.class)
    public ArrayList<i8> QuestionAnswerList = new ArrayList<>();
    public String QuestionnaireName = "";
    @ob(complex = true)
    public RadioInfo RadioInfoOnEnd = new RadioInfo();
    @ob(complex = true)
    public RadioInfo RadioInfoOnStart = new RadioInfo();
    public double RatShare2G;
    public double RatShare3G;
    public double RatShare4G;
    public double RatShare5G;
    public double RatShareUnknown;
    public double RatShareWiFi;
    public String SequenceID = "";
    public String Server = "";
    public boolean Success;
    public SpeedtestEndStates TestEndState = SpeedtestEndStates.Unknown;
    public SpeedtestEngineError TestErrorReason = SpeedtestEngineError.OK;
    @ob(complex = true)
    public TimeInfo TimeInfoOnEnd = new TimeInfo();
    @ob(complex = true)
    public TimeInfo TimeInfoOnStart = new TimeInfo();
    @ob(complex = true)
    public db TrafficInfoOnEnd = new db();
    @ob(complex = true)
    public db TrafficInfoOnStart = new db();
    @ob(complex = true)
    public WifiInfo WifiInfoOnEnd = new WifiInfo();
    @ob(complex = true)
    public WifiInfo WifiInfoOnStart = new WifiInfo();

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11378a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.NetworkGenerations[] r0 = com.startapp.networkTest.enums.NetworkGenerations.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11378a = r0
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11378a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11378a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11378a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen5     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11378a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Unknown     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.results.P3TestResult.a.<clinit>():void");
        }
    }

    public P3TestResult(String str, String str2) {
        super(str, str2);
    }

    public void calcRatShare(ArrayList<? extends MeasurementPointBase> arrayList) {
        Iterator<? extends MeasurementPointBase> it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (it.hasNext()) {
            MeasurementPointBase measurementPointBase = (MeasurementPointBase) it.next();
            ConnectionTypes connectionTypes = measurementPointBase.ConnectionType;
            if (connectionTypes != ConnectionTypes.Unknown) {
                if (connectionTypes == ConnectionTypes.Mobile) {
                    NetworkGenerations b10 = j8.b(measurementPointBase.NetworkType);
                    if (measurementPointBase.NrState.equals("CONNECTED")) {
                        b10 = NetworkGenerations.Gen5;
                    }
                    int i17 = a.f11378a[b10.ordinal()];
                    if (i17 == 1) {
                        i16++;
                    } else if (i17 == 2) {
                        i15++;
                    } else if (i17 == 3) {
                        i14++;
                    } else if (i17 == 4) {
                        i13++;
                    }
                } else {
                    i12++;
                }
                i10++;
            }
            i11++;
            i10++;
        }
        if (i10 > 0) {
            double d10 = (double) i16;
            double d11 = (double) i10;
            Double.isNaN(d10);
            Double.isNaN(d11);
            this.RatShare2G = d10 / d11;
            double d12 = (double) i15;
            Double.isNaN(d12);
            Double.isNaN(d11);
            this.RatShare3G = d12 / d11;
            double d13 = (double) i14;
            Double.isNaN(d13);
            Double.isNaN(d11);
            this.RatShare4G = d13 / d11;
            double d14 = (double) i13;
            Double.isNaN(d14);
            Double.isNaN(d11);
            this.RatShare5G = d14 / d11;
            double d15 = (double) i12;
            Double.isNaN(d15);
            Double.isNaN(d11);
            this.RatShareWiFi = d15 / d11;
            double d16 = (double) i11;
            Double.isNaN(d16);
            Double.isNaN(d11);
            this.RatShareUnknown = d16 / d11;
        }
    }
}
