package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import r6.f;
import r6.j;
import x4.b0;
import z5.f0;
import z5.g0;

public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f5373a;

    /* renamed from: b  reason: collision with root package name */
    public final LayoutInflater f5374b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckedTextView f5375c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckedTextView f5376d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5377e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<f.e> f5378f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f5379g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5380h;

    /* renamed from: i  reason: collision with root package name */
    public s6.f f5381i;

    /* renamed from: r  reason: collision with root package name */
    public CheckedTextView[][] f5382r;

    /* renamed from: s  reason: collision with root package name */
    public j.a f5383s;

    /* renamed from: t  reason: collision with root package name */
    public int f5384t;

    /* renamed from: u  reason: collision with root package name */
    public g0 f5385u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5386v;

    /* renamed from: w  reason: collision with root package name */
    public Comparator<c> f5387w;

    /* renamed from: x  reason: collision with root package name */
    public d f5388x;

    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r10) {
            /*
                r9 = this;
                com.google.android.exoplayer2.ui.TrackSelectionView r0 = com.google.android.exoplayer2.ui.TrackSelectionView.this
                android.widget.CheckedTextView r1 = r0.f5375c
                r2 = 1
                if (r10 != r1) goto L_0x0010
                r0.f5386v = r2
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r10.clear()
                goto L_0x00d4
            L_0x0010:
                android.widget.CheckedTextView r1 = r0.f5376d
                r3 = 0
                if (r10 != r1) goto L_0x001e
                r0.f5386v = r3
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r10.clear()
                goto L_0x00d4
            L_0x001e:
                r0.f5386v = r3
                java.lang.Object r1 = r10.getTag()
                r1.getClass()
                com.google.android.exoplayer2.ui.TrackSelectionView$c r1 = (com.google.android.exoplayer2.ui.TrackSelectionView.c) r1
                int r4 = r1.f5390a
                int r1 = r1.f5391b
                android.util.SparseArray<r6.f$e> r5 = r0.f5378f
                java.lang.Object r5 = r5.get(r4)
                r6.f$e r5 = (r6.f.e) r5
                r6.j$a r6 = r0.f5383s
                r6.getClass()
                if (r5 != 0) goto L_0x005d
                boolean r10 = r0.f5380h
                if (r10 != 0) goto L_0x004d
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                int r10 = r10.size()
                if (r10 <= 0) goto L_0x004d
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r10.clear()
            L_0x004d:
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r6.f$e r5 = new r6.f$e
                int[] r2 = new int[r2]
                r2[r3] = r1
                r5.<init>(r4, r2)
                r10.put(r4, r5)
                goto L_0x00d4
            L_0x005d:
                int r6 = r5.f24630c
                int[] r5 = r5.f24629b
                android.widget.CheckedTextView r10 = (android.widget.CheckedTextView) r10
                boolean r10 = r10.isChecked()
                boolean r7 = r0.a(r4)
                if (r7 != 0) goto L_0x007f
                boolean r8 = r0.f5380h
                if (r8 == 0) goto L_0x0079
                z5.g0 r8 = r0.f5385u
                int r8 = r8.f28589a
                if (r8 <= r2) goto L_0x0079
                r8 = 1
                goto L_0x007a
            L_0x0079:
                r8 = 0
            L_0x007a:
                if (r8 == 0) goto L_0x007d
                goto L_0x007f
            L_0x007d:
                r8 = 0
                goto L_0x0080
            L_0x007f:
                r8 = 1
            L_0x0080:
                if (r10 == 0) goto L_0x00ac
                if (r8 == 0) goto L_0x00ac
                if (r6 != r2) goto L_0x008c
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r10.remove(r4)
                goto L_0x00d4
            L_0x008c:
                int r10 = r5.length
                int r10 = r10 + -1
                int[] r10 = new int[r10]
                int r2 = r5.length
                r6 = 0
            L_0x0093:
                if (r3 >= r2) goto L_0x00a1
                r7 = r5[r3]
                if (r7 == r1) goto L_0x009e
                int r8 = r6 + 1
                r10[r6] = r7
                r6 = r8
            L_0x009e:
                int r3 = r3 + 1
                goto L_0x0093
            L_0x00a1:
                android.util.SparseArray<r6.f$e> r1 = r0.f5378f
                r6.f$e r2 = new r6.f$e
                r2.<init>(r4, r10)
                r1.put(r4, r2)
                goto L_0x00d4
            L_0x00ac:
                if (r10 != 0) goto L_0x00d4
                if (r7 == 0) goto L_0x00c6
                int r10 = r5.length
                int r10 = r10 + r2
                int[] r10 = java.util.Arrays.copyOf(r5, r10)
                int r2 = r10.length
                int r2 = r2 + -1
                r10[r2] = r1
                android.util.SparseArray<r6.f$e> r1 = r0.f5378f
                r6.f$e r2 = new r6.f$e
                r2.<init>(r4, r10)
                r1.put(r4, r2)
                goto L_0x00d4
            L_0x00c6:
                android.util.SparseArray<r6.f$e> r10 = r0.f5378f
                r6.f$e r5 = new r6.f$e
                int[] r2 = new int[r2]
                r2[r3] = r1
                r5.<init>(r4, r2)
                r10.put(r4, r5)
            L_0x00d4:
                r0.b()
                com.google.android.exoplayer2.ui.TrackSelectionView$d r10 = r0.f5388x
                if (r10 == 0) goto L_0x00e9
                boolean r1 = r0.getIsDisabled()
                java.util.List r0 = r0.getOverrides()
                ad.i$b r10 = (ad.i.b) r10
                r10.f275n0 = r1
                r10.f276o0 = r0
            L_0x00e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.TrackSelectionView.b.onClick(android.view.View):void");
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5390a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5391b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f5392c;

        public c(int i10, int i11, b0 b0Var) {
            this.f5390a = i10;
            this.f5391b = i11;
            this.f5392c = b0Var;
        }
    }

    public interface d {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f5373a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f5374b = from;
        b bVar = new b((a) null);
        this.f5377e = bVar;
        this.f5381i = new s6.b(getResources());
        this.f5385u = g0.f28588d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f5375c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f5376d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    public final boolean a(int i10) {
        if (!this.f5379g || this.f5385u.f28590b[i10].f28583a <= 1 || this.f5383s.a(this.f5384t, i10, false) == 0) {
            return false;
        }
        return true;
    }

    public final void b() {
        boolean z10;
        this.f5375c.setChecked(this.f5386v);
        this.f5376d.setChecked(!this.f5386v && this.f5378f.size() == 0);
        for (int i10 = 0; i10 < this.f5382r.length; i10++) {
            f.e eVar = this.f5378f.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f5382r;
                if (i11 >= checkedTextViewArr[i10].length) {
                    break;
                }
                if (eVar != null) {
                    Object tag = checkedTextViewArr[i10][i11].getTag();
                    tag.getClass();
                    CheckedTextView checkedTextView = this.f5382r[i10][i11];
                    int i12 = ((c) tag).f5391b;
                    int[] iArr = eVar.f24629b;
                    int length = iArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            z10 = false;
                            break;
                        } else if (iArr[i13] == i12) {
                            z10 = true;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    checkedTextView.setChecked(z10);
                } else {
                    checkedTextViewArr[i10][i11].setChecked(false);
                }
                i11++;
            }
        }
    }

    public final void c() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f5383s == null) {
            this.f5375c.setEnabled(false);
            this.f5376d.setEnabled(false);
            return;
        }
        this.f5375c.setEnabled(true);
        this.f5376d.setEnabled(true);
        g0 g0Var = this.f5383s.f24659d[this.f5384t];
        this.f5385u = g0Var;
        int i10 = g0Var.f28589a;
        this.f5382r = new CheckedTextView[i10][];
        boolean z10 = this.f5380h && i10 > 1;
        int i11 = 0;
        while (true) {
            g0 g0Var2 = this.f5385u;
            if (i11 < g0Var2.f28589a) {
                f0 f0Var = g0Var2.f28590b[i11];
                boolean a10 = a(i11);
                CheckedTextView[][] checkedTextViewArr = this.f5382r;
                int i12 = f0Var.f28583a;
                checkedTextViewArr[i11] = new CheckedTextView[i12];
                c[] cVarArr = new c[i12];
                for (int i13 = 0; i13 < f0Var.f28583a; i13++) {
                    cVarArr[i13] = new c(i11, i13, f0Var.f28584b[i13]);
                }
                Comparator<c> comparator = this.f5387w;
                if (comparator != null) {
                    Arrays.sort(cVarArr, comparator);
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    if (i14 == 0) {
                        addView(this.f5374b.inflate(R.layout.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f5374b.inflate((a10 || z10) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.f5373a);
                    checkedTextView.setText(this.f5381i.a(cVarArr[i14].f5392c));
                    checkedTextView.setTag(cVarArr[i14]);
                    if (this.f5383s.b(this.f5384t, i11, i14) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f5377e);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f5382r[i11][i14] = checkedTextView;
                    addView(checkedTextView);
                }
                i11++;
            } else {
                b();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f5386v;
    }

    public List<f.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f5378f.size());
        for (int i10 = 0; i10 < this.f5378f.size(); i10++) {
            arrayList.add(this.f5378f.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f5379g != z10) {
            this.f5379g = z10;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f5380h != z10) {
            this.f5380h = z10;
            if (!z10 && this.f5378f.size() > 1) {
                for (int size = this.f5378f.size() - 1; size > 0; size--) {
                    this.f5378f.remove(size);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f5375c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(s6.f fVar) {
        fVar.getClass();
        this.f5381i = fVar;
        c();
    }
}
