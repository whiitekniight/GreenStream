package p030;

import java.util.ArrayList;

/* JADX INFO: renamed from: ʼʼ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public class C1500 extends C1506 {

    /* JADX INFO: renamed from: ˉʿ */
    public int f4969;

    public C1500(AbstractC1497 r1) {
        super(r1);
        if ((r1 instanceof C1499) == false) goto L6;
        this.f4993 = 2;
        return;
    L6:
        this.f4993 = 3;
    }

    @Override // p030.C1506
    /* JADX INFO: renamed from: ˈ */
    public final void mo4040(int r4) {
        if (this.f4991 == true) goto L8;
        this.f4991 = true;
        this.f4995 = r4;
        ArrayList r42 = this.f4994;
        int r0 = r42.size();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L10;
        Object r2 = r42.get(r1);
        r1 = r1 + 1;
        InterfaceC1495 r22 = (InterfaceC1495) r2;
        r22.mo4018(r22);
        goto L6
    L10:
        return;
    }
}
