package t4;

import android.database.Cursor;
import android.net.Uri;
import com.google.firebase.remoteconfig.internal.c;
import d5.i;
import d5.n;
import d5.o;
import java.util.ArrayList;
import java.util.Map;
import l4.b;
import n5.e;
import s8.h;
import s8.l;
import t4.s;
import v6.g;

public final /* synthetic */ class r implements s.b, g, o, h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ r f25723a = new r(2);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ r f25724b = new r(3);

    public /* synthetic */ r(int i10) {
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = s.f25725e;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public i[] b() {
        return new i[]{new e(0)};
    }

    public /* synthetic */ i[] d(Uri uri, Map map) {
        return n.a(this, uri, map);
    }

    public s8.i f(Object obj) {
        c.a aVar = (c.a) obj;
        return l.e(null);
    }
}
