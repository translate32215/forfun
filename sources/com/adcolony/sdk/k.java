package com.adcolony.sdk;

import p.f;
import t2.b;

public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4572a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0 f4573b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f4574c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f4575d;

    public k(i iVar, String str, q0 q0Var, h hVar) {
        this.f4575d = iVar;
        this.f4572a = str;
        this.f4573b = q0Var;
        this.f4574c = hVar;
    }

    public void run() {
        r rVar;
        int i10;
        try {
            d dVar = this.f4575d.f4526b.get(this.f4572a);
            b bVar = this.f4575d.f4528d.get(this.f4572a);
            if (dVar == null) {
                rVar = null;
            } else {
                rVar = dVar.f4464c;
            }
            if (rVar == null && bVar != null) {
                rVar = bVar.getOmidManager();
            }
            if (rVar == null) {
                i10 = -1;
            } else {
                i10 = rVar.f4755e;
            }
            if (rVar != null && i10 == 2) {
                rVar.a(this.f4573b);
                rVar.b(this.f4574c);
            }
        } catch (IllegalArgumentException unused) {
            f.a(0, 0, b.a("IllegalArgumentException when creating omid session"), true);
        }
    }
}
