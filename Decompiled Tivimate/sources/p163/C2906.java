package p163;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.parse.ٴʼ;
import java.util.ArrayList;
import p416.C5273;

/* JADX INFO: renamed from: ˊʻ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2906 {

    /* JADX INFO: renamed from: ʼˎ */
    public final boolean f10297;

    /* JADX INFO: renamed from: ʼᐧ */
    public final ArrayList f10298;

    /* JADX INFO: renamed from: ʽ */
    public final ArrayList f10299;

    /* JADX INFO: renamed from: ˆʾ */
    public C5273 f10300;

    /* JADX INFO: renamed from: ˈ */
    public final ArrayList f10301;

    /* JADX INFO: renamed from: ˉʿ */
    public String f10302;

    /* JADX INFO: renamed from: ˉˆ */
    public final Notification f10303;

    /* JADX INFO: renamed from: ˑﹳ */
    public CharSequence f10304;

    /* JADX INFO: renamed from: ٴﹶ */
    public boolean f10305;

    /* JADX INFO: renamed from: ᵎﹶ */
    public PendingIntent f10306;

    /* JADX INFO: renamed from: ᵔʾ */
    public final boolean f10307;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f10308;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayList f10309;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f10310;

    /* JADX INFO: renamed from: ﾞʻ */
    public Bundle f10311;

    /* JADX INFO: renamed from: ﾞᴵ */
    public CharSequence f10312;

    public C2906(Context r4, String r5) {
        this.f10309 = new ArrayList();
        this.f10299 = new ArrayList();
        this.f10301 = new ArrayList();
        this.f10297 = true;
        this.f10305 = false;
        Notification r2 = new Notification();
        this.f10303 = r2;
        this.f10310 = r4;
        this.f10302 = r5;
        r2.when = System.currentTimeMillis();
        r2.audioStreamType = -1;
        this.f10308 = 0;
        this.f10298 = new ArrayList();
        this.f10307 = true;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static CharSequence m6239(CharSequence r2) {
        if (r2 != null) goto L5;
        return r2;
    L5:
        if (r2.length() > 5120) goto L7;
        return r2;
    L7:
        return r2.subSequence(0, 5120);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6240(C5273 r2) {
        if (this.f10300 == r2) goto L8;
        this.f10300 = r2;
        if (((C2906) r2.f18978) == this) goto L9;
        r2.f18978 = this;
        m6240(r2);
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Notification m6241() {
        ٴʼ r0 = new ٴʼ(this);
        Notification.Builder r1 = (Notification.Builder) r0.ᴵˊ;
        C2906 r2 = (C2906) r0.ʽʽ;
        C5273 r3 = r2.f10300;
        if (r3 == null) goto L5;
        new Notification.BigTextStyle(r1).setBigContentTitle(null).bigText((CharSequence) r3.f18976);
    L5:
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 26) goto L9;
        Notification r02 = r1.build();
    L12:
        if (r3 == null) goto L14;
        r2.f10300.getClass();
    L14:
        if (r3 == null) goto L18;
        Bundle r12 = r02.extras;
        if (r12 == null) goto L18;
        r12.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    L18:
        return r02;
    L9:
        if (r4 < 24) goto L11;
        r02 = r1.build();
        goto L12
    L11:
        r1.setExtras((Bundle) r0.ˈٴ);
        r02 = r1.build();
        goto L12
    }
}
