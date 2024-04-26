package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1372a;
        if (aVar.i(1)) {
            obj = aVar.o();
        }
        remoteActionCompat.f1372a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1373b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f1373b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1374c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f1374c = charSequence2;
        remoteActionCompat.f1375d = (PendingIntent) aVar.m(remoteActionCompat.f1375d, 4);
        boolean z10 = remoteActionCompat.f1376e;
        if (aVar.i(5)) {
            z10 = aVar.f();
        }
        remoteActionCompat.f1376e = z10;
        boolean z11 = remoteActionCompat.f1377f;
        if (aVar.i(6)) {
            z11 = aVar.f();
        }
        remoteActionCompat.f1377f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1372a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1373b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1374c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1375d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z10 = remoteActionCompat.f1376e;
        aVar.p(5);
        aVar.q(z10);
        boolean z11 = remoteActionCompat.f1377f;
        aVar.p(6);
        aVar.q(z11);
    }
}
