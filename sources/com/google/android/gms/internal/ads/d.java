package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d implements Callable<Boolean> {
    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
