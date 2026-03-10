package p450;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p162.InterfaceC2900;
import p164.AbstractC2927;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ﹶٴ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C5657 implements InterfaceC2900, InterfaceC5663 {

    /* JADX INFO: renamed from: ʽ */
    public final Set f20422;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f20423;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC2900 f20424;

    public C5657(InterfaceC2900 r5) {
        this.f20424 = r5;
        this.f20423 = r5.mo6236() + '?';
        if ((r5 instanceof InterfaceC5663) == false) goto L5;
        Set r52 = ((InterfaceC5663) r5).mo10873();
    L9:
        this.f20422 = r52;
        return;
    L5:
        HashSet r0 = new HashSet(r5.mo6233());
        int r1 = r5.mo6233();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r0.add(r5.mo6234(r2));
        r2 = r2 + 1;
        goto L6
    L8:
        r52 = r0;
        goto L9
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C5657) == true) goto L8;
        return false;
    L8:
        InterfaceC2900 r42 = ((C5657) r4).f20424;
        if (AbstractC2927.m6273(this.f20424, r42) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p162.InterfaceC2900
    public final List getAnnotations() {
        return this.f20424.getAnnotations();
    }

    public final int hashCode() {
        return this.f20424.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f20424);
        r0.append('?');
        return r0.toString();
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ʼˎ */
    public final List mo6230(int r2) {
        return this.f20424.mo6230(r2);
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ʽ */
    public final ˊʻ mo6231() {
        return this.f20424.mo6231();
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ˆʾ */
    public final InterfaceC2900 mo6232(int r2) {
        return this.f20424.mo6232(r2);
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ˈ */
    public final int mo6233() {
        return this.f20424.mo6233();
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ˑﹳ */
    public final String mo6234(int r2) {
        return this.f20424.mo6234(r2);
    }

    @Override // p450.InterfaceC5663
    /* JADX INFO: renamed from: ᵎﹶ */
    public final Set mo10873() {
        return this.f20422;
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean mo6235() {
        return true;
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ⁱˊ */
    public final String mo6236() {
        return this.f20423;
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo6237(String r2) {
        return this.f20424.mo6237(r2);
    }

    @Override // p162.InterfaceC2900
    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean mo6238() {
        return this.f20424.mo6238();
    }
}
