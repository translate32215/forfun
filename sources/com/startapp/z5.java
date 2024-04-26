package com.startapp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class z5 {

    /* renamed from: b  reason: collision with root package name */
    public static z5 f12916b = new z5();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, y5> f12917a = new ConcurrentHashMap();

    public y5 a(String str) {
        if (this.f12917a.containsKey(str)) {
            return this.f12917a.get(str);
        }
        y5 y5Var = new y5();
        this.f12917a.put(str, y5Var);
        return y5Var;
    }
}
