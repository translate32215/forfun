package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n3.b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4951a;

        /* access modifiers changed from: public */
        ImageType(boolean z10) {
            this.f4951a = z10;
        }

        public boolean hasAlpha() {
            return this.f4951a;
        }
    }

    ImageType a(ByteBuffer byteBuffer) throws IOException;

    ImageType b(InputStream inputStream) throws IOException;

    int c(InputStream inputStream, b bVar) throws IOException;
}
