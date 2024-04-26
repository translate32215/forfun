package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.t;
import b6.k;
import b6.m;
import b6.n;
import ba.o0;
import ba.s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import e6.f;
import f6.e;
import f6.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.h;
import v6.c0;
import v6.e0;
import x4.b0;
import z5.f0;

/* compiled from: HlsChunkSource */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f5159a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.e f5160b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.e f5161c;

    /* renamed from: d  reason: collision with root package name */
    public final t f5162d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri[] f5163e;

    /* renamed from: f  reason: collision with root package name */
    public final b0[] f5164f;

    /* renamed from: g  reason: collision with root package name */
    public final i f5165g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f5166h;

    /* renamed from: i  reason: collision with root package name */
    public final List<b0> f5167i;

    /* renamed from: j  reason: collision with root package name */
    public final e6.d f5168j = new e6.d(4);

    /* renamed from: k  reason: collision with root package name */
    public boolean f5169k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f5170l = e0.f26441f;

    /* renamed from: m  reason: collision with root package name */
    public IOException f5171m;

    /* renamed from: n  reason: collision with root package name */
    public Uri f5172n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5173o;

    /* renamed from: p  reason: collision with root package name */
    public h f5174p;

    /* renamed from: q  reason: collision with root package name */
    public long f5175q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5176r;

    /* compiled from: HlsChunkSource */
    public static final class a extends k {

        /* renamed from: l  reason: collision with root package name */
        public byte[] f5177l;

        public a(com.google.android.exoplayer2.upstream.e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, byte[] bArr) {
            super(eVar, eVar2, 3, b0Var, i10, obj, bArr);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.b$b  reason: collision with other inner class name */
    /* compiled from: HlsChunkSource */
    public static final class C0077b {

        /* renamed from: a  reason: collision with root package name */
        public b6.e f5178a = null;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5179b = false;

        /* renamed from: c  reason: collision with root package name */
        public Uri f5180c = null;
    }

    /* compiled from: HlsChunkSource */
    public static final class c extends b6.b {

        /* renamed from: b  reason: collision with root package name */
        public final List<e.C0139e> f5181b;

        public c(String str, long j10, List<e.C0139e> list) {
            super(0, (long) (list.size() - 1));
            this.f5181b = list;
        }
    }

    /* compiled from: HlsChunkSource */
    public static final class d extends r6.c {

        /* renamed from: g  reason: collision with root package name */
        public int f5182g;

        public d(f0 f0Var, int[] iArr) {
            super(f0Var, iArr);
            this.f5182g = o(f0Var.f28584b[iArr[0]]);
        }

        public void h(long j10, long j11, long j12, List<? extends m> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (u(this.f5182g, elapsedRealtime)) {
                int i10 = this.f24566b;
                do {
                    i10--;
                    if (i10 < 0) {
                        throw new IllegalStateException();
                    }
                } while (u(i10, elapsedRealtime));
                this.f5182g = i10;
            }
        }

        public int l() {
            return 0;
        }

        public int m() {
            return this.f5182g;
        }

        public Object p() {
            return null;
        }
    }

    /* compiled from: HlsChunkSource */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final e.C0139e f5183a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5184b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5185c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5186d;

        public e(e.C0139e eVar, long j10, int i10) {
            this.f5183a = eVar;
            this.f5184b = j10;
            this.f5185c = i10;
            this.f5186d = (eVar instanceof e.b) && ((e.b) eVar).f18195u;
        }
    }

    public b(f fVar, i iVar, Uri[] uriArr, Format[] formatArr, e6.e eVar, u6.i iVar2, t tVar, List<b0> list) {
        this.f5159a = fVar;
        this.f5165g = iVar;
        this.f5163e = uriArr;
        this.f5164f = formatArr;
        this.f5162d = tVar;
        this.f5167i = list;
        com.google.android.exoplayer2.upstream.e a10 = eVar.a(1);
        this.f5160b = a10;
        if (iVar2 != null) {
            a10.P(iVar2);
        }
        this.f5161c = eVar.a(3);
        this.f5166h = new f0((b0[]) formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].f27401e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f5174p = new d(this.f5166h, da.a.b(arrayList));
    }

    public n[] a(c cVar, long j10) {
        int i10;
        List list;
        c cVar2 = cVar;
        int a10 = cVar2 == null ? -1 : this.f5166h.a(cVar2.f3592d);
        int length = this.f5174p.length();
        n[] nVarArr = new n[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int f10 = this.f5174p.f(i11);
            Uri uri = this.f5163e[f10];
            if (!this.f5165g.c(uri)) {
                nVarArr[i11] = n.f3636a;
                i10 = i11;
            } else {
                f6.e i12 = this.f5165g.i(uri, z10);
                i12.getClass();
                i10 = i11;
                long l10 = i12.f18179f - this.f5165g.l();
                f6.e eVar = i12;
                Pair<Long, Integer> c10 = c(cVar, f10 != a10, i12, l10, j10);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                String str = eVar.f18216a;
                int i13 = (int) (longValue - eVar.f18182i);
                if (i13 < 0 || eVar.f18189p.size() < i13) {
                    ba.a<Object> aVar = s.f3795b;
                    list = o0.f3765e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i13 < eVar.f18189p.size()) {
                        if (intValue != -1) {
                            e.d dVar = eVar.f18189p.get(i13);
                            if (intValue == 0) {
                                arrayList.add(dVar);
                            } else if (intValue < dVar.f18199u.size()) {
                                List<e.b> list2 = dVar.f18199u;
                                arrayList.addAll(list2.subList(intValue, list2.size()));
                            }
                            i13++;
                        }
                        List<e.d> list3 = eVar.f18189p;
                        arrayList.addAll(list3.subList(i13, list3.size()));
                        intValue = 0;
                    }
                    if (eVar.f18185l != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < eVar.f18190q.size()) {
                            List<e.b> list4 = eVar.f18190q;
                            arrayList.addAll(list4.subList(intValue, list4.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                nVarArr[i10] = new c(str, l10, list);
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return nVarArr;
    }

    public int b(c cVar) {
        List<e.b> list;
        if (cVar.f5191o == -1) {
            return 1;
        }
        f6.e i10 = this.f5165g.i(this.f5163e[this.f5166h.a(cVar.f3592d)], false);
        i10.getClass();
        int i11 = (int) (cVar.f3635j - i10.f18182i);
        if (i11 < 0) {
            return 1;
        }
        if (i11 < i10.f18189p.size()) {
            list = i10.f18189p.get(i11).f18199u;
        } else {
            list = i10.f18190q;
        }
        if (cVar.f5191o >= list.size()) {
            return 2;
        }
        e.b bVar = list.get(cVar.f5191o);
        if (bVar.f18195u) {
            return 0;
        }
        if (e0.a(Uri.parse(c0.c(i10.f18216a, bVar.f18200a)), cVar.f3590b.f26048a)) {
            return 1;
        }
        return 2;
    }

    public final Pair<Long, Integer> c(c cVar, boolean z10, f6.e eVar, long j10, long j11) {
        List<e.b> list;
        long j12;
        int i10 = -1;
        if (cVar == null || z10) {
            long j13 = eVar.f18192s + j10;
            if (cVar != null && !this.f5173o) {
                j11 = cVar.f3595g;
            }
            if (!eVar.f18186m && j11 >= j13) {
                return new Pair<>(Long.valueOf(eVar.f18182i + ((long) eVar.f18189p.size())), -1);
            }
            long j14 = j11 - j10;
            int i11 = 0;
            int c10 = e0.c(eVar.f18189p, Long.valueOf(j14), true, !this.f5165g.a() || cVar == null);
            long j15 = ((long) c10) + eVar.f18182i;
            if (c10 >= 0) {
                e.d dVar = eVar.f18189p.get(c10);
                if (j14 < dVar.f18204e + dVar.f18202c) {
                    list = dVar.f18199u;
                } else {
                    list = eVar.f18190q;
                }
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    e.b bVar = list.get(i11);
                    if (j14 >= bVar.f18204e + bVar.f18202c) {
                        i11++;
                    } else if (bVar.f18194t) {
                        j15 += list == eVar.f18190q ? 1 : 0;
                        i10 = i11;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j15), Integer.valueOf(i10));
        } else if (!cVar.H) {
            return new Pair<>(Long.valueOf(cVar.f3635j), Integer.valueOf(cVar.f5191o));
        } else {
            if (cVar.f5191o == -1) {
                j12 = cVar.c();
            } else {
                j12 = cVar.f3635j;
            }
            Long valueOf = Long.valueOf(j12);
            int i12 = cVar.f5191o;
            if (i12 != -1) {
                i10 = i12 + 1;
            }
            return new Pair<>(valueOf, Integer.valueOf(i10));
        }
    }

    public final b6.e d(Uri uri, int i10) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        byte[] bArr = (byte[]) this.f5168j.f13616a.remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) this.f5168j.f13616a.put(uri2, bArr);
            return null;
        }
        u6.e eVar = new u6.e(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        return new a(this.f5161c, eVar, this.f5164f[i10], this.f5174p.l(), this.f5174p.p(), this.f5170l);
    }
}
