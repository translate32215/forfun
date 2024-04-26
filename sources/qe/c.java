package qe;

import ve.i;

/* compiled from: Header */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final i f24289d = i.i(":");

    /* renamed from: e  reason: collision with root package name */
    public static final i f24290e = i.i(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final i f24291f = i.i(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final i f24292g = i.i(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final i f24293h = i.i(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final i f24294i = i.i(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final i f24295a;

    /* renamed from: b  reason: collision with root package name */
    public final i f24296b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24297c;

    public c(String str, String str2) {
        this(i.i(str), i.i(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f24295a.equals(cVar.f24295a) || !this.f24296b.equals(cVar.f24296b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f24296b.hashCode() + ((this.f24295a.hashCode() + 527) * 31);
    }

    public String toString() {
        return le.c.m("%s: %s", this.f24295a.x(), this.f24296b.x());
    }

    public c(i iVar, String str) {
        this(iVar, i.i(str));
    }

    public c(i iVar, i iVar2) {
        this.f24295a = iVar;
        this.f24296b = iVar2;
        this.f24297c = iVar2.u() + iVar.u() + 32;
    }
}
