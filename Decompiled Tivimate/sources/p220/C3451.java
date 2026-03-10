package p220;

import p164.AbstractC2927;
import p447.C5623;

/* JADX INFO: renamed from: ˎᵢ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C3451 {

    /* JADX INFO: renamed from: ˈ */
    public static final C5623 f12283 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C5623 f12284 = null;

    /* JADX INFO: renamed from: ʽ */
    public final String[] f12285;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f12286;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f12287;

    static {
        f12283 = new C5623("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        f12284 = new C5623(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    public C3451(String r1, String r2, String[] r3) {
        this.f12287 = r1;
        this.f12286 = r2;
        this.f12285 = r3;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C3451) == true) goto L5;
        return false;
    L5:
        if (AbstractC2927.m6273(((C3451) r2).f12287, this.f12287) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.f12287.hashCode();
    }

    public final String toString() {
        return this.f12287;
    }
}
