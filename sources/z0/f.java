package z0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* compiled from: EmojiTextViewHelper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f28196a;

    /* compiled from: EmojiTextViewHelper */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f28197a;

        /* renamed from: b  reason: collision with root package name */
        public final d f28198b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28199c = true;

        public a(TextView textView) {
            this.f28197a = textView;
            this.f28198b = new d(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f28199c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    if (inputFilterArr[i10] instanceof d) {
                        sparseArray.put(i10, inputFilterArr[i10]);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            for (d dVar : inputFilterArr) {
                if (dVar == this.f28198b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f28198b;
            return inputFilterArr3;
        }

        public void b(boolean z10) {
            if (z10) {
                d();
            }
        }

        public void c(boolean z10) {
            this.f28199c = z10;
            d();
            this.f28197a.setFilters(a(this.f28197a.getFilters()));
        }

        public void d() {
            TransformationMethod transformationMethod = this.f28197a.getTransformationMethod();
            if (this.f28199c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f28206a;
            }
            this.f28197a.setTransformationMethod(transformationMethod);
        }
    }

    /* compiled from: EmojiTextViewHelper */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void b(boolean z10) {
        }

        public void c(boolean z10) {
        }
    }

    /* compiled from: EmojiTextViewHelper */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f28200a;

        public c(TextView textView) {
            this.f28200a = new a(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (d()) {
                return inputFilterArr;
            }
            return this.f28200a.a(inputFilterArr);
        }

        public void b(boolean z10) {
            if (!d()) {
                a aVar = this.f28200a;
                aVar.getClass();
                if (z10) {
                    aVar.d();
                }
            }
        }

        public void c(boolean z10) {
            if (d()) {
                this.f28200a.f28199c = z10;
                return;
            }
            a aVar = this.f28200a;
            aVar.f28199c = z10;
            aVar.d();
            aVar.f28197a.setFilters(aVar.a(aVar.f28197a.getFilters()));
        }

        public final boolean d() {
            return !e.c();
        }
    }

    public f(TextView textView, boolean z10) {
        q.a.f(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f28196a = new b();
        } else if (!z10) {
            this.f28196a = new c(textView);
        } else {
            this.f28196a = new a(textView);
        }
    }
}
