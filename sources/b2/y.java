package b2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14 */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public a f3452a;

    /* compiled from: ViewOverlayApi14 */
    public static class a extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup f3453a;

        /* renamed from: b  reason: collision with root package name */
        public View f3454b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Drawable> f3455c = null;

        /* renamed from: d  reason: collision with root package name */
        public y f3456d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3457e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, y yVar) {
            super(context);
            this.f3453a = viewGroup;
            this.f3454b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3456d = yVar;
        }

        public final void a() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f3455c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f3457e = true;
                    this.f3453a.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f3453a.getLocationOnScreen(iArr);
            this.f3454b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f3454b.getWidth(), this.f3454b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3455c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3455c.get(i10).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3453a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f3453a;
            if (viewGroup != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.f3454b.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f3455c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f3455c
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.y.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public y(Context context, ViewGroup viewGroup, View view) {
        this.f3452a = new a(context, viewGroup, view, this);
    }

    public static y a(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (true) {
            if (view2 != null) {
                if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) view2;
                    break;
                } else if (view2.getParent() instanceof ViewGroup) {
                    view2 = (ViewGroup) view2.getParent();
                }
            } else {
                viewGroup = null;
                break;
            }
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f3456d;
            }
        }
        return new s(viewGroup.getContext(), viewGroup, view);
    }
}
