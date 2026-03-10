package p032;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: ʼˈ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1511 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String[] f5004 = null;

    static {
        f5004 = new String[0];
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m4062(EditorInfo r2, CharSequence r3, int r4, int r5) {
        if (r2.extras != null) goto L5;
        r2.extras = new Bundle();
    L5:
        if (r3 == null) goto L7;
        SpannableStringBuilder r0 = new SpannableStringBuilder(r3);
    L8:
        r2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", r0);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", r4);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", r5);
        return;
    L7:
        r0 = null;
        goto L8
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m4063(EditorInfo r2, String[] r3) {
        if (Build.VERSION.SDK_INT < 25) goto L7;
        r2.contentMimeTypes = r3;
        return;
    L7:
        if (r2.extras != null) goto L9;
        r2.extras = new Bundle();
    L9:
        r2.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", r3);
        r2.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", r3);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String[] m4064(EditorInfo r2) {
        if (Build.VERSION.SDK_INT < 25) goto L7;
        String[] r22 = r2.contentMimeTypes;
        if (r22 == null) goto L16;
        return r22;
    L16:
        return f5004;
    L7:
        Bundle r0 = r2.extras;
        if (r0 == null) goto L16;
        String[] r02 = r0.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (r02 != null) goto L13;
        r02 = r2.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    L13:
        if (r02 == null) goto L16;
        return r02;
    }
}
