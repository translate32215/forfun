package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.a;
import com.startapp.nd;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1410a = aVar.k(iconCompat.f1410a, 1);
        byte[] bArr = iconCompat.f1412c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f1412c = bArr;
        iconCompat.f1413d = aVar.m(iconCompat.f1413d, 3);
        iconCompat.f1414e = aVar.k(iconCompat.f1414e, 4);
        iconCompat.f1415f = aVar.k(iconCompat.f1415f, 5);
        iconCompat.f1416g = (ColorStateList) aVar.m(iconCompat.f1416g, 6);
        String str = iconCompat.f1418i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.f1418i = str;
        String str2 = iconCompat.f1419j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.f1419j = str2;
        iconCompat.f1417h = PorterDuff.Mode.valueOf(iconCompat.f1418i);
        switch (iconCompat.f1410a) {
            case nd.f10913j /*-1*/:
                Parcelable parcelable = iconCompat.f1413d;
                if (parcelable != null) {
                    iconCompat.f1411b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1413d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f1412c;
                    iconCompat.f1411b = bArr2;
                    iconCompat.f1410a = 3;
                    iconCompat.f1414e = 0;
                    iconCompat.f1415f = bArr2.length;
                    break;
                } else {
                    iconCompat.f1411b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1412c, Charset.forName("UTF-16"));
                iconCompat.f1411b = str3;
                if (iconCompat.f1410a == 2 && iconCompat.f1419j == null) {
                    iconCompat.f1419j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f1411b = iconCompat.f1412c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1418i = iconCompat.f1417h.name();
        switch (iconCompat.f1410a) {
            case nd.f10913j /*-1*/:
                iconCompat.f1413d = (Parcelable) iconCompat.f1411b;
                break;
            case 1:
            case 5:
                iconCompat.f1413d = (Parcelable) iconCompat.f1411b;
                break;
            case 2:
                iconCompat.f1412c = ((String) iconCompat.f1411b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1412c = (byte[]) iconCompat.f1411b;
                break;
            case 4:
            case 6:
                iconCompat.f1412c = iconCompat.f1411b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1410a;
        if (-1 != i10) {
            aVar.p(1);
            aVar.t(i10);
        }
        byte[] bArr = iconCompat.f1412c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f1413d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i11 = iconCompat.f1414e;
        if (i11 != 0) {
            aVar.p(4);
            aVar.t(i11);
        }
        int i12 = iconCompat.f1415f;
        if (i12 != 0) {
            aVar.p(5);
            aVar.t(i12);
        }
        ColorStateList colorStateList = iconCompat.f1416g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f1418i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f1419j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
