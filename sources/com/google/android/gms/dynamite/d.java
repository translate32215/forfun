package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d implements DynamiteModule.b {
    public final DynamiteModule.b.C0084b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int i10;
        DynamiteModule.b.C0084b bVar = new DynamiteModule.b.C0084b();
        int a10 = aVar.a(context, str);
        bVar.f5916a = a10;
        int i11 = 0;
        if (a10 != 0) {
            i10 = aVar.b(context, str, false);
            bVar.f5917b = i10;
        } else {
            i10 = aVar.b(context, str, true);
            bVar.f5917b = i10;
        }
        int i12 = bVar.f5916a;
        if (i12 != 0) {
            i11 = i12;
        } else if (i10 == 0) {
            bVar.f5918c = 0;
            return bVar;
        }
        if (i11 >= i10) {
            bVar.f5918c = -1;
        } else {
            bVar.f5918c = 1;
        }
        return bVar;
    }
}
