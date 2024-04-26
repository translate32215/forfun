package com.google.android.gms.internal.ads;

import e7.k;
import e8.ek;
import e8.li;
import e8.ni;
import e8.pi;
import e8.pj;
import e8.qu;
import e8.tj;
import e8.ul;
import e8.wh0;
import e8.wi;
import e8.zi;
import e8.zz;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class i9 {

    /* renamed from: a  reason: collision with root package name */
    public final Set<ul<wh0>> f7027a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<ul<li>> f7028b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<ul<zi>> f7029c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<ul<tj>> f7030d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<ul<pj>> f7031e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<ul<pi>> f7032f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<ul<wi>> f7033g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<ul<k7.a>> f7034h;

    /* renamed from: i  reason: collision with root package name */
    public final Set<ul<z6.a>> f7035i;

    /* renamed from: j  reason: collision with root package name */
    public final Set<ul<e9>> f7036j;

    /* renamed from: k  reason: collision with root package name */
    public final Set<ul<k>> f7037k;

    /* renamed from: l  reason: collision with root package name */
    public final Set<ul<ek>> f7038l;

    /* renamed from: m  reason: collision with root package name */
    public final zz f7039m;

    /* renamed from: n  reason: collision with root package name */
    public ni f7040n;

    /* renamed from: o  reason: collision with root package name */
    public qu f7041o;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Set<ul<ek>> f7042a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public Set<ul<wh0>> f7043b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public Set<ul<li>> f7044c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        public Set<ul<zi>> f7045d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        public Set<ul<tj>> f7046e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        public Set<ul<pj>> f7047f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        public Set<ul<pi>> f7048g = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        public Set<ul<k7.a>> f7049h = new HashSet();

        /* renamed from: i  reason: collision with root package name */
        public Set<ul<z6.a>> f7050i = new HashSet();

        /* renamed from: j  reason: collision with root package name */
        public Set<ul<wi>> f7051j = new HashSet();

        /* renamed from: k  reason: collision with root package name */
        public Set<ul<e9>> f7052k = new HashSet();

        /* renamed from: l  reason: collision with root package name */
        public Set<ul<k>> f7053l = new HashSet();

        /* renamed from: m  reason: collision with root package name */
        public zz f7054m;

        public final a a(li liVar, Executor executor) {
            this.f7044c.add(new ul(liVar, executor));
            return this;
        }

        public final a b(pi piVar, Executor executor) {
            this.f7048g.add(new ul(piVar, executor));
            return this;
        }

        public final a c(pj pjVar, Executor executor) {
            this.f7047f.add(new ul(pjVar, executor));
            return this;
        }

        public final a d(ek ekVar, Executor executor) {
            this.f7042a.add(new ul(ekVar, executor));
            return this;
        }

        public final a e(wh0 wh0, Executor executor) {
            this.f7043b.add(new ul(wh0, executor));
            return this;
        }

        public final a f(z6.a aVar, Executor executor) {
            this.f7050i.add(new ul(aVar, executor));
            return this;
        }

        public final i9 g() {
            return new i9(this, (uk) null);
        }
    }

    public i9(a aVar, uk ukVar) {
        this.f7027a = aVar.f7043b;
        this.f7029c = aVar.f7045d;
        this.f7030d = aVar.f7046e;
        this.f7028b = aVar.f7044c;
        this.f7031e = aVar.f7047f;
        this.f7032f = aVar.f7048g;
        this.f7033g = aVar.f7051j;
        this.f7034h = aVar.f7049h;
        this.f7035i = aVar.f7050i;
        this.f7036j = aVar.f7052k;
        this.f7039m = aVar.f7054m;
        this.f7037k = aVar.f7053l;
        this.f7038l = aVar.f7042a;
    }
}
