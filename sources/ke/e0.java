package ke;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import le.c;
import ve.h;

/* compiled from: ResponseBody */
public abstract class e0 implements Closeable {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Reader f20689a;

    /* compiled from: ResponseBody */
    public class a extends e0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u f20690b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f20691c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h f20692d;

        public a(u uVar, long j10, h hVar) {
            this.f20690b = uVar;
            this.f20691c = j10;
            this.f20692d = hVar;
        }

        public long a() {
            return this.f20691c;
        }

        @Nullable
        public u d() {
            return this.f20690b;
        }

        public h o() {
            return this.f20692d;
        }
    }

    /* compiled from: ResponseBody */
    public static final class b extends Reader {

        /* renamed from: a  reason: collision with root package name */
        public final h f20693a;

        /* renamed from: b  reason: collision with root package name */
        public final Charset f20694b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f20695c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public Reader f20696d;

        public b(h hVar, Charset charset) {
            this.f20693a = hVar;
            this.f20694b = charset;
        }

        public void close() throws IOException {
            this.f20695c = true;
            Reader reader = this.f20696d;
            if (reader != null) {
                reader.close();
            } else {
                this.f20693a.close();
            }
        }

        public int read(char[] cArr, int i10, int i11) throws IOException {
            if (!this.f20695c) {
                Reader reader = this.f20696d;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f20693a.e0(), c.b(this.f20693a, this.f20694b));
                    this.f20696d = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public static e0 i(@Nullable u uVar, long j10, h hVar) {
        return new a(uVar, j10, hVar);
    }

    public abstract long a();

    public void close() {
        c.e(o());
    }

    @Nullable
    public abstract u d();

    public abstract h o();

    public final String s() throws IOException {
        h o10 = o();
        try {
            u d10 = d();
            return o10.d0(c.b(o10, d10 != null ? d10.a(c.f21269i) : c.f21269i));
        } finally {
            c.e(o10);
        }
    }
}
