package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import e7.e;
import e8.h9;
import e8.k9;
import e8.o50;
import e8.s0;
import e8.w;
import e8.y;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h {
    public static void a(f fVar, w wVar) {
        File externalStorageDirectory;
        if (wVar.f17183c == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(wVar.f17184d)) {
            Context context = wVar.f17183c;
            String str = wVar.f17184d;
            String str2 = wVar.f17181a;
            Map<String, String> map = wVar.f17182b;
            fVar.f6341e = context;
            fVar.f6342f = str;
            fVar.f6340d = str2;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fVar.f6344h = atomicBoolean;
            atomicBoolean.set(((Boolean) s0.f16356c.b()).booleanValue());
            if (fVar.f6344h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                fVar.f6345i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
            for (Map.Entry next : map.entrySet()) {
                fVar.f6338b.put((String) next.getKey(), (String) next.getValue());
            }
            o50 o50 = h9.f14881a;
            ((k9) o50).f15244a.execute(new e(fVar));
            Map<String, y> map2 = fVar.f6339c;
            y yVar = y.f17541b;
            map2.put("action", yVar);
            fVar.f6339c.put("ad_format", yVar);
            fVar.f6339c.put("e", y.f17542c);
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
