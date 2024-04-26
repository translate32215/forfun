package p0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23769a;

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final d f23770a;

        public a(d dVar) {
            this.f23770a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            c a10 = this.f23770a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f23748a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f23770a.getClass();
            return null;
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f23770a.c(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class b extends a {
        public b(d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            c b10 = this.f23770a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f23748a;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class c extends b {
        public c(d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f23770a.getClass();
        }
    }

    public d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f23769a = new c(this);
        } else if (i10 >= 19) {
            this.f23769a = new b(this);
        } else {
            this.f23769a = new a(this);
        }
    }

    public c a(int i10) {
        return null;
    }

    public c b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f23769a = obj;
    }
}
