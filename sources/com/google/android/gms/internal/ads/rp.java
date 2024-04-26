package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import e8.bh0;
import e8.ch0;
import e8.e70;
import e8.e8;
import e8.f80;
import e8.gf0;
import e8.k80;
import e8.n70;
import e8.q80;
import e8.t70;
import e8.t80;
import e8.v70;
import e8.w70;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import l0.e;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class rp {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8046a;

    /* renamed from: b  reason: collision with root package name */
    public int f8047b;

    /* renamed from: c  reason: collision with root package name */
    public int f8048c;

    /* renamed from: d  reason: collision with root package name */
    public int f8049d;

    public rp(int i10) {
        this.f8046a = new bh0();
        this.f8048c = i10;
        this.f8047b = 6;
        this.f8049d = 0;
    }

    public static void G(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw f80.g();
        }
    }

    public static void H(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw f80.g();
        }
    }

    public int A() throws IOException {
        int i10 = this.f8049d;
        if (i10 != 0) {
            this.f8047b = i10;
            this.f8049d = 0;
        } else {
            this.f8047b = ((op) this.f8046a).e();
        }
        int i11 = this.f8047b;
        if (i11 == 0 || i11 == this.f8048c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public boolean B() throws IOException {
        int i10;
        if (((op) this.f8046a).t() || (i10 = this.f8047b) == this.f8048c) {
            return false;
        }
        return ((op) this.f8046a).x(i10);
    }

    public String C(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        gf0 gf0 = new gf0();
        int i10 = 1;
        PriorityQueue priorityQueue = new PriorityQueue(this.f8048c, new e8(1));
        boolean z10 = false;
        int i11 = 0;
        while (i11 < split.length) {
            String[] b10 = vu.b(split[i11], z10);
            if (b10.length != 0) {
                int i12 = this.f8048c;
                int i13 = this.f8047b;
                if (b10.length < i13) {
                    wu.c(i12, wu.d(b10, b10.length), wu.b(b10, z10, b10.length), b10.length, priorityQueue);
                } else {
                    long d10 = wu.d(b10, i13);
                    wu.c(i12, d10, wu.b(b10, z10 ? 1 : 0, i13), i13, priorityQueue);
                    long j10 = 16785407;
                    long a10 = wu.a(16785407, i13 - 1);
                    int i14 = 1;
                    while (i14 < (b10.length - i13) + i10) {
                        int a11 = vu.a(b10[i14 - 1]);
                        long a12 = (((long) vu.a(b10[(i14 + i13) - i10])) + 2147483647L) % 1073807359;
                        d10 = (a12 + (((((d10 + 1073807359) - ((((((long) a11) + 2147483647L) % 1073807359) * a10) % 1073807359)) % 1073807359) * j10) % 1073807359)) % 1073807359;
                        wu.c(i12, d10, wu.b(b10, i14, i13), b10.length, priorityQueue);
                        i14++;
                        j10 = j10;
                        i10 = 1;
                    }
                }
            }
            i11++;
            i10 = 1;
            z10 = false;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) gf0.f14777c).write(((tu) this.f8046a).a(((ch0) it.next()).f14141b));
            } catch (IOException e10) {
                e.C("Error while writing hash to byteStream", e10);
            }
        }
        return gf0.toString();
    }

    public <T> T D(iq<T> iqVar, up upVar) throws IOException {
        int n10 = ((op) this.f8046a).n();
        Object obj = this.f8046a;
        if (((op) obj).f7697a < ((op) obj).f7698b) {
            int y10 = ((op) obj).y(n10);
            T k10 = iqVar.k();
            ((op) this.f8046a).f7697a++;
            iqVar.h(k10, this, upVar);
            iqVar.g(k10);
            ((op) this.f8046a).w(0);
            Object obj2 = this.f8046a;
            op opVar = (op) obj2;
            opVar.f7697a--;
            ((op) obj2).z(y10);
            return k10;
        }
        throw new f80("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public <T> T E(iq<T> iqVar, up upVar) throws IOException {
        int i10 = this.f8048c;
        this.f8048c = ((this.f8047b >>> 3) << 3) | 4;
        try {
            T k10 = iqVar.k();
            iqVar.h(k10, this, upVar);
            iqVar.g(k10);
            if (this.f8047b == this.f8048c) {
                return k10;
            }
            throw f80.g();
        } finally {
            this.f8048c = i10;
        }
    }

    public void F(int i10) throws IOException {
        if ((this.f8047b & 7) != i10) {
            throw f80.f();
        }
    }

    public void I(int i10) throws IOException {
        if (((op) this.f8046a).u() != i10) {
            throw f80.a();
        }
    }

    public void J(List<Double> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof n70) {
            n70 n70 = (n70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 1) {
                do {
                    n70.f(((op) this.f8046a).a());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                G(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    n70.f(((op) this.f8046a).a());
                } while (((op) this.f8046a).u() < u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(((op) this.f8046a).a()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                G(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Double.valueOf(((op) this.f8046a).a()));
                } while (((op) this.f8046a).u() < u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void K(List<Float> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof t70) {
            t70 t70 = (t70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                H(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    t70.i(((op) this.f8046a).b());
                } while (((op) this.f8046a).u() < u10);
            } else if (i10 == 5) {
                do {
                    t70.i(((op) this.f8046a).b());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                H(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Float.valueOf(((op) this.f8046a).b()));
                } while (((op) this.f8046a).u() < u11);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(((op) this.f8046a).b()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else {
                throw f80.f();
            }
        }
    }

    public void L(List<Long> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    q80.h(((op) this.f8046a).f());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    q80.h(((op) this.f8046a).f());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(((op) this.f8046a).f()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Long.valueOf(((op) this.f8046a).f()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void M(List<Long> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    q80.h(((op) this.f8046a).g());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    q80.h(((op) this.f8046a).g());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(((op) this.f8046a).g()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Long.valueOf(((op) this.f8046a).g()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void N(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    w70.o(((op) this.f8046a).h());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    w70.o(((op) this.f8046a).h());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).h()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).h()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void O(List<Long> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            int i10 = this.f8047b & 7;
            if (i10 == 1) {
                do {
                    q80.h(((op) this.f8046a).i());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                G(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    q80.h(((op) this.f8046a).i());
                } while (((op) this.f8046a).u() < u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(((op) this.f8046a).i()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                G(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Long.valueOf(((op) this.f8046a).i()));
                } while (((op) this.f8046a).u() < u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void P(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                H(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    w70.o(((op) this.f8046a).j());
                } while (((op) this.f8046a).u() < u10);
            } else if (i10 == 5) {
                do {
                    w70.o(((op) this.f8046a).j());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                H(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).j()));
                } while (((op) this.f8046a).u() < u11);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).j()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else {
                throw f80.f();
            }
        }
    }

    public void Q(List<Boolean> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof e70) {
            e70 e70 = (e70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    e70.f(((op) this.f8046a).k());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    e70.f(((op) this.f8046a).k());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(((op) this.f8046a).k()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Boolean.valueOf(((op) this.f8046a).k()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void R(List<String> list) throws IOException {
        g(list, true);
    }

    public void S(List<mp> list) throws IOException {
        int e10;
        if ((this.f8047b & 7) == 2) {
            do {
                list.add(t());
                if (!((op) this.f8046a).t()) {
                    e10 = ((op) this.f8046a).e();
                } else {
                    return;
                }
            } while (e10 == this.f8047b);
            this.f8049d = e10;
            return;
        }
        throw f80.f();
    }

    public void T(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    w70.o(((op) this.f8046a).n());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    w70.o(((op) this.f8046a).n());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).n()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).n()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void U(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    w70.o(((op) this.f8046a).o());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    w70.o(((op) this.f8046a).o());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).o()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).o()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void V(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                H(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    w70.o(((op) this.f8046a).p());
                } while (((op) this.f8046a).u() < u10);
            } else if (i10 == 5) {
                do {
                    w70.o(((op) this.f8046a).p());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                H(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).p()));
                } while (((op) this.f8046a).u() < u11);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).p()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else {
                throw f80.f();
            }
        }
    }

    public void W(List<Long> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            int i10 = this.f8047b & 7;
            if (i10 == 1) {
                do {
                    q80.h(((op) this.f8046a).q());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int n10 = ((op) this.f8046a).n();
                G(n10);
                int u10 = ((op) this.f8046a).u() + n10;
                do {
                    q80.h(((op) this.f8046a).q());
                } while (((op) this.f8046a).u() < u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(((op) this.f8046a).q()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int n11 = ((op) this.f8046a).n();
                G(n11);
                int u11 = ((op) this.f8046a).u() + n11;
                do {
                    list.add(Long.valueOf(((op) this.f8046a).q()));
                } while (((op) this.f8046a).u() < u11);
            } else {
                throw f80.f();
            }
        }
    }

    public double a() throws IOException {
        F(1);
        return ((op) this.f8046a).a();
    }

    public float b() throws IOException {
        F(5);
        return ((op) this.f8046a).b();
    }

    public void c(List<String> list) throws IOException {
        g(list, false);
    }

    public <T> T d(iq<T> iqVar, up upVar) throws IOException {
        F(2);
        return D(iqVar, upVar);
    }

    public String e(ArrayList<String> arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            sb2.append(str.toLowerCase(Locale.US));
            sb2.append(10);
        }
        return C(sb2.toString());
    }

    public <T> void f(List<T> list, iq<T> iqVar, up upVar) throws IOException {
        int e10;
        int i10 = this.f8047b;
        if ((i10 & 7) == 2) {
            do {
                list.add(D(iqVar, upVar));
                if (!((op) this.f8046a).t() && this.f8049d == 0) {
                    e10 = ((op) this.f8046a).e();
                } else {
                    return;
                }
            } while (e10 == i10);
            this.f8049d = e10;
            return;
        }
        throw f80.f();
    }

    public void g(List<String> list, boolean z10) throws IOException {
        String str;
        int e10;
        int e11;
        if ((this.f8047b & 7) != 2) {
            throw f80.f();
        } else if (!(list instanceof k80) || z10) {
            do {
                if (z10) {
                    str = s();
                } else {
                    F(2);
                    str = ((op) this.f8046a).c();
                }
                list.add(str);
                if (!((op) this.f8046a).t()) {
                    e10 = ((op) this.f8046a).e();
                } else {
                    return;
                }
            } while (e10 == this.f8047b);
            this.f8049d = e10;
        } else {
            k80 k80 = (k80) list;
            do {
                k80.n(t());
                if (!((op) this.f8046a).t()) {
                    e11 = ((op) this.f8046a).e();
                } else {
                    return;
                }
            } while (e11 == this.f8047b);
            this.f8049d = e11;
        }
    }

    public <K, V> void h(Map<K, V> map, t80<K, V> t80, up upVar) throws IOException {
        F(2);
        ((op) this.f8046a).y(((op) this.f8046a).n());
        throw null;
    }

    public void i(List<Integer> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof w70) {
            w70 w70 = (w70) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    w70.o(((op) this.f8046a).r());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    w70.o(((op) this.f8046a).r());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).r()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Integer.valueOf(((op) this.f8046a).r()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public void j(List<Long> list) throws IOException {
        int e10;
        int e11;
        if (list instanceof q80) {
            q80 q80 = (q80) list;
            int i10 = this.f8047b & 7;
            if (i10 == 0) {
                do {
                    q80.h(((op) this.f8046a).s());
                    if (!((op) this.f8046a).t()) {
                        e11 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e11 == this.f8047b);
                this.f8049d = e11;
            } else if (i10 == 2) {
                int u10 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    q80.h(((op) this.f8046a).s());
                } while (((op) this.f8046a).u() < u10);
                I(u10);
            } else {
                throw f80.f();
            }
        } else {
            int i11 = this.f8047b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(((op) this.f8046a).s()));
                    if (!((op) this.f8046a).t()) {
                        e10 = ((op) this.f8046a).e();
                    } else {
                        return;
                    }
                } while (e10 == this.f8047b);
                this.f8049d = e10;
            } else if (i11 == 2) {
                int u11 = ((op) this.f8046a).u() + ((op) this.f8046a).n();
                do {
                    list.add(Long.valueOf(((op) this.f8046a).s()));
                } while (((op) this.f8046a).u() < u11);
                I(u11);
            } else {
                throw f80.f();
            }
        }
    }

    public <T> T k(iq<T> iqVar, up upVar) throws IOException {
        F(3);
        return E(iqVar, upVar);
    }

    public <T> void l(List<T> list, iq<T> iqVar, up upVar) throws IOException {
        int e10;
        int i10 = this.f8047b;
        if ((i10 & 7) == 3) {
            do {
                list.add(E(iqVar, upVar));
                if (!((op) this.f8046a).t() && this.f8049d == 0) {
                    e10 = ((op) this.f8046a).e();
                } else {
                    return;
                }
            } while (e10 == i10);
            this.f8049d = e10;
            return;
        }
        throw f80.f();
    }

    public long m() throws IOException {
        F(0);
        return ((op) this.f8046a).f();
    }

    public long n() throws IOException {
        F(0);
        return ((op) this.f8046a).g();
    }

    public int o() throws IOException {
        F(0);
        return ((op) this.f8046a).h();
    }

    public long p() throws IOException {
        F(1);
        return ((op) this.f8046a).i();
    }

    public int q() throws IOException {
        F(5);
        return ((op) this.f8046a).j();
    }

    public boolean r() throws IOException {
        F(0);
        return ((op) this.f8046a).k();
    }

    public String s() throws IOException {
        F(2);
        return ((op) this.f8046a).l();
    }

    public mp t() throws IOException {
        F(2);
        return ((op) this.f8046a).m();
    }

    public int u() throws IOException {
        F(0);
        return ((op) this.f8046a).n();
    }

    public int v() throws IOException {
        F(0);
        return ((op) this.f8046a).o();
    }

    public int w() throws IOException {
        F(5);
        return ((op) this.f8046a).p();
    }

    public long x() throws IOException {
        F(1);
        return ((op) this.f8046a).q();
    }

    public int y() throws IOException {
        F(0);
        return ((op) this.f8046a).r();
    }

    public long z() throws IOException {
        F(0);
        return ((op) this.f8046a).s();
    }

    public rp(op opVar) {
        this.f8049d = 0;
        Charset charset = v70.f17029a;
        this.f8046a = opVar;
        opVar.f7700d = this;
    }
}
