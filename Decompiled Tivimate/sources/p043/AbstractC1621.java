package p043;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: renamed from: ʼᵔ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1621 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int[] f5344 = null;

    static {
        int[] r0 = new int[ImageHeaderParser$ImageType.values().length];
        f5344 = r0;
        r0[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        f5344[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        f5344[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
