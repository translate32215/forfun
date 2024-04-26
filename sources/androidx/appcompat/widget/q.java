package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.startapp.startappsdk.R;
import o0.x;
import s0.n;

/* compiled from: AppCompatImageButton */
public class q extends ImageButton implements x, n {

    /* renamed from: a  reason: collision with root package name */
    public final e f1055a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1056b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1057c;

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1055a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f1056b;
        if (rVar != null) {
            rVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1055a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1055a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e1 e1Var;
        r rVar = this.f1056b;
        if (rVar == null || (e1Var = rVar.f1082b) == null) {
            return null;
        }
        return e1Var.f894a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e1 e1Var;
        r rVar = this.f1056b;
        if (rVar == null || (e1Var = rVar.f1082b) == null) {
            return null;
        }
        return e1Var.f895b;
    }

    public boolean hasOverlappingRendering() {
        return this.f1056b.b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1055a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1055a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r rVar = this.f1056b;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        r rVar = this.f1056b;
        if (!(rVar == null || drawable == null || this.f1057c)) {
            rVar.f1084d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        r rVar2 = this.f1056b;
        if (rVar2 != null) {
            rVar2.a();
            if (!this.f1057c) {
                r rVar3 = this.f1056b;
                if (rVar3.f1081a.getDrawable() != null) {
                    rVar3.f1081a.getDrawable().setLevel(rVar3.f1084d);
                }
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1057c = true;
    }

    public void setImageResource(int i10) {
        this.f1056b.d(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        r rVar = this.f1056b;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1055a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1055a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        r rVar = this.f1056b;
        if (rVar != null) {
            rVar.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        r rVar = this.f1056b;
        if (rVar != null) {
            rVar.f(mode);
        }
    }

    public q(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        this.f1057c = false;
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f1055a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f1056b = rVar;
        rVar.c(attributeSet, i10);
    }
}
