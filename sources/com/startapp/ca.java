package com.startapp;

import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Sta */
public class ca {
    public static int a(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        long j10 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            j10 += (long) list.get(i10).intValue();
        }
        return Math.round((float) (j10 / ((long) list.size())));
    }

    public static double b(List<Integer> list) {
        long j10 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            j10 += (long) list.get(i10).intValue();
        }
        double d10 = (double) j10;
        double size = (double) list.size();
        Double.isNaN(d10);
        Double.isNaN(size);
        double d11 = d10 / size;
        double d12 = 0.0d;
        for (int i11 = 0; i11 < list.size(); i11++) {
            double intValue = (double) list.get(i11).intValue();
            Double.isNaN(intValue);
            d12 += Math.pow(intValue - d11, 2.0d);
        }
        double size2 = (double) list.size();
        Double.isNaN(size2);
        double sqrt = Math.sqrt(d12 / size2);
        if (Double.isNaN(sqrt)) {
            return 0.0d;
        }
        return sqrt;
    }

    public static int c(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).intValue() > i10) {
                i10 = list.get(i11).intValue();
            }
        }
        return i10;
    }

    public static int d(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(list.get(i10));
        }
        Collections.sort(arrayList);
        if (arrayList.size() % 2 != 0) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        double intValue = (double) ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        double intValue2 = (double) ((Integer) arrayList.get((arrayList.size() / 2) - 1)).intValue();
        Double.isNaN(intValue);
        Double.isNaN(intValue2);
        return (int) Math.round((intValue + intValue2) / 2.0d);
    }

    public static int e(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).intValue() < i10) {
                i10 = list.get(i11).intValue();
            }
        }
        return i10;
    }

    public static int a(ArrayList<Integer> arrayList, int i10) {
        long round;
        int size = arrayList.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arrayList.get(0).intValue();
        }
        double d10 = (double) i10;
        Double.isNaN(d10);
        int i11 = size - 1;
        double d11 = (double) i11;
        Double.isNaN(d11);
        double d12 = (d10 / 100.0d) * d11;
        int i12 = (int) d12;
        double intValue = (double) arrayList.get(i12).intValue();
        double d13 = (double) i12;
        Double.isNaN(d13);
        double d14 = d12 - d13;
        if (i12 == i11 || d14 == 0.0d) {
            round = Math.round(intValue);
        } else {
            double intValue2 = (double) arrayList.get(i12 + 1).intValue();
            Double.isNaN(intValue2);
            Double.isNaN(intValue);
            Double.isNaN(intValue);
            round = Math.round(((intValue2 - intValue) * d14) + intValue);
        }
        return (int) round;
    }

    public static void b(ArrayList<?> arrayList, int i10) {
        arrayList.ensureCapacity(i10);
        while (arrayList.size() < i10) {
            arrayList.add((Object) null);
        }
    }

    public static MeasurementPointLatency a(long j10, RadioInfo radioInfo, long j11) {
        MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
        measurementPointLatency.Rtt = (int) j10;
        measurementPointLatency.ConnectionType = radioInfo.ConnectionType;
        measurementPointLatency.NetworkType = radioInfo.NetworkType;
        measurementPointLatency.RxLev = radioInfo.RXLevel;
        measurementPointLatency.Delta = j11;
        return measurementPointLatency;
    }
}
