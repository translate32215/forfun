package c5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import o1.q;
import v6.e0;

/* compiled from: DrmInitData */
public final class f implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b[] f4315a;

    /* renamed from: b  reason: collision with root package name */
    public int f4316b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4317c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4318d;

    /* compiled from: DrmInitData */
    public class a implements Parcelable.Creator<f> {
        public Object createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        public Object[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: c5.f$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r1, boolean r2, c5.f.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4317c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            c5.f$b[] r3 = (c5.f.b[]) r3
        L_0x000e:
            r0.f4315a = r3
            int r1 = r3.length
            r0.f4318d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f.<init>(java.lang.String, boolean, c5.f$b[]):void");
    }

    public f a(String str) {
        if (e0.a(this.f4317c, str)) {
            return this;
        }
        return new f(str, false, this.f4315a);
    }

    public int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = x4.f.f27566a;
        if (uuid.equals(bVar.f4320b)) {
            return uuid.equals(bVar2.f4320b) ? 0 : 1;
        }
        return bVar.f4320b.compareTo(bVar2.f4320b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!e0.a(this.f4317c, fVar.f4317c) || !Arrays.equals(this.f4315a, fVar.f4315a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f4316b == 0) {
            String str = this.f4317c;
            this.f4316b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f4315a);
        }
        return this.f4316b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4317c);
        parcel.writeTypedArray(this.f4315a, 0);
    }

    /* compiled from: DrmInitData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f4319a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f4320b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4321c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4322d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f4323e;

        /* compiled from: DrmInitData */
        public class a implements Parcelable.Creator<b> {
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public Object[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f4320b = uuid;
            this.f4321c = str;
            str2.getClass();
            this.f4322d = str2;
            this.f4323e = bArr;
        }

        public boolean a() {
            return this.f4323e != null;
        }

        public boolean b(UUID uuid) {
            return x4.f.f27566a.equals(this.f4320b) || uuid.equals(this.f4320b);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!e0.a(this.f4321c, bVar.f4321c) || !e0.a(this.f4322d, bVar.f4322d) || !e0.a(this.f4320b, bVar.f4320b) || !Arrays.equals(this.f4323e, bVar.f4323e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f4319a == 0) {
                int hashCode = this.f4320b.hashCode() * 31;
                String str = this.f4321c;
                this.f4319a = Arrays.hashCode(this.f4323e) + q.a(this.f4322d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f4319a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f4320b.getMostSignificantBits());
            parcel.writeLong(this.f4320b.getLeastSignificantBits());
            parcel.writeString(this.f4321c);
            parcel.writeString(this.f4322d);
            parcel.writeByteArray(this.f4323e);
        }

        public b(Parcel parcel) {
            this.f4320b = new UUID(parcel.readLong(), parcel.readLong());
            this.f4321c = parcel.readString();
            String readString = parcel.readString();
            int i10 = e0.f26436a;
            this.f4322d = readString;
            this.f4323e = parcel.createByteArray();
        }
    }

    public f(Parcel parcel) {
        this.f4317c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = e0.f26436a;
        this.f4315a = bVarArr;
        this.f4318d = bVarArr.length;
    }
}
