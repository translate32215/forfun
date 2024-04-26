package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import d5.a0;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import j.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q6.e;
import q6.h;
import v6.b0;
import v6.v;
import x4.b0;
import x4.m0;

/* compiled from: WebvttExtractor */
public final class g implements i {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f5262g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f5263h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f5264a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f5265b;

    /* renamed from: c  reason: collision with root package name */
    public final v f5266c = new v();

    /* renamed from: d  reason: collision with root package name */
    public k f5267d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5268e = new byte[1024];

    /* renamed from: f  reason: collision with root package name */
    public int f5269f;

    public g(String str, b0 b0Var) {
        this.f5264a = str;
        this.f5265b = b0Var;
    }

    public void a() {
    }

    @RequiresNonNull({"output"})
    public final a0 b(long j10) {
        a0 l10 = this.f5267d.l(0, 3);
        b0.b bVar = new b0.b();
        bVar.f27425k = "text/vtt";
        bVar.f27417c = this.f5264a;
        bVar.f27429o = j10;
        l10.c(bVar.a());
        this.f5267d.d();
        return l10;
    }

    public boolean e(j jVar) throws IOException {
        jVar.h(this.f5268e, 0, 6, false);
        this.f5266c.B(this.f5268e, 6);
        if (h.a(this.f5266c)) {
            return true;
        }
        jVar.h(this.f5268e, 6, 3, false);
        this.f5266c.B(this.f5268e, 9);
        return h.a(this.f5266c);
    }

    public int f(j jVar, w wVar) throws IOException {
        Matcher matcher;
        String g10;
        int i10;
        this.f5267d.getClass();
        int b10 = (int) jVar.b();
        int i11 = this.f5269f;
        byte[] bArr = this.f5268e;
        if (i11 == bArr.length) {
            if (b10 != -1) {
                i10 = b10;
            } else {
                i10 = bArr.length;
            }
            this.f5268e = Arrays.copyOf(bArr, (i10 * 3) / 2);
        }
        byte[] bArr2 = this.f5268e;
        int i12 = this.f5269f;
        int a10 = jVar.a(bArr2, i12, bArr2.length - i12);
        if (a10 != -1) {
            int i13 = this.f5269f + a10;
            this.f5269f = i13;
            if (b10 == -1 || i13 != b10) {
                return 0;
            }
        }
        v vVar = new v(this.f5268e);
        h.d(vVar);
        long j10 = 0;
        long j11 = 0;
        for (String g11 = vVar.g(); !TextUtils.isEmpty(g11); g11 = vVar.g()) {
            if (g11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher2 = f5262g.matcher(g11);
                if (matcher2.find()) {
                    Matcher matcher3 = f5263h.matcher(g11);
                    if (matcher3.find()) {
                        String group = matcher2.group(1);
                        group.getClass();
                        j11 = h.c(group);
                        String group2 = matcher3.group(1);
                        group2.getClass();
                        j10 = (Long.parseLong(group2) * 1000000) / 90000;
                    } else {
                        throw new m0(f.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ", g11));
                    }
                } else {
                    throw new m0(f.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ", g11));
                }
            }
        }
        while (true) {
            String g12 = vVar.g();
            if (g12 == null) {
                matcher = null;
                break;
            } else if (h.f24210a.matcher(g12).matches()) {
                do {
                    g10 = vVar.g();
                    if (g10 == null) {
                        break;
                    }
                } while (g10.isEmpty());
            } else {
                matcher = e.f24183a.matcher(g12);
                if (matcher.matches()) {
                    break;
                }
            }
        }
        if (matcher == null) {
            b(0);
        } else {
            String group3 = matcher.group(1);
            group3.getClass();
            long c10 = h.c(group3);
            long b11 = this.f5265b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
            a0 b12 = b(b11 - c10);
            this.f5266c.B(this.f5268e, this.f5269f);
            b12.b(this.f5266c, this.f5269f);
            b12.d(b11, 1, this.f5269f, 0, (a0.a) null);
        }
        return -1;
    }

    public void h(long j10, long j11) {
        throw new IllegalStateException();
    }

    public void i(k kVar) {
        this.f5267d = kVar;
        kVar.b(new x.b(-9223372036854775807L, 0));
    }
}
