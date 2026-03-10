package p460;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: ﾞʻ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5841 implements TransformationMethod {

    /* JADX INFO: renamed from: ʾˋ */
    public Locale f21335;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r1, View r2) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return r1.toString().toUpperCase(this.f21335);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r1, CharSequence r2, boolean r3, int r4, Rect r5) {
    }
}
