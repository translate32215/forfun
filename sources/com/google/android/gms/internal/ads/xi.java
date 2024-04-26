package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xi {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<ui> f8558a = new CopyOnWriteArrayList<>();

    public static ui a(String str) throws GeneralSecurityException {
        Iterator<ui> it = f8558a.iterator();
        while (it.hasNext()) {
            ui next = it.next();
            if (next.b(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
