package com.google.android.gms.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c {
    @Deprecated
    public static long a(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z10) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
                throw th;
            }
        }
        if (z10) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
            }
        }
        return j10;
    }
}
