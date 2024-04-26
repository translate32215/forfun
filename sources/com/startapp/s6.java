package com.startapp;

import java.util.Arrays;
import java.util.List;

/* compiled from: Sta */
public final class s6 {

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f11698c = Arrays.asList(new String[]{"portrait", "landscape", "none"});

    /* renamed from: a  reason: collision with root package name */
    public boolean f11699a;

    /* renamed from: b  reason: collision with root package name */
    public int f11700b;

    public s6() {
        this(true, 2);
    }

    public static int a(String str) {
        int indexOf = f11698c.indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public s6(boolean z10, int i10) {
        this.f11699a = z10;
        this.f11700b = i10;
    }
}
