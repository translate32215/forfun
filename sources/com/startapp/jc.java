package com.startapp;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class jc {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BloomVersion, ic> f10736a;

    public jc() {
        HashMap hashMap = new HashMap();
        this.f10736a = hashMap;
        hashMap.put(BloomVersion.ZERO, new nc());
        hashMap.put(BloomVersion.THREE, new mc());
        hashMap.put(BloomVersion.FOUR, new lc());
        hashMap.put(BloomVersion.FIVE, new kc());
    }
}
