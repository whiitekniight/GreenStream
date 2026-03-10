package androidx.fragment.app.strictmode;

import p241.AbstractComponentCallbacksC3606;

/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractComponentCallbacksC3606 f526;

    public Violation(AbstractComponentCallbacksC3606 r1, String r2) {
        super(r2);
        this.f526 = r1;
    }
}
