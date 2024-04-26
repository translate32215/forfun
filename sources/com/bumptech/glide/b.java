package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.m;
import b2.t;
import c5.a0;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m3.l;
import n3.e;
import o1.p;
import o3.i;
import o3.j;
import p3.a;
import q3.a;
import q3.b;
import q3.c;
import q3.d;
import q3.e;
import q3.j;
import q3.r;
import q3.s;
import q3.t;
import q3.u;
import q3.v;
import r3.a;
import r3.b;
import r3.c;
import r3.d;
import r3.e;
import t3.b0;
import t3.g;
import t3.j;
import t3.s;
import t3.u;
import t3.w;
import t3.x;
import t3.z;
import u3.a;
import x3.h;
import z3.d;
import z3.o;

/* compiled from: Glide */
public class b implements ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile b f4881i;

    /* renamed from: r  reason: collision with root package name */
    public static volatile boolean f4882r;

    /* renamed from: a  reason: collision with root package name */
    public final e f4883a;

    /* renamed from: b  reason: collision with root package name */
    public final i f4884b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4885c;

    /* renamed from: d  reason: collision with root package name */
    public final g f4886d;

    /* renamed from: e  reason: collision with root package name */
    public final n3.b f4887e;

    /* renamed from: f  reason: collision with root package name */
    public final o f4888f;

    /* renamed from: g  reason: collision with root package name */
    public final d f4889g;

    /* renamed from: h  reason: collision with root package name */
    public final List<i> f4890h = new ArrayList();

    /* compiled from: Glide */
    public interface a {
    }

    public b(Context context, l lVar, i iVar, e eVar, n3.b bVar, o oVar, d dVar, int i10, a aVar, Map<Class<?>, j<?, ?>> map, List<c4.e<Object>> list, e eVar2) {
        f fVar;
        f fVar2;
        v3.d dVar2;
        Context context2 = context;
        e eVar3 = eVar;
        n3.b bVar2 = bVar;
        Class<j3.a> cls = j3.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f4883a = eVar3;
        this.f4887e = bVar2;
        this.f4884b = iVar;
        this.f4888f = oVar;
        this.f4889g = dVar;
        Resources resources = context.getResources();
        g gVar = new g();
        this.f4886d = gVar;
        j jVar = new j();
        t tVar = gVar.f4931g;
        synchronized (tVar) {
            ((List) tVar.f3445b).add(jVar);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            t3.o oVar2 = new t3.o();
            t tVar2 = gVar.f4931g;
            synchronized (tVar2) {
                ((List) tVar2.f3445b).add(oVar2);
            }
        }
        List<ImageHeaderParser> e10 = gVar.e();
        x3.a aVar2 = new x3.a(context2, e10, eVar3, bVar2);
        b0 b0Var = new b0(eVar3, new b0.g());
        t3.l lVar2 = new t3.l(gVar.e(), resources.getDisplayMetrics(), eVar3, bVar2);
        Class<byte[]> cls5 = cls4;
        if (!eVar2.f4918a.containsKey(c.b.class) || i11 < 28) {
            fVar = new t3.f(lVar2);
            fVar2 = new x(lVar2, bVar2);
        } else {
            fVar2 = new s();
            fVar = new g();
        }
        v3.d dVar3 = new v3.d(context2);
        int i12 = i11;
        r.c cVar = new r.c(resources);
        r.d dVar4 = new r.d(resources);
        Class<String> cls6 = cls2;
        r.b bVar3 = new r.b(resources);
        r.d dVar5 = dVar4;
        r.a aVar3 = new r.a(resources);
        t3.b bVar4 = new t3.b(bVar2);
        Class<Integer> cls7 = cls3;
        y3.a aVar4 = new y3.a();
        r.b bVar5 = bVar3;
        y3.b bVar6 = new y3.b(0);
        ContentResolver contentResolver = context.getContentResolver();
        r.c cVar2 = cVar;
        gVar.b(ByteBuffer.class, new a0(1));
        gVar.b(InputStream.class, new t(bVar2));
        gVar.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar);
        gVar.d("Bitmap", InputStream.class, Bitmap.class, fVar2);
        if (ParcelFileDescriptorRewinder.c()) {
            dVar2 = dVar3;
            gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new u(lVar2));
        } else {
            dVar2 = dVar3;
        }
        gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b0Var);
        gVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new b0(eVar3, new b0.c((b0.a) null)));
        t.a<?> aVar5 = t.a.f24137a;
        gVar.a(Bitmap.class, Bitmap.class, aVar5);
        gVar.d("Bitmap", Bitmap.class, Bitmap.class, new z());
        gVar.c(Bitmap.class, bVar4);
        gVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new t3.a(resources, fVar));
        gVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new t3.a(resources, fVar2));
        gVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new t3.a(resources, b0Var));
        gVar.c(BitmapDrawable.class, new m(eVar3, (k3.f) bVar4));
        gVar.d("Gif", InputStream.class, x3.c.class, new x3.j(e10, aVar2, bVar2));
        gVar.d("Gif", ByteBuffer.class, x3.c.class, aVar2);
        gVar.c(x3.c.class, new x3.d(0));
        Class<j3.a> cls8 = cls;
        gVar.a(cls8, cls8, aVar5);
        gVar.d("Bitmap", cls8, Bitmap.class, new h(eVar3));
        v3.d dVar6 = dVar2;
        gVar.d("legacy_append", Uri.class, Drawable.class, dVar6);
        gVar.d("legacy_append", Uri.class, Bitmap.class, new w(dVar6, eVar3));
        gVar.g(new a.C0256a());
        gVar.a(File.class, ByteBuffer.class, new c.b());
        gVar.a(File.class, InputStream.class, new e.C0222e());
        gVar.d("legacy_append", File.class, File.class, new w3.a());
        gVar.a(File.class, ParcelFileDescriptor.class, new e.b());
        gVar.a(File.class, File.class, aVar5);
        gVar.g(new k.a(bVar2));
        if (ParcelFileDescriptorRewinder.c()) {
            gVar.g(new ParcelFileDescriptorRewinder.a());
        }
        Class cls9 = Integer.TYPE;
        r.c cVar3 = cVar2;
        gVar.a(cls9, InputStream.class, cVar3);
        r.b bVar7 = bVar5;
        gVar.a(cls9, ParcelFileDescriptor.class, bVar7);
        Class<Integer> cls10 = cls7;
        gVar.a(cls10, InputStream.class, cVar3);
        gVar.a(cls10, ParcelFileDescriptor.class, bVar7);
        r.d dVar7 = dVar5;
        gVar.a(cls10, Uri.class, dVar7);
        r.a aVar6 = aVar3;
        gVar.a(cls9, AssetFileDescriptor.class, aVar6);
        gVar.a(cls10, AssetFileDescriptor.class, aVar6);
        gVar.a(cls9, Uri.class, dVar7);
        Class<String> cls11 = cls6;
        gVar.a(cls11, InputStream.class, new d.c());
        gVar.a(Uri.class, InputStream.class, new d.c());
        gVar.a(cls11, InputStream.class, new s.c());
        gVar.a(cls11, ParcelFileDescriptor.class, new s.b());
        gVar.a(cls11, AssetFileDescriptor.class, new s.a());
        gVar.a(Uri.class, InputStream.class, new a.c(context.getAssets()));
        gVar.a(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        Context context3 = context;
        gVar.a(Uri.class, InputStream.class, new b.a(context3));
        gVar.a(Uri.class, InputStream.class, new c.a(context3));
        int i13 = i12;
        if (i13 >= 29) {
            gVar.a(Uri.class, InputStream.class, new d.c(context3));
            gVar.a(Uri.class, ParcelFileDescriptor.class, new d.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        gVar.a(Uri.class, InputStream.class, new u.d(contentResolver2));
        gVar.a(Uri.class, ParcelFileDescriptor.class, new u.b(contentResolver2));
        gVar.a(Uri.class, AssetFileDescriptor.class, new u.a(contentResolver2));
        gVar.a(Uri.class, InputStream.class, new v.a());
        gVar.a(URL.class, InputStream.class, new e.a());
        gVar.a(Uri.class, File.class, new j.a(context3));
        gVar.a(q3.f.class, InputStream.class, new a.C0231a());
        Class<byte[]> cls12 = cls5;
        gVar.a(cls12, ByteBuffer.class, new b.a());
        gVar.a(cls12, InputStream.class, new b.d());
        gVar.a(Uri.class, Uri.class, aVar5);
        gVar.a(Drawable.class, Drawable.class, aVar5);
        gVar.d("legacy_append", Drawable.class, Drawable.class, new v3.e());
        gVar.h(Bitmap.class, BitmapDrawable.class, new b2.t(resources));
        y3.a aVar7 = aVar4;
        gVar.h(Bitmap.class, cls12, aVar7);
        y3.b bVar8 = bVar6;
        gVar.h(Drawable.class, cls12, new p(eVar3, (y3.c) aVar7, (y3.c) bVar8));
        gVar.h(x3.c.class, cls12, bVar8);
        if (i13 >= 23) {
            b0 b0Var2 = new b0(eVar3, new b0.d());
            gVar.d("legacy_append", ByteBuffer.class, Bitmap.class, b0Var2);
            gVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new t3.a(resources, b0Var2));
        }
        this.f4885c = new d(context, bVar, gVar, new d4.f(0), aVar, map, list, lVar, eVar2, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f4882r) {
            f4882r = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(a4.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c10 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a4.c cVar2 = (a4.c) it.next();
                        if (c10.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StringBuilder a10 = android.support.v4.media.a.a("Discovered GlideModule from manifest: ");
                        a10.append(((a4.c) it2.next()).getClass());
                        Log.d("Glide", a10.toString());
                    }
                }
                cVar.f4904n = null;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((a4.c) it3.next()).a(applicationContext, cVar);
                }
                if (cVar.f4897g == null) {
                    int a11 = p3.a.a();
                    if (!TextUtils.isEmpty("source")) {
                        cVar.f4897g = new p3.a(new ThreadPoolExecutor(a11, a11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0209a("source", a.b.f23812a, false)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                    }
                }
                if (cVar.f4898h == null) {
                    int i10 = p3.a.f23806c;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        cVar.f4898h = new p3.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0209a("disk-cache", a.b.f23812a, true)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                    }
                }
                if (cVar.f4905o == null) {
                    int i11 = p3.a.a() >= 4 ? 2 : 1;
                    if (!TextUtils.isEmpty("animation")) {
                        cVar.f4905o = new p3.a(new ThreadPoolExecutor(i11, i11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0209a("animation", a.b.f23812a, true)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                }
                if (cVar.f4900j == null) {
                    cVar.f4900j = new o3.j(new j.a(applicationContext));
                }
                if (cVar.f4901k == null) {
                    cVar.f4901k = new z3.f();
                }
                if (cVar.f4894d == null) {
                    int i12 = cVar.f4900j.f22910a;
                    if (i12 > 0) {
                        cVar.f4894d = new n3.k((long) i12);
                    } else {
                        cVar.f4894d = new n3.f();
                    }
                }
                if (cVar.f4895e == null) {
                    cVar.f4895e = new n3.j(cVar.f4900j.f22913d);
                }
                if (cVar.f4896f == null) {
                    cVar.f4896f = new o3.h((long) cVar.f4900j.f22911b);
                }
                if (cVar.f4899i == null) {
                    cVar.f4899i = new o3.g(applicationContext);
                }
                if (cVar.f4893c == null) {
                    cVar.f4893c = new l(cVar.f4896f, cVar.f4899i, cVar.f4898h, cVar.f4897g, new p3.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, p3.a.f23805b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0209a("source-unlimited", a.b.f23812a, false))), cVar.f4905o, false);
                }
                List<c4.e<Object>> list = cVar.f4906p;
                if (list == null) {
                    cVar.f4906p = Collections.emptyList();
                } else {
                    cVar.f4906p = Collections.unmodifiableList(list);
                }
                e.a aVar = cVar.f4892b;
                aVar.getClass();
                e eVar = new e(aVar);
                o oVar = new o(cVar.f4904n, eVar);
                e eVar2 = eVar;
                b bVar = new b(applicationContext, cVar.f4893c, cVar.f4896f, cVar.f4894d, cVar.f4895e, oVar, cVar.f4901k, cVar.f4902l, cVar.f4903m, cVar.f4891a, cVar.f4906p, eVar2);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    a4.c cVar3 = (a4.c) it4.next();
                    try {
                        cVar3.b(applicationContext, bVar, bVar.f4886d);
                    } catch (AbstractMethodError e10) {
                        StringBuilder a12 = android.support.v4.media.a.a("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                        a12.append(cVar3.getClass().getName());
                        throw new IllegalStateException(a12.toString(), e10);
                    }
                }
                applicationContext.registerComponentCallbacks(bVar);
                f4881i = bVar;
                f4882r = false;
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (f4881i == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e10) {
                c(e10);
                throw null;
            } catch (IllegalAccessException e11) {
                c(e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                c(e12);
                throw null;
            } catch (InvocationTargetException e13) {
                c(e13);
                throw null;
            }
            synchronized (b.class) {
                if (f4881i == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f4881i;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static i d(Context context) {
        if (context != null) {
            return b(context).f4888f.f(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        g4.j.a();
        ((g4.g) this.f4884b).e(0);
        this.f4883a.d();
        this.f4887e.d();
    }

    public void onTrimMemory(int i10) {
        long j10;
        g4.j.a();
        synchronized (this.f4890h) {
            for (i iVar : this.f4890h) {
                iVar.getClass();
            }
        }
        o3.h hVar = (o3.h) this.f4884b;
        hVar.getClass();
        if (i10 >= 40) {
            hVar.e(0);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (hVar) {
                j10 = hVar.f18459b;
            }
            hVar.e(j10 / 2);
        }
        this.f4883a.c(i10);
        this.f4887e.c(i10);
    }
}
