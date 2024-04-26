package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import v.f;
import v.i;
import y.d;
import y.e;

/* compiled from: ConstraintHelper */
public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1209a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f1210b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1211c;

    /* renamed from: d  reason: collision with root package name */
    public i f1212d;

    /* renamed from: e  reason: collision with root package name */
    public String f1213e;

    /* renamed from: f  reason: collision with root package name */
    public String f1214f;

    /* renamed from: g  reason: collision with root package name */
    public View[] f1215g = null;

    /* renamed from: h  reason: collision with root package name */
    public HashMap<Integer, String> f1216h = new HashMap<>();

    public a(Context context) {
        super(context);
        this.f1211c = context;
        i((AttributeSet) null);
    }

    public final void c(String str) {
        if (str != null && str.length() != 0 && this.f1211c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i10 = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c10 = constraintLayout2.c(0, trim);
                if (c10 instanceof Integer) {
                    i10 = ((Integer) c10).intValue();
                }
            }
            if (i10 == 0 && constraintLayout2 != null) {
                i10 = h(constraintLayout2, trim);
            }
            if (i10 == 0) {
                try {
                    i10 = d.class.getField(trim).getInt((Object) null);
                } catch (Exception unused) {
                }
            }
            if (i10 == 0) {
                i10 = this.f1211c.getResources().getIdentifier(trim, "id", this.f1211c.getPackageName());
            }
            if (i10 != 0) {
                this.f1216h.put(Integer.valueOf(i10), trim);
                d(i10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void d(int i10) {
        if (i10 != getId()) {
            int i11 = this.f1210b + 1;
            int[] iArr = this.f1209a;
            if (i11 > iArr.length) {
                this.f1209a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1209a;
            int i12 = this.f1210b;
            iArr2[i12] = i10;
            this.f1210b = i12 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f1211c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        StringBuilder a10 = android.support.v4.media.a.a("to use ConstraintTag view ");
                        a10.append(childAt.getClass().getSimpleName());
                        a10.append(" must have an ID");
                        Log.w("ConstraintHelper", a10.toString());
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f1210b; i10++) {
            View d10 = constraintLayout.d(this.f1209a[i10]);
            if (d10 != null) {
                d10.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    d10.setTranslationZ(d10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1209a, this.f1210b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f1211c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f27962b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1213e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1214f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(f fVar, boolean z10) {
    }

    public void k() {
        if (this.f1212d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f1189q0 = (f) this.f1212d;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1213e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1214f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1213e = str;
        if (str != null) {
            int i10 = 0;
            this.f1210b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    c(str.substring(i10));
                    return;
                } else {
                    c(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1214f = str;
        if (str != null) {
            int i10 = 0;
            this.f1210b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    e(str.substring(i10));
                    return;
                } else {
                    e(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1213e = null;
        this.f1210b = 0;
        for (int d10 : iArr) {
            d(d10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1213e == null) {
            d(i10);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1211c = context;
        i(attributeSet);
    }
}
