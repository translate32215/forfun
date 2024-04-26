package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.startapp.startappsdk.R;
import java.util.Calendar;
import java.util.Iterator;
import l9.u;
import n0.c;
import o0.c0;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f9124a = b0.e();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9125b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (o.z0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f9125b = o.A0(getContext(), R.attr.nestedScrollable);
        c0.C(this, new n(this));
    }

    /* renamed from: a */
    public u getAdapter() {
        return (u) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        u a10 = getAdapter();
        d<?> dVar = a10.f9211b;
        c cVar = a10.f9213d;
        int max = Math.max(a10.b(), getFirstVisiblePosition());
        int min = Math.min(a10.d(), getLastVisiblePosition());
        Long c10 = a10.getItem(max);
        Long c11 = a10.getItem(min);
        Iterator<c<Long, Long>> it = dVar.D().iterator();
        while (it.hasNext()) {
            c next = it.next();
            F f10 = next.f21812a;
            if (f10 == null) {
                materialCalendarGridView = this;
            } else if (next.f21813b != null) {
                long longValue = ((Long) f10).longValue();
                long longValue2 = ((Long) next.f21813b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(c10 == null || c11 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > c11.longValue() || valueOf2.longValue() < c10.longValue())) {
                    boolean c12 = u.c(this);
                    if (longValue < c10.longValue()) {
                        if (max % a10.f9210a.f9205d == 0) {
                            i17 = 0;
                        } else if (!c12) {
                            i17 = materialCalendarGridView.b(max - 1).getRight();
                        } else {
                            i17 = materialCalendarGridView.b(max - 1).getLeft();
                        }
                        i10 = i17;
                        i11 = max;
                    } else {
                        materialCalendarGridView.f9124a.setTimeInMillis(longValue);
                        i11 = a10.a(materialCalendarGridView.f9124a.get(5));
                        View b10 = materialCalendarGridView.b(i11);
                        i10 = (b10.getWidth() / 2) + b10.getLeft();
                    }
                    if (longValue2 > c11.longValue()) {
                        if ((min + 1) % a10.f9210a.f9205d == 0) {
                            i16 = getWidth();
                        } else if (!c12) {
                            i16 = materialCalendarGridView.b(min).getRight();
                        } else {
                            i16 = materialCalendarGridView.b(min).getLeft();
                        }
                        i12 = i16;
                        i13 = min;
                    } else {
                        materialCalendarGridView.f9124a.setTimeInMillis(longValue2);
                        i13 = a10.a(materialCalendarGridView.f9124a.get(5));
                        View b11 = materialCalendarGridView.b(i13);
                        i12 = (b11.getWidth() / 2) + b11.getLeft();
                    }
                    int itemId = (int) a10.getItemId(i11);
                    int i18 = max;
                    int i19 = min;
                    int itemId2 = (int) a10.getItemId(i13);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b12 = materialCalendarGridView.b(numColumns);
                        int top = b12.getTop() + ((b) cVar.f9148a).f9141a.top;
                        u uVar = a10;
                        int bottom = b12.getBottom() - ((b) cVar.f9148a).f9141a.bottom;
                        if (!c12) {
                            i15 = numColumns > i11 ? 0 : i10;
                            i14 = i13 > numColumns2 ? getWidth() : i12;
                        } else {
                            int i20 = i13 > numColumns2 ? 0 : i12;
                            i14 = numColumns > i11 ? getWidth() : i10;
                            i15 = i20;
                        }
                        canvas.drawRect((float) i15, (float) top, (float) i14, (float) bottom, (Paint) cVar.f9155h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a10 = uVar;
                    }
                    materialCalendarGridView = this;
                    max = i18;
                    min = i19;
                }
            }
        }
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
        } else if (i10 == 33) {
            setSelection(getAdapter().d());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i10, int i11) {
        if (this.f9125b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof u) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), u.class.getCanonicalName()}));
        }
    }
}
