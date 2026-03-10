package p025;

import java.io.Serializable;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ʻᵢ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1401 implements InterfaceC1391, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public InterfaceC4587 f4784;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f4785;

    @Override // p025.InterfaceC1391
    public final Object getValue() {
        if (this.f4785 != C1399.f4780) goto L6;
        this.f4785 = this.f4784.mo716();
        this.f4784 = null;
    L6:
        return this.f4785;
    }

    public final String toString() {
        if (this.f4785 != C1399.f4780) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
