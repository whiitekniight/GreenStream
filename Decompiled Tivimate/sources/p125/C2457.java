package p125;

import android.net.NetworkRequest;
import p164.AbstractC2927;
import p334.C4448;

/* JADX INFO: renamed from: ˆﹶ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2457 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final String f8771 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f8772;

    static {
        f8771 = C4448.m8843("NetworkRequestCompat");
    }

    public C2457(NetworkRequest r1) {
        this.f8772 = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2457) == true) goto L9;
        return false;
    L9:
        if (AbstractC2927.m6273(this.f8772, ((C2457) r4).f8772) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.f8772;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f8772 + ')';
    }
}
