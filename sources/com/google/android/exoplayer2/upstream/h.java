package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.i;

/* compiled from: DefaultDataSourceFactory */
public final class h implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5492a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a f5493b;

    public h(Context context) {
        i.a aVar = new i.a();
        aVar.f5513b = null;
        this.f5492a = context.getApplicationContext();
        this.f5493b = aVar;
    }

    public e a() {
        return new g(this.f5492a, this.f5493b.a());
    }

    public h(Context context, e.a aVar) {
        this.f5492a = context.getApplicationContext();
        this.f5493b = aVar;
    }
}
