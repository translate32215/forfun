package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class vr extends X509Certificate {

    /* renamed from: a  reason: collision with root package name */
    public final X509Certificate f8385a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f8386b;

    public vr(X509Certificate x509Certificate, byte[] bArr) {
        this.f8385a = x509Certificate;
        this.f8386b = bArr;
    }

    public void checkValidity() {
        this.f8385a.checkValidity();
    }

    public int getBasicConstraints() {
        return this.f8385a.getBasicConstraints();
    }

    public Set getCriticalExtensionOIDs() {
        return this.f8385a.getCriticalExtensionOIDs();
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f8386b;
    }

    public byte[] getExtensionValue(String str) {
        return this.f8385a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f8385a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f8385a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f8385a.getKeyUsage();
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.f8385a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f8385a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f8385a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f8385a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f8385a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f8385a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f8385a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f8385a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f8385a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f8385a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f8385a.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() {
        return this.f8385a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f8385a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f8385a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f8385a.toString();
    }

    public void verify(PublicKey publicKey) {
        this.f8385a.verify(publicKey);
    }

    public void checkValidity(Date date) {
        this.f8385a.checkValidity(date);
    }

    public void verify(PublicKey publicKey, String str) {
        this.f8385a.verify(publicKey, str);
    }
}
