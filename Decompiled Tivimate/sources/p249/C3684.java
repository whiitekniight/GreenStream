package p249;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p115.InterfaceC2401;
import p158.C2892;
import ʻٴ.ˑﹳ;
import ʽⁱ.ᵎﹶ;

/* JADX INFO: renamed from: ˑי.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3684 {

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final ˑﹳ f13189 = null;

    /* JADX INFO: renamed from: ʽ */
    public final ᵎﹶ f13190;

    /* JADX INFO: renamed from: ˈ */
    public final ʽ f13191;

    /* JADX INFO: renamed from: ˑﹳ */
    public final CopyOnWriteArrayList f13192;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2892 f13193;

    /* JADX INFO: renamed from: ﹳٴ */
    public final UUID f13194;

    static {
        f13189 = new ˑﹳ(9);
    }

    public C3684(ʽ r2, InterfaceC2401 r3, C2892 r4) {
        this.f13194 = UUID.randomUUID();
        this.f13192 = new CopyOnWriteArrayList();
        this.f13191 = r2;
        this.f13190 = (ᵎﹶ) r3;
        this.f13193 = r4;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7752(AutoCloseable r4) {
        this.f13193.add(r4);
        int r42 = 0;
        CopyOnWriteArrayList r1 = this.f13192;
        Runnable[] r0 = (Runnable[]) r1.toArray(new Runnable[0]);
        int r12 = r0.length;
    L3:
        if (r42 >= r12) goto L5;
        r0[r42].run();
        r42 = r42 + 1;
        goto L3
    }
}
