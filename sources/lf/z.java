package lf;

import j.f;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import ke.c0;
import ke.p;
import ke.r;
import ke.s;
import ke.u;
import ke.v;
import ke.z;
import ve.g;

/* compiled from: RequestBuilder */
public final class z {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f21435l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f21436m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f21437a;

    /* renamed from: b  reason: collision with root package name */
    public final s f21438b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f21439c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public s.a f21440d;

    /* renamed from: e  reason: collision with root package name */
    public final z.a f21441e = new z.a();

    /* renamed from: f  reason: collision with root package name */
    public final r.a f21442f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public u f21443g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21444h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public v.a f21445i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public p.a f21446j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public c0 f21447k;

    /* compiled from: RequestBuilder */
    public static class a extends c0 {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f21448a;

        /* renamed from: b  reason: collision with root package name */
        public final u f21449b;

        public a(c0 c0Var, u uVar) {
            this.f21448a = c0Var;
            this.f21449b = uVar;
        }

        public long a() throws IOException {
            return this.f21448a.a();
        }

        public u b() {
            return this.f21449b;
        }

        public void c(g gVar) throws IOException {
            this.f21448a.c(gVar);
        }
    }

    public z(String str, s sVar, @Nullable String str2, @Nullable r rVar, @Nullable u uVar, boolean z10, boolean z11, boolean z12) {
        this.f21437a = str;
        this.f21438b = sVar;
        this.f21439c = str2;
        this.f21443g = uVar;
        this.f21444h = z10;
        if (rVar != null) {
            this.f21442f = rVar.e();
        } else {
            this.f21442f = new r.a();
        }
        if (z11) {
            this.f21446j = new p.a();
        } else if (z12) {
            v.a aVar = new v.a();
            this.f21445i = aVar;
            u uVar2 = v.f20805f;
            if (uVar2 == null) {
                throw new NullPointerException("type == null");
            } else if (uVar2.f20802b.equals("multipart")) {
                aVar.f20814b = uVar2;
            } else {
                throw new IllegalArgumentException("multipart != " + uVar2);
            }
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            p.a aVar = this.f21446j;
            if (str != null) {
                aVar.f20773a.add(s.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, (Charset) null));
                aVar.f20774b.add(s.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, (Charset) null));
                return;
            }
            throw new NullPointerException("name == null");
        }
        p.a aVar2 = this.f21446j;
        if (str != null) {
            aVar2.f20773a.add(s.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, (Charset) null));
            aVar2.f20774b.add(s.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, (Charset) null));
            return;
        }
        throw new NullPointerException("name == null");
    }

    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f21443g = u.b(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(f.a("Malformed content type: ", str2), e10);
            }
        } else {
            this.f21442f.a(str, str2);
        }
    }

    public void c(r rVar, c0 c0Var) {
        v.a aVar = this.f21445i;
        aVar.getClass();
        if (c0Var == null) {
            throw new NullPointerException("body == null");
        } else if (rVar != null && rVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (rVar == null || rVar.c("Content-Length") == null) {
            aVar.f20815c.add(new v.b(rVar, c0Var));
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    public void d(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f21439c;
        String str4 = null;
        if (str3 != null) {
            s.a l10 = this.f21438b.l(str3);
            this.f21440d = l10;
            if (l10 != null) {
                this.f21439c = null;
            } else {
                StringBuilder a10 = android.support.v4.media.a.a("Malformed URL. Base: ");
                a10.append(this.f21438b);
                a10.append(", Relative: ");
                a10.append(this.f21439c);
                throw new IllegalArgumentException(a10.toString());
            }
        }
        if (z10) {
            s.a aVar = this.f21440d;
            if (str != null) {
                if (aVar.f20797g == null) {
                    aVar.f20797g = new ArrayList();
                }
                aVar.f20797g.add(s.b(str, " \"'<>#&=", true, false, true, true));
                List<String> list = aVar.f20797g;
                if (str2 != null) {
                    str4 = s.b(str2, " \"'<>#&=", true, false, true, true);
                }
                list.add(str4);
                return;
            }
            throw new NullPointerException("encodedName == null");
        }
        s.a aVar2 = this.f21440d;
        if (str != null) {
            if (aVar2.f20797g == null) {
                aVar2.f20797g = new ArrayList();
            }
            aVar2.f20797g.add(s.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list2 = aVar2.f20797g;
            if (str2 != null) {
                str4 = s.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            }
            list2.add(str4);
            return;
        }
        throw new NullPointerException("name == null");
    }
}
