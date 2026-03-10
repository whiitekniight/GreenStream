package p107;

import com.google.android.gms.internal.measurement.ᵎ;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: ˆʽ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 implements InterfaceC2365, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f8471;

    public C2367(Object r1) {
        this.f8471 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2367) == true) goto L5;
        return false;
    L5:
        return ᵎ.ᵎﹶ(this.f8471, ((C2367) r2).f8471);
    }

    @Override // p107.InterfaceC2365
    public final Object get() {
        return this.f8471;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8471});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f8471 + ")";
    }
}
