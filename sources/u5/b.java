package u5;

import android.os.Parcel;
import android.os.Parcelable;
import q5.a;
import v6.e0;
import x4.b0;

/* compiled from: IcyHeaders */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f26029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26031c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26032d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26033e;

    /* renamed from: f  reason: collision with root package name */
    public final int f26034f;

    /* compiled from: IcyHeaders */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        v6.a.a(i11 == -1 || i11 > 0);
        this.f26029a = i10;
        this.f26030b = str;
        this.f26031c = str2;
        this.f26032d = str3;
        this.f26033e = z10;
        this.f26034f = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u5.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0038 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x003f
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0039 }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0039 }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x0039 }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x0039 }
            android.util.Log.w(r2, r7)     // Catch:{ NumberFormatException -> 0x0039 }
            r1 = 0
            r6 = -1
            goto L_0x003f
        L_0x0038:
            r6 = -1
        L_0x0039:
            java.lang.String r7 = "Invalid bitrate header: "
            androidx.appcompat.widget.z0.a(r7, r1, r2)
            r1 = 0
        L_0x003f:
            r7 = r6
            goto L_0x0044
        L_0x0041:
            r1 = 0
            r6 = -1
            r7 = -1
        L_0x0044:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0059
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r9 = r1
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r9 = r8
        L_0x005a:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x006e
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r10 = r1
            r1 = 1
            goto L_0x006f
        L_0x006e:
            r10 = r8
        L_0x006f:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0083
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r11 = r1
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r11 = r8
        L_0x0084:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x009e
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r6 = 1
            r12 = r1
            r1 = 1
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            r12 = 0
        L_0x00a0:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00d1
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00ce }
            if (r5 <= 0) goto L_0x00b8
            r3 = r5
            goto L_0x00cb
        L_0x00b8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00cd }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00cd }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00cd }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00cd }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00cd }
            android.util.Log.w(r2, r4)     // Catch:{ NumberFormatException -> 0x00cd }
            r4 = r1
        L_0x00cb:
            r1 = r4
            goto L_0x00d1
        L_0x00cd:
            r3 = r5
        L_0x00ce:
            androidx.appcompat.widget.z0.a(r0, r13, r2)
        L_0x00d1:
            if (r1 == 0) goto L_0x00df
            u5.b r13 = new u5.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.a(java.util.Map):u5.b");
    }

    public /* synthetic */ b0 F() {
        return q5.b.b(this);
    }

    public /* synthetic */ byte[] I() {
        return q5.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26029a != bVar.f26029a || !e0.a(this.f26030b, bVar.f26030b) || !e0.a(this.f26031c, bVar.f26031c) || !e0.a(this.f26032d, bVar.f26032d) || this.f26033e != bVar.f26033e || this.f26034f != bVar.f26034f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (527 + this.f26029a) * 31;
        String str = this.f26030b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26031c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26032d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.f26033e ? 1 : 0)) * 31) + this.f26034f;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("IcyHeaders: name=\"");
        a10.append(this.f26031c);
        a10.append("\", genre=\"");
        a10.append(this.f26030b);
        a10.append("\", bitrate=");
        a10.append(this.f26029a);
        a10.append(", metadataInterval=");
        a10.append(this.f26034f);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f26029a);
        parcel.writeString(this.f26030b);
        parcel.writeString(this.f26031c);
        parcel.writeString(this.f26032d);
        boolean z10 = this.f26033e;
        int i11 = e0.f26436a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f26034f);
    }

    public b(Parcel parcel) {
        this.f26029a = parcel.readInt();
        this.f26030b = parcel.readString();
        this.f26031c = parcel.readString();
        this.f26032d = parcel.readString();
        int i10 = e0.f26436a;
        this.f26033e = parcel.readInt() != 0;
        this.f26034f = parcel.readInt();
    }
}
