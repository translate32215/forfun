package androidx.activity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import de.f0;
import de.o1;
import de.s;
import ie.t;
import java.util.List;
import l0.e;
import md.d;
import md.f;

public class j {
    public static final boolean a(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final <T> void b(f0<? super T> f0Var, d<? super T> dVar, boolean z10) {
        Object h10 = f0Var.h();
        Throwable c10 = f0Var.c(h10);
        Object a10 = c10 != null ? e.a(c10) : f0Var.d(h10);
        if (z10) {
            ie.d dVar2 = (ie.d) dVar;
            d<T> dVar3 = dVar2.f19368e;
            Object obj = dVar2.f19370g;
            f context = dVar3.getContext();
            Object c11 = t.c(context, obj);
            o1<?> c12 = c11 != t.f19398a ? s.c(dVar3, context, c11) : null;
            try {
                dVar2.f19368e.g(a10);
            } finally {
                if (c12 == null || c12.W()) {
                    t.a(context, c11);
                }
            }
        } else {
            dVar.g(a10);
        }
    }

    public static void c(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle != null) {
            int l10 = l(parcel, i10);
            parcel.writeBundle(bundle);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void d(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr != null) {
            int l10 = l(parcel, i10);
            parcel.writeByteArray(bArr);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void e(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder != null) {
            int l10 = l(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void f(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable != null) {
            int l10 = l(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void g(Parcel parcel, int i10, String str, boolean z10) {
        if (str != null) {
            int l10 = l(parcel, i10);
            parcel.writeString(str);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void h(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr != null) {
            int l10 = l(parcel, i10);
            parcel.writeStringArray(strArr);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static void i(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list != null) {
            int l10 = l(parcel, i10);
            parcel.writeStringList(list);
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static <T extends Parcelable> void j(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr != null) {
            int l10 = l(parcel, i10);
            parcel.writeInt(r7);
            for (T t10 : tArr) {
                if (t10 == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, t10, i11);
                }
            }
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static <T extends Parcelable> void k(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list != null) {
            int l10 = l(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, parcelable, 0);
                }
            }
            m(parcel, l10);
        } else if (z10) {
            parcel.writeInt(i10 | 0);
        }
    }

    public static int l(Parcel parcel, int i10) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void n(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
