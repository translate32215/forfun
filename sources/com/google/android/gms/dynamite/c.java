package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c implements DynamiteModule.b {
    public final DynamiteModule.b.C0084b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0084b bVar = new DynamiteModule.b.C0084b();
        int b10 = aVar.b(context, str, true);
        bVar.f5917b = b10;
        if (b10 != 0) {
            bVar.f5918c = 1;
        } else {
            int a10 = aVar.a(context, str);
            bVar.f5916a = a10;
            if (a10 != 0) {
                bVar.f5918c = -1;
            }
        }
        return bVar;
    }
}
