package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e implements DynamiteModule.b {
    public final DynamiteModule.b.C0084b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0084b bVar = new DynamiteModule.b.C0084b();
        bVar.f5916a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        bVar.f5917b = b10;
        int i10 = bVar.f5916a;
        if (i10 == 0) {
            if (b10 == 0) {
                bVar.f5918c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (b10 >= i10) {
            bVar.f5918c = 1;
        } else {
            bVar.f5918c = -1;
        }
        return bVar;
    }
}
