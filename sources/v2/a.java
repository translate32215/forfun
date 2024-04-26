package v2;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: LPaint */
public class a extends Paint {
    public a() {
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
