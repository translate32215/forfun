package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n3.b;
import t3.v;

/* compiled from: ImageHeaderParserUtils */
public final class d {
    public static int a(List<ImageHeaderParser> list, InputStream inputStream, b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                int c10 = list.get(i10).c(inputStream, bVar);
                if (c10 != -1) {
                    return c10;
                }
                i10++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, InputStream inputStream, b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                ImageHeaderParser.ImageType b10 = list.get(i10).b(inputStream);
                inputStream.reset();
                if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return b10;
                }
                i10++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
