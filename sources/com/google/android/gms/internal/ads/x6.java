package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e8.t8;
import e8.x8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x6 {

    /* renamed from: a  reason: collision with root package name */
    public final b f8493a;

    /* renamed from: b  reason: collision with root package name */
    public final x8 f8494b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList<t8> f8495c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8496d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final String f8497e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8498f;
    @GuardedBy("lock")

    /* renamed from: g  reason: collision with root package name */
    public long f8499g = -1;
    @GuardedBy("lock")

    /* renamed from: h  reason: collision with root package name */
    public long f8500h = -1;
    @GuardedBy("lock")

    /* renamed from: i  reason: collision with root package name */
    public long f8501i = 0;
    @GuardedBy("lock")

    /* renamed from: j  reason: collision with root package name */
    public long f8502j = -1;
    @GuardedBy("lock")

    /* renamed from: k  reason: collision with root package name */
    public long f8503k = -1;

    public x6(b bVar, x8 x8Var, String str, String str2) {
        this.f8493a = bVar;
        this.f8494b = x8Var;
        this.f8497e = str;
        this.f8498f = str2;
        this.f8495c = new LinkedList<>();
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f8496d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f8497e);
            bundle.putString("slotid", this.f8498f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f8502j);
            bundle.putLong("tresponse", this.f8503k);
            bundle.putLong("timp", this.f8499g);
            bundle.putLong("tload", this.f8500h);
            bundle.putLong("pcc", this.f8501i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f8495c.iterator();
            while (it.hasNext()) {
                t8 t8Var = (t8) it.next();
                t8Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", t8Var.f16712a);
                bundle2.putLong("tclose", t8Var.f16713b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
