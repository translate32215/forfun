package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.i0;
import androidx.lifecycle.o;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackRecordState */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1633a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f1634b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1635c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1636d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1637e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1638f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1639g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1640h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f1641i;

    /* renamed from: r  reason: collision with root package name */
    public final int f1642r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f1643s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f1644t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f1645u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f1646v;

    /* compiled from: BackStackRecordState */
    public class a implements Parcelable.Creator<d> {
        public Object createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        public Object[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(b bVar) {
        int size = bVar.f1703a.size();
        this.f1633a = new int[(size * 6)];
        if (bVar.f1709g) {
            this.f1634b = new ArrayList<>(size);
            this.f1635c = new int[size];
            this.f1636d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                i0.a aVar = bVar.f1703a.get(i10);
                int i12 = i11 + 1;
                this.f1633a[i11] = aVar.f1719a;
                ArrayList<String> arrayList = this.f1634b;
                p pVar = aVar.f1720b;
                arrayList.add(pVar != null ? pVar.f1794f : null);
                int[] iArr = this.f1633a;
                int i13 = i12 + 1;
                iArr[i12] = aVar.f1721c;
                int i14 = i13 + 1;
                iArr[i13] = aVar.f1722d;
                int i15 = i14 + 1;
                iArr[i14] = aVar.f1723e;
                int i16 = i15 + 1;
                iArr[i15] = aVar.f1724f;
                iArr[i16] = aVar.f1725g;
                this.f1635c[i10] = aVar.f1726h.ordinal();
                this.f1636d[i10] = aVar.f1727i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f1637e = bVar.f1708f;
            this.f1638f = bVar.f1711i;
            this.f1639g = bVar.f1623s;
            this.f1640h = bVar.f1712j;
            this.f1641i = bVar.f1713k;
            this.f1642r = bVar.f1714l;
            this.f1643s = bVar.f1715m;
            this.f1644t = bVar.f1716n;
            this.f1645u = bVar.f1717o;
            this.f1646v = bVar.f1718p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(b bVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1633a;
            boolean z10 = true;
            if (i10 < iArr.length) {
                i0.a aVar = new i0.a();
                int i12 = i10 + 1;
                aVar.f1719a = iArr[i10];
                if (a0.N(2)) {
                    Log.v("FragmentManager", "Instantiate " + bVar + " op #" + i11 + " base fragment #" + this.f1633a[i12]);
                }
                aVar.f1726h = o.c.values()[this.f1635c[i11]];
                aVar.f1727i = o.c.values()[this.f1636d[i11]];
                int[] iArr2 = this.f1633a;
                int i13 = i12 + 1;
                if (iArr2[i12] == 0) {
                    z10 = false;
                }
                aVar.f1721c = z10;
                int i14 = i13 + 1;
                int i15 = iArr2[i13];
                aVar.f1722d = i15;
                int i16 = i14 + 1;
                int i17 = iArr2[i14];
                aVar.f1723e = i17;
                int i18 = i16 + 1;
                int i19 = iArr2[i16];
                aVar.f1724f = i19;
                int i20 = iArr2[i18];
                aVar.f1725g = i20;
                bVar.f1704b = i15;
                bVar.f1705c = i17;
                bVar.f1706d = i19;
                bVar.f1707e = i20;
                bVar.c(aVar);
                i11++;
                i10 = i18 + 1;
            } else {
                bVar.f1708f = this.f1637e;
                bVar.f1711i = this.f1638f;
                bVar.f1709g = true;
                bVar.f1712j = this.f1640h;
                bVar.f1713k = this.f1641i;
                bVar.f1714l = this.f1642r;
                bVar.f1715m = this.f1643s;
                bVar.f1716n = this.f1644t;
                bVar.f1717o = this.f1645u;
                bVar.f1718p = this.f1646v;
                return;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1633a);
        parcel.writeStringList(this.f1634b);
        parcel.writeIntArray(this.f1635c);
        parcel.writeIntArray(this.f1636d);
        parcel.writeInt(this.f1637e);
        parcel.writeString(this.f1638f);
        parcel.writeInt(this.f1639g);
        parcel.writeInt(this.f1640h);
        TextUtils.writeToParcel(this.f1641i, parcel, 0);
        parcel.writeInt(this.f1642r);
        TextUtils.writeToParcel(this.f1643s, parcel, 0);
        parcel.writeStringList(this.f1644t);
        parcel.writeStringList(this.f1645u);
        parcel.writeInt(this.f1646v ? 1 : 0);
    }

    public d(Parcel parcel) {
        this.f1633a = parcel.createIntArray();
        this.f1634b = parcel.createStringArrayList();
        this.f1635c = parcel.createIntArray();
        this.f1636d = parcel.createIntArray();
        this.f1637e = parcel.readInt();
        this.f1638f = parcel.readString();
        this.f1639g = parcel.readInt();
        this.f1640h = parcel.readInt();
        this.f1641i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1642r = parcel.readInt();
        this.f1643s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1644t = parcel.createStringArrayList();
        this.f1645u = parcel.createStringArrayList();
        this.f1646v = parcel.readInt() != 0;
    }
}
