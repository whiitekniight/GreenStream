package p163;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: ˊʻ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2914 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6257(Notification.Builder r1) {
        r1.setGroupAlertBehavior(0);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6258(Notification.Builder r1) {
        r1.setSettingsText(null);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m6259(Notification.Builder r1) {
        r1.setShortcutId(null);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m6260(Notification.Builder r1) {
        r1.setBadgeIconType(0);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Notification.Builder m6261(Context r1, String r2) {
        return new Notification.Builder(r1, r2);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m6262(Notification.Builder r2) {
        r2.setTimeoutAfter(0);
    }
}
