package com.adcolony.sdk;

import p.f;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public int f4473a;

    /* renamed from: b  reason: collision with root package name */
    public int f4474b;

    /* renamed from: c  reason: collision with root package name */
    public int f4475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4476d;

    public e(String str) {
    }

    public int a() {
        int i10 = this.f4474b;
        if (f.f() && !f.d().A && !f.d().B) {
            return i10;
        }
        f.a(0, 0, "The AdColonyZone API is not available while AdColony is disabled.", false);
        return 0;
    }
}
