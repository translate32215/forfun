package com.google.android.gms.internal.ads;

import e8.m70;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class no {

    /* renamed from: a  reason: collision with root package name */
    public static Cipher f7599a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7600b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f7601c = new Object();

    public static Cipher a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f7601c) {
            if (f7599a == null) {
                f7599a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f7599a;
        }
        return cipher;
    }

    public final byte[] b(byte[] bArr, String str) throws m70 {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] b10 = uc.b(str, false);
                if (b10.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(b10.length);
                    allocate.put(b10);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(b10.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f7600b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new m70();
            } catch (NoSuchAlgorithmException e10) {
                throw new m70(e10);
            } catch (InvalidKeyException e11) {
                throw new m70(e11);
            } catch (IllegalBlockSizeException e12) {
                throw new m70(e12);
            } catch (NoSuchPaddingException e13) {
                throw new m70(e13);
            } catch (BadPaddingException e14) {
                throw new m70(e14);
            } catch (InvalidAlgorithmParameterException e15) {
                throw new m70(e15);
            } catch (IllegalArgumentException e16) {
                throw new m70(e16);
            }
        } else {
            throw new m70();
        }
    }

    public final byte[] c(String str) throws m70 {
        try {
            byte[] b10 = uc.b(str, false);
            if (b10.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(b10, 4, 16).get(bArr);
                for (int i10 = 0; i10 < 16; i10++) {
                    bArr[i10] = (byte) (bArr[i10] ^ 68);
                }
                return bArr;
            }
            throw new m70();
        } catch (IllegalArgumentException e10) {
            throw new m70(e10);
        }
    }

    public final String d(byte[] bArr, byte[] bArr2) throws m70 {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f7600b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return uc.a(bArr3, false);
            } catch (NoSuchAlgorithmException e10) {
                throw new m70(e10);
            } catch (InvalidKeyException e11) {
                throw new m70(e11);
            } catch (IllegalBlockSizeException e12) {
                throw new m70(e12);
            } catch (NoSuchPaddingException e13) {
                throw new m70(e13);
            } catch (BadPaddingException e14) {
                throw new m70(e14);
            }
        } else {
            throw new m70();
        }
    }
}
