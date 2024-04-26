package com.google.android.exoplayer2.upstream;

import aa.h;
import androidx.appcompat.widget.d0;
import com.google.android.exoplayer2.upstream.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: HttpDataSource */
public interface m extends e {

    /* compiled from: HttpDataSource */
    public static abstract class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final g f5523a = new g();

        public final m a() {
            j jVar = (j) this;
            return new i(jVar.f5516b, jVar.f5517c, jVar.f5518d, false, this.f5523a, (h<String>) null);
        }
    }

    /* compiled from: HttpDataSource */
    public static final class b extends d {
        public b(IOException iOException, u6.e eVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, eVar, 1);
        }
    }

    /* compiled from: HttpDataSource */
    public interface c extends e.a {
        m a();
    }

    /* compiled from: HttpDataSource */
    public static class d extends IOException {
        public d(String str, u6.e eVar, int i10) {
            super(str);
        }

        public d(IOException iOException, u6.e eVar, int i10) {
            super(iOException);
        }

        public d(String str, IOException iOException, u6.e eVar, int i10) {
            super(str, iOException);
        }
    }

    /* compiled from: HttpDataSource */
    public static final class e extends d {
        public e(String str, u6.e eVar) {
            super(j.f.a("Invalid content type: ", str), eVar, 1);
        }
    }

    /* compiled from: HttpDataSource */
    public static final class f extends d {

        /* renamed from: a  reason: collision with root package name */
        public final int f5524a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, List<String>> f5525b;

        public f(int i10, String str, Map<String, List<String>> map, u6.e eVar, byte[] bArr) {
            super(d0.a("Response code: ", i10), eVar, 1);
            this.f5524a = i10;
            this.f5525b = map;
        }
    }

    /* compiled from: HttpDataSource */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f5526a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f5527b;

        public synchronized Map<String, String> a() {
            if (this.f5527b == null) {
                this.f5527b = Collections.unmodifiableMap(new HashMap(this.f5526a));
            }
            return this.f5527b;
        }
    }
}
