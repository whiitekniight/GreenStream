package p171;

import android.support.v4.media.session.ⁱˊ;
import p046.InterfaceC1678;
import p429.InterfaceC5413;

/* JADX INFO: renamed from: ˊˎ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3028 implements InterfaceC5413 {

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f10592;

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC1678 f10593;

    /* JADX INFO: renamed from: ᴵˊ */
    public final String f10594;

    public AbstractC3028(InterfaceC1678 r1, String r2) {
        this.f10593 = r1;
        this.f10594 = r2;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ʼˈ */
    public final boolean mo4101() {
        if (getLong(0) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6410() {
        if (this.f10592 == true) goto L5;
        return;
    L5:
        ⁱˊ.ʻٴ(21, "statement is closed");
        throw null;
    }
}
