package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder */
public final class n extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f1566a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f1567b = new ArrayList();

    /* compiled from: SpannableBuilder */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final Object f1568a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f1569b = new AtomicInteger(0);

        public a(Object obj) {
            this.f1568a = obj;
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1568a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1568a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1569b.get() <= 0 || !(obj instanceof j)) {
                ((SpanWatcher) this.f1568a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f1569b.get() <= 0 || !(obj instanceof j)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = i10 > i11 ? 0 : i10;
                    if (i12 > i13) {
                        i15 = i16;
                        i14 = 0;
                    } else {
                        i14 = i12;
                        i15 = i16;
                    }
                } else {
                    i15 = i10;
                    i14 = i12;
                }
                ((SpanWatcher) this.f1568a).onSpanChanged(spannable, obj, i15, i11, i14, i13);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1569b.get() <= 0 || !(obj instanceof j)) {
                ((SpanWatcher) this.f1568a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1568a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        q.a.f(cls, "watcherClass cannot be null");
        this.f1566a = cls;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f1567b.size(); i10++) {
            this.f1567b.get(i10).f1569b.incrementAndGet();
        }
    }

    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public void b() {
        e();
        for (int i10 = 0; i10 < this.f1567b.size(); i10++) {
            ((TextWatcher) this.f1567b.get(i10).f1568a).onTextChanged(this, 0, length(), length());
        }
    }

    public final a c(Object obj) {
        for (int i10 = 0; i10 < this.f1567b.size(); i10++) {
            a aVar = this.f1567b.get(i10);
            if (aVar.f1568a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1566a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f1567b.size(); i10++) {
            this.f1567b.get(i10).f1569b.decrementAndGet();
        }
    }

    public int getSpanEnd(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!(this.f1566a == cls)) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f1568a;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r1.f1566a == r4) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji2.text.n.a> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class<?> r0 = r1.f1566a
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<androidx.emoji2.text.n$a> r4 = androidx.emoji2.text.n.a.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.n.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1567b.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public Editable replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1567b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new n(this.f1566a, this, i10, i11);
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m3append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete  reason: collision with other method in class */
    public SpannableStringBuilder m8delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m9insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m6append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m10insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m11replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    public n(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        q.a.f(cls, "watcherClass cannot be null");
        this.f1566a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m2append(char c10) {
        super.append(c10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m5append(char c10) throws IOException {
        super.append(c10);
        return this;
    }

    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m4append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m7append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) throws IOException {
        super.append(charSequence, i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m12replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }
}
