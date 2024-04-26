package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.startapp.startappsdk.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o0.c0;

public class SearchView extends o0 implements j.b {

    /* renamed from: y0  reason: collision with root package name */
    public static final o f699y0 = (Build.VERSION.SDK_INT < 29 ? new o() : null);
    public final View A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public q G;
    public Rect H;
    public Rect I;
    public int[] J;
    public int[] K;
    public final ImageView L;
    public final Drawable M;
    public final int N;
    public final int O;
    public final Intent P;
    public final Intent Q;
    public final CharSequence R;
    public m S;

    /* renamed from: a0  reason: collision with root package name */
    public l f700a0;

    /* renamed from: b0  reason: collision with root package name */
    public View.OnFocusChangeListener f701b0;

    /* renamed from: c0  reason: collision with root package name */
    public n f702c0;

    /* renamed from: d0  reason: collision with root package name */
    public View.OnClickListener f703d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f704e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f705f0;

    /* renamed from: g0  reason: collision with root package name */
    public t0.a f706g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f707h0;

    /* renamed from: i0  reason: collision with root package name */
    public CharSequence f708i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f709j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f710k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f711l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f712m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f713n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f714o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f715p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f716q0;

    /* renamed from: r0  reason: collision with root package name */
    public SearchableInfo f717r0;

    /* renamed from: s0  reason: collision with root package name */
    public Bundle f718s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Runnable f719t0;

    /* renamed from: u0  reason: collision with root package name */
    public Runnable f720u0;

    /* renamed from: v0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f721v0;

    /* renamed from: w0  reason: collision with root package name */
    public View.OnKeyListener f722w0;

    /* renamed from: x  reason: collision with root package name */
    public final SearchAutoComplete f723x;

    /* renamed from: x0  reason: collision with root package name */
    public TextWatcher f724x0;

    /* renamed from: y  reason: collision with root package name */
    public final View f725y;

    /* renamed from: z  reason: collision with root package name */
    public final View f726z;

    public static class SearchAutoComplete extends d {

        /* renamed from: e  reason: collision with root package name */
        public int f727e = getThreshold();

        /* renamed from: f  reason: collision with root package name */
        public SearchView f728f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f729g;

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f730h = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f729g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f729g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f699y0;
            oVar.getClass();
            o.a();
            Method method = oVar.f744c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f727e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f729g) {
                removeCallbacks(this.f730h);
                post(this.f730h);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f728f;
            searchView.A(searchView.f705f0);
            searchView.post(searchView.f719t0);
            if (searchView.f723x.hasFocus()) {
                searchView.n();
            }
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f728f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f728f.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f729g = true;
                Context context = getContext();
                o oVar = SearchView.f699y0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f729g = false;
                removeCallbacks(this.f730h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f729g = false;
                removeCallbacks(this.f730h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f729g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f728f = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f727e = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f723x.getText();
            searchView.f714o0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.z(z10);
            searchView.B(!z10);
            searchView.v();
            searchView.y();
            if (searchView.S != null && !TextUtils.equals(charSequence, searchView.f713n0)) {
                searchView.S.a(charSequence.toString());
            }
            searchView.f713n0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.w();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            t0.a aVar = SearchView.this.f706g0;
            if (aVar instanceof a1) {
                aVar.b((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f701b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            if (searchView.F.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f726z.getPaddingLeft();
                Rect rect = new Rect();
                boolean b10 = n1.b(searchView);
                if (searchView.f704e0) {
                    i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                searchView.f723x.getDropDownBackground().getPadding(rect);
                if (b10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchView.f723x.setDropDownHorizontalOffset(i19);
                searchView.f723x.setDropDownWidth((((searchView.F.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.B) {
                searchView.t();
            } else if (view == searchView.D) {
                searchView.p();
            } else if (view == searchView.C) {
                searchView.u();
            } else if (view == searchView.E) {
                SearchableInfo searchableInfo = searchView.f717r0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.P);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.Q, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f723x) {
                searchView.n();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.f717r0 == null) {
                return false;
            }
            if (!searchView.f723x.isPopupShowing() || SearchView.this.f723x.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f723x.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.o(0, (String) null, searchView2.f723x.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f717r0 == null || searchView3.f706g0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView3.q(searchView3.f723x.getListSelection());
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = searchView3.f723x.length();
                }
                searchView3.f723x.setSelection(i11);
                searchView3.f723x.setListSelection(0);
                searchView3.f723x.clearListSelection();
                searchView3.f723x.a();
                return true;
            } else if (i10 != 19) {
                return false;
            } else {
                searchView3.f723x.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.u();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.q(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.r(i10);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public Method f742a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f743b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f744c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f742a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f743b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f744c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends u0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f745c;

        public class a implements Parcelable.ClassLoaderCreator<p> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new p[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("SearchView.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" isIconified=");
            a10.append(this.f745c);
            a10.append("}");
            return a10.toString();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeValue(Boolean.valueOf(this.f745c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f745c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f746a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f747b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f748c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f749d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f750e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f751f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f750e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f746a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f747b.set(rect);
            this.f749d.set(rect);
            Rect rect3 = this.f749d;
            int i10 = this.f750e;
            rect3.inset(-i10, -i10);
            this.f748c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f751f
                r7.f751f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f751f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f749d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f747b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f751f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f748c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f746a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f746a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f748c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f746a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f723x.setText(charSequence);
        this.f723x.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z10) {
        this.f705f0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f723x.getText());
        this.B.setVisibility(i11);
        z(z11);
        this.f725y.setVisibility(z10 ? 8 : 0);
        if (this.L.getDrawable() == null || this.f704e0) {
            i10 = 8;
        }
        this.L.setVisibility(i10);
        v();
        B(!z11);
        y();
    }

    public final void B(boolean z10) {
        int i10 = 8;
        if (this.f712m0 && !this.f705f0 && z10) {
            this.C.setVisibility(8);
            i10 = 0;
        }
        this.E.setVisibility(i10);
    }

    public void c() {
        if (!this.f715p0) {
            this.f715p0 = true;
            int imeOptions = this.f723x.getImeOptions();
            this.f716q0 = imeOptions;
            this.f723x.setImeOptions(imeOptions | 33554432);
            this.f723x.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f710k0 = true;
        super.clearFocus();
        this.f723x.clearFocus();
        this.f723x.setImeVisibility(false);
        this.f710k0 = false;
    }

    public void e() {
        this.f723x.setText("");
        SearchAutoComplete searchAutoComplete = this.f723x;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f714o0 = "";
        clearFocus();
        A(true);
        this.f723x.setImeOptions(this.f716q0);
        this.f715p0 = false;
    }

    public int getImeOptions() {
        return this.f723x.getImeOptions();
    }

    public int getInputType() {
        return this.f723x.getInputType();
    }

    public int getMaxWidth() {
        return this.f711l0;
    }

    public CharSequence getQuery() {
        return this.f723x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f708i0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f717r0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.R;
        }
        return getContext().getText(this.f717r0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.O;
    }

    public int getSuggestionRowLayout() {
        return this.N;
    }

    public t0.a getSuggestionsAdapter() {
        return this.f706g0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f714o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f718s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f717r0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f718s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f723x);
            return;
        }
        o oVar = f699y0;
        SearchAutoComplete searchAutoComplete = this.f723x;
        oVar.getClass();
        o.a();
        Method method = oVar.f742a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f699y0;
        SearchAutoComplete searchAutoComplete2 = this.f723x;
        oVar2.getClass();
        o.a();
        Method method2 = oVar2.f743b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void o(int i10, String str, String str2) {
        getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, (String) null));
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f719t0);
        post(this.f720u0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f723x;
            Rect rect = this.H;
            searchAutoComplete.getLocationInWindow(this.J);
            getLocationInWindow(this.K);
            int[] iArr = this.J;
            int i14 = iArr[1];
            int[] iArr2 = this.K;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.I;
            Rect rect3 = this.H;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            q qVar = this.G;
            if (qVar == null) {
                q qVar2 = new q(this.I, this.H, this.f723x);
                this.G = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.I, this.H);
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f705f0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f711l0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f711l0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f711l0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f25915a);
        A(pVar.f745c);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f745c = this.f705f0;
        return pVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f719t0);
    }

    public void p() {
        if (!TextUtils.isEmpty(this.f723x.getText())) {
            this.f723x.setText("");
            this.f723x.requestFocus();
            this.f723x.setImeVisibility(true);
        } else if (this.f704e0) {
            l lVar = this.f700a0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                A(true);
            }
        }
    }

    public boolean q(int i10) {
        int i11;
        Uri uri;
        String h10;
        n nVar = this.f702c0;
        if (nVar != null && nVar.b(i10)) {
            return false;
        }
        Cursor cursor = this.f706g0.f25326c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = a1.G;
                String h11 = a1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f717r0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String str = h11;
                String h12 = a1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f717r0.getSuggestIntentData();
                }
                if (!(h12 == null || (h10 = a1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                if (h12 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h12);
                }
                intent = l(str, uri, a1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), a1.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        this.f723x.setImeVisibility(false);
        this.f723x.dismissDropDown();
        return true;
    }

    public boolean r(int i10) {
        n nVar = this.f702c0;
        if (nVar != null && nVar.a(i10)) {
            return false;
        }
        Editable text = this.f723x.getText();
        Cursor cursor = this.f706g0.f25326c;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i10)) {
            CharSequence c10 = this.f706g0.c(cursor);
            if (c10 != null) {
                setQuery(c10);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.f710k0 || !isFocusable()) {
            return false;
        }
        if (this.f705f0) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f723x.requestFocus(i10, rect);
        if (requestFocus) {
            A(false);
        }
        return requestFocus;
    }

    public void s(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f718s0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            p();
        } else {
            t();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f704e0 != z10) {
            this.f704e0 = z10;
            A(z10);
            x();
        }
    }

    public void setImeOptions(int i10) {
        this.f723x.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f723x.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f711l0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f700a0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f701b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.S = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f703d0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f702c0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f708i0 = charSequence;
        x();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f709j0 = z10;
        t0.a aVar = this.f706g0;
        if (aVar instanceof a1) {
            ((a1) aVar).f808y = z10 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f717r0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f723x
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f723x
            android.app.SearchableInfo r3 = r6.f717r0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f717r0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f717r0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f723x
            r3.setInputType(r7)
            t0.a r7 = r6.f706g0
            if (r7 == 0) goto L_0x0042
            r7.b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f717r0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.a1 r7 = new androidx.appcompat.widget.a1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f717r0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f721v0
            r7.<init>(r3, r6, r4, r5)
            r6.f706g0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f723x
            r3.setAdapter(r7)
            t0.a r7 = r6.f706g0
            androidx.appcompat.widget.a1 r7 = (androidx.appcompat.widget.a1) r7
            boolean r3 = r6.f709j0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.f808y = r3
        L_0x006b:
            r6.x()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f717r0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f717r0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.P
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f717r0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.Q
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.f712m0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f723x
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f705f0
            r6.A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f707h0 = z10;
        A(this.f705f0);
    }

    public void setSuggestionsAdapter(t0.a aVar) {
        this.f706g0 = aVar;
        this.f723x.setAdapter(aVar);
    }

    public void t() {
        A(false);
        this.f723x.requestFocus();
        this.f723x.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f703d0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void u() {
        Editable text = this.f723x.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.S;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.f717r0 != null) {
                    o(0, (String) null, text.toString());
                }
                this.f723x.setImeVisibility(false);
                this.f723x.dismissDropDown();
            }
        }
    }

    public final void v() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f723x.getText());
        int i10 = 0;
        if (!z11 && (!this.f704e0 || this.f715p0)) {
            z10 = false;
        }
        ImageView imageView = this.D;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.D.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void w() {
        int[] iArr = this.f723x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f726z.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void x() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f723x;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f704e0 && this.M != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i10 = (int) (textSize * 1.25d);
            this.M.setBounds(0, 0, i10, i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.M), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void y() {
        int i10 = 0;
        if (!((this.f707h0 || this.f712m0) && !this.f705f0) || !(this.C.getVisibility() == 0 || this.E.getVisibility() == 0)) {
            i10 = 8;
        }
        this.A.setVisibility(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f712m0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f707h0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f712m0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f705f0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f712m0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.C
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.z(boolean):void");
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        this.H = new Rect();
        this.I = new Rect();
        this.J = new int[2];
        this.K = new int[2];
        this.f719t0 = new b();
        this.f720u0 = new c();
        this.f721v0 = new WeakHashMap<>();
        f fVar = new f();
        this.f722w0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f724x0 = new a();
        int[] iArr = e.l.f13522v;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        g1 g1Var = new g1(context2, obtainStyledAttributes);
        TypedArray typedArray = obtainStyledAttributes;
        c0.B(this, context, iArr, attributeSet2, obtainStyledAttributes, i11, 0);
        LayoutInflater.from(context).inflate(g1Var.m(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f723x = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f725y = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f726z = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.A = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.B = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.C = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.D = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.E = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.L = imageView5;
        c0.d.q(findViewById, g1Var.g(10));
        c0.d.q(findViewById2, g1Var.g(14));
        imageView.setImageDrawable(g1Var.g(13));
        imageView2.setImageDrawable(g1Var.g(7));
        imageView3.setImageDrawable(g1Var.g(4));
        imageView4.setImageDrawable(g1Var.g(16));
        imageView5.setImageDrawable(g1Var.g(13));
        this.M = g1Var.g(12);
        j1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.N = g1Var.m(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.O = g1Var.m(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f724x0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f722w0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(g1Var.a(8, true));
        int f10 = g1Var.f(1, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.R = g1Var.o(6);
        this.f708i0 = g1Var.o(11);
        int j10 = g1Var.j(3, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = g1Var.j(2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(g1Var.a(0, true));
        typedArray.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.P = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.F = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        A(this.f704e0);
        x();
    }
}
