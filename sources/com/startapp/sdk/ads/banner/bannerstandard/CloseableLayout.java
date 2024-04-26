package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.g1;
import com.startapp.qb;

/* compiled from: Sta */
public class CloseableLayout extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f11785o = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f11786a;

    /* renamed from: b  reason: collision with root package name */
    public a f11787b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f11788c;

    /* renamed from: d  reason: collision with root package name */
    public ClosePosition f11789d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11790e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11791f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11792g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11793h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f11794i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f11795j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f11796k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f11797l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11798m;

    /* renamed from: n  reason: collision with root package name */
    public b f11799n;

    /* compiled from: Sta */
    public interface a {
        void onClose();
    }

    /* compiled from: Sta */
    public final class b implements Runnable {
        public b() {
        }

        public void run() {
            CloseableLayout closeableLayout = CloseableLayout.this;
            int i10 = CloseableLayout.f11785o;
            closeableLayout.a(false);
        }
    }

    public CloseableLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final void a(boolean z10) {
        int[] state = this.f11788c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z10 != (state == iArr)) {
            Drawable drawable = this.f11788c;
            if (!z10) {
                iArr = FrameLayout.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
            invalidate(this.f11795j);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11793h) {
            this.f11793h = false;
            this.f11794i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f11789d;
            Rect rect = this.f11794i;
            Rect rect2 = this.f11795j;
            int i10 = this.f11790e;
            Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
            this.f11797l.set(this.f11795j);
            Rect rect3 = this.f11797l;
            int i11 = this.f11792g;
            rect3.inset(i11, i11);
            ClosePosition closePosition2 = this.f11789d;
            Rect rect4 = this.f11797l;
            Rect rect5 = this.f11796k;
            int i12 = this.f11791f;
            Gravity.apply(closePosition2.a(), i12, i12, rect4, rect5);
            this.f11788c.setBounds(this.f11796k);
        }
        if (this.f11788c.isVisible()) {
            this.f11788c.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11793h = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f11786a)) {
            if (this.f11798m || this.f11788c.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a(true);
                } else if (action == 1) {
                    if (this.f11788c.getState() == FrameLayout.SELECTED_STATE_SET) {
                        if (this.f11799n == null) {
                            this.f11799n = new b();
                        }
                        postDelayed(this.f11799n, (long) ViewConfiguration.getPressedStateDuration());
                        playSoundEffect(0);
                        a aVar = this.f11787b;
                        if (aVar != null) {
                            aVar.onClose();
                        }
                    }
                } else if (action == 3) {
                    a(false);
                }
                return true;
            }
        }
        a(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setCloseAlwaysInteractable(boolean z10) {
        this.f11798m = z10;
    }

    public void setCloseBoundChanged(boolean z10) {
        this.f11793h = z10;
    }

    public void setCloseBounds(Rect rect) {
        this.f11795j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f11789d = closePosition;
        this.f11793h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z10) {
        if (this.f11788c.setVisible(z10, false)) {
            invalidate(this.f11795j);
        }
    }

    public void setOnCloseListener(a aVar) {
        this.f11787b = aVar;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11794i = new Rect();
        this.f11795j = new Rect();
        this.f11796k = new Rect();
        this.f11797l = new Rect();
        Drawable a10 = g1.a(context.getResources(), "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC");
        this.f11788c = a10;
        this.f11789d = ClosePosition.TOP_RIGHT;
        a10.setState(FrameLayout.EMPTY_STATE_SET);
        a10.setCallback(this);
        this.f11786a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11790e = qb.a(context, 50);
        this.f11791f = qb.a(context, 30);
        this.f11792g = qb.a(context, 8);
        setWillNotDraw(false);
        this.f11798m = true;
    }

    public boolean a(int i10, int i11, int i12) {
        Rect rect = this.f11795j;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }

    /* compiled from: Sta */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        /* access modifiers changed from: public */
        ClosePosition(int i10) {
            this.mGravity = i10;
        }

        public static ClosePosition a(String str, ClosePosition closePosition) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return closePosition;
            }
            if (str.equals("top-left")) {
                return TOP_LEFT;
            }
            if (str.equals("top-right")) {
                return TOP_RIGHT;
            }
            if (str.equals("center")) {
                return CENTER;
            }
            if (str.equals("bottom-left")) {
                return BOTTOM_LEFT;
            }
            if (str.equals("bottom-right")) {
                return BOTTOM_RIGHT;
            }
            if (str.equals("top-center")) {
                return TOP_CENTER;
            }
            if (str.equals("bottom-center")) {
                return BOTTOM_CENTER;
            }
            throw new IllegalArgumentException(str);
        }

        public int a() {
            return this.mGravity;
        }
    }
}
