package c8;

import android.os.IBinder;
import android.os.IInterface;
import i8.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface a extends IInterface {

    /* renamed from: c8.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C0062a extends b implements a {
        public C0062a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a Y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder);
        }
    }
}
