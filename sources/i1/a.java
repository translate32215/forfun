package i1;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import h.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Picker */
public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f19072a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f19073b;

    /* renamed from: c  reason: collision with root package name */
    public final List<VerticalGridView> f19074c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f19075d;

    /* renamed from: e  reason: collision with root package name */
    public float f19076e;

    /* renamed from: f  reason: collision with root package name */
    public float f19077f;

    /* renamed from: g  reason: collision with root package name */
    public float f19078g;

    /* renamed from: h  reason: collision with root package name */
    public int f19079h;

    /* renamed from: i  reason: collision with root package name */
    public Interpolator f19080i;

    /* renamed from: r  reason: collision with root package name */
    public float f19081r = 3.0f;

    /* renamed from: s  reason: collision with root package name */
    public float f19082s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public int f19083t = 0;

    /* renamed from: u  reason: collision with root package name */
    public List<CharSequence> f19084u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public int f19085v = R.layout.lb_picker_item;

    /* renamed from: w  reason: collision with root package name */
    public int f19086w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final k0 f19087x = new C0158a();

    /* renamed from: i1.a$a  reason: collision with other inner class name */
    /* compiled from: Picker */
    public class C0158a extends k0 {
        public C0158a() {
        }

        public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
            b bVar = (b) recyclerView.getAdapter();
            int indexOf = a.this.f19074c.indexOf(recyclerView);
            a.this.e(indexOf, true);
            if (a0Var != null) {
                a.this.a(indexOf, a.this.f19075d.get(indexOf).f19096b + i10);
            }
        }
    }

    /* compiled from: Picker */
    public class b extends RecyclerView.e<c> {

        /* renamed from: d  reason: collision with root package name */
        public final int f19089d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19090e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19091f;

        /* renamed from: g  reason: collision with root package name */
        public b f19092g;

        public b(int i10, int i11, int i12) {
            this.f19089d = i10;
            this.f19090e = i12;
            this.f19091f = i11;
            this.f19092g = a.this.f19075d.get(i12);
        }

        public int b() {
            b bVar = this.f19092g;
            if (bVar == null) {
                return 0;
            }
            return (bVar.f19097c - bVar.f19096b) + 1;
        }

        public void e(RecyclerView.a0 a0Var, int i10) {
            b bVar;
            CharSequence charSequence;
            c cVar = (c) a0Var;
            TextView textView = cVar.f19094u;
            boolean z10 = true;
            if (!(textView == null || (bVar = this.f19092g) == null)) {
                int i11 = bVar.f19096b + i10;
                CharSequence[] charSequenceArr = bVar.f19098d;
                if (charSequenceArr == null) {
                    charSequence = String.format(bVar.f19099e, new Object[]{Integer.valueOf(i11)});
                } else {
                    charSequence = charSequenceArr[i11];
                }
                textView.setText(charSequence);
            }
            a aVar = a.this;
            View view = cVar.f2842a;
            if (aVar.f19074c.get(this.f19090e).getSelectedPosition() != i10) {
                z10 = false;
            }
            aVar.d(view, z10, this.f19090e, false);
        }

        public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
            TextView textView;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f19089d, viewGroup, false);
            int i11 = this.f19091f;
            if (i11 != 0) {
                textView = (TextView) inflate.findViewById(i11);
            } else {
                textView = (TextView) inflate;
            }
            return new c(inflate, textView);
        }

        public void i(RecyclerView.a0 a0Var) {
            ((c) a0Var).f2842a.setFocusable(a.this.isActivated());
        }
    }

    /* compiled from: Picker */
    public static class c extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f19094u;

        public c(View view, TextView textView) {
            super(view);
            this.f19094u = textView;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f19077f = 1.0f;
        this.f19076e = 1.0f;
        this.f19078g = 0.5f;
        this.f19079h = 200;
        this.f19080i = new DecelerateInterpolator(2.5f);
        new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, this, true);
        this.f19072a = viewGroup;
        this.f19073b = (ViewGroup) viewGroup.findViewById(R.id.picker);
    }

    public void a(int i10, int i11) {
        b bVar = this.f19075d.get(i10);
        if (bVar.f19095a != i11) {
            bVar.f19095a = i11;
        }
    }

    public void b(int i10, b bVar) {
        this.f19075d.set(i10, bVar);
        VerticalGridView verticalGridView = this.f19074c.get(i10);
        b bVar2 = (b) verticalGridView.getAdapter();
        if (bVar2 != null) {
            bVar2.f2863a.b();
        }
        verticalGridView.setSelectedPosition(bVar.f19095a - bVar.f19096b);
    }

    public final void c(View view, boolean z10, float f10, float f11, Interpolator interpolator) {
        view.animate().cancel();
        if (!z10) {
            view.setAlpha(f10);
            return;
        }
        if (f11 >= 0.0f) {
            view.setAlpha(f11);
        }
        view.animate().alpha(f10).setDuration((long) this.f19079h).setInterpolator(interpolator).start();
    }

    public void d(View view, boolean z10, int i10, boolean z11) {
        boolean z12 = i10 == this.f19083t || !hasFocus();
        if (z10) {
            if (z12) {
                c(view, z11, this.f19077f, -1.0f, this.f19080i);
            } else {
                c(view, z11, this.f19076e, -1.0f, this.f19080i);
            }
        } else if (z12) {
            c(view, z11, this.f19078g, -1.0f, this.f19080i);
        } else {
            c(view, z11, 0.0f, -1.0f, this.f19080i);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public void e(int i10, boolean z10) {
        VerticalGridView verticalGridView = this.f19074c.get(i10);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i11 = 0;
        while (i11 < verticalGridView.getAdapter().b()) {
            View v10 = verticalGridView.getLayoutManager().v(i11);
            if (v10 != null) {
                d(v10, selectedPosition == i11, i10, z10);
            }
            i11++;
        }
    }

    public final void f() {
        for (int i10 = 0; i10 < getColumnsCount(); i10++) {
            g(this.f19074c.get(i10));
        }
    }

    public final void g(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) e.a(activatedVisibleItemCount, 1.0f, (float) verticalGridView.getVerticalSpacing(), ((float) getPickerItemHeightPixels()) * activatedVisibleItemCount);
        verticalGridView.setLayoutParams(layoutParams);
    }

    public float getActivatedVisibleItemCount() {
        return this.f19081r;
    }

    public int getColumnsCount() {
        ArrayList<b> arrayList = this.f19075d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.f19085v;
    }

    public final int getPickerItemTextViewId() {
        return this.f19086w;
    }

    public int getSelectedColumn() {
        return this.f19083t;
    }

    public final CharSequence getSeparator() {
        return this.f19084u.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f19084u;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f19074c.size()) {
            return this.f19074c.get(selectedColumn).requestFocus(i10, rect);
        }
        return false;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i10 = 0; i10 < this.f19074c.size(); i10++) {
            if (this.f19074c.get(i10).hasFocus()) {
                setSelectedColumn(i10);
            }
        }
    }

    public void setActivated(boolean z10) {
        if (z10 == isActivated()) {
            super.setActivated(z10);
            return;
        }
        super.setActivated(z10);
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z10 && hasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i10 = 0; i10 < getColumnsCount(); i10++) {
            this.f19074c.get(i10).setFocusable(z10);
        }
        f();
        boolean isActivated = isActivated();
        for (int i11 = 0; i11 < getColumnsCount(); i11++) {
            VerticalGridView verticalGridView = this.f19074c.get(i11);
            for (int i12 = 0; i12 < verticalGridView.getChildCount(); i12++) {
                verticalGridView.getChildAt(i12).setFocusable(isActivated);
            }
        }
        if (z10 && hasFocus && selectedColumn >= 0) {
            this.f19074c.get(selectedColumn).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f19081r != f10) {
            this.f19081r = f10;
            if (isActivated()) {
                f();
            }
        }
    }

    public void setColumns(List<b> list) {
        if (this.f19084u.size() != 0) {
            if (this.f19084u.size() == 1) {
                CharSequence charSequence = this.f19084u.get(0);
                this.f19084u.clear();
                this.f19084u.add("");
                for (int i10 = 0; i10 < list.size() - 1; i10++) {
                    this.f19084u.add(charSequence);
                }
                this.f19084u.add("");
            } else if (this.f19084u.size() != list.size() + 1) {
                StringBuilder a10 = android.support.v4.media.a.a("Separators size: ");
                a10.append(this.f19084u.size());
                a10.append(" must");
                a10.append("equal the size of columns: ");
                a10.append(list.size());
                a10.append(" + 1");
                throw new IllegalStateException(a10.toString());
            }
            this.f19074c.clear();
            this.f19073b.removeAllViews();
            ArrayList<b> arrayList = new ArrayList<>(list);
            this.f19075d = arrayList;
            if (this.f19083t > arrayList.size() - 1) {
                this.f19083t = this.f19075d.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty(this.f19084u.get(0))) {
                TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, this.f19073b, false);
                textView.setText(this.f19084u.get(0));
                this.f19073b.addView(textView);
            }
            int i11 = 0;
            while (i11 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(R.layout.lb_picker_column, this.f19073b, false);
                g(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                this.f19074c.add(verticalGridView);
                this.f19073b.addView(verticalGridView);
                int i12 = i11 + 1;
                if (!TextUtils.isEmpty(this.f19084u.get(i12))) {
                    TextView textView2 = (TextView) from.inflate(R.layout.lb_picker_separator, this.f19073b, false);
                    textView2.setText(this.f19084u.get(i12));
                    this.f19073b.addView(textView2);
                }
                getContext();
                verticalGridView.setAdapter(new b(getPickerItemLayoutId(), getPickerItemTextViewId(), i11));
                verticalGridView.setOnChildViewHolderSelectedListener(this.f19087x);
                i11 = i12;
            }
            return;
        }
        StringBuilder a11 = android.support.v4.media.a.a("Separators size is: ");
        a11.append(this.f19084u.size());
        a11.append(". At least one separator must be provided");
        throw new IllegalStateException(a11.toString());
    }

    public final void setPickerItemTextViewId(int i10) {
        this.f19086w = i10;
    }

    public void setSelectedColumn(int i10) {
        if (this.f19083t != i10) {
            this.f19083t = i10;
            for (int i11 = 0; i11 < this.f19074c.size(); i11++) {
                e(i11, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(new CharSequence[]{charSequence}));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.f19084u.clear();
        this.f19084u.addAll(list);
    }

    public void setVisibleItemCount(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f19082s != f10) {
            this.f19082s = f10;
            if (!isActivated()) {
                f();
            }
        }
    }
}
