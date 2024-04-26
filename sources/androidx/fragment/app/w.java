package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c1.d;
import c1.e;
import q.b;
import s.i;
import ud.k;

/* compiled from: FragmentLayoutInflaterFactory */
public class w implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1877a;

    /* compiled from: FragmentLayoutInflaterFactory */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h0 f1878a;

        public a(h0 h0Var) {
            this.f1878a = h0Var;
        }

        public void onViewAttachedToWindow(View view) {
            h0 h0Var = this.f1878a;
            p pVar = h0Var.f1694c;
            h0Var.k();
            q0.f((ViewGroup) pVar.Q.getParent(), w.this.f1877a).e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public w(a0 a0Var) {
        this.f1877a = a0Var;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        h0 h0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f1877a);
        }
        p pVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b1.a.f3344a);
        int i10 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            i<ClassLoader, i<String, Class<?>>> iVar = u.f1872a;
            try {
                z10 = p.class.isAssignableFrom(u.b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                if (view != null) {
                    i10 = view.getId();
                }
                if (i10 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    pVar = this.f1877a.F(resourceId);
                }
                if (pVar == null && string != null) {
                    pVar = this.f1877a.G(string);
                }
                if (pVar == null && i10 != -1) {
                    pVar = this.f1877a.F(i10);
                }
                if (pVar == null) {
                    pVar = this.f1877a.J().a(context.getClassLoader(), attributeValue);
                    pVar.f1810w = true;
                    pVar.F = resourceId != 0 ? resourceId : i10;
                    pVar.G = i10;
                    pVar.H = string;
                    pVar.f1811x = true;
                    a0 a0Var = this.f1877a;
                    pVar.B = a0Var;
                    v<?> vVar = a0Var.f1598v;
                    pVar.C = vVar;
                    pVar.U(vVar.f1874b, attributeSet, pVar.f1786b);
                    h0Var = this.f1877a.a(pVar);
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "Fragment " + pVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!pVar.f1811x) {
                    pVar.f1811x = true;
                    a0 a0Var2 = this.f1877a;
                    pVar.B = a0Var2;
                    v<?> vVar2 = a0Var2.f1598v;
                    pVar.C = vVar2;
                    pVar.U(vVar2.f1874b, attributeSet, pVar.f1786b);
                    h0Var = this.f1877a.f(pVar);
                    if (a0.N(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + pVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i10) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                d dVar = d.f4021a;
                k.f(pVar, "fragment");
                e eVar = new e(pVar, viewGroup);
                d dVar2 = d.f4021a;
                d.c(eVar);
                d.c a10 = d.a(pVar);
                if (a10.f4033a.contains(d.a.DETECT_FRAGMENT_TAG_USAGE) && d.f(a10, pVar.getClass(), e.class)) {
                    d.b(a10, eVar);
                }
                pVar.P = viewGroup;
                h0Var.k();
                h0Var.j();
                View view2 = pVar.Q;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (pVar.Q.getTag() == null) {
                        pVar.Q.setTag(string);
                    }
                    pVar.Q.addOnAttachStateChangeListener(new a(h0Var));
                    return pVar.Q;
                }
                throw new IllegalStateException(b.a("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
