package de;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

public final /* synthetic */ class w {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new v[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
