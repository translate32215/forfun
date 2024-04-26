package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import u6.e;
import u6.i;
import v6.a;
import v6.e0;

/* compiled from: DefaultDataSource */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5481a;

    /* renamed from: b  reason: collision with root package name */
    public final List<i> f5482b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final e f5483c;

    /* renamed from: d  reason: collision with root package name */
    public e f5484d;

    /* renamed from: e  reason: collision with root package name */
    public e f5485e;

    /* renamed from: f  reason: collision with root package name */
    public e f5486f;

    /* renamed from: g  reason: collision with root package name */
    public e f5487g;

    /* renamed from: h  reason: collision with root package name */
    public e f5488h;

    /* renamed from: i  reason: collision with root package name */
    public e f5489i;

    /* renamed from: j  reason: collision with root package name */
    public e f5490j;

    /* renamed from: k  reason: collision with root package name */
    public e f5491k;

    public g(Context context, e eVar) {
        this.f5481a = context.getApplicationContext();
        eVar.getClass();
        this.f5483c = eVar;
    }

    public Uri M() {
        e eVar = this.f5491k;
        if (eVar == null) {
            return null;
        }
        return eVar.M();
    }

    public Map<String, List<String>> N() {
        e eVar = this.f5491k;
        return eVar == null ? Collections.emptyMap() : eVar.N();
    }

    public long O(e eVar) throws IOException {
        boolean z10 = true;
        a.d(this.f5491k == null);
        String scheme = eVar.f26048a.getScheme();
        Uri uri = eVar.f26048a;
        int i10 = e0.f26436a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z10 = false;
        }
        if (z10) {
            String path = eVar.f26048a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f5484d == null) {
                    l lVar = new l();
                    this.f5484d = lVar;
                    m(lVar);
                }
                this.f5491k = this.f5484d;
            } else {
                if (this.f5485e == null) {
                    a aVar = new a(this.f5481a);
                    this.f5485e = aVar;
                    m(aVar);
                }
                this.f5491k = this.f5485e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f5485e == null) {
                a aVar2 = new a(this.f5481a);
                this.f5485e = aVar2;
                m(aVar2);
            }
            this.f5491k = this.f5485e;
        } else if ("content".equals(scheme)) {
            if (this.f5486f == null) {
                b bVar = new b(this.f5481a);
                this.f5486f = bVar;
                m(bVar);
            }
            this.f5491k = this.f5486f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f5487g == null) {
                try {
                    e eVar2 = (e) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f5487g = eVar2;
                    m(eVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f5487g == null) {
                    this.f5487g = this.f5483c;
                }
            }
            this.f5491k = this.f5487g;
        } else if ("udp".equals(scheme)) {
            if (this.f5488h == null) {
                s sVar = new s();
                this.f5488h = sVar;
                m(sVar);
            }
            this.f5491k = this.f5488h;
        } else if ("data".equals(scheme)) {
            if (this.f5489i == null) {
                d dVar = new d();
                this.f5489i = dVar;
                m(dVar);
            }
            this.f5491k = this.f5489i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f5490j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f5481a);
                this.f5490j = rawResourceDataSource;
                m(rawResourceDataSource);
            }
            this.f5491k = this.f5490j;
        } else {
            this.f5491k = this.f5483c;
        }
        return this.f5491k.O(eVar);
    }

    public void P(i iVar) {
        iVar.getClass();
        this.f5483c.P(iVar);
        this.f5482b.add(iVar);
        e eVar = this.f5484d;
        if (eVar != null) {
            eVar.P(iVar);
        }
        e eVar2 = this.f5485e;
        if (eVar2 != null) {
            eVar2.P(iVar);
        }
        e eVar3 = this.f5486f;
        if (eVar3 != null) {
            eVar3.P(iVar);
        }
        e eVar4 = this.f5487g;
        if (eVar4 != null) {
            eVar4.P(iVar);
        }
        e eVar5 = this.f5488h;
        if (eVar5 != null) {
            eVar5.P(iVar);
        }
        e eVar6 = this.f5489i;
        if (eVar6 != null) {
            eVar6.P(iVar);
        }
        e eVar7 = this.f5490j;
        if (eVar7 != null) {
            eVar7.P(iVar);
        }
    }

    public int a(byte[] bArr, int i10, int i11) throws IOException {
        e eVar = this.f5491k;
        eVar.getClass();
        return eVar.a(bArr, i10, i11);
    }

    public void close() throws IOException {
        e eVar = this.f5491k;
        if (eVar != null) {
            try {
                eVar.close();
            } finally {
                this.f5491k = null;
            }
        }
    }

    public final void m(e eVar) {
        for (int i10 = 0; i10 < this.f5482b.size(); i10++) {
            eVar.P(this.f5482b.get(i10));
        }
    }
}
