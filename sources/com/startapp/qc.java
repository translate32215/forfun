package com.startapp;

import java.util.List;

/* compiled from: Sta */
public class qc {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f11631a;

    /* renamed from: b  reason: collision with root package name */
    public String f11632b;

    public qc(List<String> list, String str) {
        this.f11631a = list;
        this.f11632b = str;
    }

    public String toString() {
        StringBuilder a10 = b1.a("[VideoEvent: tag=");
        a10.append(this.f11632b);
        a10.append(", fullUrls=");
        a10.append(this.f11631a.toString());
        a10.append("]");
        return a10.toString();
    }
}
