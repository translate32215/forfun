package z4;

import androidx.appcompat.widget.d0;
import java.nio.ByteBuffer;
import x4.b0;
import x4.o0;

/* compiled from: AudioSink */
public interface l {

    /* compiled from: AudioSink */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28368a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f28369b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r3, int r4, int r5, int r6, x4.b0 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " "
                r0.append(r3)
                java.lang.String r3 = "Config("
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ", "
                r0.append(r3)
                r0.append(r5)
                r0.append(r3)
                r0.append(r6)
                java.lang.String r3 = ")"
                r0.append(r3)
                if (r8 == 0) goto L_0x0032
                java.lang.String r3 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r3 = ""
            L_0x0034:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3, r9)
                r2.f28368a = r8
                r2.f28369b = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.l.b.<init>(int, int, int, int, x4.b0, boolean, java.lang.Exception):void");
        }
    }

    /* compiled from: AudioSink */
    public interface c {
    }

    /* compiled from: AudioSink */
    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28370a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f28371b;

        public d(int i10, b0 b0Var, boolean z10) {
            super(d0.a("AudioTrack write failed: ", i10));
            this.f28370a = z10;
            this.f28371b = b0Var;
        }
    }

    void a(o oVar);

    void b();

    void c();

    boolean d();

    void e() throws d;

    o0 f();

    void flush();

    void g();

    boolean h(b0 b0Var);

    void i(o0 o0Var);

    boolean j();

    void k(b0 b0Var, int i10, int[] iArr) throws a;

    void k0();

    void l(d dVar);

    void m(int i10);

    boolean n(ByteBuffer byteBuffer, long j10, int i10) throws b, d;

    long o(boolean z10);

    void p();

    int q(b0 b0Var);

    void r(c cVar);

    void s(boolean z10);

    void t();

    void u(float f10);

    /* compiled from: AudioSink */
    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f28367a;

        public a(Throwable th, b0 b0Var) {
            super(th);
            this.f28367a = b0Var;
        }

        public a(String str, b0 b0Var) {
            super(str);
            this.f28367a = b0Var;
        }
    }
}
