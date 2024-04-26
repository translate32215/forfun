package ke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import le.c;
import ve.g;
import ve.i;

/* compiled from: MultipartBody */
public final class v extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final u f20804e = u.b("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final u f20805f = u.b("multipart/form-data");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f20806g = {58, 32};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f20807h = {13, 10};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f20808i = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    public final i f20809a;

    /* renamed from: b  reason: collision with root package name */
    public final u f20810b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f20811c;

    /* renamed from: d  reason: collision with root package name */
    public long f20812d = -1;

    /* compiled from: MultipartBody */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f20813a;

        /* renamed from: b  reason: collision with root package name */
        public u f20814b = v.f20804e;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f20815c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.f20813a = i.i(uuid);
        }
    }

    /* compiled from: MultipartBody */
    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final r f20816a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f20817b;

        public b(@Nullable r rVar, c0 c0Var) {
            this.f20816a = rVar;
            this.f20817b = c0Var;
        }
    }

    static {
        u.b("multipart/alternative");
        u.b("multipart/digest");
        u.b("multipart/parallel");
    }

    public v(i iVar, u uVar, List<b> list) {
        this.f20809a = iVar;
        this.f20810b = u.b(uVar + "; boundary=" + iVar.x());
        this.f20811c = c.o(list);
    }

    public long a() throws IOException {
        long j10 = this.f20812d;
        if (j10 != -1) {
            return j10;
        }
        long d10 = d((g) null, true);
        this.f20812d = d10;
        return d10;
    }

    public u b() {
        return this.f20810b;
    }

    public void c(g gVar) throws IOException {
        d(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ve.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ve.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ve.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ve.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ve.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(@javax.annotation.Nullable ve.g r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            ve.f r13 = new ve.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<ke.v$b> r1 = r12.f20811c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a2
            java.util.List<ke.v$b> r6 = r12.f20811c
            java.lang.Object r6 = r6.get(r5)
            ke.v$b r6 = (ke.v.b) r6
            ke.r r7 = r6.f20816a
            ke.c0 r6 = r6.f20817b
            byte[] r8 = f20808i
            r13.F(r8)
            ve.i r8 = r12.f20809a
            r13.x(r8)
            byte[] r8 = f20807h
            r13.F(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.g()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.d(r9)
            ve.g r10 = r13.Y(r10)
            byte[] r11 = f20806g
            ve.g r10 = r10.F(r11)
            java.lang.String r11 = r7.h(r9)
            ve.g r10 = r10.Y(r11)
            byte[] r11 = f20807h
            r10.F(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            ke.u r7 = r6.b()
            if (r7 == 0) goto L_0x006f
            java.lang.String r8 = "Content-Type: "
            ve.g r8 = r13.Y(r8)
            java.lang.String r7 = r7.f20801a
            ve.g r7 = r8.Y(r7)
            byte[] r8 = f20807h
            r7.F(r8)
        L_0x006f:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0089
            java.lang.String r9 = "Content-Length: "
            ve.g r9 = r13.Y(r9)
            ve.g r9 = r9.Z(r7)
            byte[] r10 = f20807h
            r9.F(r10)
            goto L_0x008f
        L_0x0089:
            if (r14 == 0) goto L_0x008f
            r0.a()
            return r9
        L_0x008f:
            byte[] r9 = f20807h
            r13.F(r9)
            if (r14 == 0) goto L_0x0098
            long r3 = r3 + r7
            goto L_0x009b
        L_0x0098:
            r6.c(r13)
        L_0x009b:
            r13.F(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a2:
            byte[] r1 = f20808i
            r13.F(r1)
            ve.i r2 = r12.f20809a
            r13.x(r2)
            r13.F(r1)
            byte[] r1 = f20807h
            r13.F(r1)
            if (r14 == 0) goto L_0x00bc
            long r13 = r0.f26740b
            long r3 = r3 + r13
            r0.a()
        L_0x00bc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.v.d(ve.g, boolean):long");
    }
}
