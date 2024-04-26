package o8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public String f23109a;

    /* renamed from: b  reason: collision with root package name */
    public String f23110b;

    /* renamed from: c  reason: collision with root package name */
    public w5 f23111c;

    /* renamed from: d  reason: collision with root package name */
    public long f23112d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23113e;

    /* renamed from: f  reason: collision with root package name */
    public String f23114f;

    /* renamed from: g  reason: collision with root package name */
    public final r f23115g;

    /* renamed from: h  reason: collision with root package name */
    public long f23116h;

    /* renamed from: i  reason: collision with root package name */
    public r f23117i;

    /* renamed from: r  reason: collision with root package name */
    public final long f23118r;

    /* renamed from: s  reason: collision with root package name */
    public final r f23119s;

    public b(b bVar) {
        this.f23109a = bVar.f23109a;
        this.f23110b = bVar.f23110b;
        this.f23111c = bVar.f23111c;
        this.f23112d = bVar.f23112d;
        this.f23113e = bVar.f23113e;
        this.f23114f = bVar.f23114f;
        this.f23115g = bVar.f23115g;
        this.f23116h = bVar.f23116h;
        this.f23117i = bVar.f23117i;
        this.f23118r = bVar.f23118r;
        this.f23119s = bVar.f23119s;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f23109a, false);
        j.g(parcel, 3, this.f23110b, false);
        j.f(parcel, 4, this.f23111c, i10, false);
        long j10 = this.f23112d;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        boolean z10 = this.f23113e;
        parcel.writeInt(262150);
        parcel.writeInt(z10 ? 1 : 0);
        j.g(parcel, 7, this.f23114f, false);
        j.f(parcel, 8, this.f23115g, i10, false);
        long j11 = this.f23116h;
        parcel.writeInt(524297);
        parcel.writeLong(j11);
        j.f(parcel, 10, this.f23117i, i10, false);
        long j12 = this.f23118r;
        parcel.writeInt(524299);
        parcel.writeLong(j12);
        j.f(parcel, 12, this.f23119s, i10, false);
        j.m(parcel, l10);
    }

    public b(String str, String str2, w5 w5Var, long j10, boolean z10, String str3, r rVar, long j11, r rVar2, long j12, r rVar3) {
        this.f23109a = str;
        this.f23110b = str2;
        this.f23111c = w5Var;
        this.f23112d = j10;
        this.f23113e = z10;
        this.f23114f = str3;
        this.f23115g = rVar;
        this.f23116h = j11;
        this.f23117i = rVar2;
        this.f23118r = j12;
        this.f23119s = rVar3;
    }
}
