package kd;

import ud.k;

/* compiled from: KotlinVersion.kt */
public final class c implements Comparable<c> {

    /* renamed from: e  reason: collision with root package name */
    public static final c f20605e = new c(1, 7, 10);

    /* renamed from: a  reason: collision with root package name */
    public final int f20606a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20607b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20608c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20609d;

    public c(int i10, int i11, int i12) {
        this.f20606a = i10;
        this.f20607b = i11;
        this.f20608c = i12;
        boolean z10 = false;
        if (new zd.c(0, 255).o(i10) && new zd.c(0, 255).o(i11) && new zd.c(0, 255).o(i12)) {
            z10 = true;
        }
        if (z10) {
            this.f20609d = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public int compareTo(Object obj) {
        c cVar = (c) obj;
        k.f(cVar, "other");
        return this.f20609d - cVar.f20609d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar != null && this.f20609d == cVar.f20609d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20609d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20606a);
        sb2.append('.');
        sb2.append(this.f20607b);
        sb2.append('.');
        sb2.append(this.f20608c);
        return sb2.toString();
    }
}
