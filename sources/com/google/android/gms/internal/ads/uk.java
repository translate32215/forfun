package com.google.android.gms.internal.ads;

import a6.b;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.rn;
import e8.x50;
import f7.q;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uk {
    @Deprecated
    public static oi a(vi viVar) throws GeneralSecurityException {
        byte[] bArr;
        dj.e(new tk());
        Class<oi> cls = oi.class;
        ln lnVar = ln.ENABLED;
        rn rnVar = viVar.f8366a;
        int i10 = hj.f6885a;
        int y10 = rnVar.y();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (rn.b next : rnVar.z()) {
            if (next.y() == lnVar) {
                if (!next.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.C())}));
                } else if (next.z() == Cdo.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.C())}));
                } else if (next.y() != ln.UNKNOWN_STATUS) {
                    if (next.C() == y10) {
                        if (!z10) {
                            z10 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.B().D() != kn.a.ASYMMETRIC_PUBLIC) {
                        z11 = false;
                    }
                    i11++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.C())}));
                }
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (z10 || z11) {
            yi yiVar = new yi(cls);
            for (rn.b next2 : viVar.f8366a.z()) {
                if (next2.y() == lnVar) {
                    Object b10 = dj.b(next2.B().B(), next2.B().C(), cls);
                    if (next2.y() == lnVar) {
                        int i12 = x50.f17443a[next2.z().ordinal()];
                        if (i12 == 1 || i12 == 2) {
                            bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(next2.C()).array();
                        } else if (i12 == 3) {
                            bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(next2.C()).array();
                        } else if (i12 == 4) {
                            bArr = ni.f7589a;
                        } else {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                        q qVar = new q(b10, bArr, next2.y(), next2.z(), next2.C());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(qVar);
                        byte[] a10 = qVar.a();
                        Charset charset = yi.f8608d;
                        String str = new String(a10, charset);
                        List list = (List) yiVar.f8609a.put(str, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(qVar);
                            yiVar.f8609a.put(str, Collections.unmodifiableList(arrayList2));
                        }
                        if (next2.C() != viVar.f8366a.y()) {
                            continue;
                        } else if (((ln) qVar.f18311c) == lnVar) {
                            List list2 = (List) yiVar.f8609a.get(new String(qVar.a(), charset));
                            if (list2 == null) {
                                list2 = Collections.emptyList();
                            }
                            if (!list2.isEmpty()) {
                                yiVar.f8610b = qVar;
                            } else {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                        } else {
                            throw new IllegalArgumentException("the primary entry has to be ENABLED");
                        }
                    } else {
                        throw new GeneralSecurityException("only ENABLED key is allowed");
                    }
                }
            }
            aj ajVar = (aj) ((ConcurrentHashMap) dj.f6220f).get(yiVar.f8611c);
            if (ajVar == null) {
                String name = yiVar.f8611c.getName();
                throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
            } else if (ajVar.c().equals(yiVar.f8611c)) {
                return (oi) ajVar.a(yiVar);
            } else {
                String valueOf = String.valueOf(ajVar.c());
                String valueOf2 = String.valueOf(yiVar.f8611c);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 44);
                sb2.append("Wrong input primitive class, expected ");
                sb2.append(valueOf);
                sb2.append(", got ");
                sb2.append(valueOf2);
                throw new GeneralSecurityException(sb2.toString());
            }
        } else {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static void b(List<String> list, b bVar) {
        String str = (String) bVar.b();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
