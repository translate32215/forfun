package w7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import androidx.appcompat.widget.d0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + p10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + p10);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + p10);
        return createIntArray;
    }

    public static <T extends Parcelable> T d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + p10);
        return t10;
    }

    public static String e(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + p10);
        return readString;
    }

    public static String[] f(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + p10);
        return createStringArray;
    }

    public static ArrayList<String> g(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + p10);
        return createStringArrayList;
    }

    public static <T> T[] h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + p10);
        return createTypedArray;
    }

    public static <T> ArrayList<T> i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + p10);
        return createTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a(d0.a("Overread allowed size end=", i10), parcel);
        }
    }

    public static boolean k(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static float l(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static IBinder m(Parcel parcel, int i10) {
        int p10 = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + p10);
        return readStrongBinder;
    }

    public static int n(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long o(Parcel parcel, int i10) {
        t(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int p(Parcel parcel, int i10) {
        return (i10 & -65536) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void q(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i10));
    }

    public static int r(Parcel parcel) {
        int readInt = parcel.readInt();
        int p10 = p(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int i10 = p10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void s(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected size ");
            sb2.append(i12);
            sb2.append(" got ");
            sb2.append(i11);
            sb2.append(" (0x");
            throw new a(e.a(sb2, hexString, ")"), parcel);
        }
    }

    public static void t(Parcel parcel, int i10, int i11) {
        int p10 = p(parcel, i10);
        if (p10 != i11) {
            String hexString = Integer.toHexString(p10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected size ");
            sb2.append(i11);
            sb2.append(" got ");
            sb2.append(p10);
            sb2.append(" (0x");
            throw new a(e.a(sb2, hexString, ")"), parcel);
        }
    }
}
