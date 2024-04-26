package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import u6.e;
import u6.i;

/* compiled from: StatsDataSource */
public final class r implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f5557a;

    /* renamed from: b  reason: collision with root package name */
    public long f5558b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f5559c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<String>> f5560d = Collections.emptyMap();

    public r(e eVar) {
        eVar.getClass();
        this.f5557a = eVar;
    }

    public Uri M() {
        return this.f5557a.M();
    }

    public Map<String, List<String>> N() {
        return this.f5557a.N();
    }

    public long O(e eVar) throws IOException {
        this.f5559c = eVar.f26048a;
        this.f5560d = Collections.emptyMap();
        long O = this.f5557a.O(eVar);
        Uri M = M();
        M.getClass();
        this.f5559c = M;
        this.f5560d = N();
        return O;
    }

    public void P(i iVar) {
        iVar.getClass();
        this.f5557a.P(iVar);
    }

    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int a10 = this.f5557a.a(bArr, i10, i11);
        if (a10 != -1) {
            this.f5558b += (long) a10;
        }
        return a10;
    }

    public void close() throws IOException {
        this.f5557a.close();
    }
}
