package com.google.android.gms.internal.ads;

import androidx.activity.e;
import androidx.appcompat.widget.o;
import e8.a60;
import e8.f80;
import e8.z50;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dj {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f6215a = Logger.getLogger(dj.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, a> f6216b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentMap<String, Object> f6217c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentMap<String, Boolean> f6218d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentMap<String, li<?>> f6219e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, aj<?, ?>> f6220f = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public interface a {
        <P> z50<P> a(Class<P> cls) throws GeneralSecurityException;

        z50<?> b();

        Class<?> c();

        Set<Class<?>> d();

        Class<?> e();
    }

    public static <P> z50<P> a(String str, Class<P> cls) throws GeneralSecurityException {
        a j10 = j(str);
        if (cls == null) {
            return j10.b();
        }
        if (j10.d().contains(cls)) {
            return j10.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(j10.c());
        Set<Class<?>> d10 = j10.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class next : d10) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(next.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        throw new GeneralSecurityException(e.a(j4.e.a(o.a(sb3, valueOf.length() + name.length() + 77), "Primitive type ", name, " not supported by key manager of type ", valueOf), ", supported primitives: ", sb3));
    }

    public static <P> P b(String str, mp mpVar, Class<P> cls) throws GeneralSecurityException {
        pi piVar = (pi) a(str, cls);
        piVar.getClass();
        try {
            return piVar.a(piVar.f7862a.g(mpVar));
        } catch (f80 e10) {
            String name = piVar.f7862a.f7977a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    public static <P> P c(String str, cq cqVar, Class<P> cls) throws GeneralSecurityException {
        pi piVar = (pi) a(str, cls);
        String name = piVar.f7862a.f7977a.getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (piVar.f7862a.f7977a.isInstance(cqVar)) {
            return piVar.a(cqVar);
        }
        throw new GeneralSecurityException(concat);
    }

    public static synchronized <KeyProtoT extends cq> void d(qi qiVar) throws GeneralSecurityException {
        synchronized (dj.class) {
            String a10 = qiVar.a();
            h(a10, qiVar.getClass(), true);
            ConcurrentMap<String, a> concurrentMap = f6216b;
            if (!((ConcurrentHashMap) concurrentMap).containsKey(a10)) {
                ((ConcurrentHashMap) concurrentMap).put(a10, new fj(qiVar));
                ((ConcurrentHashMap) f6217c).put(a10, new gj(qiVar));
            }
            ((ConcurrentHashMap) f6218d).put(a10, Boolean.TRUE);
        }
    }

    public static synchronized <B, P> void e(aj<B, P> ajVar) throws GeneralSecurityException {
        synchronized (dj.class) {
            if (ajVar != null) {
                Class<P> b10 = ajVar.b();
                ConcurrentMap<Class<?>, aj<?, ?>> concurrentMap = f6220f;
                if (((ConcurrentHashMap) concurrentMap).containsKey(b10)) {
                    aj ajVar2 = (aj) ((ConcurrentHashMap) concurrentMap).get(b10);
                    if (!ajVar.getClass().equals(ajVar2.getClass())) {
                        Logger logger = f6215a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(b10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 56);
                        sb2.append("Attempted overwrite of a registered SetWrapper for type ");
                        sb2.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb2.toString());
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b10.getName(), ajVar2.getClass().getName(), ajVar.getClass().getName()}));
                    }
                }
                ((ConcurrentHashMap) concurrentMap).put(b10, ajVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized <P> void f(z50<P> z50, boolean z10) throws GeneralSecurityException {
        synchronized (dj.class) {
            if (z50 != null) {
                String a10 = ((pi) z50).f7862a.a();
                h(a10, z50.getClass(), z10);
                ((ConcurrentHashMap) f6216b).putIfAbsent(a10, new cj(z50));
                ((ConcurrentHashMap) f6218d).put(a10, Boolean.valueOf(z10));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends cq, PublicKeyProtoT extends cq> void g(a60 a60, qi qiVar) throws GeneralSecurityException {
        Class<?> e10;
        synchronized (dj.class) {
            h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", a60.getClass(), true);
            h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", qiVar.getClass(), false);
            ConcurrentMap<String, a> concurrentMap = f6216b;
            if (((ConcurrentHashMap) concurrentMap).containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (e10 = ((a) ((ConcurrentHashMap) concurrentMap).get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).e()) != null) {
                if (!e10.equals(qiVar.getClass())) {
                    f6215a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{a60.getClass().getName(), e10.getName(), qiVar.getClass().getName()}));
                }
            }
            if (!((ConcurrentHashMap) concurrentMap).containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((a) ((ConcurrentHashMap) concurrentMap).get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).e() == null) {
                ((ConcurrentHashMap) concurrentMap).put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new ej(a60, qiVar));
                ((ConcurrentHashMap) f6217c).put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new gj(a60));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = f6218d;
            ((ConcurrentHashMap) concurrentMap2).put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!((ConcurrentHashMap) concurrentMap).containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                ((ConcurrentHashMap) concurrentMap).put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new fj(qiVar));
            }
            ((ConcurrentHashMap) concurrentMap2).put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void h(java.lang.String r8, java.lang.Class<?> r9, boolean r10) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.dj> r0 = com.google.android.gms.internal.ads.dj.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.dj$a> r1 = f6216b     // Catch:{ all -> 0x0098 }
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x0098 }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x0010
            monitor-exit(r0)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.internal.ads.dj$a r1 = (com.google.android.gms.internal.ads.dj.a) r1     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = r1.c()     // Catch:{ all -> 0x0098 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x0068
            java.util.logging.Logger r10 = f6215a     // Catch:{ all -> 0x0098 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0098 }
            int r7 = r6.length()     // Catch:{ all -> 0x0098 }
            if (r7 == 0) goto L_0x003b
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0098 }
            goto L_0x0041
        L_0x003b:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0098 }
            r6.<init>(r5)     // Catch:{ all -> 0x0098 }
            r5 = r6
        L_0x0041:
            r10.logp(r2, r3, r4, r5)     // Catch:{ all -> 0x0098 }
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0098 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x0098 }
            r8 = 1
            java.lang.Class r1 = r1.c()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0098 }
            r3[r8] = r1     // Catch:{ all -> 0x0098 }
            r8 = 2
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0098 }
            r3[r8] = r9     // Catch:{ all -> 0x0098 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0098 }
            r10.<init>(r8)     // Catch:{ all -> 0x0098 }
            throw r10     // Catch:{ all -> 0x0098 }
        L_0x0068:
            if (r10 == 0) goto L_0x0096
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = f6218d     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch:{ all -> 0x0098 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0098 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0098 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0098 }
            if (r9 != 0) goto L_0x0096
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0098 }
            java.lang.String r10 = "New keys are already disallowed for key type "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0098 }
            int r1 = r8.length()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x008d
            java.lang.String r8 = r10.concat(r8)     // Catch:{ all -> 0x0098 }
            goto L_0x0092
        L_0x008d:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0098 }
            r8.<init>(r10)     // Catch:{ all -> 0x0098 }
        L_0x0092:
            r9.<init>(r8)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r0)
            return
        L_0x0098:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dj.h(java.lang.String, java.lang.Class, boolean):void");
    }

    public static synchronized cq i(mn mnVar) throws GeneralSecurityException {
        cq b10;
        synchronized (dj.class) {
            z50<?> b11 = j(mnVar.y()).b();
            if (((Boolean) ((ConcurrentHashMap) f6218d).get(mnVar.y())).booleanValue()) {
                b10 = ((pi) b11).b(mnVar.z());
            } else {
                String valueOf = String.valueOf(mnVar.y());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b10;
    }

    public static synchronized a j(String str) throws GeneralSecurityException {
        a aVar;
        synchronized (dj.class) {
            ConcurrentMap<String, a> concurrentMap = f6216b;
            if (!((ConcurrentHashMap) concurrentMap).containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            aVar = (a) ((ConcurrentHashMap) concurrentMap).get(str);
        }
        return aVar;
    }

    @Deprecated
    public static li<?> k(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, li<?>> concurrentMap = f6219e;
            Locale locale = Locale.US;
            li<?> liVar = (li) ((ConcurrentHashMap) concurrentMap).get(str.toLowerCase(locale));
            if (liVar != null) {
                return liVar;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }
}
