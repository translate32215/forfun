package com.startapp.networkTest.results;

import com.startapp.ca;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import com.startapp.ob;
import java.util.ArrayList;

/* compiled from: Sta */
public class LatencyResult extends P3TestResult {
    public String AirportCode;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public double Jitter;
    public String LtrId = "";
    @ob(type = ArrayList.class, value = MeasurementPointLatency.class)
    public ArrayList<MeasurementPointLatency> MeasurementPoints;
    public int Pause;
    public int Pings;
    public ScreenStates ScreenStateOnEnd;
    public ScreenStates ScreenStateOnStart;
    public int SuccessfulPings;

    public LatencyResult(String str, String str2) {
        super(str, str2);
        ScreenStates screenStates = ScreenStates.Unknown;
        this.ScreenStateOnStart = screenStates;
        this.ScreenStateOnEnd = screenStates;
        this.AirportCode = "";
        this.MeasurementPoints = new ArrayList<>();
    }

    public void calculateStats(ArrayList<MeasurementPointLatency> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10).Rtt != -1) {
                arrayList2.add(Integer.valueOf(arrayList.get(i10).Rtt));
            }
        }
        this.MinValue = ca.e(arrayList2);
        this.MaxValue = ca.c(arrayList2);
        this.AvgValue = ca.a(arrayList2);
        this.MedValue = ca.d(arrayList2);
        this.Jitter = ca.b(arrayList2);
        this.MeasurementPoints = arrayList;
    }
}
