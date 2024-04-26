package t4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import cb.g;
import com.google.android.exoplayer2.upstream.q;
import d5.n;
import d5.o;
import java.util.ArrayList;
import java.util.Map;
import l4.b;
import l5.c;
import o4.b;
import o4.i;
import t4.s;
import v6.g;
import w4.a;

public final /* synthetic */ class p implements s.b, g, o, g.a, q.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p f25716a = new p(0);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ p f25717b = new p(2);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ p f25718c = new p(3);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ p f25719d = new p(4);

    public /* synthetic */ p(int i10) {
    }

    public String a(Object obj) {
        Context context = (Context) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i10 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        b bVar = s.f25725e;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            i.a a10 = i.a();
            a10.a(cursor.getString(1));
            b.C0204b bVar2 = (b.C0204b) a10;
            bVar2.f22941c = a.b(cursor.getInt(2));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            bVar2.f22940b = bArr;
            arrayList.add(bVar2.b());
        }
        return arrayList;
    }

    public d5.i[] b() {
        return new d5.i[]{new c()};
    }

    public /* synthetic */ d5.i[] d(Uri uri, Map map) {
        return n.a(this, uri, map);
    }
}
