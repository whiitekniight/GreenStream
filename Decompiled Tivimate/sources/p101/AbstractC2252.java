package p101;

import java.util.Arrays;
import p025.C1390;
import p138.InterfaceC2619;

/* JADX INFO: renamed from: ʿᵔ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2252 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f8096;

    /* JADX INFO: renamed from: ʾˋ */
    public AbstractC2240[] f8097;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f8098;

    /* JADX INFO: renamed from: ˈ */
    public final AbstractC2240 m5439() {
        monitor-enter(this);
        AbstractC2240[] r0 = this.f8097;     // Catch: Throwable -> L6
        if (r0 != null) goto L9;
        r0 = mo5442();     // Catch: Throwable -> L6
        this.f8097 = r0;     // Catch: Throwable -> L6
    L11:
        int r1 = this.f8096;     // Catch: Throwable -> L6
    L12:
        AbstractC2240 r2 = r0[r1];     // Catch: Throwable -> L6
        if (r2 != null) goto L15;
        r2 = mo5440();     // Catch: Throwable -> L6
        r0[r1] = r2;     // Catch: Throwable -> L6
    L15:
        r1 = r1 + 1;     // Catch: Throwable -> L6
        if (r1 < r0.length) goto L19;
        r1 = 0;
    L19:
        if (r2.mo5428(this) == false) goto L12;
        this.f8096 = r1;     // Catch: Throwable -> L6
        this.f8098++;
        monitor-exit(this);
        return r2;
    L9:
        if (this.f8098 < r0.length) goto L11;
        Object[] r02 = Arrays.copyOf(r0, r0.length * 2);     // Catch: Throwable -> L6
        this.f8097 = (AbstractC2240[]) r02;     // Catch: Throwable -> L6
        r0 = (AbstractC2240[]) r02;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract AbstractC2240 mo5440();

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m5441(AbstractC2240 r5) {
        monitor-enter(this);
        int r0 = this.f8098 - 1;
        this.f8098 = r0;     // Catch: Throwable -> L6
        int r1 = 0;
        if (r0 != 0) goto L8;
        this.f8096 = 0;     // Catch: Throwable -> L6
    L8:
        InterfaceC2619[] r52 = r5.mo5427(this);     // Catch: Throwable -> L6
        monitor-exit(this);
        int r02 = r52.length;
    L11:
        if (r1 >= r02) goto L16;
        InterfaceC2619 r2 = r52[r1];
        if (r2 == null) goto L15;
        r2.mo4260(C1390.f4774);
    L15:
        r1 = r1 + 1;
        goto L11
    L16:
        return;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract AbstractC2240[] mo5442();
}
