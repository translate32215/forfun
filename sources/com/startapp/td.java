package com.startapp;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Sta */
public class td {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f12628a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<View, a> f12629b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, View> f12630c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<View> f12631d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<String> f12632e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f12633f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, String> f12634g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public final Map<View, Boolean> f12635h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    public boolean f12636i;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final he f12637a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f12638b = new ArrayList<>();

        public a(he heVar, String str) {
            this.f12637a = heVar;
            a(str);
        }

        public void a(String str) {
            this.f12638b.add(str);
        }
    }
}
