package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.f;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u6.i;

/* compiled from: Aes128DataSource */
public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f5155a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5156b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5157c;

    /* renamed from: d  reason: collision with root package name */
    public CipherInputStream f5158d;

    public a(e eVar, byte[] bArr, byte[] bArr2) {
        this.f5155a = eVar;
        this.f5156b = bArr;
        this.f5157c = bArr2;
    }

    public final Uri M() {
        return this.f5155a.M();
    }

    public final Map<String, List<String>> N() {
        return this.f5155a.N();
    }

    public final long O(u6.e eVar) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f5156b, "AES"), new IvParameterSpec(this.f5157c));
                f fVar = new f(this.f5155a, eVar);
                this.f5158d = new CipherInputStream(fVar, instance);
                if (fVar.f5478d) {
                    return -1;
                }
                fVar.f5475a.O(fVar.f5476b);
                fVar.f5478d = true;
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void P(i iVar) {
        iVar.getClass();
        this.f5155a.P(iVar);
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        this.f5158d.getClass();
        int read = this.f5158d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public void close() throws IOException {
        if (this.f5158d != null) {
            this.f5158d = null;
            this.f5155a.close();
        }
    }
}
