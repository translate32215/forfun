package de;

import android.support.v4.media.a;

/* compiled from: JobSupport.kt */
public final class j0 implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13292a;

    public j0(boolean z10) {
        this.f13292a = z10;
    }

    public boolean a() {
        return this.f13292a;
    }

    public f1 g() {
        return null;
    }

    public String toString() {
        StringBuilder a10 = a.a("Empty{");
        a10.append(this.f13292a ? "Active" : "New");
        a10.append('}');
        return a10.toString();
    }
}
