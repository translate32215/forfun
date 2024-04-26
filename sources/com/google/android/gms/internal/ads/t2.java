package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import g7.d;
import h7.a;
import j4.b;
import j4.f;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t2 extends v2 {

    /* renamed from: a  reason: collision with root package name */
    public Map<Class<Object>, Object> f8175a;

    public final a4 B3(String str) throws RemoteException {
        try {
            return new g4((RtbAdapter) Class.forName(str, false, f4.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    public final boolean Z1(String str) throws RemoteException {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, t2.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(o.a(str, 80));
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", assuming old implementation.");
            e.K(sb2.toString());
            return false;
        }
    }

    public final x2 g6(String str) throws RemoteException {
        m3 m3Var;
        try {
            Class<?> cls = Class.forName(str, false, t2.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new o3(bVar, (f) this.f8175a.get(bVar.getAdditionalParametersType()));
            } else if (d.class.isAssignableFrom(cls)) {
                return new m3((d) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (g7.a.class.isAssignableFrom(cls)) {
                    return new m3((g7.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                e.K(sb2.toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder(o.a(str, 43));
            sb3.append("Could not instantiate mediation adapter: ");
            sb3.append(str);
            sb3.append(". ");
            e.D(sb3.toString(), th);
        }
        throw new RemoteException();
    }
}
