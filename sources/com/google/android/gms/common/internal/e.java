package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class e<T extends IInterface> extends b<T> implements a.f {
    public final Set<Scope> G;
    public final Account H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c r13, u7.b r14, u7.g r15) {
        /*
            r9 = this;
            v7.b r3 = v7.b.a(r10)
            java.lang.Object r0 = s7.d.f25010c
            s7.d r4 = s7.d.f25011d
            java.lang.String r0 = "null reference"
            if (r14 == 0) goto L_0x004f
            if (r15 == 0) goto L_0x0049
            com.google.android.gms.common.internal.l r6 = new com.google.android.gms.common.internal.l
            r6.<init>(r14)
            com.google.android.gms.common.internal.m r7 = new com.google.android.gms.common.internal.m
            r7.<init>(r15)
            java.lang.String r8 = r13.f5846f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f5841a
            r9.H = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f5843c
            java.util.Iterator r11 = r10.iterator()
        L_0x002b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            r9.G = r10
            return
        L_0x0049:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r0)
            throw r10
        L_0x004f:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r0)
            goto L_0x0056
        L_0x0055:
            throw r10
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.e.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c, u7.b, u7.g):void");
    }

    public Set<Scope> c() {
        return m() ? this.G : Collections.emptySet();
    }

    public final Account q() {
        return this.H;
    }

    public final Executor s() {
        return null;
    }

    public final Set<Scope> u() {
        return this.G;
    }
}
