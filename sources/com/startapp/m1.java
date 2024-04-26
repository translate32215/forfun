package com.startapp;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* compiled from: Sta */
public class m1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n1 f10863a;

    public m1(n1 n1Var) {
        this.f10863a = n1Var;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            i1 i1Var = this.f10863a.f10894c;
            if (i1Var.f10528b == null) {
                i1Var.f10528b = new HashSet();
            }
            i1Var.f10528b.add(bluetoothDevice);
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f10863a.c();
            n1 n1Var = this.f10863a;
            n1Var.f10893b.a(n1Var.b());
        }
    }
}
