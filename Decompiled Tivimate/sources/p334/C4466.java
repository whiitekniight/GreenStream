package p334;

import android.app.Notification;

/* JADX INFO: renamed from: ᴵˋ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4466 {

    /* JADX INFO: renamed from: ʽ */
    public final Notification f16291;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f16292;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f16293;

    public C4466(int r1, Notification r2, int r3) {
        this.f16293 = r1;
        this.f16291 = r2;
        this.f16292 = r3;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L8;
    L18:
        return false;
    L8:
        if (C4466.class != r4.getClass()) goto L18;
        C4466 r42 = (C4466) r4;
        if (this.f16293 == r42.f16293) goto L14;
        return false;
    L14:
        if (this.f16292 == r42.f16292) goto L17;
        return false;
    L17:
        return this.f16291.equals(r42.f16291);
    }

    public final int hashCode() {
        int r0 = ((this.f16293 * 31) + this.f16292) * 31;
        return this.f16291.hashCode() + r0;
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16293 + ", mForegroundServiceType=" + this.f16292 + ", mNotification=" + this.f16291 + '}';
    }
}
