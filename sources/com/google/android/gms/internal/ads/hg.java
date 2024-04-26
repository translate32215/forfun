package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import e8.a40;
import e8.j30;
import e8.wz;
import e8.z30;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class hg {

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Class<?>> f6858g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f6859a;

    /* renamed from: b  reason: collision with root package name */
    public final a40 f6860b;

    /* renamed from: c  reason: collision with root package name */
    public final mf f6861c;

    /* renamed from: d  reason: collision with root package name */
    public final lf f6862d;

    /* renamed from: e  reason: collision with root package name */
    public eg f6863e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6864f = new Object();

    public hg(Context context, a40 a40, mf mfVar, lf lfVar) {
        this.f6859a = context;
        this.f6860b = a40;
        this.f6861c = mfVar;
        this.f6862d = lfVar;
    }

    public final synchronized Class<?> a(wz wzVar) throws z30 {
        Object obj = wzVar.f17418a;
        if (((ms) obj) != null) {
            String E = ((ms) obj).E();
            HashMap<String, Class<?>> hashMap = f6858g;
            Class<?> cls = hashMap.get(E);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.f6862d.a((File) wzVar.f17419b)) {
                    File file = (File) wzVar.f17420c;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(((File) wzVar.f17419b).getAbsolutePath(), file.getAbsolutePath(), (String) null, this.f6859a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(E, loadClass);
                    return loadClass;
                }
                throw new z30(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e10) {
                throw new z30(2026, (Throwable) e10);
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e11) {
                throw new z30(2008, e11);
            }
        } else {
            throw new z30(4010, "mc");
        }
    }

    public final Object b(Class<?> cls, wz wzVar) throws z30 {
        try {
            return cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f6859a, "msa-r", wzVar.b(), null, new Bundle(), 2});
        } catch (Exception e10) {
            throw new z30(2004, (Throwable) e10);
        }
    }

    public final j30 c() {
        eg egVar;
        synchronized (this.f6864f) {
            egVar = this.f6863e;
        }
        return egVar;
    }

    public final void d(wz wzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            eg egVar = new eg(b(a(wzVar), wzVar), wzVar, this.f6860b, this.f6861c);
            if (egVar.c()) {
                int d10 = egVar.d();
                if (d10 == 0) {
                    synchronized (this.f6864f) {
                        eg egVar2 = this.f6863e;
                        if (egVar2 != null) {
                            try {
                                egVar2.a();
                            } catch (z30 e10) {
                                this.f6861c.a(e10.f17687a, -1, e10);
                            }
                        }
                        this.f6863e = egVar;
                    }
                    this.f6861c.e(3000, System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                StringBuilder sb2 = new StringBuilder(15);
                sb2.append("ci: ");
                sb2.append(d10);
                throw new z30(4001, sb2.toString());
            }
            throw new z30(4000, "init failed");
        } catch (z30 e11) {
            this.f6861c.a(e11.f17687a, System.currentTimeMillis() - currentTimeMillis, e11);
        } catch (Exception e12) {
            this.f6861c.a(4010, System.currentTimeMillis() - currentTimeMillis, e12);
        }
    }
}
