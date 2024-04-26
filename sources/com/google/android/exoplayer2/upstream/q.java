package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.e;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import pc.l;
import t4.p;
import u6.i;
import ud.k;

/* compiled from: ResolvingDataSource */
public final class q implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f5553a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5554b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5555c;

    /* compiled from: ResolvingDataSource */
    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f5556a;

        public a(e.a aVar, b bVar) {
            this.f5556a = aVar;
        }

        public e a() {
            return new q(this.f5556a.a(), p.f25719d);
        }
    }

    /* compiled from: ResolvingDataSource */
    public interface b {
    }

    public q(e eVar, b bVar) {
        this.f5553a = eVar;
        this.f5554b = bVar;
    }

    public Uri M() {
        Uri M = this.f5553a.M();
        if (M == null) {
            return null;
        }
        this.f5554b.getClass();
        return M;
    }

    public Map<String, List<String>> N() {
        return this.f5553a.N();
    }

    public long O(u6.e eVar) throws IOException {
        String queryParameter;
        u6.e eVar2 = eVar;
        ((p) this.f5554b).getClass();
        PlayerActivity.a aVar = PlayerActivity.f13437n0;
        k.f(eVar2, "dataSpec");
        String uri = eVar2.f26048a.toString();
        k.e(uri, "dataSpec.uri.toString()");
        if (ce.k.i(uri, "twitter", false) && (queryParameter = eVar2.f26048a.getQueryParameter("stream_name")) != null) {
            StringBuilder sb2 = new StringBuilder();
            l.g();
            sb2.append("http://def.yacinelive.com/api/");
            sb2.append("tw_key?stream_name=");
            sb2.append(queryParameter);
            eVar2 = new u6.e(Uri.parse(sb2.toString()), eVar2.f26049b, eVar2.f26050c, eVar2.f26051d, eVar2.f26052e, eVar2.f26053f, eVar2.f26054g, eVar2.f26055h, eVar2.f26056i, eVar2.f26057j);
        }
        this.f5555c = true;
        return this.f5553a.O(eVar2);
    }

    public void P(i iVar) {
        iVar.getClass();
        this.f5553a.P(iVar);
    }

    public int a(byte[] bArr, int i10, int i11) throws IOException {
        return this.f5553a.a(bArr, i10, i11);
    }

    public void close() throws IOException {
        if (this.f5555c) {
            this.f5555c = false;
            this.f5553a.close();
        }
    }
}
