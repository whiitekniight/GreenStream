package com.bumptech.glide.load;

import p043.AbstractC1621;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType extends Enum<ImageHeaderParser$ImageType> {
    private static final /* synthetic */ ImageHeaderParser$ImageType[] $VALUES = null;
    public static final ImageHeaderParser$ImageType ANIMATED_AVIF = null;
    public static final ImageHeaderParser$ImageType ANIMATED_WEBP = null;
    public static final ImageHeaderParser$ImageType AVIF = null;
    public static final ImageHeaderParser$ImageType GIF = null;
    public static final ImageHeaderParser$ImageType JPEG = null;
    public static final ImageHeaderParser$ImageType PNG = null;
    public static final ImageHeaderParser$ImageType PNG_A = null;
    public static final ImageHeaderParser$ImageType RAW = null;
    public static final ImageHeaderParser$ImageType UNKNOWN = null;
    public static final ImageHeaderParser$ImageType WEBP = null;
    public static final ImageHeaderParser$ImageType WEBP_A = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final boolean f1623;

    static {
        ImageHeaderParser$ImageType r0 = new ImageHeaderParser$ImageType(0, "GIF", true);
        GIF = r0;
        ImageHeaderParser$ImageType r2 = new ImageHeaderParser$ImageType(1, "JPEG", false);
        JPEG = r2;
        ImageHeaderParser$ImageType r4 = new ImageHeaderParser$ImageType(2, "RAW", false);
        RAW = r4;
        ImageHeaderParser$ImageType r6 = new ImageHeaderParser$ImageType(3, "PNG_A", true);
        PNG_A = r6;
        ImageHeaderParser$ImageType r8 = new ImageHeaderParser$ImageType(4, "PNG", false);
        PNG = r8;
        ImageHeaderParser$ImageType r10 = new ImageHeaderParser$ImageType(5, "WEBP_A", true);
        WEBP_A = r10;
        ImageHeaderParser$ImageType r12 = new ImageHeaderParser$ImageType(6, "WEBP", false);
        WEBP = r12;
        ImageHeaderParser$ImageType r14 = new ImageHeaderParser$ImageType(7, "ANIMATED_WEBP", true);
        ANIMATED_WEBP = r14;
        ImageHeaderParser$ImageType r5 = new ImageHeaderParser$ImageType(8, "AVIF", true);
        AVIF = r5;
        ImageHeaderParser$ImageType r9 = new ImageHeaderParser$ImageType(9, "ANIMATED_AVIF", true);
        ANIMATED_AVIF = r9;
        ImageHeaderParser$ImageType r11 = new ImageHeaderParser$ImageType(10, "UNKNOWN", false);
        UNKNOWN = r11;
        $VALUES = new ImageHeaderParser$ImageType[]{r0, r2, r4, r6, r8, r10, r12, r14, r5, r9, r11};
    }

    ImageHeaderParser$ImageType(int r1, String r2, boolean r3) {
        this.f1623 = r3;
    }

    public static ImageHeaderParser$ImageType valueOf(String r1) {
        return (ImageHeaderParser$ImageType) Enum.valueOf(ImageHeaderParser$ImageType.class, r1);
    }

    public static ImageHeaderParser$ImageType[] values() {
        return (ImageHeaderParser$ImageType[]) $VALUES.clone();
    }

    public boolean hasAlpha() {
        return this.f1623;
    }

    public boolean isWebp() {
        int r0 = AbstractC1621.f5344[ordinal()];
        if (r0 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r0 == 2) goto L10;
        if (r0 == 3) goto L10;
        return false;
    }
}
