package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bm;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.pl;
import e.f;
import e8.b9;
import e8.gf0;
import e8.m60;
import e8.n60;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class so implements oi {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f8131f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final g2 f8132a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8133b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8134c;

    /* renamed from: d  reason: collision with root package name */
    public final xo f8135d;

    /* renamed from: e  reason: collision with root package name */
    public final m60 f8136e;

    public so(ECPublicKey eCPublicKey, byte[] bArr, String str, xo xoVar, m60 m60) throws GeneralSecurityException {
        uo.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f8132a = new g2(eCPublicKey);
        this.f8134c = bArr;
        this.f8133b = str;
        this.f8135d = xoVar;
        this.f8136e = m60;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        byte[] bArr3;
        byte[] doFinal;
        byte[] bArr4;
        mi miVar;
        byte[] bArr5;
        boolean z10;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        g2 g2Var = this.f8132a;
        String str = this.f8133b;
        byte[] bArr6 = this.f8134c;
        int i11 = ((wk) this.f8136e).f8470b;
        xo xoVar = this.f8135d;
        ECParameterSpec params = ((ECPublicKey) g2Var.f6511b).getParams();
        KeyPairGenerator a10 = zo.f8722h.a("EC");
        a10.initialize(params);
        KeyPair generateKeyPair = a10.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPublicKey eCPublicKey2 = (ECPublicKey) g2Var.f6511b;
        try {
            ECParameterSpec params2 = eCPublicKey2.getParams();
            ECParameterSpec params3 = eCPrivateKey.getParams();
            if (params2.getCurve().equals(params3.getCurve()) && params2.getGenerator().equals(params3.getGenerator()) && params2.getOrder().equals(params3.getOrder()) && params2.getCofactor() == params3.getCofactor()) {
                ECPoint w10 = eCPublicKey2.getW();
                uo.d(w10, eCPrivateKey.getParams().getCurve());
                PublicKey generatePublic = zo.f8723i.a("EC").generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
                KeyAgreement a11 = zo.f8721g.a("ECDH");
                a11.init(eCPrivateKey);
                try {
                    a11.doPhase(generatePublic, true);
                    byte[] generateSecret = a11.generateSecret();
                    EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger3 = new BigInteger(1, generateSecret);
                    if (bigInteger3.signum() == -1 || bigInteger3.compareTo(uo.a(curve)) >= 0) {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                    BigInteger a12 = uo.a(curve);
                    BigInteger mod = bigInteger3.multiply(bigInteger3).add(curve.getA()).multiply(bigInteger3).add(curve.getB()).mod(a12);
                    if (a12.signum() == 1) {
                        BigInteger mod2 = mod.mod(a12);
                        BigInteger bigInteger4 = BigInteger.ZERO;
                        if (!mod2.equals(bigInteger4)) {
                            if (a12.testBit(0) && a12.testBit(1)) {
                                bigInteger = mod2.modPow(a12.add(BigInteger.ONE).shiftRight(2), a12);
                            } else if (!a12.testBit(0) || a12.testBit(1)) {
                                bigInteger = null;
                            } else {
                                bigInteger4 = BigInteger.ONE;
                                BigInteger shiftRight = a12.subtract(bigInteger4).shiftRight(1);
                                int i12 = 0;
                                while (true) {
                                    BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(a12);
                                    if (mod3.equals(BigInteger.ZERO)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, a12);
                                    BigInteger bigInteger5 = BigInteger.ONE;
                                    if (modPow.add(bigInteger5).equals(a12)) {
                                        BigInteger shiftRight2 = a12.add(bigInteger5).shiftRight(1);
                                        int bitLength = shiftRight2.bitLength() - 2;
                                        BigInteger bigInteger6 = bigInteger4;
                                        while (bitLength >= 0) {
                                            BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                            bigInteger6 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(a12).multiply(mod3)).mod(a12);
                                            bigInteger5 = multiply.add(multiply).mod(a12);
                                            if (shiftRight2.testBit(bitLength)) {
                                                bigInteger2 = shiftRight2;
                                                BigInteger mod4 = bigInteger6.multiply(bigInteger4).add(bigInteger5.multiply(mod3)).mod(a12);
                                                bigInteger5 = bigInteger4.multiply(bigInteger5).add(bigInteger6).mod(a12);
                                                bigInteger6 = mod4;
                                            } else {
                                                bigInteger2 = shiftRight2;
                                            }
                                            bitLength--;
                                            shiftRight2 = bigInteger2;
                                        }
                                        bigInteger = bigInteger6;
                                    } else if (modPow.equals(bigInteger5)) {
                                        bigInteger4 = bigInteger4.add(bigInteger5);
                                        i12++;
                                        if (i12 == 128) {
                                            if (!a12.isProbablePrime(80)) {
                                                throw new InvalidAlgorithmParameterException("p is not prime");
                                            }
                                        }
                                    } else {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                }
                            }
                            if (bigInteger4 != null) {
                                if (bigInteger4.multiply(bigInteger4).mod(a12).compareTo(mod2) != 0) {
                                    throw new GeneralSecurityException("Could not find a modular square root");
                                }
                            }
                        }
                        if (true != bigInteger4.testBit(0)) {
                            a12.subtract(bigInteger4).mod(a12);
                        }
                        EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                        ECPoint w11 = eCPublicKey.getW();
                        uo.d(w11, curve2);
                        int bitLength2 = (uo.a(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                        int i13 = n60.f15595a[xoVar.ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                int i14 = 3;
                                if (i13 == 3) {
                                    int i15 = bitLength2 + 1;
                                    bArr3 = new byte[i15];
                                    byte[] byteArray = w11.getAffineX().toByteArray();
                                    System.arraycopy(byteArray, 0, bArr3, i15 - byteArray.length, byteArray.length);
                                    if (!w11.getAffineY().testBit(0)) {
                                        i14 = 2;
                                    }
                                    bArr3[0] = (byte) i14;
                                } else {
                                    String valueOf = String.valueOf(xoVar);
                                    throw new GeneralSecurityException(f.a(valueOf.length() + 15, "invalid format:", valueOf));
                                }
                            } else {
                                int i16 = bitLength2 * 2;
                                byte[] bArr7 = new byte[i16];
                                byte[] byteArray2 = w11.getAffineX().toByteArray();
                                if (byteArray2.length > bitLength2) {
                                    byteArray2 = Arrays.copyOfRange(byteArray2, byteArray2.length - bitLength2, byteArray2.length);
                                }
                                byte[] byteArray3 = w11.getAffineY().toByteArray();
                                if (byteArray3.length > bitLength2) {
                                    byteArray3 = Arrays.copyOfRange(byteArray3, byteArray3.length - bitLength2, byteArray3.length);
                                }
                                System.arraycopy(byteArray3, 0, bArr7, i16 - byteArray3.length, byteArray3.length);
                                System.arraycopy(byteArray2, 0, bArr7, bitLength2 - byteArray2.length, byteArray2.length);
                                bArr3 = bArr7;
                            }
                            i10 = 2;
                        } else {
                            int i17 = (bitLength2 * 2) + 1;
                            byte[] bArr8 = new byte[i17];
                            byte[] byteArray4 = w11.getAffineX().toByteArray();
                            byte[] byteArray5 = w11.getAffineY().toByteArray();
                            System.arraycopy(byteArray5, 0, bArr8, i17 - byteArray5.length, byteArray5.length);
                            System.arraycopy(byteArray4, 0, bArr8, (bitLength2 + 1) - byteArray4.length, byteArray4.length);
                            bArr8[0] = 4;
                            i10 = 2;
                            bArr3 = bArr8;
                        }
                        byte[][] bArr9 = new byte[i10][];
                        bArr9[0] = bArr3;
                        bArr9[1] = generateSecret;
                        byte[] d10 = g.d(bArr9);
                        Mac a13 = zo.f8720f.a(str);
                        if (i11 <= a13.getMacLength() * 255) {
                            if (bArr6 == null || bArr6.length == 0) {
                                a13.init(new SecretKeySpec(new byte[a13.getMacLength()], str));
                            } else {
                                a13.init(new SecretKeySpec(bArr6, str));
                            }
                            byte[] bArr10 = new byte[i11];
                            a13.init(new SecretKeySpec(a13.doFinal(d10), str));
                            byte[] bArr11 = new byte[0];
                            int i18 = 0;
                            int i19 = 1;
                            while (true) {
                                a13.update(bArr11);
                                a13.update(bArr2);
                                a13.update((byte) i19);
                                doFinal = a13.doFinal();
                                if (doFinal.length + i18 >= i11) {
                                    break;
                                }
                                System.arraycopy(doFinal, 0, bArr10, i18, doFinal.length);
                                i18 += doFinal.length;
                                i19++;
                                bArr11 = doFinal;
                            }
                            System.arraycopy(doFinal, 0, bArr10, i18, i11 - i18);
                            gf0 gf0 = new gf0(bArr3, bArr10);
                            m60 m60 = this.f8136e;
                            b9 b9Var = (b9) gf0.f14777c;
                            if (b9Var == null) {
                                bArr4 = null;
                            } else {
                                byte[] bArr12 = b9Var.f13905a;
                                byte[] bArr13 = new byte[bArr12.length];
                                System.arraycopy(bArr12, 0, bArr13, 0, bArr12.length);
                                bArr4 = bArr13;
                            }
                            wk wkVar = (wk) m60;
                            wkVar.getClass();
                            Class<mi> cls = mi.class;
                            if (bArr4.length == wkVar.f8470b) {
                                if (wkVar.f8469a.equals(jj.f7153b)) {
                                    bm.a C = bm.C();
                                    C.m(wkVar.f8471c);
                                    mp I = mp.I(bArr4, 0, wkVar.f8470b);
                                    if (C.f5971c) {
                                        C.n();
                                        C.f5971c = false;
                                    }
                                    bm.A((bm) C.f5970b, I);
                                    miVar = (mi) dj.c(wkVar.f8469a, (bm) ((aq) C.j()), cls);
                                } else if (wkVar.f8469a.equals(jj.f7152a)) {
                                    byte[] copyOfRange = Arrays.copyOfRange(bArr4, 0, wkVar.f8473e);
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, wkVar.f8473e, wkVar.f8470b);
                                    pl.a E = pl.E();
                                    E.m(wkVar.f8472d.C());
                                    mp L = mp.L(copyOfRange);
                                    if (E.f5971c) {
                                        E.n();
                                        E.f5971c = false;
                                    }
                                    pl.B((pl) E.f5970b, L);
                                    pl plVar = (pl) ((aq) E.j());
                                    dn.a E2 = dn.E();
                                    E2.m(wkVar.f8472d.D());
                                    mp L2 = mp.L(copyOfRange2);
                                    if (E2.f5971c) {
                                        E2.n();
                                        E2.f5971c = false;
                                    }
                                    dn.B((dn) E2.f5970b, L2);
                                    dn dnVar = (dn) ((aq) E2.j());
                                    ll.a E3 = ll.E();
                                    int y10 = wkVar.f8472d.y();
                                    if (E3.f5971c) {
                                        E3.n();
                                        z10 = false;
                                        E3.f5971c = false;
                                    } else {
                                        z10 = false;
                                    }
                                    ll.z((ll) E3.f5970b, y10);
                                    if (E3.f5971c) {
                                        E3.n();
                                        E3.f5971c = z10;
                                    }
                                    ll.A((ll) E3.f5970b, plVar);
                                    if (E3.f5971c) {
                                        E3.n();
                                        E3.f5971c = z10;
                                    }
                                    ll.B((ll) E3.f5970b, dnVar);
                                    miVar = (mi) dj.c(wkVar.f8469a, (ll) ((aq) E3.j()), cls);
                                } else {
                                    throw new GeneralSecurityException("unknown DEM key type");
                                }
                                byte[] a14 = miVar.a(bArr, f8131f);
                                b9 b9Var2 = (b9) gf0.f14776b;
                                if (b9Var2 == null) {
                                    bArr5 = null;
                                } else {
                                    byte[] bArr14 = b9Var2.f13905a;
                                    byte[] bArr15 = new byte[bArr14.length];
                                    System.arraycopy(bArr14, 0, bArr15, 0, bArr14.length);
                                    bArr5 = bArr15;
                                }
                                return ByteBuffer.allocate(bArr5.length + a14.length).put(bArr5).put(a14).array();
                            }
                            throw new GeneralSecurityException("Symmetric key has incorrect length");
                        }
                        throw new GeneralSecurityException("size too large");
                    }
                    throw new InvalidAlgorithmParameterException("p must be positive");
                } catch (IllegalStateException e10) {
                    throw new GeneralSecurityException(e10.toString());
                }
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e11) {
            throw new GeneralSecurityException(e11.toString());
        }
    }
}
