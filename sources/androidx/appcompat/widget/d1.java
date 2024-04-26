package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class d1 extends ContextWrapper {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f868b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<WeakReference<d1>> f869c;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f870a;

    public d1(Context context) {
        super(context);
        int i10 = m1.f1023b;
        this.f870a = new f1(this, context.getResources());
    }

    public static Context a(Context context) {
        boolean z10 = false;
        if (!(context instanceof d1) && !(context.getResources() instanceof f1)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i10 = m1.f1023b;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            return context;
        }
        synchronized (f868b) {
            ArrayList<WeakReference<d1>> arrayList = f869c;
            if (arrayList == null) {
                f869c = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f869c.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f869c.remove(size);
                    }
                }
                for (int size2 = f869c.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f869c.get(size2);
                    d1 d1Var = weakReference2 != null ? (d1) weakReference2.get() : null;
                    if (d1Var != null && d1Var.getBaseContext() == context) {
                        return d1Var;
                    }
                }
            }
            d1 d1Var2 = new d1(context);
            f869c.add(new WeakReference(d1Var2));
            return d1Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f870a.getAssets();
    }

    public Resources getResources() {
        return this.f870a;
    }

    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
    }
}
