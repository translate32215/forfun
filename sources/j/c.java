package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper */
public class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f19417f;

    /* renamed from: a  reason: collision with root package name */
    public int f19418a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f19419b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f19420c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f19421d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f19422e;

    /* compiled from: ContextThemeWrapper */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super((Context) null);
    }

    public void a(Configuration configuration) {
        if (this.f19422e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f19421d == null) {
            this.f19421d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f19419b == null) {
            this.f19419b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f19419b.setTo(theme);
            }
        }
        this.f19419b.applyStyle(this.f19418a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f19417f) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f19422e
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.f19421d
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f19417f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f19417f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f19417f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.f19421d
            android.content.Context r0 = j.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f19422e = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.f19422e = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.f19422e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.getResources():android.content.res.Resources");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f19420c == null) {
            this.f19420c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f19420c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f19419b;
        if (theme != null) {
            return theme;
        }
        if (this.f19418a == 0) {
            this.f19418a = 2132083271;
        }
        b();
        return this.f19419b;
    }

    public void setTheme(int i10) {
        if (this.f19418a != i10) {
            this.f19418a = i10;
            b();
        }
    }

    public c(Context context, int i10) {
        super(context);
        this.f19418a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f19419b = theme;
    }
}
