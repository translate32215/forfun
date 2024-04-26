package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.appcompat.widget.x0;
import j.f;
import java.io.IOException;
import java.net.URLDecoder;
import k3.b;
import u6.c;
import u6.e;
import v6.e0;
import x4.m0;

/* compiled from: DataSchemeDataSource */
public final class d extends c {

    /* renamed from: e  reason: collision with root package name */
    public e f5471e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5472f;

    /* renamed from: g  reason: collision with root package name */
    public int f5473g;

    /* renamed from: h  reason: collision with root package name */
    public int f5474h;

    public d() {
        super(false);
    }

    public Uri M() {
        e eVar = this.f5471e;
        if (eVar != null) {
            return eVar.f26048a;
        }
        return null;
    }

    public long O(e eVar) throws IOException {
        o(eVar);
        this.f5471e = eVar;
        this.f5474h = (int) eVar.f26053f;
        Uri uri = eVar.f26048a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] R = e0.R(uri.getSchemeSpecificPart(), ",");
            if (R.length == 2) {
                String str = R[1];
                if (R[0].contains(";base64")) {
                    try {
                        this.f5472f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        throw new m0(f.a("Error while parsing Base64 encoded string: ", str), e10);
                    }
                } else {
                    this.f5472f = e0.D(URLDecoder.decode(str, aa.c.f176a.name()));
                }
                long j10 = eVar.f26054g;
                int length = j10 != -1 ? ((int) j10) + this.f5474h : this.f5472f.length;
                this.f5473g = length;
                if (length > this.f5472f.length || this.f5474h > length) {
                    this.f5472f = null;
                    throw new b(0, 1);
                }
                p(eVar);
                return ((long) this.f5473g) - ((long) this.f5474h);
            }
            throw new m0(x0.a("Unexpected URI format: ", uri));
        }
        throw new m0(f.a("Unsupported scheme: ", scheme));
    }

    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f5473g - this.f5474h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f5472f;
        int i13 = e0.f26436a;
        System.arraycopy(bArr2, this.f5474h, bArr, i10, min);
        this.f5474h += min;
        m(min);
        return min;
    }

    public void close() {
        if (this.f5472f != null) {
            this.f5472f = null;
            n();
        }
        this.f5471e = null;
    }
}
