package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p0.c;
import p0.d;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class v extends o0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3140d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3141e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends o0.a {

        /* renamed from: d  reason: collision with root package name */
        public final v f3142d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, o0.a> f3143e = new WeakHashMap();

        public a(v vVar) {
            this.f3142d = vVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return this.f22536a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public d b(View view) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void d(View view, c cVar) {
            if (this.f3142d.j() || this.f3142d.f3140d.getLayoutManager() == null) {
                this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
                return;
            }
            this.f3142d.f3140d.getLayoutManager().k0(view, cVar);
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                aVar.d(view, cVar);
            } else {
                this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            }
        }

        public void e(View view, AccessibilityEvent accessibilityEvent) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                this.f22536a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            o0.a aVar = this.f3143e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return this.f22536a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean g(View view, int i10, Bundle bundle) {
            if (this.f3142d.j() || this.f3142d.f3140d.getLayoutManager() == null) {
                return super.g(view, i10, bundle);
            }
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i10, bundle)) {
                    return true;
                }
            } else if (super.g(view, i10, bundle)) {
                return true;
            }
            RecyclerView.s sVar = this.f3142d.f3140d.getLayoutManager().f2876b.f2798b;
            return false;
        }

        public void h(View view, int i10) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                this.f22536a.sendAccessibilityEvent(view, i10);
            }
        }

        public void i(View view, AccessibilityEvent accessibilityEvent) {
            o0.a aVar = this.f3143e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                this.f22536a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.f3140d = recyclerView;
        a aVar = this.f3141e;
        if (aVar != null) {
            this.f3141e = aVar;
        } else {
            this.f3141e = new a(this);
        }
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !j()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().i0(accessibilityEvent);
            }
        }
    }

    public void d(View view, c cVar) {
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
        if (!j() && this.f3140d.getLayoutManager() != null) {
            RecyclerView.m layoutManager = this.f3140d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f2876b;
            layoutManager.j0(recyclerView.f2798b, recyclerView.f2825s0, cVar);
        }
    }

    public boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        if (j() || this.f3140d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f3140d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f2876b;
        return layoutManager.A0(recyclerView.f2798b, recyclerView.f2825s0, i10, bundle);
    }

    public boolean j() {
        return this.f3140d.N();
    }
}
