package com.startapp;

import android.bluetooth.BluetoothDevice;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
public class i1 {

    /* renamed from: a  reason: collision with root package name */
    public Set<BluetoothDevice> f10527a;

    /* renamed from: b  reason: collision with root package name */
    public Set<BluetoothDevice> f10528b;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Set<BluetoothDevice> set = this.f10527a;
            if (set != null && set.size() > 0) {
                jSONObject.put("paired", a(this.f10527a));
            }
            Set<BluetoothDevice> set2 = this.f10528b;
            if (set2 != null && set2.size() > 0) {
                jSONObject.put("available", a(this.f10528b));
            }
        } catch (Exception unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    public final JSONArray a(Set<BluetoothDevice> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (BluetoothDevice next : set) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bluetoothClass", next.getBluetoothClass().getDeviceClass());
                jSONObject.put("name", next.getName());
                jSONObject.put("mac", next.getAddress());
                jSONObject.put("bondState", next.getBondState());
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }
}
