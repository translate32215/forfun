package com.startapp;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.List;

/* compiled from: Sta */
public class oa extends TelephonyManager.CellInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pa f11538a;

    public oa(pa paVar) {
        this.f11538a = paVar;
    }

    public void onCellInfo(List<CellInfo> list) {
        this.f11538a.b(false);
    }
}
