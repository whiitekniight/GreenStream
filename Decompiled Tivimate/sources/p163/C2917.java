package p163;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import ar.tvplayer.p002tv.R;
import java.lang.reflect.InvocationTargetException;
import p040.AbstractC1599;

/* JADX INFO: renamed from: ˊʻ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2917 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f10324;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f10325;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f10326;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final PendingIntent f10327;

    /* JADX INFO: renamed from: ⁱˊ */
    public IconCompat f10328;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Bundle f10329;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final CharSequence f10330;

    public C2917(String r11, PendingIntent r12) {
        IconCompat r0 = IconCompat.m117(R.drawable.u);
        Bundle r1 = new Bundle();
        this.f10325 = true;
        this.f10328 = r0;
        int r3 = r0.f317;
        if (r3 != (-1)) goto L20;
        int r32 = Build.VERSION.SDK_INT;
        Object r5 = r0.f316;
        if (r32 < 28) goto L24;
        r3 = AbstractC1599.m4244(r5);
        goto L20
    L24:
        r3 = ((Integer) r5.getClass().getMethod("getType", null).invoke(r5, null)).intValue();     // Catch: NoSuchMethodException -> L9 InvocationTargetException -> L11 IllegalAccessException -> L13
    L17:
        String r02 = "Unable to get icon type " + r5;
    L18:
        r3 = -1;
    L15:
        String r03 = "Unable to get icon type " + r5;
    L16:
        String r04 = "Unable to get icon type " + r5;
    L20:
        if (r3 != 2) goto L22;
        this.f10326 = r0.m119();
    L22:
        this.f10330 = C2906.m6239(r11);
        this.f10327 = r12;
        this.f10329 = r1;
        this.f10324 = true;
        this.f10325 = true;
    }
}
