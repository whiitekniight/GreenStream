package p163;

import android.app.Notification;
import android.content.Context;
import ar.tvplayer.tv.base.ScreenOnService;

/* JADX INFO: renamed from: ˊʻ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2913 {
    /* JADX INFO: renamed from: ʽ */
    public static void m6251(Notification.Builder r1) {
        r1.setBubbleMetadata(null);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6252(Notification.Action.Builder r1) {
        r1.setContextual(false);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m6253(ScreenOnService r2, Notification r3) {
        r2.startForeground(1, r3, -1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m6254(Notification.Builder r0, boolean r1) {
        r0.setAllowSystemGeneratedContextualActions(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m6255(Context r0) {
        return r0.getOpPackageName();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m6256(ScreenOnService r2, Notification r3) {
        r2.startForeground(1, r3, -1);
    }
}
