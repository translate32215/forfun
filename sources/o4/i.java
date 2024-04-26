package o4;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import l4.d;
import o4.b;

@AutoValue
/* compiled from: TransportContext */
public abstract class i {

    @AutoValue.Builder
    /* compiled from: TransportContext */
    public static abstract class a {
        public abstract a a(String str);
    }

    public static a a() {
        b.C0204b bVar = new b.C0204b();
        bVar.f22941c = d.DEFAULT;
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
