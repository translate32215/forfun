package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.appcompat.widget.o;
import e.f;
import e8.e60;
import e8.li0;
import e8.v50;
import e8.y9;
import e8.z50;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import l0.d;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class g7 {
    public static int a(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i10));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    public static vo b(bn bnVar) throws GeneralSecurityException {
        int i10 = e60.f14368b[bnVar.ordinal()];
        if (i10 == 1) {
            return vo.NIST_P256;
        }
        if (i10 == 2) {
            return vo.NIST_P384;
        }
        if (i10 == 3) {
            return vo.NIST_P521;
        }
        String valueOf = String.valueOf(bnVar);
        throw new GeneralSecurityException(f.a(valueOf.length() + 20, "unknown curve type: ", valueOf));
    }

    public static xo c(nm nmVar) throws GeneralSecurityException {
        int i10 = e60.f14369c[nmVar.ordinal()];
        if (i10 == 1) {
            return xo.UNCOMPRESSED;
        }
        if (i10 == 2) {
            return xo.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i10 == 3) {
            return xo.COMPRESSED;
        }
        String valueOf = String.valueOf(nmVar);
        throw new GeneralSecurityException(f.a(valueOf.length() + 22, "unknown point format: ", valueOf));
    }

    public static String d(cn cnVar) throws NoSuchAlgorithmException {
        int i10 = e60.f14367a[cnVar.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha256";
        }
        if (i10 == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(cnVar);
        throw new NoSuchAlgorithmException(f.a(valueOf.length() + 27, "hash unsupported for HMAC: ", valueOf));
    }

    public static ByteBuffer e(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i10 <= byteBuffer.remaining()) {
                return f(byteBuffer, i10);
            } else {
                throw new IOException(y9.a(101, "Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
            }
        } else {
            throw new IOException(d.a(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 < position || i11 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i11);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException(d.a(17, "size: ", i10));
        }
    }

    public static void g(int i10, byte[] bArr) {
        bArr[1] = (byte) i10;
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) (i10 >>> 16);
        bArr[4] = (byte) (i10 >>> 24);
    }

    public static void h(sm smVar) throws GeneralSecurityException {
        uo.b(b(smVar.y().y()));
        d(smVar.y().z());
        if (smVar.A() != nm.UNKNOWN_FORMAT) {
            mn y10 = smVar.z().y();
            Logger logger = dj.f6215a;
            synchronized (dj.class) {
                z50<?> b10 = dj.j(y10.y()).b();
                if (((Boolean) ((ConcurrentHashMap) dj.f6218d).get(y10.y())).booleanValue()) {
                    ((pi) b10).c(y10.z());
                } else {
                    String valueOf = String.valueOf(y10.y());
                    throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
                }
            }
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate[] i(java.nio.ByteBuffer r20, java.util.Map<java.lang.Integer, byte[]> r21, java.security.cert.CertificateFactory r22) throws java.lang.SecurityException, java.io.IOException {
        /*
            java.nio.ByteBuffer r0 = e(r20)
            java.nio.ByteBuffer r1 = e(r20)
            byte[] r2 = p(r20)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
        L_0x0015:
            boolean r8 = r1.hasRemaining()
            r9 = 8
            r10 = 769(0x301, float:1.078E-42)
            r11 = 514(0x202, float:7.2E-43)
            r12 = 513(0x201, float:7.19E-43)
            r13 = 1
            if (r8 == 0) goto L_0x00cc
            int r6 = r6 + 1
            java.nio.ByteBuffer r8 = e(r1)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            int r14 = r8.remaining()     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            if (r14 < r9) goto L_0x00b3
            int r9 = r8.getInt()     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r3.add(r14)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            if (r9 == r12) goto L_0x0046
            if (r9 == r11) goto L_0x0046
            if (r9 == r10) goto L_0x0046
            switch(r9) {
                case 257: goto L_0x0046;
                case 258: goto L_0x0046;
                case 259: goto L_0x0046;
                case 260: goto L_0x0046;
                default: goto L_0x0044;
            }     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
        L_0x0044:
            r10 = 0
            goto L_0x0047
        L_0x0046:
            r10 = 1
        L_0x0047:
            if (r10 != 0) goto L_0x004a
            goto L_0x0015
        L_0x004a:
            if (r5 == r4) goto L_0x00ac
            int r10 = a(r9)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            int r11 = a(r5)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r12 = "Unknown digestAlgorithm2: "
            r14 = 37
            r15 = 2
            if (r10 == r13) goto L_0x008e
            if (r10 != r15) goto L_0x0077
            if (r11 == r13) goto L_0x00aa
            if (r11 != r15) goto L_0x0062
            goto L_0x00a9
        L_0x0062:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.<init>(r14)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.append(r12)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.append(r11)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            throw r0     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
        L_0x0077:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.<init>(r14)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r2 = "Unknown digestAlgorithm1: "
            r1.append(r2)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.append(r10)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            throw r0     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
        L_0x008e:
            if (r11 == r13) goto L_0x00a9
            if (r11 != r15) goto L_0x0094
            r13 = -1
            goto L_0x00aa
        L_0x0094:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.<init>(r14)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.append(r12)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r1.append(r11)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            throw r0     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
        L_0x00a9:
            r13 = 0
        L_0x00aa:
            if (r13 <= 0) goto L_0x0015
        L_0x00ac:
            byte[] r7 = p(r8)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            r5 = r9
            goto L_0x0015
        L_0x00b3:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
            throw r0     // Catch:{ IOException -> 0x00bd, BufferUnderflowException -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            goto L_0x00be
        L_0x00bd:
            r0 = move-exception
        L_0x00be:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 45
            java.lang.String r3 = "Failed to parse signature record #"
            java.lang.String r2 = l0.d.a(r2, r3, r6)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cc:
            if (r5 != r4) goto L_0x00e0
            if (r6 != 0) goto L_0x00d8
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            if (r5 == r12) goto L_0x0111
            if (r5 == r11) goto L_0x0111
            if (r5 == r10) goto L_0x010e
            switch(r5) {
                case 257: goto L_0x0101;
                case 258: goto L_0x0101;
                case 259: goto L_0x0101;
                case 260: goto L_0x0101;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r5
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0104
            java.lang.String r1 = r1.concat(r2)
            goto L_0x010a
        L_0x0101:
            java.lang.String r4 = "RSA"
            goto L_0x0113
        L_0x0104:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x010a:
            r0.<init>(r1)
            throw r0
        L_0x010e:
            java.lang.String r4 = "DSA"
            goto L_0x0113
        L_0x0111:
            java.lang.String r4 = "EC"
        L_0x0113:
            if (r5 == r12) goto L_0x018b
            if (r5 == r11) goto L_0x0183
            if (r5 == r10) goto L_0x017b
            switch(r5) {
                case 257: goto L_0x0159;
                case 258: goto L_0x0142;
                case 259: goto L_0x013a;
                case 260: goto L_0x0132;
                default: goto L_0x011c;
            }
        L_0x011c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r5
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0171
            java.lang.String r1 = r1.concat(r2)
            goto L_0x0177
        L_0x0132:
            java.lang.String r1 = "SHA512withRSA"
            r6 = 0
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x0192
        L_0x013a:
            r6 = 0
            java.lang.String r1 = "SHA256withRSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x0192
        L_0x0142:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r17 = java.security.spec.MGF1ParameterSpec.SHA512
            r18 = 64
            r19 = 1
            java.lang.String r15 = "SHA-512"
            java.lang.String r16 = "MGF1"
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r6 = "SHA512withRSA/PSS"
            android.util.Pair r1 = android.util.Pair.create(r6, r1)
            goto L_0x016f
        L_0x0159:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r17 = java.security.spec.MGF1ParameterSpec.SHA256
            r18 = 32
            r19 = 1
            java.lang.String r15 = "SHA-256"
            java.lang.String r16 = "MGF1"
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r6 = "SHA256withRSA/PSS"
            android.util.Pair r1 = android.util.Pair.create(r6, r1)
        L_0x016f:
            r6 = 0
            goto L_0x0192
        L_0x0171:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x0177:
            r0.<init>(r1)
            throw r0
        L_0x017b:
            java.lang.String r1 = "SHA256withDSA"
            r6 = 0
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x0192
        L_0x0183:
            r6 = 0
            java.lang.String r1 = "SHA512withECDSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x0192
        L_0x018b:
            r6 = 0
            java.lang.String r1 = "SHA256withECDSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
        L_0x0192:
            java.lang.Object r8 = r1.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r1.second
            java.security.spec.AlgorithmParameterSpec r1 = (java.security.spec.AlgorithmParameterSpec) r1
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            java.security.spec.X509EncodedKeySpec r10 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            r10.<init>(r2)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            java.security.PublicKey r4 = r4.generatePublic(r10)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            java.security.Signature r10 = java.security.Signature.getInstance(r8)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            r10.initVerify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            if (r1 == 0) goto L_0x01b3
            r10.setParameter(r1)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
        L_0x01b3:
            r10.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            boolean r1 = r10.verify(r7)     // Catch:{ NoSuchAlgorithmException -> 0x02c6, InvalidKeySpecException -> 0x02c4, InvalidKeyException -> 0x02c2, InvalidAlgorithmParameterException -> 0x02c0, SignatureException -> 0x02be }
            if (r1 == 0) goto L_0x02ae
            r0.clear()
            java.nio.ByteBuffer r1 = e(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 0
        L_0x01c9:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L_0x0205
            int r7 = r7 + r13
            java.nio.ByteBuffer r8 = e(r1)     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            int r10 = r8.remaining()     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            if (r10 < r9) goto L_0x01ec
            int r10 = r8.getInt()     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            r4.add(r11)     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            if (r10 != r5) goto L_0x01c9
            byte[] r6 = p(r8)     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            goto L_0x01c9
        L_0x01ec:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
            throw r0     // Catch:{ IOException -> 0x01f6, BufferUnderflowException -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f7
        L_0x01f6:
            r0 = move-exception
        L_0x01f7:
            java.io.IOException r1 = new java.io.IOException
            r2 = 42
            java.lang.String r3 = "Failed to parse digest record #"
            java.lang.String r2 = l0.d.a(r2, r3, r7)
            r1.<init>(r2, r0)
            throw r1
        L_0x0205:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x02a6
            int r1 = a(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r21
            java.lang.Object r3 = r4.put(r3, r6)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x0234
            boolean r3 = java.security.MessageDigest.isEqual(r3, r6)
            if (r3 == 0) goto L_0x0224
            goto L_0x0234
        L_0x0224:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = o(r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x0234:
            java.nio.ByteBuffer r0 = e(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x023e:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L_0x026e
            int r3 = r3 + r13
            byte[] r4 = p(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x025f }
            r5.<init>(r4)     // Catch:{ CertificateException -> 0x025f }
            r6 = r22
            java.security.cert.Certificate r5 = r6.generateCertificate(r5)     // Catch:{ CertificateException -> 0x025f }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x025f }
            com.google.android.gms.internal.ads.vr r7 = new com.google.android.gms.internal.ads.vr
            r7.<init>(r5, r4)
            r1.add(r7)
            goto L_0x023e
        L_0x025f:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 41
            java.lang.String r4 = "Failed to decode certificate #"
            java.lang.String r2 = l0.d.a(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x026e:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x029e
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x0296
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L_0x0296:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L_0x029e:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L_0x02a6:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L_0x02ae:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x02be:
            r0 = move-exception
            goto L_0x02c7
        L_0x02c0:
            r0 = move-exception
            goto L_0x02c7
        L_0x02c2:
            r0 = move-exception
            goto L_0x02c7
        L_0x02c4:
            r0 = move-exception
            goto L_0x02c7
        L_0x02c6:
            r0 = move-exception
        L_0x02c7:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 27
            int r2 = androidx.appcompat.widget.o.a(r8, r2)
            java.lang.String r3 = "Failed to verify "
            java.lang.String r4 = " signature"
            java.lang.String r2 = e.g.a(r2, r3, r8, r4)
            r1.<init>(r2, r0)
            goto L_0x02dc
        L_0x02db:
            throw r1
        L_0x02dc:
            goto L_0x02db
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g7.i(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static byte[][] j(int[] iArr, y9[] y9VarArr) throws DigestException {
        int[] iArr2 = iArr;
        y9[] y9VarArr2 = y9VarArr;
        long j10 = 0;
        long j11 = 0;
        for (y9 size : y9VarArr2) {
            j11 += ((size.size() + 1048576) - 1) / 1048576;
        }
        if (j11 < 2097151) {
            int i10 = (int) j11;
            byte[][] bArr = new byte[iArr2.length][];
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                byte[] bArr2 = new byte[((q(iArr2[i11]) * i10) + 5)];
                bArr2[0] = 90;
                g(i10, bArr2);
                bArr[i11] = bArr2;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            int length = iArr2.length;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i12 = 0;
            while (i12 < iArr2.length) {
                String o10 = o(iArr2[i12]);
                try {
                    messageDigestArr[i12] = MessageDigest.getInstance(o10);
                    i12++;
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(o10.concat(" digest not supported"), e10);
                }
            }
            int length2 = y9VarArr2.length;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length2) {
                y9 y9Var = y9VarArr2[i13];
                int i16 = length2;
                int i17 = i13;
                long size2 = y9Var.size();
                long j12 = j10;
                while (size2 > j10) {
                    int min = (int) Math.min(size2, 1048576);
                    g(min, bArr3);
                    int i18 = 0;
                    while (i18 < length) {
                        messageDigestArr[i18].update(bArr3);
                        i18++;
                        y9[] y9VarArr3 = y9VarArr;
                    }
                    try {
                        y9Var.b(messageDigestArr, j12, min);
                        int i19 = 0;
                        while (i19 < iArr2.length) {
                            int i20 = iArr2[i19];
                            byte[] bArr4 = bArr3;
                            byte[] bArr5 = bArr[i19];
                            int q10 = q(i20);
                            int i21 = length;
                            MessageDigest messageDigest = messageDigestArr[i19];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i15 * q10) + 5, q10);
                            if (digest == q10) {
                                i19++;
                                bArr3 = bArr4;
                                length = i21;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb2 = new StringBuilder(o.a(algorithm, 46));
                                sb2.append("Unexpected output size of ");
                                sb2.append(algorithm);
                                sb2.append(" digest: ");
                                sb2.append(digest);
                                throw new RuntimeException(sb2.toString());
                            }
                        }
                        int i22 = length;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j13 = (long) min;
                        j12 += j13;
                        size2 -= j13;
                        i15++;
                        j10 = 0;
                        y9[] y9VarArr4 = y9VarArr;
                        bArr3 = bArr3;
                    } catch (IOException e11) {
                        throw new DigestException(y9.a(59, "Failed to digest chunk #", i15, " of section #", i14), e11);
                    }
                }
                byte[] bArr6 = bArr3;
                int i23 = length;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                i14++;
                i13 = i17 + 1;
                j10 = 0;
                y9VarArr2 = y9VarArr;
                length2 = i16;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i24 = 0;
            while (i24 < iArr2.length) {
                int i25 = iArr2[i24];
                byte[] bArr8 = bArr[i24];
                String o11 = o(i25);
                try {
                    bArr7[i24] = MessageDigest.getInstance(o11).digest(bArr8);
                    i24++;
                } catch (NoSuchAlgorithmException e12) {
                    throw new RuntimeException(o11.concat(" digest not supported"), e12);
                }
            }
            return bArr7;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j11);
        throw new DigestException(sb3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[Catch:{ all -> 0x0279 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029d A[Catch:{ all -> 0x0279 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate[][] k(java.lang.String r20) throws e8.qb0, java.lang.SecurityException, java.io.IOException {
        /*
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r0 = "r"
            r2 = r20
            r1.<init>(r2, r0)
            long r2 = r1.length()     // Catch:{ all -> 0x0279 }
            r4 = 22
            r0 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0016
            r2 = 0
            goto L_0x0024
        L_0x0016:
            android.util.Pair r2 = com.google.android.gms.internal.ads.xs.c(r1, r0)     // Catch:{ all -> 0x0279 }
            if (r2 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            r2 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r2 = com.google.android.gms.internal.ads.xs.c(r1, r2)     // Catch:{ all -> 0x0279 }
        L_0x0024:
            if (r2 == 0) goto L_0x02a5
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0279 }
            r12 = r3
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12     // Catch:{ all -> 0x0279 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0279 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0279 }
            long r10 = r2.longValue()     // Catch:{ all -> 0x0279 }
            r2 = 20
            long r2 = r10 - r2
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x004b
            r1.seek(r2)     // Catch:{ all -> 0x0279 }
            int r2 = r1.readInt()     // Catch:{ all -> 0x0279 }
            r3 = 1347094023(0x504b0607, float:1.36246794E10)
            if (r2 != r3) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 != 0) goto L_0x029d
            com.google.android.gms.internal.ads.xs.d(r12)     // Catch:{ all -> 0x0279 }
            int r2 = r12.position()     // Catch:{ all -> 0x0279 }
            r3 = 16
            int r2 = r2 + r3
            int r2 = r12.getInt(r2)     // Catch:{ all -> 0x0279 }
            long r7 = (long) r2     // Catch:{ all -> 0x0279 }
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r7 & r13
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x027b
            com.google.android.gms.internal.ads.xs.d(r12)     // Catch:{ all -> 0x0279 }
            int r2 = r12.position()     // Catch:{ all -> 0x0279 }
            int r2 = r2 + 12
            int r2 = r12.getInt(r2)     // Catch:{ all -> 0x0279 }
            long r6 = (long) r2     // Catch:{ all -> 0x0279 }
            long r6 = r6 & r13
            long r6 = r6 + r4
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0271
            r6 = 32
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0257
            r2 = 24
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ all -> 0x0279 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0279 }
            r6.order(r7)     // Catch:{ all -> 0x0279 }
            int r8 = r6.capacity()     // Catch:{ all -> 0x0279 }
            long r8 = (long) r8     // Catch:{ all -> 0x0279 }
            long r8 = r4 - r8
            r1.seek(r8)     // Catch:{ all -> 0x0279 }
            byte[] r8 = r6.array()     // Catch:{ all -> 0x0279 }
            int r9 = r6.arrayOffset()     // Catch:{ all -> 0x0279 }
            int r13 = r6.capacity()     // Catch:{ all -> 0x0279 }
            r1.readFully(r8, r9, r13)     // Catch:{ all -> 0x0279 }
            r8 = 8
            long r13 = r6.getLong(r8)     // Catch:{ all -> 0x0279 }
            r17 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r9 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r9 != 0) goto L_0x024f
            long r13 = r6.getLong(r3)     // Catch:{ all -> 0x0279 }
            r17 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x024f
            long r13 = r6.getLong(r0)     // Catch:{ all -> 0x0279 }
            int r3 = r6.capacity()     // Catch:{ all -> 0x0279 }
            long r8 = (long) r3     // Catch:{ all -> 0x0279 }
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0236
            r8 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0236
            r8 = 8
            long r8 = r8 + r13
            int r3 = (int) r8     // Catch:{ all -> 0x0279 }
            long r8 = (long) r3     // Catch:{ all -> 0x0279 }
            long r8 = r4 - r8
            r15 = 0
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r17 < 0) goto L_0x021d
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x0279 }
            r3.order(r7)     // Catch:{ all -> 0x0279 }
            r1.seek(r8)     // Catch:{ all -> 0x0279 }
            byte[] r15 = r3.array()     // Catch:{ all -> 0x0279 }
            int r6 = r3.arrayOffset()     // Catch:{ all -> 0x0279 }
            int r2 = r3.capacity()     // Catch:{ all -> 0x0279 }
            r1.readFully(r15, r6, r2)     // Catch:{ all -> 0x0279 }
            r18 = r4
            long r4 = r3.getLong(r0)     // Catch:{ all -> 0x0279 }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x01fc
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0279 }
            android.util.Pair r2 = android.util.Pair.create(r3, r2)     // Catch:{ all -> 0x0279 }
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0279 }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ all -> 0x0279 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0279 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0279 }
            long r8 = r2.longValue()     // Catch:{ all -> 0x0279 }
            java.nio.ByteOrder r2 = r3.order()     // Catch:{ all -> 0x0279 }
            if (r2 != r7) goto L_0x01f4
            int r2 = r3.capacity()     // Catch:{ all -> 0x0279 }
            r4 = 24
            int r2 = r2 - r4
            java.nio.ByteBuffer r2 = m(r3, r2)     // Catch:{ all -> 0x0279 }
        L_0x012b:
            boolean r3 = r2.hasRemaining()     // Catch:{ all -> 0x0279 }
            if (r3 == 0) goto L_0x01ec
            r3 = 1
            int r0 = r0 + r3
            int r4 = r2.remaining()     // Catch:{ all -> 0x0279 }
            r5 = 8
            if (r4 < r5) goto L_0x01d3
            long r6 = r2.getLong()     // Catch:{ all -> 0x0279 }
            r13 = 4
            java.lang.String r4 = " size out of range: "
            java.lang.String r15 = "APK Signing Block entry #"
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 < 0) goto L_0x01b6
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 > 0) goto L_0x01b6
            int r7 = (int) r6
            int r6 = r2.position()     // Catch:{ all -> 0x0279 }
            int r6 = r6 + r7
            int r13 = r2.remaining()     // Catch:{ all -> 0x0279 }
            if (r7 > r13) goto L_0x018d
            int r4 = r2.getInt()     // Catch:{ all -> 0x0279 }
            r13 = 1896449818(0x7109871a, float:6.810044E29)
            if (r4 != r13) goto L_0x0185
            int r7 = r7 + -4
            java.nio.ByteBuffer r5 = f(r2, r7)     // Catch:{ all -> 0x0279 }
            e8.v50 r0 = new e8.v50     // Catch:{ all -> 0x0279 }
            r13 = 0
            r14 = r18
            r4 = r0
            r6 = r8
            r8 = r14
            r4.<init>(r5, r6, r8, r10, r12, r13)     // Catch:{ all -> 0x0279 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ all -> 0x0279 }
            java.security.cert.X509Certificate[][] r0 = l(r2, r0)     // Catch:{ all -> 0x0279 }
            r1.close()     // Catch:{ all -> 0x0279 }
            r1.close()     // Catch:{ IOException -> 0x0184 }
        L_0x0184:
            return r0
        L_0x0185:
            r14 = r18
            r2.position(r6)     // Catch:{ all -> 0x0279 }
            r18 = r14
            goto L_0x012b
        L_0x018d:
            e8.qb0 r3 = new e8.qb0     // Catch:{ all -> 0x0279 }
            int r2 = r2.remaining()     // Catch:{ all -> 0x0279 }
            r5 = 91
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r6.<init>(r5)     // Catch:{ all -> 0x0279 }
            r6.append(r15)     // Catch:{ all -> 0x0279 }
            r6.append(r0)     // Catch:{ all -> 0x0279 }
            r6.append(r4)     // Catch:{ all -> 0x0279 }
            r6.append(r7)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = ", available: "
            r6.append(r0)     // Catch:{ all -> 0x0279 }
            r6.append(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0279 }
            r3.<init>(r0)     // Catch:{ all -> 0x0279 }
            throw r3     // Catch:{ all -> 0x0279 }
        L_0x01b6:
            e8.qb0 r2 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r3 = 76
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r5.<init>(r3)     // Catch:{ all -> 0x0279 }
            r5.append(r15)     // Catch:{ all -> 0x0279 }
            r5.append(r0)     // Catch:{ all -> 0x0279 }
            r5.append(r4)     // Catch:{ all -> 0x0279 }
            r5.append(r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0279 }
            r2.<init>(r0)     // Catch:{ all -> 0x0279 }
            throw r2     // Catch:{ all -> 0x0279 }
        L_0x01d3:
            e8.qb0 r2 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r3 = 70
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r4.<init>(r3)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = "Insufficient data to read size of APK Signing Block entry #"
            r4.append(r3)     // Catch:{ all -> 0x0279 }
            r4.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0279 }
            r2.<init>(r0)     // Catch:{ all -> 0x0279 }
            throw r2     // Catch:{ all -> 0x0279 }
        L_0x01ec:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "No APK Signature Scheme v2 block in APK Signing Block"
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x01f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "ByteBuffer byte order must be little endian"
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x01fc:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r2 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "APK Signing Block sizes in header and footer do not match: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = " vs "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r13)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x021d:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r2 = 59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "APK Signing Block offset out of range: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r8)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0236:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r2 = 57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "APK Signing Block size out of range: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r13)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x024f:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "No APK Signing Block before ZIP Central Directory"
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0257:
            r14 = r4
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r2 = 87
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r14)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0271:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0279:
            r0 = move-exception
            goto L_0x02c7
        L_0x027b:
            r14 = r4
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            r2 = 122(0x7a, float:1.71E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "ZIP Central Directory offset out of range: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r14)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = ". ZIP End of Central Directory offset: "
            r3.append(r2)     // Catch:{ all -> 0x0279 }
            r3.append(r10)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x029d:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "ZIP64 APK not supported"
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x02a5:
            e8.qb0 r0 = new e8.qb0     // Catch:{ all -> 0x0279 }
            long r2 = r1.length()     // Catch:{ all -> 0x0279 }
            r4 = 102(0x66, float:1.43E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r5.<init>(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = "Not an APK file: ZIP End of Central Directory record not found in file with "
            r5.append(r4)     // Catch:{ all -> 0x0279 }
            r5.append(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = " bytes"
            r5.append(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0279 }
            r0.<init>(r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x02c7:
            r1.close()     // Catch:{ IOException -> 0x02ca }
        L_0x02ca:
            goto L_0x02cc
        L_0x02cb:
            throw r0
        L_0x02cc:
            goto L_0x02cb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g7.k(java.lang.String):java.security.cert.X509Certificate[][]");
    }

    public static X509Certificate[][] l(FileChannel fileChannel, v50 v50) throws SecurityException {
        v50 v502 = v50;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer e10 = e(v502.f17022a);
                int i10 = 0;
                int i11 = 0;
                while (e10.hasRemaining()) {
                    i11++;
                    try {
                        arrayList.add(i(e(e10), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e11) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("Failed to parse/verify signer #");
                        sb2.append(i11);
                        sb2.append(" block");
                        throw new SecurityException(sb2.toString(), e11);
                    }
                }
                if (i11 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    long j10 = v502.f17023b;
                    long j11 = v502.f17024c;
                    long j12 = v502.f17025d;
                    ByteBuffer byteBuffer = v502.f17026e;
                    if (!hashMap.isEmpty()) {
                        FileChannel fileChannel2 = fileChannel;
                        gr grVar = new gr(fileChannel2, 0, j10);
                        gr grVar2 = new gr(fileChannel2, j11, j12 - j11);
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        xs.d(duplicate);
                        int position = duplicate.position() + 16;
                        if (j10 < 0 || j10 > 4294967295L) {
                            StringBuilder sb3 = new StringBuilder(47);
                            sb3.append("uint32 value of out range: ");
                            sb3.append(j10);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        duplicate.putInt(duplicate.position() + position, (int) j10);
                        g2 g2Var = new g2(duplicate);
                        int size = hashMap.size();
                        int[] iArr = new int[size];
                        int i12 = 0;
                        for (Integer intValue : hashMap.keySet()) {
                            iArr[i12] = intValue.intValue();
                            i12++;
                        }
                        try {
                            byte[][] j13 = j(iArr, new y9[]{grVar, grVar2, g2Var});
                            while (i10 < size) {
                                int i13 = iArr[i10];
                                if (MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i13)), j13[i10])) {
                                    i10++;
                                } else {
                                    throw new SecurityException(o(i13).concat(" digest of contents did not verify"));
                                }
                            }
                            return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                        } catch (DigestException e12) {
                            throw new SecurityException("Failed to compute digest(s) of contents", e12);
                        }
                    } else {
                        throw new SecurityException("No digests provided");
                    }
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e13) {
                throw new SecurityException("Failed to read list of signers", e13);
            }
        } catch (CertificateException e14) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e14);
        }
    }

    /* JADX INFO: finally extract failed */
    public static ByteBuffer m(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i10 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i10);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(y9.a(41, "end > capacity: ", i10, " > ", capacity));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("end < start: ");
            sb2.append(i10);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static li0 n(Context context, List<pe> list) {
        ArrayList arrayList = new ArrayList();
        for (pe next : list) {
            if (next.f7856c) {
                arrayList.add(y6.d.f28117m);
            } else {
                arrayList.add(new y6.d(next.f7854a, next.f7855b));
            }
        }
        return new li0(context, (y6.d[]) arrayList.toArray(new y6.d[arrayList.size()]));
    }

    public static String o(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(d.a(44, "Unknown content digest algorthm: ", i10));
    }

    public static byte[] p(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        } else if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            throw new IOException(y9.a(90, "Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
    }

    public static int q(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(d.a(44, "Unknown content digest algorthm: ", i10));
    }

    public static int r(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    public static pe s(li0 li0) {
        if (li0.f15402i) {
            return new pe(-3, 0, true);
        }
        return new pe(li0.f15398e, li0.f15395b, false);
    }

    public static int t(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
