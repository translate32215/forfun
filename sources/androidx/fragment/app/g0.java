package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.o;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentState */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f1677a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1678b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1679c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1680d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1681e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1682f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1683g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1684h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1685i;

    /* renamed from: r  reason: collision with root package name */
    public final Bundle f1686r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1687s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1688t;

    /* renamed from: u  reason: collision with root package name */
    public Bundle f1689u;

    /* compiled from: FragmentState */
    public class a implements Parcelable.Creator<g0> {
        public Object createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        public Object[] newArray(int i10) {
            return new g0[i10];
        }
    }

    public g0(p pVar) {
        this.f1677a = pVar.getClass().getName();
        this.f1678b = pVar.f1794f;
        this.f1679c = pVar.f1810w;
        this.f1680d = pVar.F;
        this.f1681e = pVar.G;
        this.f1682f = pVar.H;
        this.f1683g = pVar.K;
        this.f1684h = pVar.f1808u;
        this.f1685i = pVar.J;
        this.f1686r = pVar.f1796g;
        this.f1687s = pVar.I;
        this.f1688t = pVar.f1791d0.ordinal();
    }

    public p a(u uVar, ClassLoader classLoader) {
        p a10 = uVar.a(classLoader, this.f1677a);
        Bundle bundle = this.f1686r;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.l0(this.f1686r);
        a10.f1794f = this.f1678b;
        a10.f1810w = this.f1679c;
        a10.f1812y = true;
        a10.F = this.f1680d;
        a10.G = this.f1681e;
        a10.H = this.f1682f;
        a10.K = this.f1683g;
        a10.f1808u = this.f1684h;
        a10.J = this.f1685i;
        a10.I = this.f1687s;
        a10.f1791d0 = o.c.values()[this.f1688t];
        Bundle bundle2 = this.f1689u;
        if (bundle2 != null) {
            a10.f1786b = bundle2;
        } else {
            a10.f1786b = new Bundle();
        }
        return a10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1677a);
        sb2.append(" (");
        sb2.append(this.f1678b);
        sb2.append(")}:");
        if (this.f1679c) {
            sb2.append(" fromLayout");
        }
        if (this.f1681e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f1681e));
        }
        String str = this.f1682f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f1682f);
        }
        if (this.f1683g) {
            sb2.append(" retainInstance");
        }
        if (this.f1684h) {
            sb2.append(" removing");
        }
        if (this.f1685i) {
            sb2.append(" detached");
        }
        if (this.f1687s) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1677a);
        parcel.writeString(this.f1678b);
        parcel.writeInt(this.f1679c ? 1 : 0);
        parcel.writeInt(this.f1680d);
        parcel.writeInt(this.f1681e);
        parcel.writeString(this.f1682f);
        parcel.writeInt(this.f1683g ? 1 : 0);
        parcel.writeInt(this.f1684h ? 1 : 0);
        parcel.writeInt(this.f1685i ? 1 : 0);
        parcel.writeBundle(this.f1686r);
        parcel.writeInt(this.f1687s ? 1 : 0);
        parcel.writeBundle(this.f1689u);
        parcel.writeInt(this.f1688t);
    }

    public g0(Parcel parcel) {
        this.f1677a = parcel.readString();
        this.f1678b = parcel.readString();
        boolean z10 = true;
        this.f1679c = parcel.readInt() != 0;
        this.f1680d = parcel.readInt();
        this.f1681e = parcel.readInt();
        this.f1682f = parcel.readString();
        this.f1683g = parcel.readInt() != 0;
        this.f1684h = parcel.readInt() != 0;
        this.f1685i = parcel.readInt() != 0;
        this.f1686r = parcel.readBundle();
        this.f1687s = parcel.readInt() == 0 ? false : z10;
        this.f1689u = parcel.readBundle();
        this.f1688t = parcel.readInt();
    }
}
