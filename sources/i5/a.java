package i5;

import d5.j;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: DefaultEbmlReader */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f19155a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f19156b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final g f19157c = new g();

    /* renamed from: d  reason: collision with root package name */
    public b f19158d;

    /* renamed from: e  reason: collision with root package name */
    public int f19159e;

    /* renamed from: f  reason: collision with root package name */
    public int f19160f;

    /* renamed from: g  reason: collision with root package name */
    public long f19161g;

    /* compiled from: DefaultEbmlReader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19162a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19163b;

        public b(int i10, long j10, C0160a aVar) {
            this.f19162a = i10;
            this.f19163b = j10;
        }
    }

    public final long a(j jVar, int i10) throws IOException {
        jVar.readFully(this.f19155a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f19155a[i11] & 255));
        }
        return j10;
    }
}
