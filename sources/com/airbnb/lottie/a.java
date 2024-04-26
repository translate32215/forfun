package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import u2.d;
import u2.f;
import u2.g;
import u2.k;
import u2.m;
import ve.p;
import ve.t;

/* compiled from: LottieCompositionFactory */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, m<d>> f4863a = new HashMap();

    /* renamed from: com.airbnb.lottie.a$a  reason: collision with other inner class name */
    /* compiled from: LottieCompositionFactory */
    public class C0070a implements g<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4864a;

        public C0070a(String str) {
            this.f4864a = str;
        }

        public void a(Object obj) {
            d dVar = (d) obj;
            ((HashMap) a.f4863a).remove(this.f4864a);
        }
    }

    /* compiled from: LottieCompositionFactory */
    public class b implements g<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4865a;

        public b(String str) {
            this.f4865a = str;
        }

        public void a(Object obj) {
            Throwable th = (Throwable) obj;
            ((HashMap) a.f4863a).remove(this.f4865a);
        }
    }

    /* compiled from: LottieCompositionFactory */
    public class c implements Callable<k<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4866a;

        public c(d dVar) {
            this.f4866a = dVar;
        }

        public Object call() throws Exception {
            return new k(this.f4866a);
        }
    }

    public static m<d> a(String str, Callable<k<d>> callable) {
        d dVar;
        if (str == null) {
            dVar = null;
        } else {
            z2.g gVar = z2.g.f28236b;
            gVar.getClass();
            dVar = gVar.f28237a.b(str);
        }
        if (dVar != null) {
            return new m<>(new c(dVar));
        }
        if (str != null) {
            HashMap hashMap = (HashMap) f4863a;
            if (hashMap.containsKey(str)) {
                return (m) hashMap.get(str);
            }
        }
        m<d> mVar = new m<>(callable);
        if (str != null) {
            mVar.b(new C0070a(str));
            mVar.a(new b(str));
            ((HashMap) f4863a).put(str, mVar);
        }
        return mVar;
    }

    public static k<d> b(InputStream inputStream, String str) {
        try {
            t tVar = new t(p.c(inputStream));
            String[] strArr = f3.c.f18080e;
            return c(new f3.d(tVar), str, true);
        } finally {
            g3.g.b(inputStream);
        }
    }

    public static k<d> c(f3.c cVar, String str, boolean z10) {
        try {
            d a10 = e3.t.a(cVar);
            if (str != null) {
                z2.g gVar = z2.g.f28236b;
                gVar.getClass();
                gVar.f28237a.c(str, a10);
            }
            k<d> kVar = new k<>(a10);
            if (z10) {
                g3.g.b(cVar);
            }
            return kVar;
        } catch (Exception e10) {
            k<d> kVar2 = new k<>((Throwable) e10);
            if (z10) {
                g3.g.b(cVar);
            }
            return kVar2;
        } catch (Throwable th) {
            if (z10) {
                g3.g.b(cVar);
            }
            throw th;
        }
    }

    public static k<d> d(ZipInputStream zipInputStream, String str) {
        try {
            return e(zipInputStream, str);
        } finally {
            g3.g.b(zipInputStream);
        }
    }

    public static k<d> e(ZipInputStream zipInputStream, String str) {
        f fVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    t tVar = new t(p.c(zipInputStream));
                    String[] strArr = f3.c.f18080e;
                    dVar = (d) c(new f3.d(tVar), (String) null, false).f26011a;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<f> it = dVar.f25922d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fVar = null;
                        break;
                    }
                    fVar = it.next();
                    if (fVar.f25983d.equals(str2)) {
                        break;
                    }
                }
                if (fVar != null) {
                    fVar.f25984e = g3.g.e((Bitmap) entry.getValue(), fVar.f25980a, fVar.f25981b);
                }
            }
            for (Map.Entry next : dVar.f25922d.entrySet()) {
                if (((f) next.getValue()).f25984e == null) {
                    StringBuilder a10 = android.support.v4.media.a.a("There is no image for ");
                    a10.append(((f) next.getValue()).f25983d);
                    return new k<>((Throwable) new IllegalStateException(a10.toString()));
                }
            }
            if (str != null) {
                z2.g gVar = z2.g.f28236b;
                gVar.getClass();
                gVar.f28237a.c(str, dVar);
            }
            return new k<>(dVar);
        } catch (IOException e10) {
            return new k<>((Throwable) e10);
        }
    }

    public static String f(Context context, int i10) {
        StringBuilder a10 = android.support.v4.media.a.a("rawRes");
        a10.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        a10.append(i10);
        return a10.toString();
    }
}
