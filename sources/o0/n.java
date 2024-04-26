package o0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: NestedScrollingChildHelper */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f22591a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f22592b;

    /* renamed from: c  reason: collision with root package name */
    public final View f22593c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22594d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f22595e;

    public n(View view) {
        this.f22593c = view;
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent g10;
        if (!this.f22594d || (g10 = g(0)) == null) {
            return false;
        }
        View view = this.f22593c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return g0.a(g10, view, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedFling", e10);
                return false;
            }
        } else if (g10 instanceof q) {
            return ((q) g10).onNestedFling(view, f10, f11, z10);
        } else {
            return false;
        }
    }

    public boolean b(float f10, float f11) {
        ViewParent g10;
        if (!this.f22594d || (g10 = g(0)) == null) {
            return false;
        }
        View view = this.f22593c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return g0.b(g10, view, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedPreFling", e10);
                return false;
            }
        } else if (g10 instanceof q) {
            return ((q) g10).onNestedPreFling(view, f10, f11);
        } else {
            return false;
        }
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent g10;
        int i13;
        int i14;
        int[] iArr3;
        int i15 = i10;
        int i16 = i11;
        int[] iArr4 = iArr2;
        int i17 = i12;
        if (!this.f22594d || (g10 = g(i17)) == null) {
            return false;
        }
        if (i15 == 0 && i16 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f22593c.getLocationInWindow(iArr4);
            i14 = iArr4[0];
            i13 = iArr4[1];
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f22595e == null) {
                this.f22595e = new int[2];
            }
            iArr3 = this.f22595e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f22593c;
        if (g10 instanceof o) {
            ((o) g10).j(view, i10, i11, iArr3, i12);
        } else if (i17 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    g0.c(g10, view, i10, i16, iArr3);
                } catch (AbstractMethodError e10) {
                    AbstractMethodError abstractMethodError = e10;
                    Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedPreScroll", abstractMethodError);
                }
            } else if (g10 instanceof q) {
                ((q) g10).onNestedPreScroll(view, i10, i16, iArr3);
            }
        }
        if (iArr4 != null) {
            this.f22593c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i14;
            iArr4[1] = iArr4[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public void d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        f(i10, i11, i12, i13, (int[]) null, i14, iArr2);
    }

    public boolean e(int i10, int i11, int i12, int i13, int[] iArr) {
        return f(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final boolean f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent g10;
        int i15;
        int i16;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i17 = i14;
        if (!this.f22594d || (g10 = g(i17)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f22593c.getLocationInWindow(iArr4);
            i16 = iArr4[0];
            i15 = iArr4[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f22595e == null) {
                this.f22595e = new int[2];
            }
            int[] iArr5 = this.f22595e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f22593c;
        if (g10 instanceof p) {
            ((p) g10).m(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (g10 instanceof o) {
                ((o) g10).n(view, i10, i11, i12, i13, i14);
            } else if (i17 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g0.d(g10, view, i10, i11, i12, i13);
                    } catch (AbstractMethodError e10) {
                        AbstractMethodError abstractMethodError = e10;
                        Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedScroll", abstractMethodError);
                    }
                } else if (g10 instanceof q) {
                    ((q) g10).onNestedScroll(view, i10, i11, i12, i13);
                }
            }
        }
        if (iArr4 != null) {
            this.f22593c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i16;
            iArr4[1] = iArr4[1] - i15;
        }
        return true;
    }

    public final ViewParent g(int i10) {
        if (i10 == 0) {
            return this.f22591a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f22592b;
    }

    public boolean h(int i10) {
        return g(i10) != null;
    }

    public void i(boolean z10) {
        if (this.f22594d) {
            View view = this.f22593c;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (Build.VERSION.SDK_INT >= 21) {
                c0.i.z(view);
            } else if (view instanceof m) {
                ((m) view).stopNestedScroll();
            }
        }
        this.f22594d = z10;
    }

    public boolean j(int i10, int i11) {
        boolean z10;
        if (g(i11) != null) {
            return true;
        }
        if (this.f22594d) {
            View view = this.f22593c;
            for (ViewParent parent = this.f22593c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f22593c;
                boolean z11 = parent instanceof o;
                if (z11) {
                    z10 = ((o) parent).o(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z10 = g0.f(parent, view, view2, i10);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            }
                        } else if (parent instanceof q) {
                            z10 = ((q) parent).onStartNestedScroll(view, view2, i10);
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    if (i11 == 0) {
                        this.f22591a = parent;
                    } else if (i11 == 1) {
                        this.f22592b = parent;
                    }
                    View view3 = this.f22593c;
                    if (z11) {
                        ((o) parent).h(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                g0.e(parent, view, view3, i10);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        } else if (parent instanceof q) {
                            ((q) parent).onNestedScrollAccepted(view, view3, i10);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void k(int i10) {
        ViewParent g10 = g(i10);
        if (g10 != null) {
            View view = this.f22593c;
            if (g10 instanceof o) {
                ((o) g10).i(view, i10);
            } else if (i10 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g0.g(g10, view);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onStopNestedScroll", e10);
                    }
                } else if (g10 instanceof q) {
                    ((q) g10).onStopNestedScroll(view);
                }
            }
            if (i10 == 0) {
                this.f22591a = null;
            } else if (i10 == 1) {
                this.f22592b = null;
            }
        }
    }
}
