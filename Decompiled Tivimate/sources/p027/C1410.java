package p027;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʻﹶ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1410 implements InterfaceC1409 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final LinkedHashMap f4790;

    public C1410(X509Certificate... r7) {
        LinkedHashMap r0 = new LinkedHashMap();
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        X509Certificate r3 = r7[r2];
        X500Principal r4 = r3.getSubjectX500Principal();
        Object r5 = r0.get(r4);
        if (r5 != null) goto L7;
        r5 = new LinkedHashSet();
        r0.put(r4, r5);
    L7:
        ((Set) r5).add(r3);
        r2 = r2 + 1;
        goto L3
    L8:
        this.f4790 = r0;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof C1410) == true) goto L6;
        return false;
    L6:
        if (AbstractC2927.m6273(((C1410) r2).f4790, this.f4790) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public final int hashCode() {
        return this.f4790.hashCode();
    }

    @Override // p027.InterfaceC1409
    /* JADX INFO: renamed from: ﹳٴ */
    public final X509Certificate mo3903(X509Certificate r5) {
        X500Principal r0 = r5.getIssuerX500Principal();
        Set r02 = (Set) this.f4790.get(r0);
        Object r1 = null;
        if (r02 != null) goto L5;
        return null;
    L5:
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L12;
        Object r2 = r03.next();
        r5.verify(((X509Certificate) r2).getPublicKey());     // Catch: Exception -> L13
        r1 = r2;
    L12:
        return (X509Certificate) r1;
    }
}
