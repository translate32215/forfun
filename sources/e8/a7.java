package e8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import e7.i;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import l0.e;
import w7.a;
import w7.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a7 extends a {
    public static final Parcelable.Creator<a7> CREATOR = new b7();

    /* renamed from: a  reason: collision with root package name */
    public ParcelFileDescriptor f13664a;

    /* renamed from: b  reason: collision with root package name */
    public Parcelable f13665b = null;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13666c = true;

    public a7(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13664a = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends c> T i(Parcelable.Creator<T> creator) {
        if (this.f13666c) {
            if (this.f13664a == null) {
                e.I("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f13664a));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                try {
                    dataInputStream.close();
                } catch (IOException unused) {
                }
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f13665b = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f13666c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e10) {
                e.C("Could not read from parcel file descriptor", e10);
                try {
                    dataInputStream.close();
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        }
        return (c) this.f13665b;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f13664a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f13665b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        ((k9) h9.f14881a).f15244a.execute(new i((OutputStream) autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e10) {
                        e = e10;
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                    e.C("Error transporting the ad response", e);
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e, "LargeParcelTeleporter.pipeData.2");
                    if (autoCloseOutputStream != null) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    this.f13664a = parcelFileDescriptor;
                    int l10 = j.l(parcel, 20293);
                    j.f(parcel, 2, this.f13664a, i10, false);
                    j.m(parcel, l10);
                }
                this.f13664a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int l102 = j.l(parcel, 20293);
        j.f(parcel, 2, this.f13664a, i10, false);
        j.m(parcel, l102);
    }
}
