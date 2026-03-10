package p334;

import android.net.Uri;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ᴵˋ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4443 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f16213;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Uri f16214;

    public C4443(Uri r1, boolean r2) {
        this.f16214 = r1;
        this.f16213 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (C4443.class.equals(r1) == true) goto L11;
        return false;
    L11:
        C4443 r52 = (C4443) r5;
        if (AbstractC2927.m6273(this.f16214, r52.f16214) == true) goto L15;
        return false;
    L15:
        if (this.f16213 == r52.f16213) goto L17;
        return false;
    L17:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final int hashCode() {
        int r0 = this.f16214.hashCode() * 31;
        if (this.f16213 == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 + r1;
    L5:
        r1 = 1237;
        goto L7
    }
}
