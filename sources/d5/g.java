package d5;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.startapp.b4;
import e.h;
import e5.b;
import j5.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k5.f;
import k5.i;
import k5.m;
import n5.a;
import n5.c;
import n5.d0;
import n5.e;
import n5.w;
import v6.b0;

/* compiled from: DefaultExtractorsFactory */
public final class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f13033a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<? extends i> f13034b;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(i.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f13034b = constructor;
    }

    public final void a(int i10, List<i> list) {
        switch (i10) {
            case 0:
                list.add(new a());
                return;
            case 1:
                list.add(new c());
                return;
            case 2:
                list.add(new e(0));
                return;
            case 3:
                list.add(new b(0));
                return;
            case 4:
                Constructor<? extends i> constructor = f13034b;
                if (constructor != null) {
                    try {
                        list.add((i) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                } else {
                    list.add(new f5.c(0));
                    return;
                }
            case 5:
                list.add(new g5.c());
                return;
            case 6:
                list.add(new i5.e(0));
                return;
            case 7:
                list.add(new d(0, -9223372036854775807L));
                return;
            case b4.f10106f:
                list.add(new f(0, (b0) null, (m) null, Collections.emptyList()));
                list.add(new i(0));
                return;
            case 9:
                list.add(new l5.c());
                return;
            case 10:
                list.add(new w());
                return;
            case 11:
                list.add(new d0(1, new b0(0), new n5.g(0), 112800));
                return;
            case 12:
                list.add(new o5.b());
                return;
            case 14:
                list.add(new h5.a());
                return;
            default:
                return;
        }
    }

    public synchronized i[] b() {
        return d(Uri.EMPTY, new HashMap());
    }

    public synchronized Extractor[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int b10 = h.b(map);
        if (b10 != -1) {
            a(b10, arrayList);
        }
        int c10 = h.c(uri);
        if (!(c10 == -1 || c10 == b10)) {
            a(c10, arrayList);
        }
        for (int i10 : f13033a) {
            if (!(i10 == b10 || i10 == c10)) {
                a(i10, arrayList);
            }
        }
        return (i[]) arrayList.toArray(new i[arrayList.size()]);
    }
}
