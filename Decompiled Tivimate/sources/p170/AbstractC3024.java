package p170;

import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* JADX INFO: renamed from: ˊˋ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3024 {
    /* JADX INFO: renamed from: ʼˎ */
    public static void m6395(TextView r0, int r1, float r2) {
        r0.setLineHeight(r1, r2);
    }

    /* JADX INFO: renamed from: ʽ */
    public static float m6396(VelocityTracker r0, int r1) {
        return r0.getAxisVelocity(r1);
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static void m6397(SurfaceView r1) {
        r1.setSurfaceLifecycle(2);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6398(AccessibilityNodeInfo r0, Rect r1) {
        r0.getBoundsInWindow(r1);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static CharSequence m6399(AccessibilityNodeInfo r0) {
        return r0.getContainerTitle();
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static int m6400(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMinimumFlingVelocity(r1, r2, r3);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static boolean m6401(AccessibilityNodeInfo r0) {
        return r0.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static AccessibilityNodeInfo.AccessibilityAction m6402() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static JobScheduler m6403(JobScheduler r1) {
        return r1.forNamespace("androidx.work.systemjobscheduler");
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static int m6404(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMaximumFlingVelocity(r1, r2, r3);
    }
}
