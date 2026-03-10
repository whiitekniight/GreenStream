package p043;

import android.text.TextUtils;
import p047.AbstractC1703;
import ᵎˉ.ⁱˊ;

/* JADX INFO: renamed from: ʼᵔ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1626 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final ⁱˊ f5346 = null;

    /* JADX INFO: renamed from: ʽ */
    public final String f5347;

    /* JADX INFO: renamed from: ˈ */
    public volatile byte[] f5348;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC1631 f5349;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f5350;

    static {
        f5346 = new ⁱˊ();
    }

    public C1626(String r2, Object r3, InterfaceC1631 r4) {
        if (TextUtils.isEmpty(r2) == true) goto L7;
        this.f5347 = r2;
        this.f5350 = r3;
        this.f5349 = r4;
        return;
    L7:
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1626 m4287(Object r2, String r3) {
        return new C1626(r3, r2, f5346);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1626) == true) goto L5;
        return false;
    L5:
        return this.f5347.equals(((C1626) r2).f5347);
    }

    public final int hashCode() {
        return this.f5347.hashCode();
    }

    public final String toString() {
        return AbstractC1703.m4486(new StringBuilder("Option{key='"), this.f5347, "'}");
    }
}
