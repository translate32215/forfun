package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final InternalRewinder f4965a;

    public static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelFileDescriptor f4966a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f4966a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f4966a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f4966a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        public e b(Object obj) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4965a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() throws IOException {
        return this.f4965a.rewind();
    }
}
