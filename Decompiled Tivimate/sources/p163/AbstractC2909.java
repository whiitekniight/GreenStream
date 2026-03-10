package p163;

import android.app.Notification;
import android.app.NotificationManager;

/* JADX INFO: renamed from: ˊʻ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2909 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6242(Notification.Builder r1) {
        r1.setRemoteInputHistory(null);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m6243(Notification.Action.Builder r0, boolean r1) {
        r0.setAllowGeneratedReplies(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m6244(NotificationManager r0) {
        return r0.areNotificationsEnabled();
    }
}
