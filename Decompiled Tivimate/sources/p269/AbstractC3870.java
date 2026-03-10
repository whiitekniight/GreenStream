package p269;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: יᐧ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3870 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int[] f14173 = null;

    static {
        int[] r0 = new int[Bitmap.Config.values().length];
        f14173 = r0;
        r0[Bitmap.Config.ARGB_8888.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
    L12:
        f14173[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
    L14:
        f14173[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
    L18:
        f14173[Bitmap.Config.ALPHA_8.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
        return;
    }
}
