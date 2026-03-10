package p336;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ᴵי.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4504 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16343 = null;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC4481[] f16344;

    static {
        f16343 = AtomicIntegerFieldUpdater.newUpdater(C4504.class, "notCompletedCount$volatile");
    }

    public C4504(InterfaceC4481[] r1) {
        this.f16344 = r1;
        this.notCompletedCount$volatile = r1.length;
    }
}
