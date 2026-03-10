package p336;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ᴵי.יـ */
/* JADX INFO: loaded from: classes.dex */
public class C4505 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16345 = null;
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Throwable f16346;

    static {
        f16345 = AtomicIntegerFieldUpdater.newUpdater(C4505.class, "_handled$volatile");
    }

    public C4505(Throwable r1, boolean r2) {
        this.f16346 = r1;
        this._handled$volatile = r2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f16346 + ']';
    }
}
