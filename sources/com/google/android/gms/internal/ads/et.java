package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e8.bd0;
import e8.eg0;
import e8.sb0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import o1.q;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class et implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<et> CREATOR = new bd0();

    /* renamed from: a  reason: collision with root package name */
    public final a[] f6320a;

    /* renamed from: b  reason: collision with root package name */
    public int f6321b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6322c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.gms.internal.ads.et$a[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public et(boolean r3, com.google.android.gms.internal.ads.et.a... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.et$a[] r4 = (com.google.android.gms.internal.ads.et.a[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0040
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f6324b
            r1 = r4[r3]
            java.util.UUID r1 = r1.f6324b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0026
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0026:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f6324b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 25
            java.lang.String r1 = "Duplicate data for uuid: "
            java.lang.String r3 = e.f.a(r4, r1, r3)
            r0.<init>(r3)
            throw r0
        L_0x0040:
            r2.f6320a = r4
            int r3 = r4.length
            r2.f6322c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et.<init>(boolean, com.google.android.gms.internal.ads.et$a[]):void");
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        UUID uuid = sb0.f16389b;
        if (uuid.equals(aVar.f6324b)) {
            return uuid.equals(aVar2.f6324b) ? 0 : 1;
        }
        return aVar.f6324b.compareTo(aVar2.f6324b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || et.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6320a, ((et) obj).f6320a);
    }

    public final int hashCode() {
        if (this.f6321b == 0) {
            this.f6321b = Arrays.hashCode(this.f6320a);
        }
        return this.f6321b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f6320a, 0);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new ft();

        /* renamed from: a  reason: collision with root package name */
        public int f6323a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f6324b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6325c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f6326d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6327e;

        public a(UUID uuid, String str, byte[] bArr) {
            uuid.getClass();
            this.f6324b = uuid;
            this.f6325c = str;
            bArr.getClass();
            this.f6326d = bArr;
            this.f6327e = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return this.f6325c.equals(aVar.f6325c) && eg0.d(this.f6324b, aVar.f6324b) && Arrays.equals(this.f6326d, aVar.f6326d);
        }

        public final int hashCode() {
            if (this.f6323a == 0) {
                this.f6323a = Arrays.hashCode(this.f6326d) + q.a(this.f6325c, this.f6324b.hashCode() * 31, 31);
            }
            return this.f6323a;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f6324b.getMostSignificantBits());
            parcel.writeLong(this.f6324b.getLeastSignificantBits());
            parcel.writeString(this.f6325c);
            parcel.writeByteArray(this.f6326d);
            parcel.writeByte(this.f6327e ? (byte) 1 : 0);
        }

        public a(Parcel parcel) {
            this.f6324b = new UUID(parcel.readLong(), parcel.readLong());
            this.f6325c = parcel.readString();
            this.f6326d = parcel.createByteArray();
            this.f6327e = parcel.readByte() != 0;
        }
    }

    public et(Parcel parcel) {
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f6320a = aVarArr;
        this.f6322c = aVarArr.length;
    }
}
