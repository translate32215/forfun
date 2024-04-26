package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.tf;
import com.google.android.gms.internal.ads.zf;
import e8.k30;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class qf {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7974a;

    /* renamed from: b  reason: collision with root package name */
    public final Looper f7975b;

    public qf(Context context, Looper looper) {
        this.f7974a = context;
        this.f7975b = looper;
    }

    public final void a(String str) {
        zf.b B = zf.B();
        String packageName = this.f7974a.getPackageName();
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        zf.A((zf) B.f5970b, packageName);
        zf.a aVar = zf.a.BLOCKED_IMPRESSION;
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        zf.z((zf) B.f5970b, aVar);
        tf.b A = tf.A();
        if (A.f5971c) {
            A.n();
            A.f5971c = false;
        }
        tf.z((tf) A.f5970b, str);
        tf.a aVar2 = tf.a.BLOCKED_REASON_BACKGROUND;
        if (A.f5971c) {
            A.n();
            A.f5971c = false;
        }
        tf.y((tf) A.f5970b, aVar2);
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        zf.y((zf) B.f5970b, (tf) ((aq) A.j()));
        k30 k30 = new k30(this.f7974a, this.f7975b, (zf) ((aq) B.j()));
        synchronized (k30.f15232c) {
            if (!k30.f15233d) {
                k30.f15233d = true;
                k30.f15230a.n();
            }
        }
    }
}
