package com.startapp;

import com.startapp.networkTest.enums.bluetooth.BluetoothConnectionState;
import java.util.ArrayList;

/* compiled from: Sta */
public class l1 {
    public BluetoothConnectionState A2DPConnectionState;
    public boolean BluetoothEnabled;
    @ob(type = ArrayList.class, value = k1.class)
    public ArrayList<k1> ConnectedA2DPBluetoothDevices = new ArrayList<>();
    @ob(type = ArrayList.class, value = k1.class)
    public ArrayList<k1> ConnectedHeadsetBluetoothDevices = new ArrayList<>();
    @ob(type = ArrayList.class, value = k1.class)
    public ArrayList<k1> ConnectedHealthBluetoothDevices = new ArrayList<>();
    public BluetoothConnectionState HeadsetConnectionState;
    public BluetoothConnectionState HealthConnectionState;
    public boolean MissingPermission = false;
    @ob(type = ArrayList.class, value = k1.class)
    public ArrayList<k1> PairedBluetoothDevices = new ArrayList<>();

    public l1() {
        BluetoothConnectionState bluetoothConnectionState = BluetoothConnectionState.Unknown;
        this.HealthConnectionState = bluetoothConnectionState;
        this.HeadsetConnectionState = bluetoothConnectionState;
        this.A2DPConnectionState = bluetoothConnectionState;
    }
}
