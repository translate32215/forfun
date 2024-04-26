package androidx.leanback.app;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.h1;
import androidx.leanback.widget.l0;
import androidx.leanback.widget.m0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.v0;
import androidx.leanback.widget.y0;
import com.startapp.startappsdk.R;

/* compiled from: SearchSupportFragment */
public class p extends androidx.fragment.app.p {
    public static final String G0;
    public static final String H0;
    public SpeechRecognizer A0;
    public int B0;
    public boolean C0 = true;
    public boolean D0;
    public boolean E0;
    public SearchBar.k F0 = new e();

    /* renamed from: n0  reason: collision with root package name */
    public final h0.b f2057n0 = new a();

    /* renamed from: o0  reason: collision with root package name */
    public final Handler f2058o0 = new Handler();

    /* renamed from: p0  reason: collision with root package name */
    public final Runnable f2059p0 = new b();

    /* renamed from: q0  reason: collision with root package name */
    public final Runnable f2060q0 = new c();

    /* renamed from: r0  reason: collision with root package name */
    public final Runnable f2061r0 = new d();

    /* renamed from: s0  reason: collision with root package name */
    public o f2062s0;

    /* renamed from: t0  reason: collision with root package name */
    public SearchBar f2063t0;

    /* renamed from: u0  reason: collision with root package name */
    public h f2064u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f2065v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public l0 f2066w0;

    /* renamed from: x0  reason: collision with root package name */
    public h0 f2067x0;

    /* renamed from: y0  reason: collision with root package name */
    public String f2068y0;

    /* renamed from: z0  reason: collision with root package name */
    public Drawable f2069z0;

    /* compiled from: SearchSupportFragment */
    public class a extends h0.b {
        public a() {
        }

        public void a() {
            p pVar = p.this;
            pVar.f2058o0.removeCallbacks(pVar.f2059p0);
            p pVar2 = p.this;
            pVar2.f2058o0.post(pVar2.f2059p0);
        }
    }

    /* compiled from: SearchSupportFragment */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            h0 h0Var;
            h0 h0Var2;
            p pVar = p.this;
            o oVar = pVar.f2062s0;
            if (!(oVar == null || (h0Var = oVar.f1923n0) == (h0Var2 = pVar.f2067x0) || (h0Var == null && h0Var2.e() == 0))) {
                p pVar2 = p.this;
                pVar2.f2062s0.w0(pVar2.f2067x0);
                p.this.f2062s0.y0(0, true);
            }
            p.this.u0();
            p pVar3 = p.this;
            int i10 = pVar3.B0 | 1;
            pVar3.B0 = i10;
            if ((i10 & 2) != 0) {
                pVar3.s0();
            }
            p.this.t0();
        }
    }

    /* compiled from: SearchSupportFragment */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            h0 h0Var;
            p pVar = p.this;
            if (pVar.f2062s0 != null) {
                h0 h10 = pVar.f2064u0.h();
                p pVar2 = p.this;
                h0 h0Var2 = pVar2.f2067x0;
                if (h10 != h0Var2) {
                    boolean z10 = h0Var2 == null;
                    if (h0Var2 != null) {
                        h0Var2.f2400a.unregisterObserver(pVar2.f2057n0);
                        pVar2.f2067x0 = null;
                    }
                    p pVar3 = p.this;
                    pVar3.f2067x0 = h10;
                    if (h10 != null) {
                        h10.f2400a.registerObserver(pVar3.f2057n0);
                    }
                    if (!z10 || !((h0Var = p.this.f2067x0) == null || h0Var.e() == 0)) {
                        p pVar4 = p.this;
                        pVar4.f2062s0.w0(pVar4.f2067x0);
                    }
                    p pVar5 = p.this;
                    String str = pVar5.f2065v0;
                    if (!(str == null || pVar5.f2067x0 == null)) {
                        pVar5.f2065v0 = null;
                        if (pVar5.f2064u0.a(str)) {
                            pVar5.B0 &= -3;
                        }
                    }
                }
                p.this.t0();
                p pVar6 = p.this;
                if (pVar6.C0) {
                    pVar6.f2058o0.removeCallbacks(pVar6.f2061r0);
                    p pVar7 = p.this;
                    pVar7.f2058o0.postDelayed(pVar7.f2061r0, 300);
                    return;
                }
                pVar6.s0();
            }
        }
    }

    /* compiled from: SearchSupportFragment */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            p pVar = p.this;
            pVar.C0 = false;
            pVar.f2063t0.d();
        }
    }

    /* compiled from: SearchSupportFragment */
    public class e implements SearchBar.k {
        public e() {
        }
    }

    /* compiled from: SearchSupportFragment */
    public class f implements SearchBar.j {
        public f() {
        }
    }

    /* compiled from: SearchSupportFragment */
    public class g implements m0 {
        public g() {
        }

        public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
            v0 v0Var = (v0) obj2;
            p.this.u0();
            p.this.getClass();
        }
    }

    /* compiled from: SearchSupportFragment */
    public interface h {
        boolean a(String str);

        boolean b(String str);

        h0 h();
    }

    static {
        Class<p> cls = p.class;
        String canonicalName = p.class.getCanonicalName();
        G0 = j.f.a(canonicalName, ".query");
        H0 = j.f.a(canonicalName, ".title");
    }

    public void O(Bundle bundle) {
        if (this.C0) {
            this.C0 = bundle == null;
        }
        super.O(bundle);
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_search_fragment, viewGroup, false);
        SearchBar searchBar = (SearchBar) ((FrameLayout) inflate.findViewById(R.id.lb_search_frame)).findViewById(R.id.lb_search_bar);
        this.f2063t0 = searchBar;
        searchBar.setSearchBarListener(new f());
        this.f2063t0.setSpeechRecognitionCallback((h1) null);
        this.f2063t0.setPermissionListener(this.F0);
        Bundle bundle2 = this.f1796g;
        if (bundle2 != null) {
            String str = G0;
            if (bundle2.containsKey(str)) {
                this.f2063t0.setSearchQuery(bundle2.getString(str));
            }
            String str2 = H0;
            if (bundle2.containsKey(str2)) {
                String string = bundle2.getString(str2);
                this.f2068y0 = string;
                SearchBar searchBar2 = this.f2063t0;
                if (searchBar2 != null) {
                    searchBar2.setTitle(string);
                }
            }
        }
        Drawable drawable = this.f2069z0;
        if (drawable != null) {
            this.f2069z0 = drawable;
            SearchBar searchBar3 = this.f2063t0;
            if (searchBar3 != null) {
                searchBar3.setBadgeDrawable(drawable);
            }
        }
        String str3 = this.f2068y0;
        if (str3 != null) {
            this.f2068y0 = str3;
            SearchBar searchBar4 = this.f2063t0;
            if (searchBar4 != null) {
                searchBar4.setTitle(str3);
            }
        }
        if (p().F(R.id.lb_results_frame) == null) {
            this.f2062s0 = new o();
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(p());
            bVar.h(R.id.lb_results_frame, this.f2062s0);
            bVar.e();
        } else {
            this.f2062s0 = (o) p().F(R.id.lb_results_frame);
        }
        this.f2062s0.E0(new g());
        this.f2062s0.D0(this.f2066w0);
        this.f2062s0.C0(true);
        if (this.f2064u0 != null) {
            this.f2058o0.removeCallbacks(this.f2060q0);
            this.f2058o0.post(this.f2060q0);
        }
        return inflate;
    }

    public void Q() {
        h0 h0Var = this.f2067x0;
        if (h0Var != null) {
            h0Var.f2400a.unregisterObserver(this.f2057n0);
            this.f2067x0 = null;
        }
        this.O = true;
    }

    public void V() {
        if (this.A0 != null) {
            this.f2063t0.setSpeechRecognizer((SpeechRecognizer) null);
            this.A0.destroy();
            this.A0 = null;
        }
        this.D0 = true;
        this.O = true;
    }

    public void Y(int i10, String[] strArr, int[] iArr) {
        if (i10 == 0 && strArr.length > 0 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr[0] == 0) {
            if (this.D0) {
                this.E0 = true;
            } else {
                this.f2063t0.d();
            }
        }
    }

    public void Z() {
        this.O = true;
        this.D0 = false;
        if (this.A0 == null) {
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(q());
            this.A0 = createSpeechRecognizer;
            this.f2063t0.setSpeechRecognizer(createSpeechRecognizer);
        }
        if (this.E0) {
            this.E0 = false;
            this.f2063t0.d();
            return;
        }
        this.f2063t0.e();
    }

    public void b0() {
        this.O = true;
        VerticalGridView verticalGridView = this.f2062s0.f1924o0;
        int dimensionPixelSize = C().getDimensionPixelSize(R.dimen.lb_search_browse_rows_align_top);
        verticalGridView.setItemAlignmentOffset(0);
        verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignmentOffset(dimensionPixelSize);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignment(0);
        verticalGridView.setFocusable(false);
        verticalGridView.setFocusableInTouchMode(false);
    }

    public final void r0() {
        o oVar = this.f2062s0;
        if (oVar != null && oVar.f1924o0 != null && this.f2067x0.e() != 0 && this.f2062s0.f1924o0.requestFocus()) {
            this.B0 &= -2;
        }
    }

    public void s0() {
        o oVar;
        h0 h0Var = this.f2067x0;
        if (h0Var == null || h0Var.e() <= 0 || (oVar = this.f2062s0) == null || oVar.f1923n0 != this.f2067x0) {
            this.f2063t0.requestFocus();
        } else {
            r0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = (r0 = r2.f2062s0).f1924o0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t0() {
        /*
            r2 = this;
            androidx.leanback.widget.SearchBar r0 = r2.f2063t0
            if (r0 == 0) goto L_0x0023
            androidx.leanback.widget.h0 r0 = r2.f2067x0
            if (r0 != 0) goto L_0x0009
            goto L_0x0023
        L_0x0009:
            int r0 = r0.e()
            if (r0 == 0) goto L_0x001d
            androidx.leanback.app.o r0 = r2.f2062s0
            if (r0 == 0) goto L_0x001d
            androidx.leanback.widget.VerticalGridView r0 = r0.f1924o0
            if (r0 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            int r0 = r0.getId()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            androidx.leanback.widget.SearchBar r1 = r2.f2063t0
            r1.setNextFocusDownId(r0)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.app.p.t0():void");
    }

    public void u0() {
        h0 h0Var;
        o oVar = this.f2062s0;
        this.f2063t0.setVisibility(((oVar != null ? oVar.f1927r0 : -1) <= 0 || (h0Var = this.f2067x0) == null || h0Var.e() == 0) ? 0 : 8);
    }
}
