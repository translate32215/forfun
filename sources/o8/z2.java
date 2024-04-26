package o8;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.j;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class z2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23630a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f23631b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23632c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f23633d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f23634e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f23635f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f23636g;

    public z2(h hVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f23636g = hVar;
        this.f23631b = i10;
        this.f23632c = str;
        this.f23633d = obj;
        this.f23634e = obj2;
        this.f23635f = obj3;
    }

    public final void run() {
        switch (this.f23630a) {
            case 0:
                j t10 = ((h) this.f23636g).f8864a.t();
                if (t10.n()) {
                    h hVar = (h) this.f23636g;
                    if (hVar.f8794c == 0) {
                        f fVar = hVar.f8864a.f8843g;
                        if (fVar.f23192d == null) {
                            synchronized (fVar) {
                                if (fVar.f23192d == null) {
                                    ApplicationInfo applicationInfo = fVar.f8864a.f8837a.getApplicationInfo();
                                    String a10 = d.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        fVar.f23192d = Boolean.valueOf(str != null && str.equals(a10));
                                    }
                                    if (fVar.f23192d == null) {
                                        fVar.f23192d = Boolean.TRUE;
                                        fVar.f8864a.d().f8797f.a("My process not in the list of running processes");
                                    }
                                }
                            }
                        }
                        if (fVar.f23192d.booleanValue()) {
                            h hVar2 = (h) this.f23636g;
                            hVar2.f8864a.getClass();
                            hVar2.f8794c = 'C';
                        } else {
                            h hVar3 = (h) this.f23636g;
                            hVar3.f8864a.getClass();
                            hVar3.f8794c = 'c';
                        }
                    }
                    h hVar4 = (h) this.f23636g;
                    if (hVar4.f8795d < 0) {
                        hVar4.f8864a.f8843g.q();
                        hVar4.f8795d = 43042;
                    }
                    char charAt = "01VDIWEA?".charAt(this.f23631b);
                    h hVar5 = (h) this.f23636g;
                    char c10 = hVar5.f8794c;
                    long j10 = hVar5.f8795d;
                    String u10 = h.u(true, this.f23632c, this.f23633d, this.f23634e, this.f23635f);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(u10).length() + 24);
                    sb2.append("2");
                    sb2.append(charAt);
                    sb2.append(c10);
                    sb2.append(j10);
                    sb2.append(":");
                    sb2.append(u10);
                    String sb3 = sb2.toString();
                    if (sb3.length() > 1024) {
                        sb3 = this.f23632c.substring(0, 1024);
                    }
                    i3 i3Var = t10.f8809d;
                    if (i3Var != null) {
                        i3Var.f23261e.h();
                        if (i3Var.f23261e.o().getLong(i3Var.f23257a, 0) == 0) {
                            i3Var.a();
                        }
                        if (sb3 == null) {
                            sb3 = "";
                        }
                        long j11 = i3Var.f23261e.o().getLong(i3Var.f23258b, 0);
                        if (j11 <= 0) {
                            SharedPreferences.Editor edit = i3Var.f23261e.o().edit();
                            edit.putString(i3Var.f23259c, sb3);
                            edit.putLong(i3Var.f23258b, 1);
                            edit.apply();
                            return;
                        }
                        long nextLong = i3Var.f23261e.f8864a.A().s().nextLong();
                        long j12 = j11 + 1;
                        SharedPreferences.Editor edit2 = i3Var.f23261e.o().edit();
                        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j12) {
                            edit2.putString(i3Var.f23259c, sb3);
                        }
                        edit2.putLong(i3Var.f23258b, j12);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, ((h) this.f23636g).w(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((c3) this.f23633d).o(this.f23632c, this.f23631b, (Throwable) this.f23634e, (byte[]) this.f23635f, (Map) this.f23636g);
                return;
        }
    }

    public z2(String str, c3 c3Var, int i10, Throwable th, byte[] bArr, Map map) {
        if (c3Var != null) {
            this.f23633d = c3Var;
            this.f23631b = i10;
            this.f23634e = th;
            this.f23635f = bArr;
            this.f23632c = str;
            this.f23636g = map;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
