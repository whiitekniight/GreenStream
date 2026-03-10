package p025;

import java.io.Serializable;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʻᵢ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1405 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Throwable f4788;

    public C1405(Throwable r1) {
        this.f4788 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1405) == false) goto L8;
        Throwable r22 = ((C1405) r2).f4788;
        if (AbstractC2927.m6273(this.f4788, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f4788.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4788 + ')';
    }
}
