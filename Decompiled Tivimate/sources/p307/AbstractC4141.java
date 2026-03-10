package p307;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: ٴﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4141 {
    /* JADX INFO: renamed from: ʽ */
    public static void m8387(Drawable r0, Resources r1, XmlPullParser r2, AttributeSet r3, Resources.Theme r4) {
        r0.inflate(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m8388(TypedArray r0) {
        return r0.getChangingConfigurations();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Drawable m8389(Resources r0, XmlPullParser r1, AttributeSet r2, Resources.Theme r3) {
        return Drawable.createFromXmlInner(r0, r1, r2, r3);
    }
}
