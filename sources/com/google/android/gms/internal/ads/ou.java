package com.google.android.gms.internal.ads;

import androidx.fragment.app.c;
import androidx.leanback.widget.s;
import com.google.android.gms.ads.internal.util.o;
import d7.l;
import e8.dh0;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ou {

    /* renamed from: a  reason: collision with root package name */
    public final int f7736a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7737b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7738c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7739d;

    /* renamed from: e  reason: collision with root package name */
    public final rp f7740e;

    /* renamed from: f  reason: collision with root package name */
    public final dh0 f7741f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7742g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f7743h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f7744i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<uu> f7745j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public int f7746k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f7747l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f7748m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f7749n;

    /* renamed from: o  reason: collision with root package name */
    public String f7750o = "";

    /* renamed from: p  reason: collision with root package name */
    public String f7751p = "";

    /* renamed from: q  reason: collision with root package name */
    public String f7752q = "";

    public ou(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f7736a = i10;
        this.f7737b = i11;
        this.f7738c = i12;
        this.f7739d = z10;
        this.f7740e = new rp(i13);
        this.f7741f = new dh0(i14, i15, i16);
    }

    public static String a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb2.append((String) obj);
            sb2.append(' ');
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final void b(String str, boolean z10, float f10, float f11, float f12, float f13) {
        c(str, z10, f10, f11, f12, f13);
        synchronized (this.f7742g) {
            if (this.f7748m < 0) {
                e.E("ActivityContent: negative number of WebViews.");
            }
            d();
        }
    }

    public final void c(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null && str.length() >= this.f7738c) {
            synchronized (this.f7742g) {
                this.f7743h.add(str);
                this.f7746k += str.length();
                if (z10) {
                    this.f7744i.add(str);
                    this.f7745j.add(new uu(f10, f11, f12, f13, this.f7744i.size() - 1));
                }
            }
        }
    }

    public final void d() {
        int i10;
        synchronized (this.f7742g) {
            int i11 = this.f7746k;
            int i12 = this.f7747l;
            if (this.f7739d) {
                i10 = this.f7737b;
            } else {
                i10 = (i11 * this.f7736a) + (i12 * this.f7737b);
            }
            if (i10 > this.f7749n) {
                this.f7749n = i10;
                if (!((o) l.B.f13190g.f()).x()) {
                    this.f7750o = this.f7740e.e(this.f7743h);
                    this.f7751p = this.f7740e.e(this.f7744i);
                }
                if (!((o) l.B.f13190g.f()).y()) {
                    this.f7752q = this.f7741f.a(this.f7744i, this.f7745j);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((ou) obj).f7750o;
        return str != null && str.equals(this.f7750o);
    }

    public final int hashCode() {
        return this.f7750o.hashCode();
    }

    public final String toString() {
        int i10 = this.f7747l;
        int i11 = this.f7749n;
        int i12 = this.f7746k;
        String a10 = a(this.f7743h);
        String a11 = a(this.f7744i);
        String str = this.f7750o;
        String str2 = this.f7751p;
        String str3 = this.f7752q;
        StringBuilder sb2 = new StringBuilder(androidx.appcompat.widget.o.a(str3, androidx.appcompat.widget.o.a(str2, androidx.appcompat.widget.o.a(str, androidx.appcompat.widget.o.a(a11, androidx.appcompat.widget.o.a(a10, 165))))));
        sb2.append("ActivityContent fetchId: ");
        sb2.append(i10);
        sb2.append(" score:");
        sb2.append(i11);
        sb2.append(" total_length:");
        sb2.append(i12);
        sb2.append("\n text: ");
        sb2.append(a10);
        s.a(sb2, "\n viewableText", a11, "\n signture: ", str);
        return c.a(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
