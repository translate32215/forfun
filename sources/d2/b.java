package d2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.e;
import androidx.versionedparcelable.a;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f12947d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f12948e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12949f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12950g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12951h;

    /* renamed from: i  reason: collision with root package name */
    public int f12952i;

    /* renamed from: j  reason: collision with root package name */
    public int f12953j;

    /* renamed from: k  reason: collision with root package name */
    public int f12954k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.a(), new s.a(), new s.a());
    }

    public void a() {
        int i10 = this.f12952i;
        if (i10 >= 0) {
            int i11 = this.f12947d.get(i10);
            int dataPosition = this.f12948e.dataPosition();
            this.f12948e.setDataPosition(i11);
            this.f12948e.writeInt(dataPosition - i11);
            this.f12948e.setDataPosition(dataPosition);
        }
    }

    public a b() {
        Parcel parcel = this.f12948e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f12953j;
        if (i10 == this.f12949f) {
            i10 = this.f12950g;
        }
        return new b(parcel, dataPosition, i10, e.a(new StringBuilder(), this.f12951h, "  "), this.f3166a, this.f3167b, this.f3168c);
    }

    public boolean f() {
        return this.f12948e.readInt() != 0;
    }

    public byte[] g() {
        int readInt = this.f12948e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f12948e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12948e);
    }

    public boolean i(int i10) {
        while (this.f12953j < this.f12950g) {
            int i11 = this.f12954k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f12948e.setDataPosition(this.f12953j);
            int readInt = this.f12948e.readInt();
            this.f12954k = this.f12948e.readInt();
            this.f12953j += readInt;
        }
        if (this.f12954k == i10) {
            return true;
        }
        return false;
    }

    public int j() {
        return this.f12948e.readInt();
    }

    public <T extends Parcelable> T l() {
        return this.f12948e.readParcelable(b.class.getClassLoader());
    }

    public String n() {
        return this.f12948e.readString();
    }

    public void p(int i10) {
        a();
        this.f12952i = i10;
        this.f12947d.put(i10, this.f12948e.dataPosition());
        this.f12948e.writeInt(0);
        this.f12948e.writeInt(i10);
    }

    public void q(boolean z10) {
        this.f12948e.writeInt(z10 ? 1 : 0);
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            this.f12948e.writeInt(bArr.length);
            this.f12948e.writeByteArray(bArr);
            return;
        }
        this.f12948e.writeInt(-1);
    }

    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12948e, 0);
    }

    public void t(int i10) {
        this.f12948e.writeInt(i10);
    }

    public void u(Parcelable parcelable) {
        this.f12948e.writeParcelable(parcelable, 0);
    }

    public void v(String str) {
        this.f12948e.writeString(str);
    }

    public b(Parcel parcel, int i10, int i11, String str, s.a<String, Method> aVar, s.a<String, Method> aVar2, s.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f12947d = new SparseIntArray();
        this.f12952i = -1;
        this.f12953j = 0;
        this.f12954k = -1;
        this.f12948e = parcel;
        this.f12949f = i10;
        this.f12950g = i11;
        this.f12953j = i10;
        this.f12951h = str;
    }
}
