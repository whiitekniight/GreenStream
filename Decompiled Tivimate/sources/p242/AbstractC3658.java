package p242;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: ˑʿ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3658 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static <T, V> ObjectAnimator m7703(T r1, Property<T, V> r2, Path r3) {
        return ObjectAnimator.ofObject(r1, r2, null, r3);
    }
}
