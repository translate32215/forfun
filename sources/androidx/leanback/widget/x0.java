package androidx.leanback.widget;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.r0;
import com.startapp.startappsdk.R;

/* compiled from: RowHeaderPresenter */
public class x0 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2553a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2554b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2555c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2556d;

    /* compiled from: RowHeaderPresenter */
    public static class a extends r0.a {

        /* renamed from: b  reason: collision with root package name */
        public float f2557b;

        /* renamed from: c  reason: collision with root package name */
        public float f2558c;

        /* renamed from: d  reason: collision with root package name */
        public RowHeaderView f2559d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f2560e;

        public a(View view) {
            super(view);
            this.f2559d = (RowHeaderView) view.findViewById(R.id.row_header);
            this.f2560e = (TextView) view.findViewById(R.id.row_header_description);
            RowHeaderView rowHeaderView = this.f2559d;
            if (rowHeaderView != null) {
                rowHeaderView.getCurrentTextColor();
            }
            this.f2558c = view.getResources().getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
        }
    }

    public x0() {
        this.f2554b = new Paint(1);
        this.f2553a = R.layout.lb_row_header;
        this.f2556d = true;
    }

    public void c(r0.a aVar, Object obj) {
        t tVar;
        if (obj == null) {
            tVar = null;
        } else {
            tVar = ((v0) obj).f2549a;
        }
        a aVar2 = (a) aVar;
        if (tVar == null) {
            RowHeaderView rowHeaderView = aVar2.f2559d;
            if (rowHeaderView != null) {
                rowHeaderView.setText((CharSequence) null);
            }
            TextView textView = aVar2.f2560e;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            aVar.f2509a.setContentDescription((CharSequence) null);
            if (this.f2555c) {
                aVar.f2509a.setVisibility(8);
                return;
            }
            return;
        }
        RowHeaderView rowHeaderView2 = aVar2.f2559d;
        if (rowHeaderView2 != null) {
            rowHeaderView2.setText((String) tVar.f2526c);
        }
        if (aVar2.f2560e != null) {
            if (TextUtils.isEmpty((CharSequence) tVar.f2527d)) {
                aVar2.f2560e.setVisibility(8);
            } else {
                aVar2.f2560e.setVisibility(0);
            }
            aVar2.f2560e.setText((CharSequence) tVar.f2527d);
        }
        aVar.f2509a.setContentDescription((CharSequence) tVar.f2528e);
        aVar.f2509a.setVisibility(0);
    }

    public r0.a d(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f2553a, viewGroup, false));
        if (this.f2556d) {
            h(aVar, 0.0f);
        }
        return aVar;
    }

    public void e(r0.a aVar) {
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f2559d;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f2560e;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f2556d) {
            h(aVar2, 0.0f);
        }
    }

    public final void h(a aVar, float f10) {
        aVar.f2557b = f10;
        if (this.f2556d) {
            View view = aVar.f2509a;
            float f11 = aVar.f2558c;
            view.setAlpha(((1.0f - f11) * f10) + f11);
        }
    }

    public x0(int i10) {
        this.f2554b = new Paint(1);
        this.f2553a = i10;
        this.f2556d = true;
    }

    public x0(int i10, boolean z10) {
        this.f2554b = new Paint(1);
        this.f2553a = i10;
        this.f2556d = z10;
    }
}
